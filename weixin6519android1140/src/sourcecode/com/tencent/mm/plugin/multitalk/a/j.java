package com.tencent.mm.plugin.multitalk.a;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;

public final class j
{
  public a nmx;
  public ae nnb;
  public a nnc;
  
  public j(a parama)
  {
    GMTrace.i(4767547916288L, 35521);
    this.nnc = new a();
    this.nmx = parama;
    GMTrace.o(4767547916288L, 35521);
  }
  
  private final class a
  {
    public int angle;
    public int h;
    public boolean kNw;
    public Bitmap lEg;
    public int nne;
    public int nnf;
    public int[] nng;
    public int w;
    
    public a()
    {
      GMTrace.i(4751173353472L, 35399);
      GMTrace.o(4751173353472L, 35399);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(4739496411136L, 35312);
      GMTrace.o(4739496411136L, 35312);
    }
    
    public final void run()
    {
      GMTrace.i(4739630628864L, 35313);
      j.this.nnc.kNw = true;
      if (j.this.nnc.lEg != null)
      {
        long l = System.currentTimeMillis();
        if (j.this.nmx != null) {
          j.this.nmx.a(q.zE(), j.this.nnc.lEg, j.this.nnc.nnf, j.this.nnc.angle);
        }
        l = System.currentTimeMillis() - l;
        if (l > 30L) {
          w.d("MicroMsg.MT.MultiTalkVideoNativeReceiver", "steve: draw native picture use time total: %d", new Object[] { Long.valueOf(l) });
        }
        j.this.nnc.kNw = false;
      }
      try
      {
        Thread.sleep(20L);
        GMTrace.o(4739630628864L, 35313);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        w.printErrStackTrace("MicroMsg.MT.MultiTalkVideoNativeReceiver", localInterruptedException, "", new Object[0]);
        GMTrace.o(4739630628864L, 35313);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */