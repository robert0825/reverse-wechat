package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.Callable;

abstract class l<T>
  implements Callable<T>
{
  l()
  {
    GMTrace.i(10149544591360L, 75620);
    GMTrace.o(10149544591360L, 75620);
  }
  
  abstract String getTag();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */