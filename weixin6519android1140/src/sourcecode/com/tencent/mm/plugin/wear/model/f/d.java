package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class d
  implements Runnable
{
  public d()
  {
    GMTrace.i(9192035319808L, 68486);
    w.i("MicroMsg.WearBaseWorkerTask", "Create %s", new Object[] { getName() });
    GMTrace.o(9192035319808L, 68486);
  }
  
  public abstract void execute();
  
  public abstract String getName();
  
  public void run()
  {
    GMTrace.i(9192169537536L, 68487);
    long l1 = System.currentTimeMillis();
    try
    {
      execute();
      long l2 = System.currentTimeMillis();
      w.i("MicroMsg.WearBaseWorkerTask", "execute %s | use time %d", new Object[] { getName(), Long.valueOf(l2 - l1) });
      GMTrace.o(9192169537536L, 68487);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WearBaseWorkerTask", localException, "run task %s occur exception: %s", new Object[] { getName(), localException.getMessage() });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */