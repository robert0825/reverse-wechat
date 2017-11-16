package com.tencent.mm.sdk.f;

import android.os.Debug;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

final class g
  implements Comparable<g>, Runnable
{
  private static final String gYT;
  private static int vne;
  long gqA;
  final String lGL;
  final int priority;
  boolean started;
  final Runnable viN;
  long viQ;
  long viS;
  final boolean vnf;
  e.b vng;
  
  static
  {
    GMTrace.i(13983205556224L, 104183);
    vne = 1000;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|pooled = %b");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
    localStringBuilder.append("|started = %b");
    gYT = localStringBuilder.toString();
    GMTrace.o(13983205556224L, 104183);
  }
  
  g(Runnable paramRunnable, String paramString, int paramInt, boolean paramBoolean, e.b paramb)
  {
    GMTrace.i(13982668685312L, 104179);
    this.started = false;
    Assert.assertNotNull("ThreadTask arg task is null!", paramRunnable);
    Assert.assertNotNull("ThreadTask arg name is null!", paramString);
    this.viN = paramRunnable;
    this.lGL = paramString;
    this.priority = paramInt;
    this.vnf = paramBoolean;
    this.viQ = System.currentTimeMillis();
    this.vng = paramb;
    GMTrace.o(13982668685312L, 104179);
  }
  
  public final void run()
  {
    GMTrace.i(13982802903040L, 104180);
    this.gqA = System.currentTimeMillis();
    this.viS = Debug.threadCpuTimeNanos();
    this.started = true;
    this.viN.run();
    this.gqA = (System.currentTimeMillis() - this.gqA);
    this.viS = (Debug.threadCpuTimeNanos() - this.viS);
    GMTrace.o(13982802903040L, 104180);
  }
  
  public final String toString()
  {
    GMTrace.i(13982937120768L, 104181);
    String str = String.format(gYT, new Object[] { this.lGL, Integer.valueOf(this.priority), Boolean.valueOf(this.vnf), Long.valueOf(this.viQ), Long.valueOf(this.gqA), Long.valueOf(this.viS), Boolean.valueOf(this.started) });
    GMTrace.o(13982937120768L, 104181);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */