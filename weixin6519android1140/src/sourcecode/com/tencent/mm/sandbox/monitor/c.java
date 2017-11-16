package com.tencent.mm.sandbox.monitor;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.a;
import com.tencent.mm.sandbox.updater.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public abstract class c
  implements com.tencent.mm.sandbox.b
{
  public static final String veU;
  public int veV;
  public int veW;
  public int veX;
  public String veY;
  private boolean veZ;
  
  static
  {
    GMTrace.i(3603209125888L, 26846);
    veU = com.tencent.mm.compatible.util.e.ghz;
    GMTrace.o(3603209125888L, 26846);
  }
  
  public c(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(3602269601792L, 26839);
    this.veZ = false;
    this.veW = paramInt1;
    this.veY = paramString;
    this.veV = paramInt2;
    this.veZ = paramBoolean;
    this.veX = com.tencent.mm.a.e.aY(aPU());
    paramString = new File(veU);
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
    w.d("MM.GetUpdatePack", "NetSceneGetUpdatePack : temp path = " + aPU() + " packOffset = " + this.veX);
    GMTrace.o(3602269601792L, 26839);
  }
  
  public static String FM(String paramString)
  {
    GMTrace.i(3602940690432L, 26844);
    paramString = aU(paramString, false);
    GMTrace.o(3602940690432L, 26844);
    return paramString;
  }
  
  public static boolean Rs(String paramString)
  {
    GMTrace.i(3602806472704L, 26843);
    if (com.tencent.mm.a.e.aZ(veU + paramString + ".temp"))
    {
      GMTrace.o(3602806472704L, 26843);
      return true;
    }
    GMTrace.o(3602806472704L, 26843);
    return false;
  }
  
  public static String Rt(String paramString)
  {
    GMTrace.i(19597667336192L, 146014);
    paramString = veU + paramString + ".apk";
    if ((com.tencent.mm.a.e.aZ(paramString)) && (a.br(paramString)))
    {
      GMTrace.o(19597667336192L, 146014);
      return paramString;
    }
    GMTrace.o(19597667336192L, 146014);
    return null;
  }
  
  public static String aU(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19597801553920L, 146015);
    String str1 = veU + paramString + ".temp";
    String str4 = veU + paramString + ".apk";
    if ((com.tencent.mm.a.e.aZ(str1)) && (!paramBoolean) && ((a.br(str1)) || (paramString.equalsIgnoreCase(com.tencent.mm.a.g.bg(str1)))))
    {
      com.tencent.mm.a.e.g(veU, paramString + ".temp", paramString + ".apk");
      GMTrace.o(19597801553920L, 146015);
      return str4;
    }
    if (com.tencent.mm.a.e.aZ(str4))
    {
      if (a.br(str4))
      {
        w.i("MM.GetUpdatePack", "summertoken getReadyPack checkApkMd5 update pack ok");
        GMTrace.o(19597801553920L, 146015);
        return str4;
      }
      for (;;)
      {
        try
        {
          str1 = com.tencent.mm.c.c.j(new File(str4));
          String str2 = str1;
          w.w("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode e:" + localException1.getMessage());
        }
        catch (Exception localException1)
        {
          try
          {
            if (bg.nm(str1))
            {
              com.tencent.mm.plugin.report.service.g.ork.a(322L, 10L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4010) });
              str2 = str1;
            }
            w.i("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode pkgsig[%s]", new Object[] { str2 });
            if (!bg.nm(str2)) {
              break;
            }
            if (!paramString.equalsIgnoreCase(com.tencent.mm.a.g.bg(str4))) {
              break label479;
            }
            w.i("MM.GetUpdatePack", "summertoken getReadyPack no pkgsig getMD5 update pack ok");
            GMTrace.o(19597801553920L, 146015);
            return str4;
          }
          catch (Exception localException2)
          {
            String str3;
            for (;;) {}
          }
          localException1 = localException1;
          str1 = null;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(322L, 9L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4009), localException1.getMessage() });
        str3 = str1;
      }
      paramString = i.bOV();
      w.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig[%s], downloadedSig[%s]", new Object[] { str3, paramString });
      if (str3.equals(paramString))
      {
        w.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check update pack ok");
        GMTrace.o(19597801553920L, 146015);
        return str4;
      }
      w.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check invalid");
      com.tencent.mm.plugin.report.service.g.ork.a(322L, 11L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4011), String.format("%s,%s", new Object[] { paramString, str3 }) });
      label479:
      w.e("MM.GetUpdatePack", "summertoken getReadyPack: update pack MD5 not same");
      com.tencent.mm.loader.stub.b.deleteFile(str4);
    }
    GMTrace.o(19597801553920L, 146015);
    return null;
  }
  
  public String aPU()
  {
    GMTrace.i(3602403819520L, 26840);
    String str = veU + this.veY + ".temp";
    GMTrace.o(3602403819520L, 26840);
    return str;
  }
  
  public String bOJ()
  {
    GMTrace.i(3602538037248L, 26841);
    String str = veU + this.veY + ".apk";
    GMTrace.o(3602538037248L, 26841);
    return str;
  }
  
  public final boolean bOK()
  {
    GMTrace.i(3603074908160L, 26845);
    if (this.veZ)
    {
      if (!am.isWifi(ab.getContext()))
      {
        GMTrace.o(3603074908160L, 26845);
        return true;
      }
      GMTrace.o(3603074908160L, 26845);
      return false;
    }
    GMTrace.o(3603074908160L, 26845);
    return false;
  }
  
  public final void deleteTempFile()
  {
    GMTrace.i(3602672254976L, 26842);
    try
    {
      w.d("MM.GetUpdatePack", "deleteTempFile");
      File localFile = new File(aPU());
      if (localFile.exists()) {
        localFile.delete();
      }
      GMTrace.o(3602672254976L, 26842);
      return;
    }
    catch (Exception localException)
    {
      w.e("MM.GetUpdatePack", "error in deleteTempFile");
      GMTrace.o(3602672254976L, 26842);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\monitor\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */