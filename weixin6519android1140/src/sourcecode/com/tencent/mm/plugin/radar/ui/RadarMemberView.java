package com.tencent.mm.plugin.radar.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.radar.a.c.d;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.y.at;

public class RadarMemberView
  extends RelativeLayout
{
  private ae handler;
  private x iBi;
  private TextView lAu;
  private EditText nUE;
  public awx nZY;
  public c.d nZZ;
  private bb oaA;
  a oaB;
  private View.OnClickListener oaC;
  private i oaD;
  private View oaE;
  private TextView oaF;
  private View oao;
  private View oap;
  private ImageView oaq;
  private View oar;
  private Button oas;
  private TextView oat;
  private TextView oau;
  private Button oav;
  private TextView oaw;
  private int[] oax;
  private TextView oay;
  private boolean oaz;
  
  public RadarMemberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8919036461056L, 66452);
    this.oao = null;
    this.oap = null;
    this.oaq = null;
    this.oar = null;
    this.oas = null;
    this.oat = null;
    this.oau = null;
    this.oav = null;
    this.oaw = null;
    this.oax = null;
    this.oay = null;
    this.nZZ = null;
    this.nZY = null;
    this.oaz = false;
    this.oaB = null;
    this.oaC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8924136734720L, 66490);
        String str = "";
        paramAnonymousView = str;
        if (RadarMemberView.a(RadarMemberView.this) != null)
        {
          if (!a.eE(RadarMemberView.a(RadarMemberView.this).field_type)) {
            break label99;
          }
          paramAnonymousView = RadarMemberView.a(RadarMemberView.this).field_conRemark;
        }
        for (;;)
        {
          Object localObject = paramAnonymousView;
          if (bg.nm(paramAnonymousView))
          {
            localObject = paramAnonymousView;
            if (RadarMemberView.this.nZY != null) {
              localObject = RadarMemberView.this.nZY.jio;
            }
          }
          RadarMemberView.a(RadarMemberView.this, (String)localObject);
          GMTrace.o(8924136734720L, 66490);
          return;
          label99:
          at.AR();
          paramAnonymousView = com.tencent.mm.y.c.yL().CC(RadarMemberView.a(RadarMemberView.this).field_username);
          if (paramAnonymousView != null)
          {
            localObject = paramAnonymousView;
            if (!bg.nm(paramAnonymousView.field_encryptUsername)) {}
          }
          else
          {
            localObject = paramAnonymousView;
            if (!bg.nm(RadarMemberView.a(RadarMemberView.this).field_encryptUsername))
            {
              at.AR();
              localObject = com.tencent.mm.y.c.yL().CC(RadarMemberView.a(RadarMemberView.this).field_encryptUsername);
            }
          }
          paramAnonymousView = str;
          if (localObject != null) {
            paramAnonymousView = ((bb)localObject).field_conRemark;
          }
        }
      }
    };
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8912862445568L, 66406);
        if (paramAnonymousMessage.what == 0)
        {
          RadarMemberView.a(RadarMemberView.this, RadarMemberView.this.nZY, RadarMemberView.this.nZZ);
          GMTrace.o(8912862445568L, 66406);
          return;
        }
        if (paramAnonymousMessage.what == 1)
        {
          RadarMemberView.this.setVisibility(4);
          RadarMemberView.d(RadarMemberView.this);
          if (RadarMemberView.e(RadarMemberView.this) != null) {
            RadarMemberView.e(RadarMemberView.this).setVisibility(0);
          }
          if (RadarMemberView.b(RadarMemberView.this) != null) {
            RadarMemberView.b(RadarMemberView.this).c(RadarMemberView.this.nZY, RadarMemberView.this.nZZ);
          }
        }
        GMTrace.o(8912862445568L, 66406);
      }
    };
    this.oaD = null;
    this.oaE = null;
    this.lAu = null;
    this.nUE = null;
    this.oaF = null;
    GMTrace.o(8919036461056L, 66452);
  }
  
  public RadarMemberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8919170678784L, 66453);
    this.oao = null;
    this.oap = null;
    this.oaq = null;
    this.oar = null;
    this.oas = null;
    this.oat = null;
    this.oau = null;
    this.oav = null;
    this.oaw = null;
    this.oax = null;
    this.oay = null;
    this.nZZ = null;
    this.nZY = null;
    this.oaz = false;
    this.oaB = null;
    this.oaC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8924136734720L, 66490);
        String str = "";
        paramAnonymousView = str;
        if (RadarMemberView.a(RadarMemberView.this) != null)
        {
          if (!a.eE(RadarMemberView.a(RadarMemberView.this).field_type)) {
            break label99;
          }
          paramAnonymousView = RadarMemberView.a(RadarMemberView.this).field_conRemark;
        }
        for (;;)
        {
          Object localObject = paramAnonymousView;
          if (bg.nm(paramAnonymousView))
          {
            localObject = paramAnonymousView;
            if (RadarMemberView.this.nZY != null) {
              localObject = RadarMemberView.this.nZY.jio;
            }
          }
          RadarMemberView.a(RadarMemberView.this, (String)localObject);
          GMTrace.o(8924136734720L, 66490);
          return;
          label99:
          at.AR();
          paramAnonymousView = com.tencent.mm.y.c.yL().CC(RadarMemberView.a(RadarMemberView.this).field_username);
          if (paramAnonymousView != null)
          {
            localObject = paramAnonymousView;
            if (!bg.nm(paramAnonymousView.field_encryptUsername)) {}
          }
          else
          {
            localObject = paramAnonymousView;
            if (!bg.nm(RadarMemberView.a(RadarMemberView.this).field_encryptUsername))
            {
              at.AR();
              localObject = com.tencent.mm.y.c.yL().CC(RadarMemberView.a(RadarMemberView.this).field_encryptUsername);
            }
          }
          paramAnonymousView = str;
          if (localObject != null) {
            paramAnonymousView = ((bb)localObject).field_conRemark;
          }
        }
      }
    };
    this.handler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8912862445568L, 66406);
        if (paramAnonymousMessage.what == 0)
        {
          RadarMemberView.a(RadarMemberView.this, RadarMemberView.this.nZY, RadarMemberView.this.nZZ);
          GMTrace.o(8912862445568L, 66406);
          return;
        }
        if (paramAnonymousMessage.what == 1)
        {
          RadarMemberView.this.setVisibility(4);
          RadarMemberView.d(RadarMemberView.this);
          if (RadarMemberView.e(RadarMemberView.this) != null) {
            RadarMemberView.e(RadarMemberView.this).setVisibility(0);
          }
          if (RadarMemberView.b(RadarMemberView.this) != null) {
            RadarMemberView.b(RadarMemberView.this).c(RadarMemberView.this.nZY, RadarMemberView.this.nZZ);
          }
        }
        GMTrace.o(8912862445568L, 66406);
      }
    };
    this.oaD = null;
    this.oaE = null;
    this.lAu = null;
    this.nUE = null;
    this.oaF = null;
    GMTrace.o(8919170678784L, 66453);
  }
  
  public static void G(Activity paramActivity)
  {
    GMTrace.i(8920110202880L, 66460);
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(8920110202880L, 66460);
      return;
    }
    paramActivity = paramActivity.getCurrentFocus();
    if (paramActivity == null)
    {
      GMTrace.o(8920110202880L, 66460);
      return;
    }
    if (paramActivity.getWindowToken() == null)
    {
      GMTrace.o(8920110202880L, 66460);
      return;
    }
    localInputMethodManager.toggleSoftInput(0, 2);
    GMTrace.o(8920110202880L, 66460);
  }
  
  private void a(awx paramawx, c.d paramd)
  {
    GMTrace.i(8919439114240L, 66455);
    this.oay.setVisibility(0);
    switch (4.oaH[paramd.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(8919439114240L, 66455);
      return;
      this.oau.setVisibility(0);
      this.oav.setVisibility(0);
      this.oas.setText(R.l.dPu);
      this.oas.setVisibility(0);
      this.oat.setVisibility(8);
      this.oaw.setVisibility(8);
      GMTrace.o(8919439114240L, 66455);
      return;
      this.oau.setVisibility(0);
      this.oav.setVisibility(0);
      this.oat.setText(R.l.dPx);
      this.oas.setVisibility(8);
      this.oat.setVisibility(0);
      this.oaw.setVisibility(8);
      GMTrace.o(8919439114240L, 66455);
      return;
      this.oau.setVisibility(0);
      this.oav.setVisibility(0);
      this.oat.setText(R.l.dPj);
      this.oas.setVisibility(8);
      this.oat.setVisibility(0);
      this.oaw.setVisibility(8);
      GMTrace.o(8919439114240L, 66455);
      return;
      this.oau.setVisibility(0);
      this.oav.setVisibility(0);
      this.oas.setText(R.l.dPi);
      this.oas.setVisibility(0);
      this.oat.setVisibility(8);
      this.oaw.setText(getContext().getString(R.l.bWc, new Object[] { paramawx.jio }));
      this.oaw.setVisibility(0);
    }
  }
  
  private void reset()
  {
    GMTrace.i(8919841767424L, 66458);
    this.oar.setVisibility(8);
    this.oau.setVisibility(4);
    this.oav.setVisibility(4);
    this.oas.setVisibility(8);
    this.oat.setVisibility(8);
    this.oaw.setVisibility(8);
    this.oay.setVisibility(8);
    GMTrace.o(8919841767424L, 66458);
  }
  
  public final void a(View paramView, final awx paramawx, c.d paramd)
  {
    GMTrace.i(8919573331968L, 66456);
    w.d("MicroMsg.RadarMemberView", "popup");
    this.nZZ = paramd;
    this.nZY = paramawx;
    if (this.oap == null) {
      this.oap = findViewById(R.h.bVW);
    }
    if (this.oaq == null) {
      this.oaq = ((ImageView)findViewById(R.h.bVJ));
    }
    if (this.oar == null) {
      this.oar = findViewById(R.h.bVI);
    }
    if (this.oas == null) {
      this.oas = ((Button)findViewById(R.h.bVL));
    }
    this.oas.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8922928775168L, 66481);
        if ((RadarMemberView.this.nZZ == null) || (RadarMemberView.b(RadarMemberView.this) == null))
        {
          GMTrace.o(8922928775168L, 66481);
          return;
        }
        RadarMemberView.b(RadarMemberView.this).b(paramawx, RadarMemberView.this.nZZ);
        RadarMemberView.this.dismiss();
        GMTrace.o(8922928775168L, 66481);
      }
    });
    if (this.oat == null) {
      this.oat = ((TextView)findViewById(R.h.bVM));
    }
    if (this.oau == null) {
      this.oau = ((TextView)findViewById(R.h.bVQ));
    }
    if (this.oav == null)
    {
      this.oav = ((Button)findViewById(R.h.bVP));
      this.oav.setOnClickListener(this.oaC);
    }
    if (this.oaw == null) {
      this.oaw = ((TextView)findViewById(R.h.bWc));
    }
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8912594010112L, 66404);
        if ((paramAnonymousView != RadarMemberView.c(RadarMemberView.this)) && (paramAnonymousMotionEvent.getAction() == 1) && (RadarMemberView.this.isShowing())) {
          RadarMemberView.this.dismiss();
        }
        GMTrace.o(8912594010112L, 66404);
        return true;
      }
    });
    if (this.oay == null) {
      this.oay = ((TextView)findViewById(R.h.bxZ));
    }
    this.oay.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8910043873280L, 66385);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("k_username", RadarMemberView.a(RadarMemberView.this).field_username);
        paramAnonymousView.putExtra("showShare", false);
        paramAnonymousView.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(38) }));
        d.b(RadarMemberView.this.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        GMTrace.o(8910043873280L, 66385);
      }
    });
    paramd = c.b(paramawx);
    if (!bg.nm(paramd))
    {
      at.AR();
      this.iBi = com.tencent.mm.y.c.yK().TE(paramd);
    }
    if ((this.iBi != null) && (a.eE(this.iBi.field_type)))
    {
      paramd = this.iBi.field_conRemark;
      if ((this.iBi == null) || (bg.nm(paramd))) {
        break label637;
      }
      this.oau.setText(h.b(getContext(), paramd, this.oau.getTextSize()));
    }
    for (;;)
    {
      this.oau.setVisibility(4);
      this.oav.setVisibility(4);
      reset();
      this.oao = paramView;
      paramawx = (ImageView)this.oao.findViewById(R.h.bVY);
      paramView = this.oao.findViewById(R.h.bVI);
      this.oao.setVisibility(4);
      this.oaq.setImageDrawable(paramawx.getDrawable());
      this.oar.setVisibility(0);
      paramd = new int[2];
      paramView.getLocationInWindow(paramd);
      int[] arrayOfInt = new int[2];
      this.oap.getLocationInWindow(arrayOfInt);
      this.oax = arrayOfInt;
      setVisibility(0);
      paramawx = new AnimationSet(true);
      paramawx.setFillAfter(true);
      paramawx.setRepeatCount(1);
      paramawx.setDuration(500L);
      float f1 = this.oap.getHeight() / paramView.getHeight();
      float f2 = (paramView.getWidth() - paramView.getHeight()) / 2;
      paramView = new TranslateAnimation(paramd[0], arrayOfInt[0] - f2 * f1, paramd[1], arrayOfInt[1]);
      paramawx.addAnimation(new ScaleAnimation(1.0F, f1, 1.0F, f1));
      paramawx.addAnimation(paramView);
      paramawx.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8922391904256L, 66477);
          w.d("MicroMsg.RadarMemberView", "popup animation end");
          RadarMemberView.f(RadarMemberView.this).sendEmptyMessage(0);
          GMTrace.o(8922391904256L, 66477);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8922257686528L, 66476);
          GMTrace.o(8922257686528L, 66476);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8922123468800L, 66475);
          GMTrace.o(8922123468800L, 66475);
        }
      });
      this.oar.startAnimation(paramawx);
      GMTrace.o(8919573331968L, 66456);
      return;
      at.AR();
      this.oaA = com.tencent.mm.y.c.yL().CC(paramd);
      paramd = this.oaA.field_conRemark;
      break;
      label637:
      this.oau.setText(h.b(getContext(), paramawx.jio, this.oau.getTextSize()));
    }
  }
  
  public final void c(String paramString, c.d paramd)
  {
    GMTrace.i(8919304896512L, 66454);
    if ((!isShowing()) || (this.oaz))
    {
      GMTrace.o(8919304896512L, 66454);
      return;
    }
    if ((paramString.equals(this.nZY.ujf)) || (paramString.equals(this.nZY.jhi))) {
      a(this.nZY, paramd);
    }
    GMTrace.o(8919304896512L, 66454);
  }
  
  public final void dismiss()
  {
    GMTrace.i(8919707549696L, 66457);
    w.d("MicroMsg.RadarMemberView", "dismiss");
    if (this.oaz)
    {
      GMTrace.o(8919707549696L, 66457);
      return;
    }
    this.oaz = true;
    Object localObject = this.oao.findViewById(R.h.bVI);
    AnimationSet localAnimationSet = new AnimationSet(true);
    localAnimationSet.setFillAfter(true);
    localAnimationSet.setRepeatCount(1);
    localAnimationSet.setDuration(500L);
    int[] arrayOfInt1 = this.oax;
    int[] arrayOfInt2 = new int[2];
    ((View)localObject).getLocationInWindow(arrayOfInt2);
    float f1 = this.oap.getHeight() / ((View)localObject).getHeight();
    float f2 = (((View)localObject).getWidth() - ((View)localObject).getHeight()) / 2;
    localObject = new TranslateAnimation(arrayOfInt1[0] - f2 * f1, arrayOfInt2[0], arrayOfInt1[1], arrayOfInt2[1]);
    localAnimationSet.addAnimation(new ScaleAnimation(f1, 1.0F, f1, 1.0F));
    localAnimationSet.addAnimation((Animation)localObject);
    localAnimationSet.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8901722374144L, 66323);
        w.d("MicroMsg.RadarMemberView", "dismiss animation end");
        RadarMemberView.g(RadarMemberView.this);
        RadarMemberView.f(RadarMemberView.this).sendEmptyMessage(1);
        GMTrace.o(8901722374144L, 66323);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8901588156416L, 66322);
        GMTrace.o(8901588156416L, 66322);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8901453938688L, 66321);
        GMTrace.o(8901453938688L, 66321);
      }
    });
    this.oau.setVisibility(4);
    this.oav.setVisibility(4);
    this.oas.setVisibility(8);
    this.oat.setVisibility(8);
    this.oaw.setVisibility(8);
    this.oay.setVisibility(8);
    this.oar.startAnimation(localAnimationSet);
    GMTrace.o(8919707549696L, 66457);
  }
  
  public final boolean isShowing()
  {
    GMTrace.i(8919975985152L, 66459);
    if (getVisibility() == 0)
    {
      GMTrace.o(8919975985152L, 66459);
      return true;
    }
    GMTrace.o(8919975985152L, 66459);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void b(awx paramawx, c.d paramd);
    
    public abstract void c(awx paramawx, c.d paramd);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\RadarMemberView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */