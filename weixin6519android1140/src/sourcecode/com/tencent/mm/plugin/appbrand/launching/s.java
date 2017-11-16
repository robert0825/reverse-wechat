package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.protocal.c.bue;
import com.tencent.mm.protocal.c.lw;
import com.tencent.mm.protocal.c.lx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class s
{
  private final String appId;
  private final String eDW;
  private final String hUC;
  private final boolean hUD;
  
  public s(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(17669227020288L, 131646);
    this.appId = paramString1;
    this.eDW = paramString2;
    this.hUC = paramString3;
    this.hUD = paramBoolean;
    GMTrace.o(17669227020288L, 131646);
  }
  
  private void g(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(17669495455744L, 131648);
    if ((e.Sl().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L)) && (this.hUD)) {
      d.as(this.appId, 2);
    }
    GMTrace.o(17669495455744L, 131648);
  }
  
  public final int Vk()
  {
    GMTrace.i(10153973776384L, 75653);
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
      i = a.iqH.ordinal();
      GMTrace.o(10153973776384L, 75653);
      return i;
    }
    try
    {
      localObject = (lx)((a.a)localObject).eWz;
      if (((lx)localObject).ucB == null)
      {
        w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", new Object[] { this.appId });
        i = a.iqI.ordinal();
        GMTrace.o(10153973776384L, 75653);
        return i;
      }
      w.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((lx)localObject).ucB.kBk), Boolean.valueOf(((lx)localObject).ucC), ((lx)localObject).ucD, ((lx)localObject).ucE });
      if (((lx)localObject).ucB.kBk != 0)
      {
        i = ((lx)localObject).ucB.kBk;
        GMTrace.o(10153973776384L, 75653);
        return i;
      }
      if ((((lx)localObject).ucC) && (!bg.nm(((lx)localObject).ucE)) && (!bg.nm(((lx)localObject).ucD))) {
        g(2, ((lx)localObject).ucD, ((lx)localObject).ucE);
      }
      if ((((lx)localObject).ucF) && (!bg.nm(((lx)localObject).ucH)) && (!bg.nm(((lx)localObject).ucG))) {
        g(10001, ((lx)localObject).ucG, ((lx)localObject).ucH);
      }
      i = a.iqE.ordinal();
      GMTrace.o(10153973776384L, 75653);
      return i;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
      i = a.iqI.ordinal();
      GMTrace.o(10153973776384L, 75653);
    }
    return i;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10148739284992L, 75614);
      iqE = new a("Ok", 0);
      iqF = new a("Fail", 1);
      iqG = new a("Timeout", 2);
      iqH = new a("CgiFail", 3);
      iqI = new a("ResponseInvalid", 4);
      iqJ = new a("AwaitFail", 5);
      iqK = new a[] { iqE, iqF, iqG, iqH, iqI, iqJ };
      GMTrace.o(10148739284992L, 75614);
    }
    
    private a()
    {
      GMTrace.i(10148470849536L, 75612);
      GMTrace.o(10148470849536L, 75612);
    }
    
    public static a iV(int paramInt)
    {
      GMTrace.i(10148605067264L, 75613);
      if (paramInt < 0)
      {
        GMTrace.o(10148605067264L, 75613);
        return null;
      }
      a[] arrayOfa = values();
      int j = arrayOfa.length;
      int i = 0;
      while (i < j)
      {
        a locala = arrayOfa[i];
        if (locala.ordinal() == paramInt)
        {
          GMTrace.o(10148605067264L, 75613);
          return locala;
        }
        i += 1;
      }
      GMTrace.o(10148605067264L, 75613);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */