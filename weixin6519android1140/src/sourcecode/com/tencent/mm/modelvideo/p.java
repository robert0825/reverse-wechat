package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class p
{
  public String hcn;
  private boolean hco;
  private long time;
  
  public p(String paramString)
  {
    GMTrace.i(325343772672L, 2424);
    String str = paramString;
    if (paramString.endsWith("\n")) {
      str = paramString.substring(0, paramString.length() - 1);
    }
    paramString = str.split(":");
    try
    {
      if (paramString.length > 0) {
        this.hcn = paramString[0];
      }
      if (paramString.length > 1) {
        this.time = bg.getLong(paramString[1], 0L);
      }
      if (paramString.length > 2) {
        this.hco = paramString[2].equals("1");
      }
      GMTrace.o(325343772672L, 2424);
      return;
    }
    catch (Exception paramString)
    {
      if (this.hcn == null) {
        this.hcn = "";
      }
      this.hco = false;
      this.time = 0L;
      w.e("MicroMsg.VideoContent", "VoiceContent parse failed.");
      GMTrace.o(325343772672L, 2424);
    }
  }
  
  public static String b(String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(325209554944L, 2423);
    paramString = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      paramString = i + "\n";
      GMTrace.o(325209554944L, 2423);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */