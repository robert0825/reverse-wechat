package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import junit.framework.Assert;

public final class i
{
  public a iYh;
  public long jbO;
  private long jbP;
  public boolean jbQ;
  public Boolean jbR;
  
  public i(a parama)
  {
    GMTrace.i(9513218342912L, 70879);
    this.jbO = 0L;
    this.jbP = 0L;
    this.jbQ = false;
    this.jbR = null;
    this.iYh = parama;
    GMTrace.o(9513218342912L, 70879);
  }
  
  public final void afD()
  {
    GMTrace.i(9513352560640L, 70880);
    this.jbO = bg.Pv();
    w.d("MicroMsg.HeartBeatHandler", "updateHeartBeatTimeStamp[%d]", new Object[] { Long.valueOf(this.jbO) });
    this.jbQ = false;
    GMTrace.o(9513352560640L, 70880);
  }
  
  public final void afE()
  {
    GMTrace.i(9513486778368L, 70881);
    if (this.jbP == Long.MAX_VALUE) {}
    for (long l = 0L;; l = this.jbP + 1L)
    {
      this.jbP = l;
      com.tencent.mm.plugin.backup.h.e locale = new com.tencent.mm.plugin.backup.h.e();
      locale.jbP = this.jbP;
      try
      {
        w.i("MicroMsg.HeartBeatHandler", "send heartbeat req, ack:%d", new Object[] { Long.valueOf(locale.jbP) });
        b.r(locale.toByteArray(), 9);
        GMTrace.o(9513486778368L, 70881);
        return;
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.HeartBeatHandler", localIOException, "buf to BackupHeartBeatRequest err.", new Object[0]);
        GMTrace.o(9513486778368L, 70881);
      }
    }
  }
  
  public final void start()
  {
    boolean bool2 = true;
    GMTrace.i(9513755213824L, 70883);
    if (this.iYh != null)
    {
      bool1 = true;
      Assert.assertTrue("HeartBeatTimeoutCallback is null", bool1);
      if (this.jbR != null) {
        break label93;
      }
    }
    label93:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue("New HeartBeatHandler EveryTime !", bool1);
      w.i("MicroMsg.HeartBeatHandler", "start backup heart beat handler.");
      afD();
      this.jbR = Boolean.valueOf(false);
      com.tencent.mm.sdk.f.e.b(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9499930787840L, 70780);
          for (;;)
          {
            if (!i.this.jbR.booleanValue()) {}
            try
            {
              Thread.sleep(15000L);
              if (i.this.jbR.booleanValue() == true)
              {
                GMTrace.o(9499930787840L, 70780);
                return;
              }
              w.d("MicroMsg.HeartBeatHandler", "heartBeatTimeStamp[%d]", new Object[] { Long.valueOf(i.this.jbO) });
              long l = bg.aH(i.this.jbO);
              if (l < 15000L) {
                continue;
              }
              if (!i.this.jbQ)
              {
                i.this.afE();
                i.this.afD();
                i.this.jbQ = true;
                continue;
              }
              w.e("MicroMsg.HeartBeatHandler", "Timeout Now ! timeDiff:%d, heartBeatTimeStamp:%d", new Object[] { Long.valueOf(l), Long.valueOf(i.this.jbO) });
              i.this.iYh.xC();
              i.this.afD();
              i.this.stop();
              GMTrace.o(9499930787840L, 70780);
              return;
              GMTrace.o(9499930787840L, 70780);
              return;
            }
            catch (Exception localException)
            {
              for (;;) {}
            }
          }
        }
      }, "BackupSendBackupHeartBeat").start();
      afE();
      GMTrace.o(9513755213824L, 70883);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(9513620996096L, 70882);
    if (this.jbR != null) {
      this.jbR = Boolean.valueOf(true);
    }
    GMTrace.o(9513620996096L, 70882);
  }
  
  public static abstract interface a
  {
    public abstract void xC();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */