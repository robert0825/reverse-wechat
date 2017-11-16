package com.tencent.mm.plugin.traceroute.b;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public final class c
  extends ThreadPoolExecutor
{
  public c()
  {
    super(10, 20, 3000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(200), new ThreadPoolExecutor.CallerRunsPolicy());
    GMTrace.i(9990228148224L, 74433);
    GMTrace.o(9990228148224L, 74433);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */