package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;

public final class m
{
  public static String aA(String paramString, boolean paramBoolean)
  {
    GMTrace.i(12488422719488L, 93046);
    String str = com.tencent.mm.storage.w.ghv;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VoicePrintLogic", "dbCachePath " + str);
    if (str.endsWith(File.separator)) {}
    for (paramString = str + paramString;; paramString = str + File.separator + paramString)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VoicePrintLogic", "genpath " + paramString);
      if (!bg.nm(paramString)) {
        break;
      }
      GMTrace.o(12488422719488L, 93046);
      return null;
    }
    if (paramBoolean)
    {
      GMTrace.o(12488422719488L, 93046);
      return paramString;
    }
    if (new File(paramString).exists())
    {
      GMTrace.o(12488422719488L, 93046);
      return paramString;
    }
    GMTrace.o(12488422719488L, 93046);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */