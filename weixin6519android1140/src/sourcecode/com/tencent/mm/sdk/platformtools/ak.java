package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class ak
  implements Runnable
{
  private static final String viW;
  private static final String viX;
  long endTime;
  long gqA;
  final Handler handler;
  final String lGL;
  long lnw;
  int priority;
  boolean started;
  final Thread thread;
  final Runnable viN;
  final Object viO;
  final a viP;
  long viQ;
  long viR;
  long viS;
  long viT;
  long viU;
  float viV;
  String vis;
  
  static
  {
    GMTrace.i(13914217644032L, 103669);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|token = %s");
    localStringBuilder.append("|handler = %s");
    localStringBuilder.append("|threadName = %s");
    localStringBuilder.append("|threadId = %d");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|delayTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
    localStringBuilder.append("|started = %b");
    viW = localStringBuilder.toString();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append(" | addTime = %s");
    localStringBuilder.append(" | endTime = %s");
    localStringBuilder.append(" | usedTime = %d");
    localStringBuilder.append(" | cpuTime = %d");
    localStringBuilder.append(" | threadCpuTime = %d");
    localStringBuilder.append(" | totalCpuTime = %d");
    localStringBuilder.append(" | threadCpuRate = %.1f");
    viX = localStringBuilder.toString();
    GMTrace.o(13914217644032L, 103669);
  }
  
  ak(Thread paramThread, Handler paramHandler, Runnable paramRunnable, Object paramObject, a parama)
  {
    GMTrace.i(13913814990848L, 103666);
    this.started = false;
    this.viV = -1.0F;
    this.thread = paramThread;
    if (paramThread != null)
    {
      this.vis = paramThread.getName();
      this.lnw = paramThread.getId();
      this.priority = paramThread.getPriority();
    }
    this.handler = paramHandler;
    this.viN = paramRunnable;
    paramHandler = paramRunnable.getClass().getName();
    paramRunnable = paramRunnable.toString();
    paramThread = paramHandler;
    if (!bg.nm(paramRunnable))
    {
      int i = paramRunnable.indexOf('|');
      paramThread = paramHandler;
      if (i > 0) {
        paramThread = paramHandler + "_" + paramRunnable.substring(i + 1);
      }
    }
    this.lGL = paramThread;
    this.viO = paramObject;
    this.viP = parama;
    this.viQ = System.currentTimeMillis();
    GMTrace.o(13913814990848L, 103666);
  }
  
  public final String dump(boolean paramBoolean)
  {
    GMTrace.i(13914083426304L, 103668);
    if (paramBoolean)
    {
      str = String.format(viW, new Object[] { this.lGL, this.viO, this.handler, this.vis, Long.valueOf(this.lnw), Integer.valueOf(this.priority), Long.valueOf(this.viQ), Long.valueOf(this.viR), Long.valueOf(this.gqA), Long.valueOf(this.viS), Boolean.valueOf(this.started) });
      GMTrace.o(13914083426304L, 103668);
      return str;
    }
    String str = String.format(viX, new Object[] { this.lGL, new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.viQ)), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.endTime)), Long.valueOf(this.gqA), Long.valueOf(this.viS), Long.valueOf(this.viT), Long.valueOf(this.viU), Float.valueOf(this.viV) });
    GMTrace.o(13914083426304L, 103668);
    return str;
  }
  
  public final void run()
  {
    GMTrace.i(13913949208576L, 103667);
    int i = Process.myTid();
    new StringBuilder("/proc/self/task/").append(i).append("/stat");
    this.gqA = System.currentTimeMillis();
    this.viS = Debug.threadCpuTimeNanos();
    this.viT = -1L;
    this.viU = -1L;
    this.started = true;
    this.viN.run();
    this.viT = (-1L - this.viT);
    this.viU = (-1L - this.viU);
    this.endTime = System.currentTimeMillis();
    this.gqA = (this.endTime - this.gqA);
    this.viS = ((Debug.threadCpuTimeNanos() - this.viS) / 1000000L);
    if (this.viU != 0L) {
      this.viV = ((float)(100L * this.viT) / (float)this.viU);
    }
    if (this.viP != null)
    {
      this.viP.a(this.viN, this);
      this.viP.a(this, this.thread, this.gqA, this.viS, this.viV);
    }
    GMTrace.o(13913949208576L, 103667);
  }
  
  public static abstract interface a
  {
    public abstract void a(Runnable paramRunnable, ak paramak);
    
    public abstract void a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */