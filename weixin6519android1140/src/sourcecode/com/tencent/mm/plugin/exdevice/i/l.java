package com.tencent.mm.plugin.exdevice.i;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.service.l.a;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public final class l
  extends l.a
{
  private final long guK;
  private c kEb;
  boolean kEc;
  boolean kEd;
  Runnable kEe;
  
  public l(c paramc)
  {
    GMTrace.i(11119536111616L, 82847);
    this.kEb = null;
    this.guK = 15000L;
    this.kEc = false;
    this.kEd = false;
    this.kEe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11121280942080L, 82860);
        l.a(l.this);
        if (l.b(l.this))
        {
          GMTrace.o(11121280942080L, 82860);
          return;
        }
        l.c(l.this).a(-1L, -1, -2, "TimeOut", null);
        GMTrace.o(11121280942080L, 82860);
      }
      
      public final String toString()
      {
        GMTrace.i(11121415159808L, 82861);
        String str = super.toString() + "|mAsyncTimeOut";
        GMTrace.o(11121415159808L, 82861);
        return str;
      }
    };
    Assert.assertNotNull(paramc);
    this.kEb = paramc;
    GMTrace.o(11119536111616L, 82847);
  }
  
  public final void a(final long paramLong, int paramInt1, final int paramInt2, final String paramString, final p paramp)
  {
    GMTrace.i(11119670329344L, 82848);
    if (this.kEd)
    {
      GMTrace.o(11119670329344L, 82848);
      return;
    }
    if (this.kEc)
    {
      GMTrace.o(11119670329344L, 82848);
      return;
    }
    at.xB().bQi().removeCallbacks(this.kEe);
    at.xB().bQi().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11122086248448L, 82866);
        l.c(l.this).a(paramLong, paramInt2, paramString, paramp, this.kEh);
        GMTrace.o(11122086248448L, 82866);
      }
      
      public final String toString()
      {
        GMTrace.i(11122220466176L, 82867);
        String str = super.toString() + "|onTaskEnd";
        GMTrace.o(11122220466176L, 82867);
        return str;
      }
    });
    GMTrace.o(11119670329344L, 82848);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\i\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */