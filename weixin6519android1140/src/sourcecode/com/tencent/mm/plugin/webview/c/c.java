package com.tencent.mm.plugin.webview.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class c
  extends i<a>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(19464926003200L, 145025);
    fTX = new String[] { i.a(a.fTp, "WebViewData") };
    GMTrace.o(19464926003200L, 145025);
  }
  
  public c(e parame)
  {
    super(parame, a.fTp, "WebViewData", null);
    GMTrace.i(19464523350016L, 145022);
    GMTrace.o(19464523350016L, 145022);
  }
  
  static String ac(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19464657567744L, 145023);
    paramString1 = paramString1 + paramString3 + paramString2;
    GMTrace.o(19464657567744L, 145023);
    return paramString1;
  }
  
  static String es(String paramString1, String paramString2)
  {
    GMTrace.i(19464791785472L, 145024);
    paramString1 = paramString1 + "_" + paramString2;
    GMTrace.o(19464791785472L, 145024);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */