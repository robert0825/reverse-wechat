package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;

public abstract class h<Params, Progress, Result>
{
  public com.tencent.mm.sdk.platformtools.ae handler;
  private boolean isStart;
  
  public h()
  {
    GMTrace.i(8150505750528L, 60726);
    this.isStart = false;
    this.handler = ae.aDa();
    GMTrace.o(8150505750528L, 60726);
  }
  
  public abstract com.tencent.mm.sdk.platformtools.ae biu();
  
  public abstract Result biv();
  
  public final boolean m(final Params... paramVarArgs)
  {
    GMTrace.i(8150639968256L, 60727);
    if (this.isStart) {
      Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
    }
    this.isStart = true;
    com.tencent.mm.sdk.platformtools.ae localae = biu();
    if (localae == null)
    {
      GMTrace.o(8150639968256L, 60727);
      return false;
    }
    localae.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8111314173952L, 60434);
        final Object localObject = h.this.biv();
        h.this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8121648939008L, 60511);
            h.this.onPostExecute(localObject);
            GMTrace.o(8121648939008L, 60511);
          }
        });
        GMTrace.o(8111314173952L, 60434);
      }
    });
    GMTrace.o(8150639968256L, 60727);
    return true;
  }
  
  public void onPostExecute(Result paramResult)
  {
    GMTrace.i(8150908403712L, 60729);
    GMTrace.o(8150908403712L, 60729);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */