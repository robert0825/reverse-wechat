package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.protocal.c.bue;
import com.tencent.mm.protocal.c.lw;
import com.tencent.mm.protocal.c.lx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private final String appId;
  private final String eDW;
  private final String hUC;
  private final boolean hUD;
  
  private d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19907576070144L, 148323);
    this.appId = paramString1;
    this.eDW = paramString2;
    this.hUC = paramString3;
    this.hUD = false;
    GMTrace.o(19907576070144L, 148323);
  }
  
  public d(String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    this(paramString1, paramString2, paramString3);
    GMTrace.i(19907710287872L, 148324);
    GMTrace.o(19907710287872L, 148324);
  }
  
  private void g(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(19907844505600L, 148325);
    ((a)h.h(a.class)).RZ().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L);
    GMTrace.o(19907844505600L, 148325);
  }
  
  public final int Vk()
  {
    GMTrace.i(19907978723328L, 148326);
    Object localObject = this.appId;
    String str1 = this.eDW;
    String str2 = this.hUC;
    b.a locala = new b.a();
    lw locallw = new lw();
    locallw.eSd = ((String)localObject);
    locallw.ucz = str1;
    locallw.ucA = str2;
    locala.gtF = locallw;
    locala.gtG = new lx();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
    locala.gtE = 1124;
    localObject = c.c(locala.DA());
    int i;
    if ((((a.a)localObject).errType != 0) || (((a.a)localObject).errCode != 0))
    {
      w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s", new Object[] { this.appId, Integer.valueOf(((a.a)localObject).errType), Integer.valueOf(((a.a)localObject).errCode), ((a.a)localObject).eAR });
      i = a.hUH;
      GMTrace.o(19907978723328L, 148326);
      return i - 1;
    }
    try
    {
      localObject = (lx)((a.a)localObject).eWz;
      if (((lx)localObject).ucB == null)
      {
        w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", new Object[] { this.appId });
        i = a.hUI;
        GMTrace.o(19907978723328L, 148326);
        return i - 1;
      }
      w.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((lx)localObject).ucB.kBk), Boolean.valueOf(((lx)localObject).ucC), ((lx)localObject).ucD, ((lx)localObject).ucE });
      if (((lx)localObject).ucB.kBk != 0)
      {
        i = ((lx)localObject).ucB.kBk;
        GMTrace.o(19907978723328L, 148326);
        return i;
      }
      if ((((lx)localObject).ucC) && (!bg.nm(((lx)localObject).ucE)) && (!bg.nm(((lx)localObject).ucD))) {
        g(2, ((lx)localObject).ucD, ((lx)localObject).ucE);
      }
      if ((((lx)localObject).ucF) && (!bg.nm(((lx)localObject).ucH)) && (!bg.nm(((lx)localObject).ucG))) {
        g(10001, ((lx)localObject).ucG, ((lx)localObject).ucH);
      }
      i = a.hUE;
      GMTrace.o(19907978723328L, 148326);
      return i - 1;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
      i = a.hUI;
      GMTrace.o(19907978723328L, 148326);
    }
    return i - 1;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19907441852416L, 148322);
      hUE = 1;
      hUF = 2;
      hUG = 3;
      hUH = 4;
      hUI = 5;
      hUJ = 6;
      hUK = new int[] { hUE, hUF, hUG, hUH, hUI, hUJ };
      GMTrace.o(19907441852416L, 148322);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\launching\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */