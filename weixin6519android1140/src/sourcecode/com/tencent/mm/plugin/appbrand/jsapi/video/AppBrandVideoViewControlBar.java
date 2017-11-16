package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class AppBrandVideoViewControlBar
  extends VideoPlayerSeekBar
{
  private static int ims;
  ImageView imh;
  ImageView imi;
  private RelativeLayout imj;
  private ImageView imk;
  private TextView iml;
  private FrameLayout imm;
  b imn;
  aj imo;
  aj imp;
  boolean imq;
  boolean imr;
  
  static
  {
    GMTrace.i(17379048292352L, 129484);
    ims = -1;
    GMTrace.o(17379048292352L, 129484);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17376766590976L, 129467);
    GMTrace.o(17376766590976L, 129467);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17376900808704L, 129468);
    GMTrace.o(17376900808704L, 129468);
  }
  
  public AppBrandVideoViewControlBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17377035026432L, 129469);
    GMTrace.o(17377035026432L, 129469);
  }
  
  private void Xx()
  {
    GMTrace.i(17377571897344L, 129473);
    if (!this.imq)
    {
      if (this.eIC)
      {
        this.oSU.setImageResource(o.h.hDT);
        GMTrace.o(17377571897344L, 129473);
        return;
      }
      this.oSU.setImageResource(o.h.hDS);
      GMTrace.o(17377571897344L, 129473);
      return;
    }
    if (this.eIC)
    {
      this.oSU.setImageResource(o.h.hDQ);
      GMTrace.o(17377571897344L, 129473);
      return;
    }
    this.oSU.setImageResource(o.h.hDP);
    GMTrace.o(17377571897344L, 129473);
  }
  
  public final void WT()
  {
    GMTrace.i(17378108768256L, 129477);
    this.imq = false;
    XB();
    GMTrace.o(17378108768256L, 129477);
  }
  
  public final void XA()
  {
    GMTrace.i(17377974550528L, 129476);
    if (getVisibility() == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      setVisibility(8);
      GMTrace.o(17377974550528L, 129476);
      return;
    }
    Xz();
    GMTrace.o(17377974550528L, 129476);
  }
  
  final void XB()
  {
    GMTrace.i(17378242985984L, 129478);
    ViewGroup.LayoutParams localLayoutParams = this.imj.getLayoutParams();
    if (this.imq)
    {
      localLayoutParams.height = getResources().getDimensionPixelSize(o.d.hAk);
      this.imj.setLayoutParams(localLayoutParams);
      Xy();
      if (!this.imq) {
        break label133;
      }
      this.imh.setImageResource(o.h.hDO);
      label66:
      Xx();
      if (!this.imq) {
        break label146;
      }
    }
    label133:
    label146:
    for (float f = getResources().getDimensionPixelSize(o.d.hAl);; f = getResources().getDimensionPixelSize(o.d.hAj))
    {
      this.oSV.setTextSize(0, f);
      this.oSW.setTextSize(0, f);
      GMTrace.o(17378242985984L, 129478);
      return;
      localLayoutParams.height = getResources().getDimensionPixelSize(o.d.hAi);
      break;
      this.imh.setImageResource(o.h.hDR);
      break label66;
    }
  }
  
  final boolean XC()
  {
    GMTrace.i(17378377203712L, 129479);
    if (this.imn == null)
    {
      w.i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
      GMTrace.o(17378377203712L, 129479);
      return false;
    }
    int j = this.imn.Xj();
    int k = this.imn.Xk();
    if ((j < 0) || (k < 0))
    {
      GMTrace.o(17378377203712L, 129479);
      return false;
    }
    int i = this.imm.getWidth();
    if (i <= 0)
    {
      GMTrace.o(17378377203712L, 129479);
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
      GMTrace.o(17378377203712L, 129479);
      return false;
      i = (int)(i * (1.0F - j / k));
      break;
      label165:
      i = 0;
    }
    label170:
    GMTrace.o(17378377203712L, 129479);
    return true;
  }
  
  final void Xy()
  {
    GMTrace.i(17377706115072L, 129474);
    if (!this.imq)
    {
      if (this.imr)
      {
        this.imi.setImageResource(o.h.hDL);
        GMTrace.o(17377706115072L, 129474);
        return;
      }
      this.imi.setImageResource(o.h.hDK);
      GMTrace.o(17377706115072L, 129474);
      return;
    }
    if (this.imr)
    {
      this.imi.setImageResource(o.h.hDN);
      GMTrace.o(17377706115072L, 129474);
      return;
    }
    this.imi.setImageResource(o.h.hDM);
    GMTrace.o(17377706115072L, 129474);
  }
  
  public final void Xz()
  {
    GMTrace.i(17377840332800L, 129475);
    setVisibility(0);
    if (this.imo == null) {
      this.imo = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(17356365496320L, 129315);
          AppBrandVideoViewControlBar.this.setVisibility(8);
          AppBrandVideoViewControlBar.c(AppBrandVideoViewControlBar.this).stopTimer();
          GMTrace.o(17356365496320L, 129315);
          return false;
        }
      }, false);
    }
    this.imo.stopTimer();
    this.imo.z(7000L, 7000L);
    GMTrace.o(17377840332800L, 129475);
  }
  
  public final void cp(boolean paramBoolean)
  {
    GMTrace.i(17377437679616L, 129472);
    this.eIC = paramBoolean;
    Xx();
    GMTrace.o(17377437679616L, 129472);
  }
  
  public final void cq(boolean paramBoolean)
  {
    GMTrace.i(20369553489920L, 151765);
    if (paramBoolean)
    {
      this.imm.setVisibility(8);
      this.oSV.setVisibility(8);
      this.oSW.setVisibility(8);
      this.iml.setVisibility(0);
      GMTrace.o(20369553489920L, 151765);
      return;
    }
    this.imm.setVisibility(0);
    this.oSV.setVisibility(0);
    this.oSW.setVisibility(0);
    this.iml.setVisibility(8);
    GMTrace.o(20369553489920L, 151765);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17377169244160L, 129470);
    int i = o.g.hDp;
    GMTrace.o(17377169244160L, 129470);
    return i;
  }
  
  protected final void init()
  {
    GMTrace.i(17377303461888L, 129471);
    super.init();
    this.imh = ((ImageView)this.hqF.findViewById(o.f.bCm));
    this.imi = ((ImageView)this.hqF.findViewById(o.f.hBK));
    this.imk = ((ImageView)this.hqF.findViewById(o.f.bTn));
    this.imm = ((FrameLayout)this.hqF.findViewById(o.f.bTo));
    this.iml = ((TextView)findViewById(o.f.hBT));
    this.imj = ((RelativeLayout)findViewById(o.f.bZf));
    if (ims < 0) {
      ims = getResources().getDimensionPixelSize(o.d.hAm);
    }
    GMTrace.o(17377303461888L, 129471);
  }
  
  public static abstract interface a
  {
    public abstract void co(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract int Xj();
    
    public abstract int Xk();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\AppBrandVideoViewControlBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */