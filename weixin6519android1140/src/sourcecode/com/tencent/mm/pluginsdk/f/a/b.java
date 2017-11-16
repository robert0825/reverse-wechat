package com.tencent.mm.pluginsdk.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
{
  private CountDownLatch tmt;
  
  public b()
  {
    GMTrace.i(838726582272L, 6249);
    this.tmt = null;
    GMTrace.o(838726582272L, 6249);
  }
  
  public final void b(long paramLong, Runnable paramRunnable)
  {
    GMTrace.i(838995017728L, 6251);
    w.i("MicroMsg.SyncJob", "doAsSyncJob");
    if (this.tmt == null) {
      this.tmt = new CountDownLatch(1);
    }
    af.t(paramRunnable);
    w.i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
    if (this.tmt != null) {
      try
      {
        this.tmt.await(paramLong, TimeUnit.MILLISECONDS);
        GMTrace.o(838995017728L, 6251);
        return;
      }
      catch (InterruptedException paramRunnable)
      {
        w.w("MicroMsg.SyncJob", paramRunnable.getMessage());
        w.printErrStackTrace("MicroMsg.SyncJob", paramRunnable, "", new Object[0]);
      }
    }
    GMTrace.o(838995017728L, 6251);
  }
  
  public final void countDown()
  {
    GMTrace.i(838860800000L, 6250);
    if (this.tmt != null)
    {
      this.tmt.countDown();
      this.tmt = null;
    }
    GMTrace.o(838860800000L, 6250);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\f\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */