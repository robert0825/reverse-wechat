package com.tencent.mm.plugin.mmsight.model.a;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static int mZF;
  static int mZG;
  public ae handler;
  HandlerThread[] mZH;
  int mZI;
  int mZJ;
  LinkedList<b> mZK;
  a mZL;
  boolean mZM;
  b.a mZN;
  
  static
  {
    GMTrace.i(7372311363584L, 54928);
    mZF = 4;
    mZG = 4;
    GMTrace.o(7372311363584L, 54928);
  }
  
  public a(a parama)
  {
    GMTrace.i(7371506057216L, 54922);
    this.mZI = 0;
    this.mZJ = 0;
    this.mZK = new LinkedList();
    this.mZM = false;
    this.mZN = new b.a()
    {
      public final void a(final b paramAnonymousb)
      {
        GMTrace.i(7370834968576L, 54917);
        a.this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7348017954816L, 54747);
            a locala = a.this;
            b localb = paramAnonymousb;
            w.i("MicroMsg.ForwardMgr", "receive buf bufIndex: %d receiveIndex: %d", new Object[] { Integer.valueOf(localb.mZU), Integer.valueOf(locala.mZJ) });
            if (locala.mZJ == localb.mZU)
            {
              locala.mZJ += 1;
              locala.mZL.output(localb.mZS);
              locala.aPn();
              GMTrace.o(7348017954816L, 54747);
              return;
            }
            locala.mZK.add(localb);
            locala.aPn();
            GMTrace.o(7348017954816L, 54747);
          }
        });
        GMTrace.o(7370834968576L, 54917);
      }
    };
    this.mZL = parama;
    mZG = -1;
    if (CaptureMMProxy.getInstance() != null) {
      mZG = CaptureMMProxy.getInstance().getInt(w.a.vvz, -1);
    }
    if (mZG == -1)
    {
      mZG = Runtime.getRuntime().availableProcessors();
      mZG = Math.min(mZF, mZG);
      w.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from runtime %d, availableProcessors: %s", new Object[] { Integer.valueOf(mZG), Integer.valueOf(Runtime.getRuntime().availableProcessors()) });
    }
    for (;;)
    {
      this.mZH = new HandlerThread[mZG];
      SightVideoJNI.initScaleAndRoateBuffer(mZG);
      int i = 0;
      while (i < this.mZH.length)
      {
        this.mZH[i] = e.cK("BigSightMediaCodecMP4MuxRecorder_FrameBufProcessMgr_" + i, -1);
        this.mZH[i].start();
        i += 1;
      }
      w.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from config %d", new Object[] { Integer.valueOf(mZG) });
    }
    this.mZM = false;
    GMTrace.o(7371506057216L, 54922);
  }
  
  final void aPn()
  {
    GMTrace.i(7371640274944L, 54923);
    w.i("MicroMsg.ForwardMgr", "processBufList %d %d", new Object[] { Integer.valueOf(this.mZK.size()), Integer.valueOf(this.mZJ) });
    for (;;)
    {
      if (this.mZK.size() == 0)
      {
        GMTrace.o(7371640274944L, 54923);
        return;
      }
      w.i("MicroMsg.ForwardMgr", "loop processBufList %d %d", new Object[] { Integer.valueOf(this.mZK.size()), Integer.valueOf(this.mZJ) });
      Iterator localIterator = this.mZK.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (this.mZJ == localb.mZU)
        {
          this.mZJ += 1;
          this.mZL.output(localb.mZS);
          this.mZK.remove(localb);
        }
      }
      for (int i = 1; i == 0; i = 0)
      {
        GMTrace.o(7371640274944L, 54923);
        return;
      }
    }
  }
  
  public final boolean aPo()
  {
    GMTrace.i(7371774492672L, 54924);
    if (this.mZJ == this.mZI)
    {
      GMTrace.o(7371774492672L, 54924);
      return true;
    }
    GMTrace.o(7371774492672L, 54924);
    return false;
  }
  
  public final void stop()
  {
    int i = 0;
    GMTrace.i(7371908710400L, 54925);
    w.i("MicroMsg.ForwardMgr", "stop FrameBufProcessMgr %s", new Object[] { bg.bQW().toString() });
    while (i < this.mZH.length)
    {
      if (this.mZH[i] != null)
      {
        this.mZH[i].quit();
        this.mZH[i] = null;
      }
      i += 1;
    }
    SightVideoJNI.releaseScaleAndRoateBuffer(mZG);
    this.mZM = true;
    GMTrace.o(7371908710400L, 54925);
  }
  
  public static abstract interface a
  {
    public abstract void output(byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */