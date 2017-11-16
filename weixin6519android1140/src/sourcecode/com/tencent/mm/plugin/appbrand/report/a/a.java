package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.l;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class a
{
  private static final a iyw;
  public String appId;
  public int eAu;
  public String eAv;
  public String eAw;
  public String eDA;
  public int eVc;
  public int eVi;
  public String eVj;
  public com.tencent.mm.plugin.appbrand.e hzM;
  public long iyA;
  public long iyB;
  public String iyC;
  public int iyD;
  public String iyE;
  public long iyF;
  public int iyG;
  public int iyH;
  public String iyI;
  private boolean iyJ;
  public int iym;
  private final boolean iyv;
  public final LinkedList<String> iyx;
  public boolean iyy;
  public String iyz;
  public int scene;
  
  static
  {
    GMTrace.i(16283563196416L, 121322);
    iyw = new a(true);
    GMTrace.o(16283563196416L, 121322);
  }
  
  private a(boolean paramBoolean)
  {
    GMTrace.i(16283160543232L, 121319);
    this.iyx = new LinkedList();
    this.iyy = false;
    this.iyJ = true;
    this.iyv = paramBoolean;
    GMTrace.o(16283160543232L, 121319);
  }
  
  public static a a(com.tencent.mm.plugin.appbrand.e parame, String paramString, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(17302812622848L, 128916);
    a locala = new a(false);
    locala.eDA = paramString;
    paramString = com.tencent.mm.plugin.appbrand.a.nL(parame.hyD);
    locala.scene = paramString.scene;
    locala.eAv = paramString.eAv;
    locala.appId = parame.hyD;
    locala.hzM = parame;
    locala.eAu = (parame.hyG.hRg.hKB + 1);
    locala.eVc = parame.hyG.hRg.hKC;
    locala.iym = paramString.iym;
    locala.eVi = paramString.eVi;
    locala.eVj = paramString.eVj;
    if (paramLinkedList != null) {
      locala.iyx.addAll(paramLinkedList);
    }
    GMTrace.o(17302812622848L, 128916);
    return locala;
  }
  
  public static a aad()
  {
    GMTrace.i(16283294760960L, 121320);
    a locala = iyw;
    GMTrace.o(16283294760960L, 121320);
    return locala;
  }
  
  public final void e(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(16163035676672L, 120424);
    AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nK(this.appId);
    if (localAppBrandSysConfig != null)
    {
      this.eVc = localAppBrandSysConfig.hRg.hKC;
      this.iyG = l.SC().hKC;
    }
    this.iyF = paramAppBrandPageView.ivu.ivC;
    this.iyA = Math.max(0L, paramAppBrandPageView.ivu.ivD);
    this.iyB = Math.max(0L, paramAppBrandPageView.ivu.ivB.iyo);
    this.eAw = paramAppBrandPageView.ivj.hZo;
    this.iyI = paramAppBrandPageView.ivj.iwc;
    this.iyz = com.tencent.mm.plugin.appbrand.report.a.bP(ab.getContext());
    if (this.iyJ) {}
    for (int i = 1;; i = 0)
    {
      this.iyH = i;
      this.iyJ = false;
      GMTrace.o(16163035676672L, 120424);
      return;
    }
  }
  
  public final void rw()
  {
    GMTrace.i(16163304112128L, 120426);
    if (this.iyv)
    {
      GMTrace.o(16163304112128L, 120426);
      return;
    }
    w.i("MicroMsg.AppBrand.Report.kv_13536", "report " + toString());
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16255511691264L, 121113);
        for (;;)
        {
          try
          {
            str = (String)this.iyK[(this.iyK.length - 1)];
            if (!bg.nm(str))
            {
              i = str.indexOf('?');
              if (i >= 0) {
                continue;
              }
              str = "";
              this.iyK[(this.iyK.length - 1)] = str;
            }
          }
          catch (Exception localException)
          {
            String str;
            int i;
            this.iyK[(this.iyK.length - 1)] = "";
            continue;
          }
          g.ork.i(13536, com.tencent.mm.plugin.appbrand.report.d.g(this.iyK));
          KVCommCrossProcessReceiver.bbU();
          GMTrace.o(16255511691264L, 121113);
          return;
          str = com.tencent.mm.compatible.util.p.encode(str.substring(i + 1, str.length()));
        }
      }
    };
    if (this.iyy)
    {
      local1.run();
      try
      {
        KVCommCrossProcessReceiver.bbU();
        GMTrace.o(16163304112128L, 120426);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.AppBrand.Report.kv_13536", localException, "sendKV", new Object[0]);
        GMTrace.o(16163304112128L, 120426);
        return;
      }
    }
    com.tencent.mm.plugin.appbrand.o.d.xB().A(localException);
    GMTrace.o(16163304112128L, 120426);
  }
  
  public final String toString()
  {
    GMTrace.i(16163169894400L, 120425);
    String str = "kv_13536{scene=" + this.scene + ", sceneNote='" + this.eAv + '\'' + ", sessionId='" + this.eDA + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.eVc + ", appState=" + this.eAu + ", usedState=" + this.iym + ", pagePath='" + this.eAw + '\'' + ", networkType='" + this.iyz + '\'' + ", costTime=" + this.iyA + ", stayTime=" + this.iyB + ", referPagePath='" + this.iyC + '\'' + ", targetAction=" + this.iyD + ", targetPagePath='" + this.iyE + '\'' + ", clickTimestamp=" + this.iyF + ", publicLibVersion=" + this.iyG + ", preScene=" + this.eVi + ", preSceneNote='" + this.eVj + '\'' + ", isEntrance=" + this.iyH + '}';
    GMTrace.o(16163169894400L, 120425);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */