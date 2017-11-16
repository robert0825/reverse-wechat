package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.modelvideo.b;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.d.a;

public class AppBrandVideoWrapper
  extends RelativeLayout
  implements com.tencent.mm.pluginsdk.ui.h, h.a, h.b, h.c, d.a
{
  private float imA;
  private int imB;
  private boolean imC;
  private boolean imD;
  private com.tencent.mm.y.d imE;
  private com.tencent.mm.pluginsdk.ui.h imv;
  h.b imw;
  private com.tencent.mm.pluginsdk.ui.g imx;
  private h.d imy;
  private boolean imz;
  private Context mContext;
  private String url;
  
  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(17357036584960L, 129320);
    GMTrace.o(17357036584960L, 129320);
  }
  
  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17357170802688L, 129321);
    this.imy = h.d.ttz;
    this.imz = false;
    this.imA = -1.0F;
    this.mContext = paramContext;
    this.imE = new com.tencent.mm.y.d();
    GMTrace.o(17357170802688L, 129321);
  }
  
  private com.tencent.mm.pluginsdk.ui.h XD()
  {
    GMTrace.i(17357439238144L, 129323);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.tsC = this;
    localCommonVideoView.a(this);
    a(600L, 200L, 1L, false);
    GMTrace.o(17357439238144L, 129323);
    return localCommonVideoView;
  }
  
  private com.tencent.mm.pluginsdk.ui.h XE()
  {
    GMTrace.i(17357573455872L, 129324);
    MMVideoView localMMVideoView = new MMVideoView(this.mContext);
    localMMVideoView.tsC = this;
    localMMVideoView.a(this);
    localMMVideoView.hag = new AppBrandOnlineVideoProxy();
    localMMVideoView.hag.a(localMMVideoView);
    localMMVideoView.haj = this;
    String str = e.ghz + "appbrandvideo/";
    com.tencent.mm.sdk.platformtools.h.Nj(str);
    localMMVideoView.haf = str;
    a(600L, 201L, 1L, false);
    GMTrace.o(17357573455872L, 129324);
    return localMMVideoView;
  }
  
  private boolean a(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(17357707673600L, 129325);
    if ((paramBoolean) || (this.imD))
    {
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if (com.tencent.mm.compatible.util.d.eu(18))
    {
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    int i = ab.getContext().getSharedPreferences("system_config_prefs", 4).getInt("appbrand_video_player", -1);
    w.d("MicroMsg.AppBrandVideoWrapper", "checkUseSystemPlayer abtestFlag[%d]", new Object[] { Integer.valueOf(i) });
    if (i <= 0)
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "abtest is zero, use system player");
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if ((!bg.nm(paramString1)) && (paramString1.contains(".m3u8")))
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
      a(600L, 204L, 1L, false);
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if (q.mf(paramString2))
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
      a(600L, 204L, 1L, false);
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    GMTrace.o(17357707673600L, 129325);
    return false;
  }
  
  public final void A(int paramInt, String paramString)
  {
    GMTrace.i(17361465769984L, 129353);
    com.tencent.mm.plugin.report.service.g.ork.A(14349, paramString);
    GMTrace.o(17361465769984L, 129353);
  }
  
  public final void MR()
  {
    GMTrace.i(17359720939520L, 129340);
    if (this.imv != null) {
      this.imv.MR();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(17359720939520L, 129340);
  }
  
  public final void MS()
  {
    GMTrace.i(17359586721792L, 129339);
    if (this.imv != null) {
      this.imv.MS();
    }
    GMTrace.o(17359586721792L, 129339);
  }
  
  public final int MU()
  {
    GMTrace.i(17358647197696L, 129332);
    if (this.imv != null)
    {
      int i = this.imv.MU();
      GMTrace.o(17358647197696L, 129332);
      return i;
    }
    GMTrace.o(17358647197696L, 129332);
    return 0;
  }
  
  public final void O(String paramString, boolean paramBoolean)
  {
    GMTrace.i(17360257810432L, 129344);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      GMTrace.o(17360257810432L, 129344);
      return;
    }
    int i;
    if (a(false, "", paramString))
    {
      if (!(this.imv instanceof MMVideoView)) {
        break label319;
      }
      this.imv.stop();
      this.imv.XF();
      removeView((View)this.imv);
      w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.imv = XD();
      i = 1;
    }
    for (;;)
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
      GMTrace.o(17360257810432L, 129344);
      return;
      if ((this.imv instanceof CommonVideoView))
      {
        this.imv.stop();
        this.imv.XF();
        removeView((View)this.imv);
        w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.imv = XE();
        i = 1;
      }
      else
      {
        label319:
        i = 0;
      }
    }
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(17360123592704L, 129343);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(17360123592704L, 129343);
      return false;
    }
    this.imA = paramFloat;
    if (this.imv != null)
    {
      boolean bool = this.imv.T(this.imA);
      GMTrace.o(17360123592704L, 129343);
      return bool;
    }
    GMTrace.o(17360123592704L, 129343);
    return false;
  }
  
  public final void XF()
  {
    GMTrace.i(17357976109056L, 129327);
    if (this.imv != null) {
      this.imv.XF();
    }
    GMTrace.o(17357976109056L, 129327);
  }
  
  public final int XG()
  {
    GMTrace.i(17358378762240L, 129330);
    if (this.imv != null)
    {
      i = this.imv.XG();
      GMTrace.o(17358378762240L, 129330);
      return i;
    }
    int i = this.imB;
    GMTrace.o(17358378762240L, 129330);
    return i;
  }
  
  public final int XH()
  {
    GMTrace.i(17785862225920L, 132515);
    if (this.imv != null)
    {
      int i = this.imv.XH();
      GMTrace.o(17785862225920L, 132515);
      return i;
    }
    GMTrace.o(17785862225920L, 132515);
    return 0;
  }
  
  public final int XI()
  {
    GMTrace.i(17358512979968L, 129331);
    if (this.imv != null)
    {
      int i = this.imv.XI();
      GMTrace.o(17358512979968L, 129331);
      return i;
    }
    GMTrace.o(17358512979968L, 129331);
    return 0;
  }
  
  public final void XJ()
  {
    GMTrace.i(17359855157248L, 129341);
    if (this.imv != null) {
      this.imv.XJ();
    }
    this.imE.bf(false);
    setKeepScreenOn(false);
    GMTrace.o(17359855157248L, 129341);
  }
  
  public final boolean Xi()
  {
    GMTrace.i(17358915633152L, 129334);
    if (this.imv != null)
    {
      boolean bool = this.imv.Xi();
      GMTrace.o(17358915633152L, 129334);
      return bool;
    }
    GMTrace.o(17358915633152L, 129334);
    return false;
  }
  
  public final void Xq()
  {
    GMTrace.i(17360526245888L, 129346);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xq();
    }
    if (Xi())
    {
      a(600L, 203L, 1L, false);
      GMTrace.o(17360526245888L, 129346);
      return;
    }
    a(600L, 202L, 1L, false);
    GMTrace.o(17360526245888L, 129346);
  }
  
  public final void Xr()
  {
    GMTrace.i(17360660463616L, 129347);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.imw != null) {
      this.imw.Xr();
    }
    GMTrace.o(17360660463616L, 129347);
  }
  
  public final void Xs()
  {
    GMTrace.i(17360928899072L, 129349);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.imE.bf(false);
    if (this.imw != null) {
      this.imw.Xs();
    }
    GMTrace.o(17360928899072L, 129349);
  }
  
  public final void Xt()
  {
    GMTrace.i(17361063116800L, 129350);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.imE.a(this);
    if (this.imw != null) {
      this.imw.Xt();
    }
    GMTrace.o(17361063116800L, 129350);
  }
  
  public final void Xu()
  {
    GMTrace.i(20742947209216L, 154547);
    if (this.imw != null) {
      this.imw.Xu();
    }
    GMTrace.o(20742947209216L, 154547);
  }
  
  public final void Xv()
  {
    GMTrace.i(20743081426944L, 154548);
    if (this.imw != null) {
      this.imw.Xv();
    }
    GMTrace.o(20743081426944L, 154548);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(17361331552256L, 129352);
    com.tencent.mm.plugin.report.service.g.ork.a(600L, paramLong2, 1L, false);
    GMTrace.o(17361331552256L, 129352);
  }
  
  public final void a(com.tencent.mm.pluginsdk.ui.g paramg)
  {
    GMTrace.i(17357841891328L, 129326);
    this.imx = paramg;
    if (this.imv != null) {
      this.imv.a(this.imx);
    }
    GMTrace.o(17357841891328L, 129326);
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(17359989374976L, 129342);
    this.imy = paramd;
    if (this.imv != null) {
      this.imv.a(this.imy);
    }
    GMTrace.o(17359989374976L, 129342);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    int i = 1;
    GMTrace.i(17357305020416L, 129322);
    this.imB = paramInt;
    this.imC = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    if ((!bg.nm(localPString.value)) && (localPString.value.indexOf("wxfile://") == 0))
    {
      localPString.value = localPString.value.substring(9);
      paramBoolean = true;
      this.imD = paramBoolean;
      this.url = localPString.value;
      if (this.imv != null) {
        break label289;
      }
      if (!a(this.imC, this.url, "")) {
        break label253;
      }
      w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.imv = XD();
      paramInt = i;
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
      GMTrace.o(17357305020416L, 129322);
      return;
      paramBoolean = false;
      break;
      label253:
      w.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.imv = XE();
      paramInt = i;
      continue;
      label289:
      if (a(this.imC, this.url, ""))
      {
        if ((this.imv instanceof MMVideoView))
        {
          this.imv.stop();
          this.imv.XF();
          removeView((View)this.imv);
          w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.imv = XD();
          paramInt = i;
        }
        else
        {
          w.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.imv.stop();
          paramInt = 0;
        }
      }
      else if ((this.imv instanceof CommonVideoView))
      {
        this.imv.stop();
        this.imv.XF();
        removeView((View)this.imv);
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.imv = XE();
        paramInt = i;
      }
      else
      {
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use last mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.imv.stop();
        paramInt = 0;
      }
    }
  }
  
  public final void bs(int paramInt1, int paramInt2)
  {
    GMTrace.i(17360794681344L, 129348);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.bs(paramInt1, paramInt2);
    }
    GMTrace.o(17360794681344L, 129348);
  }
  
  public final boolean iN(int paramInt)
  {
    GMTrace.i(17358110326784L, 129328);
    if (this.imv != null)
    {
      boolean bool = this.imv.iN(paramInt);
      GMTrace.o(17358110326784L, 129328);
      return bool;
    }
    GMTrace.o(17358110326784L, 129328);
    return false;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(17358781415424L, 129333);
    if (this.imv != null)
    {
      boolean bool = this.imv.isPlaying();
      GMTrace.o(17358781415424L, 129333);
      return bool;
    }
    GMTrace.o(17358781415424L, 129333);
    return false;
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17358244544512L, 129329);
    if (this.imv != null)
    {
      paramBoolean = this.imv.o(paramInt, paramBoolean);
      GMTrace.o(17358244544512L, 129329);
      return paramBoolean;
    }
    GMTrace.o(17358244544512L, 129329);
    return false;
  }
  
  public final boolean pause()
  {
    GMTrace.i(17359318286336L, 129337);
    if (this.imv != null)
    {
      setKeepScreenOn(false);
      this.imE.bf(false);
      boolean bool = this.imv.pause();
      GMTrace.o(17359318286336L, 129337);
      return bool;
    }
    GMTrace.o(17359318286336L, 129337);
    return false;
  }
  
  public void setKeepScreenOn(boolean paramBoolean)
  {
    GMTrace.i(17361197334528L, 129351);
    w.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
    super.setKeepScreenOn(paramBoolean);
    GMTrace.o(17361197334528L, 129351);
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(17359452504064L, 129338);
    this.imz = paramBoolean;
    if (this.imv != null) {
      this.imv.setMute(this.imz);
    }
    GMTrace.o(17359452504064L, 129338);
  }
  
  public final void start()
  {
    GMTrace.i(17359049850880L, 129335);
    if (this.imv != null)
    {
      this.imv.start();
      setKeepScreenOn(true);
      this.imE.a(this);
    }
    GMTrace.o(17359049850880L, 129335);
  }
  
  public final void stop()
  {
    GMTrace.i(17359184068608L, 129336);
    if (this.imv != null)
    {
      this.imv.stop();
      this.imE.bf(false);
      setKeepScreenOn(false);
    }
    GMTrace.o(17359184068608L, 129336);
  }
  
  public final void w(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(20742812991488L, 154546);
    w.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.imw != null) {
      this.imw.w(paramString, paramInt1, paramInt2);
    }
    GMTrace.o(20742812991488L, 154546);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\AppBrandVideoWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */