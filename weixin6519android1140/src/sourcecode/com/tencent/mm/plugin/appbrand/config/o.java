package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.k.b;
import com.tencent.mm.plugin.appbrand.k.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class o
  implements b
{
  public o()
  {
    GMTrace.i(17267379142656L, 128652);
    GMTrace.o(17267379142656L, 128652);
  }
  
  public final void S(final List<String> paramList)
  {
    GMTrace.i(20369687707648L, 151766);
    if (bg.cc(paramList))
    {
      GMTrace.o(20369687707648L, 151766);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20369956143104L, 151768);
        if (paramList.size() > 0) {
          r.S(paramList);
        }
        GMTrace.o(20369956143104L, 151768);
      }
    }, "batchSyncWxaContanctThread");
    GMTrace.o(20369687707648L, 151766);
  }
  
  public final void a(String paramString, final b.a parama)
  {
    GMTrace.i(18345281716224L, 136683);
    r.a(paramString, new r.b() {});
    GMTrace.o(18345281716224L, 136683);
  }
  
  public final WxaAttributes pn(String paramString)
  {
    GMTrace.i(17267513360384L, 128653);
    paramString = com.tencent.mm.plugin.appbrand.app.e.Se().d(paramString, new String[0]);
    GMTrace.o(17267513360384L, 128653);
    return paramString;
  }
  
  public final void po(final String paramString)
  {
    GMTrace.i(18345415933952L, 136684);
    if (bg.nm(paramString))
    {
      GMTrace.o(18345415933952L, 136684);
      return;
    }
    final af localaf = new af();
    new ae(localaf.ngv.getLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18345952804864L, 136688);
        if (r.pz(paramString)) {
          r.a(paramString, new r.b() {});
        }
        for (;;)
        {
          Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
          {
            public final boolean queueIdle()
            {
              GMTrace.i(18345684369408L, 136686);
              o.2.this.hRv.ngv.quit();
              GMTrace.o(18345684369408L, 136686);
              return false;
            }
          });
          GMTrace.o(18345952804864L, 136688);
          return;
          if (this.hRt != null) {
            this.hRt.b(o.this.pn(paramString));
          }
        }
      }
    });
    GMTrace.o(18345415933952L, 136684);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */