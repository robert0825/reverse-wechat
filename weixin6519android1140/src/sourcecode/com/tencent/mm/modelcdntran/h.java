package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;

public final class h
  extends i
{
  public String[] gAA;
  public String gAz;
  public String host;
  public String[] iplist;
  public int iplistSource;
  public boolean isColdSnsData;
  public String referer;
  public String signalQuality;
  public String snsCipherKey;
  public String snsScene;
  public String url;
  
  public h()
  {
    GMTrace.i(20995813408768L, 156431);
    this.snsCipherKey = "";
    this.gAL = true;
    GMTrace.o(20995813408768L, 156431);
  }
  
  private static String f(String[] paramArrayOfString)
  {
    GMTrace.i(20996081844224L, 156433);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      GMTrace.o(20996081844224L, 156433);
      return "";
    }
    int j = paramArrayOfString.length;
    String str1 = "";
    int i = 0;
    while (i < j)
    {
      String str2 = paramArrayOfString[i];
      str1 = str1 + str2 + ",";
      i += 1;
    }
    GMTrace.o(20996081844224L, 156433);
    return str1;
  }
  
  public final String toString()
  {
    GMTrace.i(20995947626496L, 156432);
    String str = String.format("mediaId:%s, url:%s, host:%s, referer:%s, savepath:%s, iplist:%s, slaveIplist:%s, iplistSource:%d, isColdSnsData:%b, signalQuality:%s, snsScene:%s", new Object[] { this.field_mediaId, this.url, this.host, this.referer, this.gAz, f(this.iplist), f(this.gAA), Integer.valueOf(this.iplistSource), Boolean.valueOf(this.isColdSnsData), this.signalQuality, this.snsScene });
    GMTrace.o(20995947626496L, 156432);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */