package com.tencent.mm.plugin.wear.model;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class j
{
  HandlerThread handlerThread;
  ae irz;
  
  public j()
  {
    GMTrace.i(9173647491072L, 68349);
    if (com.tencent.mm.compatible.util.d.ev(18))
    {
      this.handlerThread = e.SV("WearWorker_worker_thread");
      this.handlerThread.start();
      this.irz = new a(this.handlerThread.getLooper());
      w.i("MicroMsg.Wear.WearWorker", "start worker %d", new Object[] { Integer.valueOf(this.handlerThread.getThreadId()) });
    }
    GMTrace.o(9173647491072L, 68349);
  }
  
  public final void a(com.tencent.mm.plugin.wear.model.f.d paramd)
  {
    GMTrace.i(9173781708800L, 68350);
    if (this.irz != null)
    {
      paramd = this.irz.obtainMessage(0, paramd);
      this.irz.sendMessage(paramd);
    }
    GMTrace.o(9173781708800L, 68350);
  }
  
  private final class a
    extends ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(18826183835648L, 140266);
      GMTrace.o(18826183835648L, 140266);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(18826318053376L, 140267);
      paramMessage = (com.tencent.mm.plugin.wear.model.f.d)paramMessage.obj;
      if (paramMessage != null) {
        try
        {
          paramMessage.run();
          GMTrace.o(18826318053376L, 140267);
          return;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.Wear.WearWorker", localException.getCause(), "run task %s occur exception", new Object[] { paramMessage.getName() });
        }
      }
      GMTrace.o(18826318053376L, 140267);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */