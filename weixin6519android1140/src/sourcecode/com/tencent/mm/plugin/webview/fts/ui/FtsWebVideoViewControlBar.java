package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class FtsWebVideoViewControlBar
  extends FtsVideoPlayerSeekBar
{
  private static int ims;
  ImageView imh;
  private RelativeLayout imj;
  private ImageView imk;
  private FrameLayout imm;
  public aj imo;
  public aj imp;
  public boolean imq;
  ImageView rDE;
  a rDF;
  ImageView rDt;
  
  static
  {
    GMTrace.i(20478806720512L, 152579);
    ims = -1;
    GMTrace.o(20478806720512L, 152579);
  }
  
  public FtsWebVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20475853930496L, 152557);
    GMTrace.o(20475853930496L, 152557);
  }
  
  public FtsWebVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20475988148224L, 152558);
    GMTrace.o(20475988148224L, 152558);
  }
  
  public FtsWebVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20476122365952L, 152559);
    GMTrace.o(20476122365952L, 152559);
  }
  
  private void Xx()
  {
    GMTrace.i(20476793454592L, 152564);
    if (!this.imq)
    {
      if (this.eIC)
      {
        this.oSU.setImageResource(R.g.aWI);
        GMTrace.o(20476793454592L, 152564);
        return;
      }
      this.oSU.setImageResource(R.g.aWL);
      GMTrace.o(20476793454592L, 152564);
      return;
    }
    if (this.eIC)
    {
      this.oSU.setImageResource(R.g.aWI);
      GMTrace.o(20476793454592L, 152564);
      return;
    }
    this.oSU.setImageResource(R.g.aWL);
    GMTrace.o(20476793454592L, 152564);
  }
  
  public final void WT()
  {
    GMTrace.i(20477867196416L, 152572);
    this.imq = false;
    XB();
    GMTrace.o(20477867196416L, 152572);
  }
  
  final void XB()
  {
    GMTrace.i(20478001414144L, 152573);
    ViewGroup.LayoutParams localLayoutParams = this.imj.getLayoutParams();
    if (this.imq)
    {
      localLayoutParams.height = getResources().getDimensionPixelSize(R.f.aSh);
      this.imj.setLayoutParams(localLayoutParams);
      if (!this.imq) {
        break label146;
      }
      this.imh.setImageResource(R.k.cMI);
      this.imh.setVisibility(8);
      this.rDt.setVisibility(0);
      label79:
      Xx();
      if (!this.imq) {
        break label176;
      }
    }
    label146:
    label176:
    for (float f = getResources().getDimensionPixelSize(R.f.aSi);; f = getResources().getDimensionPixelSize(R.f.aSg))
    {
      this.oSV.setTextSize(0, f);
      this.oSW.setTextSize(0, f);
      GMTrace.o(20478001414144L, 152573);
      return;
      localLayoutParams.height = getResources().getDimensionPixelSize(R.f.aSf);
      break;
      this.rDt.setVisibility(8);
      this.imh.setVisibility(0);
      this.imh.setImageResource(R.g.aWJ);
      break label79;
    }
  }
  
  final boolean XC()
  {
    GMTrace.i(20478135631872L, 152574);
    if (this.rDF == null)
    {
      w.i("MicroMsg.FtsWebVideoViewControlBar", "updateMiddleBar mStatePorter null");
      GMTrace.o(20478135631872L, 152574);
      return false;
    }
    int j = this.rDF.Xj();
    int k = this.rDF.Xk();
    if ((j < 0) || (k < 0))
    {
      GMTrace.o(20478135631872L, 152574);
      return false;
    }
    int i = this.imm.getWidth();
    if (i <= 0)
    {
      GMTrace.o(20478135631872L, 152574);
      return true;
    }
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.imk.getLayoutParams();
    if (k == 0) {
      if (i <= 0) {
        break label165;
      }
    }
    for (;;)
    {
      localLayoutParams.rightMargin = (i + ims);
      this.imk.setLayoutParams(localLayoutParams);
      if ((j < k) || (k == 0)) {
        break label170;
      }
      GMTrace.o(20478135631872L, 152574);
      return false;
      i = (int)(i * (1.0F - j / k));
      break;
      label165:
      i = 0;
    }
    label170:
    GMTrace.o(20478135631872L, 152574);
    return true;
  }
  
  public final void bBU()
  {
    GMTrace.i(20477196107776L, 152567);
    this.rDE.setImageResource(R.g.aWK);
    GMTrace.o(20477196107776L, 152567);
  }
  
  public final void bBV()
  {
    GMTrace.i(20477464543232L, 152569);
    if (this.imo != null) {
      this.imo.stopTimer();
    }
    GMTrace.o(20477464543232L, 152569);
  }
  
  public final void bBW()
  {
    GMTrace.i(20477598760960L, 152570);
    if (this.imo != null)
    {
      this.imo.stopTimer();
      this.imo.z(2000L, 2000L);
    }
    GMTrace.o(20477598760960L, 152570);
  }
  
  public final void bBX()
  {
    GMTrace.i(20478269849600L, 152575);
    this.oSU.setVisibility(8);
    GMTrace.o(20478269849600L, 152575);
  }
  
  public final void bBY()
  {
    GMTrace.i(20478404067328L, 152576);
    this.oSU.setVisibility(0);
    GMTrace.o(20478404067328L, 152576);
  }
  
  protected final int bgI()
  {
    GMTrace.i(20476659236864L, 152563);
    int i = this.oST.getWidth();
    GMTrace.o(20476659236864L, 152563);
    return i;
  }
  
  public final void cp(boolean paramBoolean)
  {
    GMTrace.i(20476525019136L, 152562);
    this.eIC = paramBoolean;
    Xx();
    GMTrace.o(20476525019136L, 152562);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20476256583680L, 152560);
    int i = R.i.cyb;
    GMTrace.o(20476256583680L, 152560);
    return i;
  }
  
  protected final void init()
  {
    GMTrace.i(20476390801408L, 152561);
    super.init();
    this.imh = ((ImageView)this.hqF.findViewById(R.h.bCm));
    this.rDE = ((ImageView)this.hqF.findViewById(R.h.clj));
    this.imk = ((ImageView)this.hqF.findViewById(R.h.bTn));
    this.imm = ((FrameLayout)this.hqF.findViewById(R.h.bTo));
    this.imj = ((RelativeLayout)findViewById(R.h.bZf));
    this.rDt = ((ImageView)this.hqF.findViewById(R.h.bxW));
    if (ims < 0) {
      ims = getResources().getDimensionPixelSize(R.f.aSj);
    }
    GMTrace.o(20476390801408L, 152561);
  }
  
  public final void js(boolean paramBoolean)
  {
    GMTrace.i(20477732978688L, 152571);
    if (getVisibility() == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      setVisibility(8);
      GMTrace.o(20477732978688L, 152571);
      return;
    }
    setVisibility(0);
    if (!paramBoolean) {
      bBY();
    }
    for (;;)
    {
      if (this.imo == null) {
        this.imo = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(20472766922752L, 152534);
            FtsWebVideoViewControlBar.this.setVisibility(8);
            FtsWebVideoViewControlBar.a(FtsWebVideoViewControlBar.this).stopTimer();
            GMTrace.o(20472766922752L, 152534);
            return false;
          }
        }, false);
      }
      this.imo.stopTimer();
      this.imo.z(2000L, 2000L);
      GMTrace.o(20477732978688L, 152571);
      return;
      bBX();
    }
  }
  
  public final void uM(int paramInt)
  {
    GMTrace.i(21047755669504L, 156818);
    seek((int)Math.ceil(this.rDF.ctW() * 1.0D / 1000.0D));
    GMTrace.o(21047755669504L, 156818);
  }
  
  public final void uN()
  {
    GMTrace.i(20477061890048L, 152566);
    this.rDE.setImageResource(R.g.aWN);
    GMTrace.o(20477061890048L, 152566);
  }
  
  public static abstract interface a
  {
    public abstract int Xj();
    
    public abstract int Xk();
    
    public abstract int ctW();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\FtsWebVideoViewControlBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */