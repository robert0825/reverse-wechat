package com.tencent.mm.plugin.appbrand.dynamic.jsengine;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jsapi.b.d;
import com.tencent.xweb.f;

public class X5JSCoreBasedJsEngine
  extends AppBrandIndV8JsEngine
  implements d
{
  public X5JSCoreBasedJsEngine(Object paramObject, String paramString, f paramf)
  {
    super(paramObject, paramString, paramf);
    GMTrace.i(19918179270656L, 148402);
    GMTrace.o(19918179270656L, 148402);
  }
  
  public final void pause()
  {
    GMTrace.i(18850343026688L, 140446);
    super.pause();
    GMTrace.o(18850343026688L, 140446);
  }
  
  public final void resume()
  {
    GMTrace.i(18850477244416L, 140447);
    super.resume();
    GMTrace.o(18850477244416L, 140447);
  }
  
  public final boolean wp()
  {
    GMTrace.i(19918313488384L, 148403);
    boolean bool = super.wp();
    GMTrace.o(19918313488384L, 148403);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\jsengine\X5JSCoreBasedJsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */