package com.tencent.mm.plugin.backup.f;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Queue;

public final class j
{
  public a iYi;
  public long jbT;
  public long jbU;
  public long jbV;
  public long jbW;
  public Queue<Long> jbX;
  private aj jbY;
  
  public j(a parama)
  {
    GMTrace.i(9501004529664L, 70788);
    this.jbT = 0L;
    this.jbX = new LinkedList();
    this.jbY = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9512815689728L, 70876);
        long l = System.currentTimeMillis() - j.this.jbW;
        j localj;
        if (l != 0L)
        {
          j.this.jbU = (j.this.jbV / l * 1000L);
          j.this.jbX.offer(Long.valueOf(j.this.jbU));
          l = ((Long)j.this.jbX.poll()).longValue();
          j.this.jbU = ((j.this.jbT * 10L - l + j.this.jbU) / 10L);
          localj = j.this;
          if (j.this.jbU <= 0L) {
            break label204;
          }
        }
        label204:
        for (l = j.this.jbU;; l = 0L)
        {
          localj.jbU = l;
          j.this.jbT = j.this.jbU;
          j.this.jbV = 0L;
          j.this.jbW = System.currentTimeMillis();
          j.this.iYi.aeR();
          GMTrace.o(9512815689728L, 70876);
          return true;
        }
      }
    }, true);
    this.iYi = parama;
    GMTrace.o(9501004529664L, 70788);
  }
  
  public final String afF()
  {
    GMTrace.i(9501138747392L, 70789);
    long l = this.jbU;
    String str;
    if (l >> 30 > 0L) {
      str = bg.b(l, 100.0D);
    }
    for (;;)
    {
      w.i("MicroMsg.SpeedCalculator", "getBackupPcSpeed :%s", new Object[] { str });
      GMTrace.o(9501138747392L, 70789);
      return str;
      if (l >> 20 > 0L)
      {
        str = bg.a(l, 100.0D);
      }
      else if (l >> 9 > 0L)
      {
        int i = Math.round((float)(l / 1024L));
        str = i + " KB";
      }
      else
      {
        str = l + " B";
      }
    }
  }
  
  public final void start()
  {
    GMTrace.i(9501272965120L, 70790);
    w.i("MicroMsg.SpeedCalculator", "start backup get speed handler.");
    this.jbW = System.currentTimeMillis();
    this.jbV = 0L;
    this.jbT = 0L;
    this.jbX.clear();
    int i = 0;
    while (i < 10)
    {
      this.jbX.offer(Long.valueOf(0L));
      i += 1;
    }
    this.jbY.z(1000L, 1000L);
    GMTrace.o(9501272965120L, 70790);
  }
  
  public final void stop()
  {
    GMTrace.i(9501407182848L, 70791);
    w.i("MicroMsg.SpeedCalculator", "stop backup get speed handler.");
    this.jbY.stopTimer();
    GMTrace.o(9501407182848L, 70791);
  }
  
  public static abstract interface a
  {
    public abstract void aeR();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */