package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.d;
import com.tencent.mm.y.d.a;

public class FtsVideoWrapper
  extends RelativeLayout
  implements h, h.a, h.b, h.c, d.a
{
  private float imA;
  private int imB;
  private boolean imC;
  private boolean imD;
  private d imE;
  private h imv;
  h.b imw;
  private com.tencent.mm.pluginsdk.ui.g imx;
  private h.d imy;
  private boolean imz;
  private Context mContext;
  private String url;
  
  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(20454915964928L, 152401);
    GMTrace.o(20454915964928L, 152401);
  }
  
  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20455050182656L, 152402);
    this.imy = h.d.ttz;
    this.imz = false;
    this.imA = -1.0F;
    this.mContext = paramContext;
    this.imE = new d();
    GMTrace.o(20455050182656L, 152402);
  }
  
  private h XD()
  {
    GMTrace.i(20455318618112L, 152404);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.tsC = this;
    localCommonVideoView.a(this);
    GMTrace.o(20455318618112L, 152404);
    return localCommonVideoView;
  }
  
  public final void A(int paramInt, String paramString)
  {
    GMTrace.i(20459479367680L, 152435);
    com.tencent.mm.plugin.report.service.g.ork.A(14349, paramString);
    GMTrace.o(20459479367680L, 152435);
  }
  
  public final void MR()
  {
    GMTrace.i(20457466101760L, 152420);
    if (this.imv != null) {
      this.imv.MR();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(20457466101760L, 152420);
  }
  
  public final void MS()
  {
    GMTrace.i(20457331884032L, 152419);
    if (this.imv != null) {
      this.imv.MS();
    }
    GMTrace.o(20457331884032L, 152419);
  }
  
  public final int MU()
  {
    GMTrace.i(20456392359936L, 152412);
    if (this.imv != null)
    {
      int i = this.imv.MU();
      GMTrace.o(20456392359936L, 152412);
      return i;
    }
    GMTrace.o(20456392359936L, 152412);
    return 0;
  }
  
  public final void O(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20458002972672L, 152424);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      GMTrace.o(20458002972672L, 152424);
      return;
    }
    if ((this.imv instanceof MMVideoView))
    {
      this.imv.stop();
      this.imv.XF();
      removeView((View)this.imv);
      w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.imv = XD();
    }
    for (int i = 1;; i = 0)
    {
      a(this.imy);
      T(this.imA);
      setMute(this.imz);
      if (i != 0)
      {
        a(this.imx);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.imv, paramString);
        this.imv.b(this.imC, this.url, this.imB);
        this.imv.start();
      }
      GMTrace.o(20458002972672L, 152424);
      return;
    }
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(20457868754944L, 152423);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(20457868754944L, 152423);
      return false;
    }
    this.imA = paramFloat;
    if (this.imv != null)
    {
      boolean bool = this.imv.T(this.imA);
      GMTrace.o(20457868754944L, 152423);
      return bool;
    }
    GMTrace.o(20457868754944L, 152423);
    return false;
  }
  
  public final void XF()
  {
    GMTrace.i(20455587053568L, 152406);
    if (this.imv != null) {
      this.imv.XF();
    }
    GMTrace.o(20455587053568L, 152406);
  }
  
  public final int XG()
  {
    GMTrace.i(20455989706752L, 152409);
    if (this.imv != null)
    {
      i = this.imv.XG();
      GMTrace.o(20455989706752L, 152409);
      return i;
    }
    int i = this.imB;
    GMTrace.o(20455989706752L, 152409);
    return i;
  }
  
  public final int XH()
  {
    GMTrace.i(20456123924480L, 152410);
    if (this.imv != null)
    {
      int i = this.imv.XH();
      GMTrace.o(20456123924480L, 152410);
      return i;
    }
    GMTrace.o(20456123924480L, 152410);
    return 0;
  }
  
  public final int XI()
  {
    GMTrace.i(20456258142208L, 152411);
    if (this.imv != null)
    {
      int i = this.imv.XI();
      GMTrace.o(20456258142208L, 152411);
      return i;
    }
    GMTrace.o(20456258142208L, 152411);
    return 0;
  }
  
  public final void XJ()
  {
    GMTrace.i(20457600319488L, 152421);
    if (this.imv != null) {
      this.imv.XJ();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(20457600319488L, 152421);
  }
  
  public final boolean Xi()
  {
    GMTrace.i(20456660795392L, 152414);
    if (this.imv != null)
    {
      boolean bool = this.imv.Xi();
      GMTrace.o(20456660795392L, 152414);
      return bool;
    }
    GMTrace.o(20456660795392L, 152414);
    return false;
  }
  
  public final void Xq()
  {
    GMTrace.i(20458271408128L, 152426);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xq();
    }
    GMTrace.o(20458271408128L, 152426);
  }
  
  public final void Xr()
  {
    GMTrace.i(20458405625856L, 152427);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xr();
    }
    GMTrace.o(20458405625856L, 152427);
  }
  
  public final void Xs()
  {
    GMTrace.i(20458674061312L, 152429);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.imE.bf(false);
    if (this.imw != null) {
      this.imw.Xs();
    }
    GMTrace.o(20458674061312L, 152429);
  }
  
  public final void Xt()
  {
    GMTrace.i(20458808279040L, 152430);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.imE.a(this);
    if (this.imw != null) {
      this.imw.Xt();
    }
    GMTrace.o(20458808279040L, 152430);
  }
  
  public final void Xu()
  {
    GMTrace.i(20458942496768L, 152431);
    if (this.imw != null) {
      this.imw.Xu();
    }
    GMTrace.o(20458942496768L, 152431);
  }
  
  public final void Xv()
  {
    GMTrace.i(20459076714496L, 152432);
    if (this.imw != null) {
      this.imw.Xv();
    }
    GMTrace.o(20459076714496L, 152432);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(20459345149952L, 152434);
    com.tencent.mm.plugin.report.service.g.ork.a(600L, paramLong2, 1L, false);
    GMTrace.o(20459345149952L, 152434);
  }
  
  public final void a(com.tencent.mm.pluginsdk.ui.g paramg)
  {
    GMTrace.i(20455452835840L, 152405);
    this.imx = paramg;
    if (this.imv != null) {
      this.imv.a(this.imx);
    }
    GMTrace.o(20455452835840L, 152405);
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(20457734537216L, 152422);
    this.imy = paramd;
    if (this.imv != null) {
      this.imv.a(this.imy);
    }
    GMTrace.o(20457734537216L, 152422);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    GMTrace.i(20455184400384L, 152403);
    this.imB = paramInt;
    this.imC = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    bg.nm(localPString.value);
    this.imD = false;
    this.url = localPString.value;
    if (this.imv == null)
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.imv = XD();
      paramInt = 1;
    }
    for (;;)
    {
      a(this.imy);
      T(this.imA);
      setMute(this.imz);
      if (paramInt != 0)
      {
        a(this.imx);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.imv, paramString);
      }
      this.imv.b(this.imC, this.url, this.imB);
      GMTrace.o(20455184400384L, 152403);
      return;
      if ((this.imv instanceof MMVideoView))
      {
        this.imv.stop();
        this.imv.XF();
        removeView((View)this.imv);
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.imv = XD();
        paramInt = 1;
      }
      else
      {
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.imv.stop();
        paramInt = 0;
      }
    }
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(20458539843584L, 152428);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.bs(paramInt1, paramInt2);
    }
    GMTrace.o(20458539843584L, 152428);
  }
  
  public final boolean iN(int paramInt)
  {
    GMTrace.i(20455721271296L, 152407);
    if (this.imv != null)
    {
      boolean bool = this.imv.iN(paramInt);
      GMTrace.o(20455721271296L, 152407);
      return bool;
    }
    GMTrace.o(20455721271296L, 152407);
    return false;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(20456526577664L, 152413);
    if (this.imv != null)
    {
      boolean bool = this.imv.isPlaying();
      GMTrace.o(20456526577664L, 152413);
      return bool;
    }
    GMTrace.o(20456526577664L, 152413);
    return false;
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20455855489024L, 152408);
    if (this.imv != null)
    {
      paramBoolean = this.imv.o(paramInt, paramBoolean);
      GMTrace.o(20455855489024L, 152408);
      return paramBoolean;
    }
    GMTrace.o(20455855489024L, 152408);
    return false;
  }
  
  public final boolean pause()
  {
    GMTrace.i(20457063448576L, 152417);
    if (this.imv != null)
    {
      setKeepScreenOn(false);
      this.imE.bf(false);
      boolean bool = this.imv.pause();
      GMTrace.o(20457063448576L, 152417);
      return bool;
    }
    GMTrace.o(20457063448576L, 152417);
    return false;
  }
  
  public void setKeepScreenOn(boolean paramBoolean)
  {
    GMTrace.i(20459210932224L, 152433);
    w.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
    super.setKeepScreenOn(paramBoolean);
    GMTrace.o(20459210932224L, 152433);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(20457197666304L, 152418);
    this.imz = paramBoolean;
    if (this.imv != null) {
      this.imv.setMute(this.imz);
    }
    GMTrace.o(20457197666304L, 152418);
  }
  
  public final void start()
  {
    GMTrace.i(20456795013120L, 152415);
    if (this.imv != null)
    {
      this.imv.start();
      setKeepScreenOn(true);
      this.imE.a(this);
    }
    GMTrace.o(20456795013120L, 152415);
  }
  
  public final void stop()
  {
    GMTrace.i(20456929230848L, 152416);
    if (this.imv != null)
    {
      this.imv.stop();
      this.imE.bf(false);
      setKeepScreenOn(false);
    }
    GMTrace.o(20456929230848L, 152416);
  }
  
  public final void w(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(20458137190400L, 152425);
    w.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.w(paramString, paramInt1, paramInt2);
    }
    GMTrace.o(20458137190400L, 152425);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\FtsVideoWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */