package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import java.util.Locale;

public final class n
  extends r
{
  final int hJg;
  final int hJh;
  final y.a hJi;
  
  public n(String paramString1, int paramInt1, int paramInt2, String paramString2, y.a parama)
  {
    super(String.format(Locale.US, "WxaPkgDiff_%s_%d_%d", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), q.SK() + String.format(Locale.US, "_%s_%d_%d.wxapkg.diff", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, 0, paramInt2);
    GMTrace.i(19994280722432L, 148969);
    this.hJg = paramInt1;
    this.hJh = paramInt2;
    this.hJi = parama;
    GMTrace.o(19994280722432L, 148969);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */