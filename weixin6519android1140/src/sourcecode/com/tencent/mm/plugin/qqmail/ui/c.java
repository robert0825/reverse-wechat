package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jo;
import com.tencent.mm.g.a.jo.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public final class c
  implements com.tencent.mm.ad.e
{
  static long nXK;
  private Activity eNu;
  public a nXL;
  
  static
  {
    GMTrace.i(5566009180160L, 41470);
    nXK = 0L;
    GMTrace.o(5566009180160L, 41470);
  }
  
  public c(Activity paramActivity)
  {
    GMTrace.i(5565069656064L, 41463);
    at.wS().a(138, this);
    this.eNu = paramActivity;
    GMTrace.o(5565069656064L, 41463);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5565606526976L, 41467);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (this.nXL != null)
      {
        this.nXL.aYH();
        this.nXL = null;
      }
    }
    for (;;)
    {
      nXK = System.currentTimeMillis();
      GMTrace.o(5565606526976L, 41467);
      return;
      if (this.nXL != null)
      {
        this.nXL.aYI();
        this.nXL = null;
      }
    }
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(5565203873792L, 41464);
    this.nXL = parama;
    parama = new jo();
    parama.eNs.eNu = this.eNu;
    parama.eNs.eNv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5542386860032L, 41294);
        if (parama.eNt.eDb)
        {
          c localc = c.this;
          if (System.currentTimeMillis() - c.nXK > 600000L)
          {
            if (at.AU())
            {
              at.wS().a(new bf(new c.2(localc)), 0);
              GMTrace.o(5542386860032L, 41294);
            }
          }
          else if (localc.nXL != null) {
            localc.nXL.aYI();
          }
          GMTrace.o(5542386860032L, 41294);
          return;
        }
        if (c.this.nXL != null) {
          c.this.nXL.aYI();
        }
        GMTrace.o(5542386860032L, 41294);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(parama, Looper.myLooper());
    GMTrace.o(5565203873792L, 41464);
  }
  
  protected final void finalize()
  {
    GMTrace.i(5565472309248L, 41466);
    release();
    super.finalize();
    GMTrace.o(5565472309248L, 41466);
  }
  
  public final void release()
  {
    GMTrace.i(5565338091520L, 41465);
    at.wS().b(138, this);
    GMTrace.o(5565338091520L, 41465);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(5545876520960L, 41320);
      GMTrace.o(5545876520960L, 41320);
    }
    
    public abstract void aYH();
    
    public abstract void aYI();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */