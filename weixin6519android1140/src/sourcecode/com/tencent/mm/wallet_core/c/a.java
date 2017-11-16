package com.tencent.mm.wallet_core.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tenpay.cert.CertUtil;

public final class a
{
  static boolean isInit;
  private static a xCY;
  private boolean xCZ;
  
  static
  {
    GMTrace.i(1452638470144L, 10823);
    xCY = null;
    isInit = false;
    GMTrace.o(1452638470144L, 10823);
  }
  
  public a()
  {
    GMTrace.i(1450625204224L, 10808);
    this.xCZ = false;
    GMTrace.o(1450625204224L, 10808);
  }
  
  public static a clF()
  {
    GMTrace.i(1450759421952L, 10809);
    if (xCY == null) {
      xCY = new a();
    }
    a locala = xCY;
    GMTrace.o(1450759421952L, 10809);
    return locala;
  }
  
  public static void clean()
  {
    GMTrace.i(1452504252416L, 10822);
    w.d("MicroMsg.CertUtilWx", "clean allcrt stack %s", new Object[] { bg.bQW().toString() });
    CertUtil.getInstance().clearAllCert();
    GMTrace.o(1452504252416L, 10822);
  }
  
  public static void clearCert(String paramString)
  {
    GMTrace.i(1452370034688L, 10821);
    w.d("MicroMsg.CertUtilWx", "clearCert stack %s", new Object[] { bg.bQW().toString() });
    CertUtil.getInstance().clearCert(paramString);
    GMTrace.o(1452370034688L, 10821);
  }
  
  public static void clearToken(String paramString)
  {
    GMTrace.i(1451967381504L, 10818);
    w.d("MicroMsg.CertUtilWx", "clearToken stack %s", new Object[] { bg.bQW().toString() });
    CertUtil.getInstance().clearToken(paramString);
    GMTrace.o(1451967381504L, 10818);
  }
  
  public static String genUserSig(String paramString1, String paramString2)
  {
    GMTrace.i(1451564728320L, 10815);
    w.d("MicroMsg.CertUtilWx", "genUserSig stack %s", new Object[] { bg.bQW().toString() });
    paramString1 = CertUtil.getInstance().genUserSig(paramString1, paramString2);
    GMTrace.o(1451564728320L, 10815);
    return paramString1;
  }
  
  public static int getLastError()
  {
    GMTrace.i(1452235816960L, 10820);
    w.d("MicroMsg.CertUtilWx", "getLastError stack %s", new Object[] { bg.bQW().toString() });
    int i = CertUtil.getInstance().getLastError();
    GMTrace.o(1452235816960L, 10820);
    return i;
  }
  
  public static String getToken(String paramString)
  {
    GMTrace.i(1451833163776L, 10817);
    w.d("MicroMsg.CertUtilWx", "getToken stack %s", new Object[] { bg.bQW().toString() });
    paramString = CertUtil.getInstance().getToken(paramString);
    GMTrace.o(1451833163776L, 10817);
    return paramString;
  }
  
  public static int getTokenCount(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1452101599232L, 10819);
    w.d("MicroMsg.CertUtilWx", "getTokenCount stack %s", new Object[] { bg.bQW().toString() });
    int i = CertUtil.getInstance().getTokenCount(paramString, true);
    GMTrace.o(1452101599232L, 10819);
    return i;
  }
  
  public static void init(Context paramContext)
  {
    GMTrace.i(1450893639680L, 10810);
    if (isInit)
    {
      GMTrace.o(1450893639680L, 10810);
      return;
    }
    w.d("MicroMsg.CertUtilWx", "init  %s", new Object[] { bg.bQW().toString() });
    CertUtil.getInstance().init(paramContext);
    isInit = true;
    GMTrace.o(1450893639680L, 10810);
  }
  
  public static boolean isCertExist(String paramString)
  {
    GMTrace.i(1451430510592L, 10814);
    w.d("MicroMsg.CertUtilWx", "isCertExist stack %s", new Object[] { bg.bQW().toString() });
    g.ork.a(414L, 5L, 1L, true);
    boolean bool = CertUtil.getInstance().isCertExist(paramString);
    g.ork.a(414L, 6L, 1L, true);
    GMTrace.o(1451430510592L, 10814);
    return bool;
  }
  
  public static boolean setTokens(String paramString1, String paramString2)
  {
    GMTrace.i(1451698946048L, 10816);
    w.d("MicroMsg.CertUtilWx", "setTokens stack %s", new Object[] { bg.bQW().toString() });
    boolean bool = CertUtil.getInstance().setTokens(paramString1, paramString2);
    GMTrace.o(1451698946048L, 10816);
    return bool;
  }
  
  public final boolean clG()
  {
    GMTrace.i(1451296292864L, 10813);
    w.d("MicroMsg.CertUtilWx", "importCertNone");
    try
    {
      this.xCZ = false;
      GMTrace.o(1451296292864L, 10813);
      return false;
    }
    finally {}
  }
  
  public final String getCertApplyCSR(String paramString)
  {
    GMTrace.i(1451027857408L, 10811);
    w.d("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s", new Object[] { bg.bQW().toString() });
    try
    {
      if (this.xCZ)
      {
        w.i("MicroMsg.CertUtilWx", "isCert_Wating");
        GMTrace.o(1451027857408L, 10811);
        return "";
      }
      this.xCZ = true;
      paramString = CertUtil.getInstance().getCertApplyCSR(paramString);
      GMTrace.o(1451027857408L, 10811);
      return paramString;
    }
    finally {}
  }
  
  public final boolean importCert(String paramString1, String paramString2)
  {
    GMTrace.i(1451162075136L, 10812);
    w.d("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", new Object[] { paramString1, paramString2, bg.bQW().toString() });
    try
    {
      this.xCZ = false;
      boolean bool = CertUtil.getInstance().importCert(paramString1, paramString2);
      GMTrace.o(1451162075136L, 10812);
      return bool;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */