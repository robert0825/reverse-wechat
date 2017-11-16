package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;

public final class g
{
  public static String jab;
  public StringBuffer jae;
  public String vhw;
  
  static
  {
    GMTrace.i(13930189553664L, 103788);
    jab = "]]>";
    GMTrace.o(13930189553664L, 103788);
  }
  
  public g()
  {
    GMTrace.i(13929518465024L, 103783);
    this.vhw = "";
    this.jae = new StringBuffer();
    GMTrace.o(13929518465024L, 103783);
  }
  
  public g(String paramString)
  {
    GMTrace.i(13929652682752L, 103784);
    this.vhw = "";
    this.jae = new StringBuffer();
    this.vhw = paramString;
    to(this.vhw);
    GMTrace.o(13929652682752L, 103784);
  }
  
  private void to(String paramString)
  {
    GMTrace.i(13929786900480L, 103785);
    this.jae.append("<" + paramString + ">");
    GMTrace.o(13929786900480L, 103785);
  }
  
  public final void br(String paramString1, String paramString2)
  {
    GMTrace.i(13930055335936L, 103787);
    to(paramString1);
    if (!bg.nm(paramString2))
    {
      if (!paramString2.contains(jab)) {
        break label76;
      }
      this.jae.append("<![CDATA[" + bg.Sw(paramString2) + "]]>");
    }
    for (;;)
    {
      tp(paramString1);
      GMTrace.o(13930055335936L, 103787);
      return;
      label76:
      this.jae.append("<![CDATA[" + paramString2 + "]]>");
    }
  }
  
  public final void tp(String paramString)
  {
    GMTrace.i(13929921118208L, 103786);
    this.jae.append("</" + paramString + ">");
    GMTrace.o(13929921118208L, 103786);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */