package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.gmtrace.GMTrace;

public final class f
{
  public final String appId;
  public final String eYR;
  public final String eYS;
  public final int eYT;
  public final String eYU;
  public final long eYV;
  public final Exception eYW;
  public final String filePath;
  public final String url;
  public final String version;
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7, long paramLong, Exception paramException)
  {
    GMTrace.i(12355144515584L, 92053);
    this.url = paramString1;
    this.filePath = paramString2;
    this.version = paramString3;
    this.appId = paramString4;
    this.eYR = paramString5;
    this.eYS = paramString6;
    this.eYT = paramInt;
    this.eYU = paramString7;
    this.eYV = paramLong;
    this.eYW = paramException;
    GMTrace.o(12355144515584L, 92053);
  }
  
  public final String toString()
  {
    GMTrace.i(12355278733312L, 92054);
    String str = "WebViewCacheResponseWrapper{url='" + this.url + '\'' + ", filePath='" + this.filePath + '\'' + ", version='" + this.version + '\'' + ", appId='" + this.appId + '\'' + ", domain='" + this.eYR + '\'' + ", packageId='" + this.eYS + '\'' + ", cacheType=" + this.eYT + ", contentType='" + this.eYU + '\'' + ", contentLength=" + this.eYV + ", exception=" + this.eYW + '}';
    GMTrace.o(12355278733312L, 92054);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\downloaderimpl\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */