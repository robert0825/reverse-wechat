package com.tencent.mm.plugin.mmsight.model.b;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  int bitrate;
  int frameCount;
  int gBm;
  int gBn;
  int hwX;
  int hwY;
  boolean isStart;
  int lhd;
  int mAB;
  a ncV;
  Thread ncW;
  int ncj;
  
  public e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    GMTrace.i(20192788742144L, 150448);
    this.isStart = false;
    this.frameCount = 0;
    this.hwX = paramInt1;
    this.hwY = paramInt2;
    this.mAB = paramInt3;
    this.lhd = paramInt4;
    this.bitrate = paramInt5;
    this.ncj = paramInt6;
    this.gBm = 2;
    this.gBn = paramInt7;
    GMTrace.o(20192788742144L, 150448);
  }
  
  private final class a
    implements Runnable
  {
    Object nbD;
    int nbk;
    volatile int nbw;
    boolean ncX;
    
    public a()
    {
      GMTrace.i(20194399354880L, 150460);
      this.nbD = new Object();
      GMTrace.o(20194399354880L, 150460);
    }
    
    public final void run()
    {
      GMTrace.i(20194533572608L, 150461);
      if (this.nbk == -1)
      {
        this.nbk = Process.myTid();
        Process.setThreadPriority(Process.myTid(), -2);
        w.i("MicroMsg.MMSightRemuxX264Encoder", "encodeTid: %s", new Object[] { Integer.valueOf(this.nbk) });
      }
      this.nbw = 0;
      for (;;)
      {
        int i;
        synchronized (this.nbD)
        {
          if (this.ncX) {
            break label191;
          }
          l = bg.Pw();
          w.i("MicroMsg.MMSightRemuxX264Encoder", "try trigger encode");
          i = MP4MuxerJNI.triggerEncodeForSegment(Math.max(0, this.nbw), false);
          w.i("MicroMsg.MMSightRemuxX264Encoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()) });
          int j = this.nbw;
          if (i != j) {}
        }
        try
        {
          Thread.sleep(20L);
          this.nbw = i;
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.MMSightRemuxX264Encoder", "thread sleep error");
          }
        }
      }
      label191:
      long l = bg.Pw();
      this.nbw = MP4MuxerJNI.triggerEncodeForSegment(this.nbw, true);
      w.i("MicroMsg.MMSightRemuxX264Encoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(this.nbw), Long.valueOf(Thread.currentThread().getId()) });
      GMTrace.o(20194533572608L, 150461);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */