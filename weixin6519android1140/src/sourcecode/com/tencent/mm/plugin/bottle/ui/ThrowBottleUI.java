package com.tencent.mm.plugin.bottle.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.ToneGenerator;
import android.os.Message;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.bottle.a.h.d;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;

public class ThrowBottleUI
  extends FrameLayout
  implements View.OnClickListener, com.tencent.mm.plugin.bottle.a.h.a
{
  private static final int[] jsp;
  private static final int[] jsq;
  ae handler;
  BottleBeachUI jqX;
  ImageView jru;
  ImageView jsA;
  MMEditText jsB;
  View jsC;
  Button jsD;
  ImageButton jsE;
  ThrowBottleFooter jsF;
  boolean jsG;
  boolean jsH;
  LinearLayout.LayoutParams jsI;
  private int jsJ;
  int jsK;
  private ThrowBottleAnimUI.a jsL;
  final aj jsM;
  final aj jsN;
  boolean jsO;
  @SuppressLint({"HandlerLeak"})
  private final ae jsP;
  final com.tencent.mm.ad.h.a jsQ;
  boolean jsl;
  h.d jsr;
  ToneGenerator jss;
  private long jst;
  Toast jsu;
  Vibrator jsv;
  ThrowBottleAnimUI jsw;
  AnimationDrawable jsx;
  ImageView jsy;
  TextView jsz;
  
  static
  {
    GMTrace.i(7639941513216L, 56922);
    jsp = new int[] { 0, 9, 18, 27, 37, 46, 55, 64, 74, 85, 93, 100 };
    jsq = new int[] { R.g.aTz, R.g.aTC, R.g.aTD, R.g.aTE, R.g.aTF, R.g.aTG, R.g.aTH, R.g.aTI, R.g.aTJ, R.g.aTA, R.g.aTB };
    GMTrace.o(7639941513216L, 56922);
  }
  
  public ThrowBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7634572804096L, 56882);
    this.jst = -1L;
    this.handler = new ae();
    this.jsG = false;
    this.jsl = true;
    this.jsI = null;
    this.jsJ = 0;
    this.jsK = 0;
    this.jsL = new ThrowBottleAnimUI.a()
    {
      public final void ahQ()
      {
        GMTrace.i(7648397230080L, 56985);
        ThrowBottleUI.q(ThrowBottleUI.this).setVisibility(8);
        ThrowBottleUI.h(ThrowBottleUI.this).li(0);
        GMTrace.o(7648397230080L, 56985);
      }
    };
    this.jsM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        int i = 0;
        GMTrace.i(7648665665536L, 56987);
        if (ThrowBottleUI.r(ThrowBottleUI.this) == null)
        {
          w.w("MM.Bottle.ThrowBottleUI", "bottle recder is null");
          GMTrace.o(7648665665536L, 56987);
          return false;
        }
        int j = ThrowBottleUI.r(ThrowBottleUI.this).getMaxAmplitude();
        for (;;)
        {
          if (i < ThrowBottleUI.aia().length)
          {
            if ((j >= ThrowBottleUI.aib()[i]) && (j < ThrowBottleUI.aib()[(i + 1)])) {
              ThrowBottleUI.s(ThrowBottleUI.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.aia()[i]));
            }
          }
          else
          {
            GMTrace.o(7648665665536L, 56987);
            return true;
          }
          i += 1;
        }
      }
    }, true);
    this.jsN = new aj(new aj.a()
    {
      int count;
      
      public final boolean pM()
      {
        GMTrace.i(7648128794624L, 56983);
        if (ThrowBottleUI.t(ThrowBottleUI.this) == -1L) {
          ThrowBottleUI.a(ThrowBottleUI.this, bg.Pw());
        }
        if (this.count % 3 == 2) {
          ThrowBottleUI.u(ThrowBottleUI.this).setWidth(ThrowBottleUI.u(ThrowBottleUI.this).getWidth() + 1);
        }
        this.count += 1;
        this.count %= 3;
        long l = bg.aI(ThrowBottleUI.t(ThrowBottleUI.this));
        int i;
        if ((l >= 50000L) && (l <= 60000L))
        {
          if (ThrowBottleUI.v(ThrowBottleUI.this) != null) {
            break label251;
          }
          i = (int)((60000L - l) / 1000L);
          ThrowBottleUI.a(ThrowBottleUI.this, Toast.makeText(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.h(ThrowBottleUI.this).getResources().getQuantityString(R.j.cIg, i, new Object[] { Integer.valueOf(i) }), 0));
        }
        for (;;)
        {
          ThrowBottleUI.v(ThrowBottleUI.this).show();
          if (l < 60000L) {
            break;
          }
          w.v("MM.Bottle.ThrowBottleUI", "bottle record stop on countdown");
          ThrowBottleUI.w(ThrowBottleUI.this);
          ThrowBottleUI.this.ahZ();
          ThrowBottleUI.x(ThrowBottleUI.this);
          aq.C(ThrowBottleUI.h(ThrowBottleUI.this), R.l.eev);
          GMTrace.o(7648128794624L, 56983);
          return false;
          label251:
          i = (int)((60000L - l) / 1000L);
          ThrowBottleUI.v(ThrowBottleUI.this).setText(ThrowBottleUI.h(ThrowBottleUI.this).getResources().getQuantityString(R.j.cIg, i, new Object[] { Integer.valueOf(i) }));
        }
        GMTrace.o(7648128794624L, 56983);
        return true;
      }
    }, true);
    this.jsO = false;
    this.jsP = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7648934100992L, 56989);
        super.handleMessage(paramAnonymousMessage);
        ThrowBottleUI.f(ThrowBottleUI.this).setBackgroundDrawable(com.tencent.mm.br.a.b(ThrowBottleUI.h(ThrowBottleUI.this), R.g.aZx));
        ThrowBottleUI.f(ThrowBottleUI.this).setEnabled(true);
        GMTrace.o(7648934100992L, 56989);
      }
    };
    this.jsQ = new com.tencent.mm.ad.h.a()
    {
      public final void onError()
      {
        GMTrace.i(7624774909952L, 56809);
        ThrowBottleUI.r(ThrowBottleUI.this).reset();
        ThrowBottleUI.z(ThrowBottleUI.this).stopTimer();
        ThrowBottleUI.A(ThrowBottleUI.this).stopTimer();
        ad.RT("keep_app_silent");
        ThrowBottleUI.x(ThrowBottleUI.this);
        w.v("MM.Bottle.ThrowBottleUI", "bottle record stop on error");
        Toast.makeText(ThrowBottleUI.h(ThrowBottleUI.this), ThrowBottleUI.h(ThrowBottleUI.this).getString(R.l.dgX), 0).show();
        GMTrace.o(7624774909952L, 56809);
      }
    };
    this.jqX = ((BottleBeachUI)paramContext);
    GMTrace.o(7634572804096L, 56882);
  }
  
  private void ahX()
  {
    int j = 8;
    GMTrace.i(7634975457280L, 56885);
    this.jsz.setVisibility(8);
    Object localObject = this.jsA;
    boolean bool;
    if (this.jsl)
    {
      i = 8;
      ((ImageView)localObject).setVisibility(i);
      localObject = (View)this.jsB.getParent();
      i = j;
      if (this.jsl) {
        i = 0;
      }
      ((View)localObject).setVisibility(i);
      if (this.jsl) {
        this.jsB.requestFocus();
      }
      if (this.jsl) {
        break label198;
      }
      bool = true;
      label95:
      this.jsl = bool;
      ImageButton localImageButton = this.jsE;
      if (!this.jsl) {
        break label203;
      }
      localObject = com.tencent.mm.br.a.b(this.jqX, R.g.aVH);
      label125:
      localImageButton.setImageDrawable((Drawable)localObject);
      if (!this.jsl) {
        break label218;
      }
      dq(false);
      label144:
      this.jsD = ((Button)this.jqX.findViewById(R.h.bij));
      localObject = this.jsD;
      if (!this.jsl) {
        break label226;
      }
    }
    label198:
    label203:
    label218:
    label226:
    for (int i = R.l.dbv;; i = R.l.dbs)
    {
      ((Button)localObject).setText(i);
      GMTrace.o(7634975457280L, 56885);
      return;
      i = 0;
      break;
      bool = false;
      break label95;
      localObject = com.tencent.mm.br.a.b(this.jqX, R.g.aVI);
      break label125;
      dq(true);
      break label144;
    }
  }
  
  private void ahY()
  {
    GMTrace.i(7635109675008L, 56886);
    int i;
    int j;
    if (this.jsl)
    {
      i = this.jsz.getLeft();
      j = this.jsz.getTop();
    }
    for (int k = this.jsz.getWidth();; k = 0)
    {
      this.jsw = ((ThrowBottleAnimUI)this.jqX.findViewById(R.h.bif));
      this.jsw.jsk = this.jsL;
      ThrowBottleAnimUI localThrowBottleAnimUI = this.jsw;
      localThrowBottleAnimUI.jsl = this.jsl;
      localThrowBottleAnimUI.Qo = i;
      localThrowBottleAnimUI.Qp = j;
      localThrowBottleAnimUI.jsj = k;
      localThrowBottleAnimUI.setVisibility(0);
      af.i(new ThrowBottleAnimUI.1(localThrowBottleAnimUI), 100L);
      GMTrace.o(7635109675008L, 56886);
      return;
      i = this.jsB.getLeft();
      j = this.jsB.getTop();
    }
  }
  
  private void dq(boolean paramBoolean)
  {
    GMTrace.i(7635243892736L, 56887);
    if (paramBoolean)
    {
      ((InputMethodManager)this.jqX.getSystemService("input_method")).showSoftInput(this.jsB, 0);
      GMTrace.o(7635243892736L, 56887);
      return;
    }
    ((InputMethodManager)this.jqX.getSystemService("input_method")).hideSoftInputFromWindow(this.jsB.getWindowToken(), 2);
    GMTrace.o(7635243892736L, 56887);
  }
  
  public final boolean ahZ()
  {
    GMTrace.i(7635378110464L, 56888);
    w.d("MM.Bottle.ThrowBottleUI", "bottle record stop");
    boolean bool;
    if (this.jsO)
    {
      this.jqX.getWindow().getDecorView().setKeepScreenOn(false);
      if (this.jsx != null) {
        this.jsx.stop();
      }
      if (this.jsr == null) {
        break label197;
      }
      bool = this.jsr.qt();
      ad.RT("keep_app_silent");
      this.jsM.stopTimer();
      this.jsN.stopTimer();
      this.jst = -1L;
    }
    for (;;)
    {
      if (!bool)
      {
        this.jsD.setEnabled(false);
        this.jsD.setBackgroundDrawable(com.tencent.mm.br.a.b(this.jqX, R.g.aZw));
        this.jsy.setVisibility(8);
        this.jsz.setVisibility(8);
        this.jsP.sendEmptyMessageDelayed(0, 500L);
        at.AR();
        if (com.tencent.mm.y.c.isSDCardAvailable()) {
          this.jqX.lh(R.l.dbr);
        }
      }
      for (;;)
      {
        this.jsO = false;
        GMTrace.o(7635378110464L, 56888);
        return false;
        ahY();
      }
      label197:
      bool = false;
    }
  }
  
  public final void bK(int paramInt1, int paramInt2)
  {
    GMTrace.i(7635512328192L, 56889);
    if (paramInt2 == 63534)
    {
      this.jqX.li(0);
      this.jqX.lh(R.l.daZ);
    }
    GMTrace.o(7635512328192L, 56889);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(7634841239552L, 56884);
    if (R.h.bhx == paramView.getId())
    {
      if ((!this.jsl) && (this.jsB.getText().toString().trim().length() > 0))
      {
        com.tencent.mm.ui.base.h.a(this.jqX, getResources().getString(R.l.dbp), null, getResources().getString(R.l.dbq), new com.tencent.mm.ui.base.h.c()
        {
          public final void hQ(int paramAnonymousInt)
          {
            GMTrace.i(7644504915968L, 56956);
            if (paramAnonymousInt == 0)
            {
              ThrowBottleUI.m(ThrowBottleUI.this).setText("");
              ThrowBottleUI.p(ThrowBottleUI.this);
            }
            GMTrace.o(7644504915968L, 56956);
          }
        }, null);
        GMTrace.o(7634841239552L, 56884);
        return;
      }
      ahX();
      GMTrace.o(7634841239552L, 56884);
      return;
    }
    this.jqX.li(0);
    GMTrace.o(7634841239552L, 56884);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7634707021824L, 56883);
    this.jru.setVisibility(8);
    int i;
    if (paramInt == 0)
    {
      this.jsl = true;
      this.jsy.setVisibility(8);
      this.jsz.setVisibility(8);
      this.jsz.setWidth(BackwardSupportUtil.b.a(this.jqX, 120.0F));
      this.jsA.setVisibility(0);
      ((View)this.jsB.getParent()).setVisibility(8);
      this.jsB.setText("");
      this.jsF.setVisibility(0);
      com.tencent.mm.ui.tools.a.c.d(this.jsB).Ea(b.tV()).a(null);
      this.jsE.setImageDrawable(com.tencent.mm.br.a.b(this.jqX, R.g.aVH));
      this.jsD.setBackgroundDrawable(com.tencent.mm.br.a.b(this.jqX, R.g.aZx));
      Button localButton = this.jsD;
      if (this.jsl)
      {
        i = R.l.dbv;
        localButton.setText(i);
        ((LinearLayout)this.jqX.findViewById(R.h.bil)).setVisibility(0);
        this.jqX.getWindow().clearFlags(1024);
      }
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(7634707021824L, 56883);
      return;
      i = R.l.dbs;
      break;
      this.jqX.getWindow().setFlags(1024, 1024);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\ThrowBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */