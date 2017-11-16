package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class l
{
  final String appId;
  final String eOR;
  final String eYR;
  final String eYS;
  final int eYT;
  final String rFO;
  final a rFP;
  
  public l(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    GMTrace.i(12347762540544L, 91998);
    this.appId = paramString1;
    this.eYR = paramString2;
    this.rFO = paramString3;
    this.eYT = paramInt;
    this.eYS = paramString4;
    w.i("MicroMsg.WebViewCacheResWriter", "init WebViewCacheResWriter, appId = %s, domain = %s, mainURL = %s, cacheType = %d", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
    this.rFP = a.Ls(paramString1);
    if (this.rFP != null)
    {
      paramString1 = this.rFP;
      paramString2 = String.format("%d_%d_%d_%d", new Object[] { Integer.valueOf(paramString2.hashCode()), Integer.valueOf(paramInt), Integer.valueOf(paramString3.hashCode()), Integer.valueOf(paramString4.hashCode()) });
      this.eOR = (paramString1.path + "/" + paramString2);
      GMTrace.o(12347762540544L, 91998);
      return;
    }
    this.eOR = null;
    w.e("MicroMsg.WebViewCacheResWriter", "get null appIdResDir");
    GMTrace.o(12347762540544L, 91998);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */