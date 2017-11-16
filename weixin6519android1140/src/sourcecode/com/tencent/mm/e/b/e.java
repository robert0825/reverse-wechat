package com.tencent.mm.e.b;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class e
  extends f
{
  public boolean exC;
  public AudioRecord exQ;
  public int eyc;
  private int eyf;
  private b eyg;
  public a eyh;
  public c.a eyi;
  private final Object eyj;
  public final byte[] eyk;
  public final Object eyl;
  private Timer eym;
  private boolean eyn;
  private boolean eyo;
  public boolean mIsMute;
  public int mStatus;
  
  public e(AudioRecord paramAudioRecord, boolean paramBoolean1, int paramInt, c.a parama, boolean paramBoolean2)
  {
    GMTrace.i(4481395720192L, 33389);
    this.mStatus = 0;
    this.eyf = 12800;
    this.mIsMute = false;
    this.eyg = new b();
    this.eyh = null;
    this.eyj = new Object();
    this.eyk = new byte[0];
    this.eyl = new Object();
    this.eym = null;
    this.eyn = false;
    this.eyo = false;
    this.exQ = paramAudioRecord;
    this.exC = paramBoolean1;
    this.eyc = paramInt;
    this.eyi = parama;
    this.eyo = paramBoolean2;
    GMTrace.o(4481395720192L, 33389);
  }
  
  public final void aC(boolean paramBoolean)
  {
    GMTrace.i(4482201026560L, 33395);
    this.mIsMute = paramBoolean;
    GMTrace.o(4482201026560L, 33395);
  }
  
  public final int g(byte[] paramArrayOfByte, int paramInt)
  {
    int j = -1;
    GMTrace.i(4482066808832L, 33394);
    for (;;)
    {
      a locala;
      synchronized (this.eyj)
      {
        if (this.eyh == null) {
          break label301;
        }
        locala = this.eyh;
        i = j;
        if (paramInt > 0)
        {
          i = j;
          if (paramInt <= locala.sb())
          {
            if (paramArrayOfByte != null) {
              continue;
            }
            i = j;
          }
        }
        GMTrace.o(4482066808832L, 33394);
        return i;
        i = j;
        if (locala.fMG == locala.fMH) {
          continue;
        }
        if (locala.fMI) {
          locala.fMJ.lock();
        }
        if (locala.fMG < locala.fMH)
        {
          System.arraycopy(locala.fMF, locala.fMG, paramArrayOfByte, 0, paramInt);
          locala.fMG += paramInt;
          if (!locala.fMI) {
            break label314;
          }
          locala.fMJ.unlock();
          break label314;
        }
        if (paramInt <= locala.fMD - locala.fMG)
        {
          System.arraycopy(locala.fMF, locala.fMG, paramArrayOfByte, 0, paramInt);
          locala.fMG += paramInt;
        }
      }
      System.arraycopy(locala.fMF, locala.fMG, paramArrayOfByte, 0, locala.fMD - locala.fMG);
      System.arraycopy(locala.fMF, 0, paramArrayOfByte, locala.fMD - locala.fMG, paramInt - (locala.fMD - locala.fMG));
      locala.fMG = (paramInt - (locala.fMD - locala.fMG));
      continue;
      label301:
      GMTrace.o(4482066808832L, 33394);
      return -1;
      label314:
      int i = 0;
    }
  }
  
  public final void pL()
  {
    GMTrace.i(4481664155648L, 33391);
    w.i("MicroMsg.RecordModeAsyncRead", "stopRecord");
    synchronized (this.eyl)
    {
      this.mStatus = 3;
      synchronized (this.eyk)
      {
        this.eyk.notify();
        com.tencent.mm.sdk.f.e.L(this.eyg);
      }
    }
    try
    {
      com.tencent.mm.sdk.f.e.N(this.eyg);
      if (this.eyh != null)
      {
        if (this.eym != null)
        {
          this.eym.cancel();
          this.eym = null;
        }
        ??? = this.eyh;
        ((a)???).fMD = 0;
        ((a)???).fME = 0;
        ((a)???).fMG = 0;
        ((a)???).fMH = 0;
        ((a)???).fMF = null;
      }
      synchronized (this.eyj)
      {
        this.eyh = null;
        this.eyi = null;
        this.eyn = false;
        this.eyh = null;
        GMTrace.o(4481664155648L, 33391);
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final int qA()
  {
    GMTrace.i(4481932591104L, 33393);
    synchronized (this.eyj)
    {
      if (this.eyh != null)
      {
        int i = this.eyh.sb();
        GMTrace.o(4481932591104L, 33393);
        return i;
      }
      GMTrace.o(4481932591104L, 33393);
      return -1;
    }
  }
  
  public final boolean qw()
  {
    int j = -1;
    GMTrace.i(4481529937920L, 33390);
    w.i("MicroMsg.RecordModeAsyncRead", "startRecord");
    int i;
    for (;;)
    {
      synchronized (this.eyl)
      {
        this.mStatus = 1;
        com.tencent.mm.sdk.f.e.b(this.eyg, "RecordModeAsyncRead_record", 10);
        if (true != this.eyo) {
          break label356;
        }
        this.eyh = new a();
        if (this.eyh == null)
        {
          w.e("MicroMsg.RecordModeAsyncRead", "new m_audioBuffer error ");
          i = 0;
          if (i != 0) {
            break;
          }
          w.e("MicroMsg.RecordModeAsyncRead", "initAudioBuffer failed");
          GMTrace.o(4481529937920L, 33390);
          return false;
        }
      }
      this.eyf = (this.eyc * 20);
      w.i("MicroMsg.RecordModeAsyncRead", "audioBuffer init mAudioBufferSize: " + this.eyf);
      ??? = this.eyh;
      i = this.eyf;
      if (i <= 0) {
        i = -1;
      }
      for (;;)
      {
        if (i == 0) {
          break label229;
        }
        w.e("MicroMsg.RecordModeAsyncRead", "audioBuffer init failed, error code = -1");
        i = 0;
        break;
        ((a)???).fMF = new byte[i];
        if (((a)???).fMF == null)
        {
          i = -1;
        }
        else
        {
          ((a)???).fMD = i;
          if (((a)???).fMI) {
            ((a)???).fMJ = new ReentrantLock();
          }
          i = 0;
        }
      }
      label229:
      i = 1;
    }
    if ((this.eyn) || (this.eym != null))
    {
      w.w("MicroMsg.RecordModeAsyncRead", "Timer has been created or, timer has been started, " + this.eyn);
      i = j;
    }
    while (i != 0)
    {
      w.e("MicroMsg.RecordModeAsyncRead", "InitAudioRecTimer failed, error code = -1");
      GMTrace.o(4481529937920L, 33390);
      return false;
      this.eym = new Timer();
      i = j;
      if (this.eym != null) {
        i = 0;
      }
    }
    this.eym.scheduleAtFixedRate(new a(), 60L, 20L);
    this.eyn = true;
    label356:
    GMTrace.o(4481529937920L, 33390);
    return true;
  }
  
  public final int qz()
  {
    GMTrace.i(4481798373376L, 33392);
    synchronized (this.eyj)
    {
      if (this.eyh != null)
      {
        int i = this.eyh.fMD;
        GMTrace.o(4481798373376L, 33392);
        return i;
      }
      GMTrace.o(4481798373376L, 33392);
      return -1;
    }
  }
  
  final class a
    extends TimerTask
  {
    private int eyp;
    private int eyq;
    byte[] eyr;
    
    a()
    {
      GMTrace.i(4482335244288L, 33396);
      this.eyp = (e.this.eyc * 2);
      this.eyq = e.this.eyc;
      this.eyr = new byte[this.eyp];
      GMTrace.o(4482335244288L, 33396);
    }
    
    public final void run()
    {
      GMTrace.i(4482469462016L, 33397);
      int j;
      if (!e.this.mIsPause)
      {
        j = (int)(0.8D * e.this.qz());
        i = j;
        if (j < e.this.eyc * 8) {
          i = e.this.eyc * 8;
        }
        if (e.this.qA() <= i) {
          break label146;
        }
      }
      label146:
      for (int i = 8;; i = 1)
      {
        j = 0;
        while (j < i)
        {
          int k = e.this.g(this.eyr, this.eyq);
          if ((e.this.eyi != null) && (k == 0)) {
            e.this.eyi.d(this.eyr, this.eyq);
          }
          j += 1;
        }
        GMTrace.o(4482469462016L, 33397);
        return;
      }
    }
  }
  
  final class b
    implements Runnable
  {
    b()
    {
      GMTrace.i(4474684833792L, 33339);
      GMTrace.o(4474684833792L, 33339);
    }
    
    public final void run()
    {
      GMTrace.i(4474819051520L, 33340);
      w.i("MicroMsg.RecordModeAsyncRead", "RecordThread started. frameSize:%d", new Object[] { Integer.valueOf(e.this.eyc) });
      if (-123456789 != e.this.exG)
      {
        w.i("MicroMsg.RecordModeAsyncRead", "set priority to " + e.this.exG);
        Process.setThreadPriority(e.this.exG);
      }
      for (;;)
      {
        synchronized (e.this.eyl)
        {
          if (1 != e.this.mStatus)
          {
            w.e("MicroMsg.RecordModeAsyncRead", "status is not inited, now status: " + e.this.mStatus);
            GMTrace.o(4474819051520L, 33340);
            return;
          }
          e.this.mStatus = 2;
          ??? = new byte[e.this.eyc];
          if (2 == e.this.mStatus) {
            synchronized (e.this.eyk)
            {
              boolean bool = e.this.mIsPause;
              if (!bool) {}
            }
          }
        }
        try
        {
          e.this.eyk.wait();
          if (2 != e.this.mStatus) {}
          Object localObject6;
          int i;
          do
          {
            for (;;)
            {
              w.i("MicroMsg.RecordModeAsyncRead", "RecordThread exited.");
              GMTrace.o(4474819051520L, 33340);
              return;
              localObject4 = finally;
              throw ((Throwable)localObject4);
              if (e.this.exQ != null) {
                break;
              }
              w.i("MicroMsg.RecordModeAsyncRead", "mAudioRecord is null, so stop record.");
              synchronized (e.this.eyl)
              {
                e.this.mStatus = 3;
              }
            }
            localObject2 = finally;
            throw ((Throwable)localObject2);
            localObject6 = localObject2;
            if (e.this.exC) {
              localObject6 = new byte[e.this.eyc];
            }
            e.this.eyt += 1;
            new g.a();
            i = e.this.exQ.read((byte[])localObject6, 0, e.this.eyc);
          } while (2 != e.this.mStatus);
          if (e.this.exY != null) {
            e.this.exY.c(i, (byte[])localObject6);
          }
          if (e.this.eyc != i) {
            w.i("MicroMsg.RecordModeAsyncRead", "read len " + i);
          }
          if (i < e.this.eyc) {
            w.i("MicroMsg.RecordModeAsyncRead", "read too fast? sleep 10 ms");
          }
          try
          {
            Thread.sleep(10L);
            Object localObject3 = localObject6;
            if (e.this.eyi == null) {
              continue;
            }
            localObject3 = localObject6;
            if (i <= 0) {
              continue;
            }
            int j = i;
            if (i > localObject6.length) {
              j = localObject6.length;
            }
            if (e.this.eyh != null)
            {
              if (e.this.mIsMute) {
                Arrays.fill((byte[])localObject6, 0, j, (byte)0);
              }
              localObject3 = e.this.eyh;
              if (j > 0)
              {
                if (((a)localObject3).fMI) {
                  ((a)localObject3).fMJ.lock();
                }
                if (((a)localObject3).fMG != ((a)localObject3).fMH) {
                  break label641;
                }
                i = ((a)localObject3).fMD;
                label585:
                if (j <= i) {
                  break label767;
                }
              }
              for (i = -1;; i = -1)
              {
                localObject3 = localObject6;
                if (i == 0) {
                  break;
                }
                w.e("MicroMsg.RecordModeAsyncRead", "WriteToBuffer Failed, ret:%d AudioBuffer length: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(e.this.eyh.sb()) });
                localObject3 = localObject6;
                break;
                label641:
                if ((((a)localObject3).fMH + 1) % ((a)localObject3).fMD == ((a)localObject3).fMG)
                {
                  i = 0;
                  break label585;
                }
                if (((a)localObject3).fMG < ((a)localObject3).fMH) {
                  ((a)localObject3).fME = (((a)localObject3).fMH - ((a)localObject3).fMG);
                }
                for (;;)
                {
                  if (((a)localObject3).fMI) {
                    ((a)localObject3).fMJ.unlock();
                  }
                  i = ((a)localObject3).fMD - ((a)localObject3).fME;
                  break;
                  if (((a)localObject3).fMG > ((a)localObject3).fMH) {
                    ((a)localObject3).fME = (((a)localObject3).fMH + ((a)localObject3).fMD - ((a)localObject3).fMG);
                  }
                }
                label767:
                if ((((a)localObject3).fMH + j) % ((a)localObject3).fMD != ((a)localObject3).fMG) {
                  break label793;
                }
              }
              label793:
              if (((a)localObject3).fMI) {
                ((a)localObject3).fMJ.lock();
              }
              if ((((a)localObject3).fMG < ((a)localObject3).fMH) && (j > ((a)localObject3).fMD - ((a)localObject3).fMH))
              {
                System.arraycopy(localObject6, 0, ((a)localObject3).fMF, ((a)localObject3).fMH, ((a)localObject3).fMD - ((a)localObject3).fMH);
                System.arraycopy(localObject6, ((a)localObject3).fMD - ((a)localObject3).fMH, ((a)localObject3).fMF, 0, j - (((a)localObject3).fMD - ((a)localObject3).fMH));
                ((a)localObject3).fMH = (j - (((a)localObject3).fMD - ((a)localObject3).fMH));
              }
              for (((a)localObject3).fMH %= ((a)localObject3).fMD;; ((a)localObject3).fMH = ((j + ((a)localObject3).fMH) % ((a)localObject3).fMD))
              {
                if (((a)localObject3).fMI) {
                  ((a)localObject3).fMJ.unlock();
                }
                i = 0;
                break;
                System.arraycopy(localObject6, 0, ((a)localObject3).fMF, ((a)localObject3).fMH, j);
              }
            }
            localObject3 = localObject6;
            if (e.this.eyi == null) {
              continue;
            }
            if (e.this.mIsMute) {
              Arrays.fill((byte[])localObject6, 0, j, (byte)0);
            }
            e.this.eyi.d((byte[])localObject6, j);
            localObject3 = localObject6;
          }
          catch (InterruptedException localInterruptedException1)
          {
            for (;;) {}
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          for (;;) {}
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\e\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */