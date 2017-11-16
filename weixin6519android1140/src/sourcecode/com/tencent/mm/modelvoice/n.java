package com.tencent.mm.modelvoice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;

public final class n
{
  public String hcn;
  public boolean hco;
  public long time;
  
  public n(String paramString)
  {
    GMTrace.i(551366426624L, 4108);
    String str = paramString;
    for (;;)
    {
      try
      {
        if (paramString.endsWith("\n")) {
          str = paramString.substring(0, paramString.length() - 1);
        }
        paramString = str.split(":");
        if ((paramString.length == 4) && (x.fw(paramString[0])))
        {
          i = 1;
          if (paramString.length > i) {
            this.hcn = paramString[i];
          }
          if (paramString.length > i + 1) {
            this.time = bg.getLong(paramString[(i + 1)], 0L);
          }
          if (paramString.length > i + 2) {
            this.hco = paramString[(i + 2)].equals("1");
          }
          GMTrace.o(551366426624L, 4108);
          return;
        }
      }
      catch (Exception paramString)
      {
        if (this.hcn == null) {
          this.hcn = "";
        }
        this.hco = false;
        this.time = 0L;
        w.e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        GMTrace.o(551366426624L, 4108);
        return;
      }
      int i = 0;
    }
  }
  
  public static String b(String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(551232208896L, 4107);
    paramString = new StringBuilder().append(paramString).append(":").append(paramLong).append(":");
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      paramString = i + "\n";
      GMTrace.o(551232208896L, 4107);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */