package com.tencent.mm.jsapi;

import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.d;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
{
  public static void a(d paramd, String paramString, a parama)
  {
    GMTrace.i(20023808622592L, 149189);
    if (bg.nm(paramString))
    {
      parama.eu("");
      GMTrace.o(20023808622592L, 149189);
      return;
    }
    paramd.evaluateJavascript(paramString + String.format(";var ___result_return = function(){return %d;};___result_return();", new Object[] { Integer.valueOf(11111) }), new ValueCallback() {});
    GMTrace.o(20023808622592L, 149189);
  }
  
  public static abstract interface a
  {
    public abstract void eu(String paramString);
    
    public abstract void wk();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */