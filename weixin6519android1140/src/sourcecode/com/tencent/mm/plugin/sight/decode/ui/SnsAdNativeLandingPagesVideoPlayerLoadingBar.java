package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.ag.a.e;
import com.tencent.mm.plugin.ag.a.f;
import com.tencent.mm.plugin.ag.a.g;
import com.tencent.mm.sdk.platformtools.w;

public class SnsAdNativeLandingPagesVideoPlayerLoadingBar
  extends RelativeLayout
  implements a
{
  public boolean eIC;
  private View hqF;
  private int jP;
  private boolean jaO;
  public b oSQ;
  private ImageView oSR;
  private ImageView oSS;
  private ImageView oST;
  private ImageView oSU;
  private TextView oSV;
  private TextView oSW;
  public int oSX;
  private int oSY;
  private float oTa;
  private int oTb;
  private int oTc;
  private int oTd;
  private int oTe;
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9271492214784L, 69078);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.eIC = false;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9271492214784L, 69078);
  }
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9271626432512L, 69079);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.eIC = false;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9271626432512L, 69079);
  }
  
  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9271760650240L, 69080);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.eIC = false;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9271760650240L, 69080);
  }
  
  private int bgG()
  {
    GMTrace.i(9272968609792L, 69089);
    this.oSY = this.oSS.getWidth();
    int i = this.oSY;
    GMTrace.o(9272968609792L, 69089);
    return i;
  }
  
  private void bgJ()
  {
    GMTrace.i(9273237045248L, 69091);
    if (this.oSX == 0)
    {
      GMTrace.o(9273237045248L, 69091);
      return;
    }
    if (this.jaO)
    {
      GMTrace.o(9273237045248L, 69091);
      return;
    }
    if (this.oST == null)
    {
      GMTrace.o(9273237045248L, 69091);
      return;
    }
    if (bgG() == 0)
    {
      GMTrace.o(9273237045248L, 69091);
      return;
    }
    int i = (this.oST.getWidth() - this.oST.getPaddingLeft() - this.oST.getPaddingRight()) / 2;
    this.oSV.setText(iL(this.jP / 60) + ":" + iL(this.jP % 60));
    int j = ((FrameLayout.LayoutParams)this.oSS.getLayoutParams()).leftMargin;
    int k = this.oST.getPaddingLeft();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.oST.getLayoutParams();
    localLayoutParams.leftMargin = (j - k + (int)(this.jP * 1.0D / this.oSX * bgG()) - i);
    this.oST.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.oSR.getLayoutParams();
    localLayoutParams.width = ((int)(this.jP * 1.0D / this.oSX * bgG()));
    this.oSR.setLayoutParams(localLayoutParams);
    GMTrace.o(9273237045248L, 69091);
  }
  
  public static String iL(int paramInt)
  {
    GMTrace.i(9273371262976L, 69092);
    if (paramInt < 10)
    {
      String str = "0" + paramInt;
      GMTrace.o(9273371262976L, 69092);
      return str;
    }
    GMTrace.o(9273371262976L, 69092);
    return String.valueOf(paramInt);
  }
  
  private void init()
  {
    GMTrace.i(9272029085696L, 69082);
    this.hqF = View.inflate(getContext(), a.f.qzx, this);
    this.oSR = ((ImageView)this.hqF.findViewById(a.e.nHs));
    this.oSS = ((ImageView)this.hqF.findViewById(a.e.nHr));
    this.oST = ((ImageView)this.hqF.findViewById(a.e.nHt));
    this.oSU = ((ImageView)this.hqF.findViewById(a.e.bTl));
    this.oSV = ((TextView)this.hqF.findViewById(a.e.nHp));
    this.oSW = ((TextView)this.hqF.findViewById(a.e.nHq));
    this.oST.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9265183981568L, 69031);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          w.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, false);
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, paramAnonymousMotionEvent.getX());
          if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) != null) {
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).Xw();
          }
        }
        for (;;)
        {
          GMTrace.o(9265183981568L, 69031);
          return true;
          int i;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f = paramAnonymousMotionEvent.getX();
            paramAnonymousView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).getLayoutParams();
            i = paramAnonymousView.leftMargin;
            int j = (int)(f - SnsAdNativeLandingPagesVideoPlayerLoadingBar.c(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this));
            paramAnonymousView.leftMargin = SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, j + i);
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this);
            if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) > 0)
            {
              paramAnonymousView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).getLayoutParams();
              paramAnonymousView.width = ((int)(i * 1.0D / SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) * SnsAdNativeLandingPagesVideoPlayerLoadingBar.g(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this)));
              SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            }
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.h(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).setText(SnsAdNativeLandingPagesVideoPlayerLoadingBar.iL(i / 60) + ":" + SnsAdNativeLandingPagesVideoPlayerLoadingBar.iL(i % 60));
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, true);
          }
          else if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.i(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this))
          {
            i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this);
            if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this) != null)
            {
              w.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : " + i);
              SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this).iM(i);
            }
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this, false);
          }
        }
      }
    });
    GMTrace.o(9272029085696L, 69082);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(9271894867968L, 69081);
    this.oSQ = paramb;
    GMTrace.o(9271894867968L, 69081);
  }
  
  public final int bgE()
  {
    GMTrace.i(9272700174336L, 69087);
    int i = this.oSX;
    GMTrace.o(9272700174336L, 69087);
    return i;
  }
  
  public final void bgH()
  {
    GMTrace.i(9273102827520L, 69090);
    this.oSY = 0;
    GMTrace.o(9273102827520L, 69090);
  }
  
  public final void cp(boolean paramBoolean)
  {
    GMTrace.i(9272431738880L, 69085);
    this.eIC = paramBoolean;
    if (paramBoolean)
    {
      this.oSU.setImageResource(a.g.nHw);
      GMTrace.o(9272431738880L, 69085);
      return;
    }
    this.oSU.setImageResource(a.g.nHx);
    GMTrace.o(9272431738880L, 69085);
  }
  
  public final void d(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9272297521152L, 69084);
    this.oSU.setOnClickListener(paramOnClickListener);
    GMTrace.o(9272297521152L, 69084);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9272163303424L, 69083);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != this.oTb) || (paramInt2 != this.oTc) || (paramInt3 != this.oTd) || (paramInt4 != this.oTe)) {
      bgJ();
    }
    this.oTb = paramInt1;
    this.oTc = paramInt2;
    this.oTd = paramInt3;
    this.oTe = paramInt4;
    GMTrace.o(9272163303424L, 69083);
  }
  
  public final void seek(int paramInt)
  {
    GMTrace.i(9272565956608L, 69086);
    this.jP = paramInt;
    bgJ();
    GMTrace.o(9272565956608L, 69086);
  }
  
  public final void tY(final int paramInt)
  {
    GMTrace.i(9272834392064L, 69088);
    if ((this.oST.isShown()) && (this.oST.getWidth() == 0))
    {
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9277397794816L, 69122);
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.tY(paramInt);
          GMTrace.o(9277397794816L, 69122);
        }
      });
      GMTrace.o(9272834392064L, 69088);
      return;
    }
    this.oSX = paramInt;
    this.jP = 0;
    this.oSW.setText(iL(this.oSX / 60) + ":" + iL(this.oSX % 60));
    bgJ();
    GMTrace.o(9272834392064L, 69088);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\SnsAdNativeLandingPagesVideoPlayerLoadingBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */