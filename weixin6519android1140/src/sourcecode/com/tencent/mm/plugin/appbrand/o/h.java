package com.tencent.mm.plugin.appbrand.o;

import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsruntime.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class h
{
  public static void a(a parama, String paramString, a parama1)
  {
    GMTrace.i(20682549231616L, 154097);
    if (bg.nm(paramString))
    {
      parama1.eu("");
      GMTrace.o(20682549231616L, 154097);
      return;
    }
    parama.evaluateJavascript(paramString + String.format(";var ___result_return = function(){return %d;};___result_return();", new Object[] { Integer.valueOf(11111) }), new ValueCallback() {});
    GMTrace.o(20682549231616L, 154097);
  }
  
  public static abstract interface a
  {
    public abstract void eu(String paramString);
    
    public abstract void wk();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\o\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */