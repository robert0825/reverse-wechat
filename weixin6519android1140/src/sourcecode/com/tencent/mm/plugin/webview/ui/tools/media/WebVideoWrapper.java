package com.tencent.mm.plugin.webview.ui.tools.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.d;
import com.tencent.mm.y.d.a;

public class WebVideoWrapper
  extends RelativeLayout
  implements h, h.b, h.c, d.a
{
  private int imB;
  private boolean imC;
  private d imE;
  private h imv;
  private h.b imw;
  private Context mContext;
  private String url;
  
  public WebVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(20448876167168L, 152356);
    GMTrace.o(20448876167168L, 152356);
  }
  
  public WebVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20449010384896L, 152357);
    this.mContext = paramContext;
    this.imE = new d();
    if (this.imv == null)
    {
      paramContext = new CommonVideoView(this.mContext);
      paramContext.tsC = this;
      paramContext.a(this);
      a(600L, 200L, 1L, false);
      this.imv = paramContext;
    }
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(13);
    addView((View)this.imv, paramContext);
    GMTrace.o(20449010384896L, 152357);
  }
  
  public final void A(int paramInt, String paramString)
  {
    GMTrace.i(20453171134464L, 152388);
    com.tencent.mm.plugin.report.service.g.ork.A(14349, paramString);
    GMTrace.o(20453171134464L, 152388);
  }
  
  public final void MR()
  {
    GMTrace.i(20451292086272L, 152374);
    if (this.imv != null) {
      this.imv.MR();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(20451292086272L, 152374);
  }
  
  public final void MS()
  {
    GMTrace.i(20451157868544L, 152373);
    if (this.imv != null) {
      this.imv.MS();
    }
    GMTrace.o(20451157868544L, 152373);
  }
  
  public final int MU()
  {
    GMTrace.i(20450218344448L, 152366);
    if (this.imv != null)
    {
      int i = this.imv.MU();
      GMTrace.o(20450218344448L, 152366);
      return i;
    }
    GMTrace.o(20450218344448L, 152366);
    return 0;
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(20451694739456L, 152377);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(20451694739456L, 152377);
      return false;
    }
    if (this.imv != null)
    {
      boolean bool = this.imv.T(paramFloat);
      GMTrace.o(20451694739456L, 152377);
      return bool;
    }
    GMTrace.o(20451694739456L, 152377);
    return false;
  }
  
  public final void XF()
  {
    GMTrace.i(20449413038080L, 152360);
    if (this.imv != null) {
      this.imv.XF();
    }
    GMTrace.o(20449413038080L, 152360);
  }
  
  public final int XG()
  {
    GMTrace.i(20449815691264L, 152363);
    if (this.imv != null)
    {
      i = this.imv.XG();
      GMTrace.o(20449815691264L, 152363);
      return i;
    }
    int i = this.imB;
    GMTrace.o(20449815691264L, 152363);
    return i;
  }
  
  public final int XH()
  {
    GMTrace.i(20449949908992L, 152364);
    if (this.imv != null)
    {
      int i = this.imv.XH();
      GMTrace.o(20449949908992L, 152364);
      return i;
    }
    GMTrace.o(20449949908992L, 152364);
    return 0;
  }
  
  public final int XI()
  {
    GMTrace.i(20450084126720L, 152365);
    if (this.imv != null)
    {
      int i = this.imv.XI();
      GMTrace.o(20450084126720L, 152365);
      return i;
    }
    GMTrace.o(20450084126720L, 152365);
    return 0;
  }
  
  public final void XJ()
  {
    GMTrace.i(20451426304000L, 152375);
    if (this.imv != null) {
      this.imv.XJ();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(20451426304000L, 152375);
  }
  
  public final boolean Xi()
  {
    GMTrace.i(20450486779904L, 152368);
    if (this.imv != null)
    {
      boolean bool = this.imv.Xi();
      GMTrace.o(20450486779904L, 152368);
      return bool;
    }
    GMTrace.o(20450486779904L, 152368);
    return false;
  }
  
  public final void Xq()
  {
    GMTrace.i(20451963174912L, 152379);
    w.i("MicroMsg.WebVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xq();
    }
    GMTrace.o(20451963174912L, 152379);
  }
  
  public final void Xr()
  {
    GMTrace.i(20452097392640L, 152380);
    w.i("MicroMsg.WebVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xr();
    }
    GMTrace.o(20452097392640L, 152380);
  }
  
  public final void Xs()
  {
    GMTrace.i(20452365828096L, 152382);
    w.d("MicroMsg.WebVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.imE.bf(false);
    if (this.imw != null) {
      this.imw.Xs();
    }
    GMTrace.o(20452365828096L, 152382);
  }
  
  public final void Xt()
  {
    GMTrace.i(20452500045824L, 152383);
    w.d("MicroMsg.WebVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.imE.a(this);
    if (this.imw != null) {
      this.imw.Xt();
    }
    GMTrace.o(20452500045824L, 152383);
  }
  
  public final void Xu()
  {
    GMTrace.i(20452634263552L, 152384);
    if (this.imw != null) {
      this.imw.Xu();
    }
    GMTrace.o(20452634263552L, 152384);
  }
  
  public final void Xv()
  {
    GMTrace.i(20452768481280L, 152385);
    if (this.imw != null) {
      this.imw.Xv();
    }
    GMTrace.o(20452768481280L, 152385);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(20453036916736L, 152387);
    com.tencent.mm.plugin.report.service.g.ork.a(600L, paramLong2, 1L, false);
    GMTrace.o(20453036916736L, 152387);
  }
  
  public final void a(com.tencent.mm.pluginsdk.ui.g paramg)
  {
    GMTrace.i(20449278820352L, 152359);
    if (this.imv != null) {
      this.imv.a(paramg);
    }
    GMTrace.o(20449278820352L, 152359);
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(20451560521728L, 152376);
    if (this.imv != null) {
      this.imv.a(paramd);
    }
    GMTrace.o(20451560521728L, 152376);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    GMTrace.i(20449144602624L, 152358);
    this.imB = paramInt;
    this.imC = paramBoolean;
    this.url = paramString;
    if (this.imv != null) {
      this.imv.b(this.imC, this.url, this.imB);
    }
    GMTrace.o(20449144602624L, 152358);
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(20452231610368L, 152381);
    w.i("MicroMsg.WebVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.bs(paramInt1, paramInt2);
    }
    GMTrace.o(20452231610368L, 152381);
  }
  
  public final boolean iN(int paramInt)
  {
    GMTrace.i(20449547255808L, 152361);
    if (this.imv != null)
    {
      boolean bool = this.imv.iN(paramInt);
      GMTrace.o(20449547255808L, 152361);
      return bool;
    }
    GMTrace.o(20449547255808L, 152361);
    return false;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(20450352562176L, 152367);
    if (this.imv != null)
    {
      boolean bool = this.imv.isPlaying();
      GMTrace.o(20450352562176L, 152367);
      return bool;
    }
    GMTrace.o(20450352562176L, 152367);
    return false;
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20449681473536L, 152362);
    if (this.imv != null)
    {
      paramBoolean = this.imv.o(paramInt, paramBoolean);
      GMTrace.o(20449681473536L, 152362);
      return paramBoolean;
    }
    GMTrace.o(20449681473536L, 152362);
    return false;
  }
  
  public final boolean pause()
  {
    GMTrace.i(20450889433088L, 152371);
    if (this.imv != null)
    {
      setKeepScreenOn(false);
      this.imE.bf(false);
      boolean bool = this.imv.pause();
      GMTrace.o(20450889433088L, 152371);
      return bool;
    }
    GMTrace.o(20450889433088L, 152371);
    return false;
  }
  
  public void setKeepScreenOn(boolean paramBoolean)
  {
    GMTrace.i(20452902699008L, 152386);
    w.d("MicroMsg.WebVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
    super.setKeepScreenOn(paramBoolean);
    GMTrace.o(20452902699008L, 152386);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(20451023650816L, 152372);
    if (this.imv != null) {
      this.imv.setMute(paramBoolean);
    }
    GMTrace.o(20451023650816L, 152372);
  }
  
  public final void start()
  {
    GMTrace.i(20450620997632L, 152369);
    if (this.imv != null)
    {
      this.imv.start();
      setKeepScreenOn(true);
      this.imE.a(this);
    }
    GMTrace.o(20450620997632L, 152369);
  }
  
  public final void stop()
  {
    GMTrace.i(20450755215360L, 152370);
    if (this.imv != null)
    {
      this.imv.stop();
      this.imE.bf(false);
      setKeepScreenOn(false);
    }
    GMTrace.o(20450755215360L, 152370);
  }
  
  public final void w(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(20451828957184L, 152378);
    w.w("MicroMsg.WebVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.w(paramString, paramInt1, paramInt2);
    }
    GMTrace.o(20451828957184L, 152378);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\media\WebVideoWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */