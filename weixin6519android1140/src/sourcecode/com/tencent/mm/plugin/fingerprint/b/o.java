package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class o
{
  public a llB;
  
  public o(a parama)
  {
    GMTrace.i(10775536074752L, 80284);
    this.llB = parama;
    GMTrace.o(10775536074752L, 80284);
  }
  
  public final void aAb()
  {
    GMTrace.i(10775670292480L, 80285);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10782783832064L, 80338);
        String str = "";
        if (e.azF())
        {
          w.i("MicroMsg.SyncGenRsaKey", "device is support FingerPrintAuth");
          str = FingerPrintAuth.genRsaKey(e.cs(ab.getContext()), e.getUserId(), p.ta());
        }
        for (;;)
        {
          if (o.this.llB != null) {
            o.this.llB.qp(str);
          }
          GMTrace.o(10782783832064L, 80338);
          return;
          w.e("MicroMsg.SyncGenRsaKey", "device is not support FingerPrintAuth");
        }
      }
    }, getClass().getName());
    GMTrace.o(10775670292480L, 80285);
  }
  
  public static abstract interface a
  {
    public abstract void qp(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */