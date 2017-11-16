package com.tencent.mm.plugin.fts.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.wcdb.support.OperationCanceledException;
import java.util.List;
import java.util.regex.Pattern;

public abstract class e
  extends a
{
  public f lwP;
  public int lwQ;
  
  public e(f paramf)
  {
    GMTrace.i(18632641871872L, 138824);
    this.lwP = paramf;
    GMTrace.o(18632641871872L, 138824);
  }
  
  public abstract List<i> a(String[] paramArrayOfString, f paramf);
  
  public final boolean execute()
  {
    GMTrace.i(18632910307328L, 138826);
    final g localg = new g(this.lwP);
    try
    {
      localg.lwZ = this;
      localg.lxa = yT(this.lwP.eQb);
      localg.lxb = a(localg.lxa, this.lwP);
      this.lwQ = localg.lxb.size();
      if (!Thread.interrupted()) {
        break label124;
      }
      throw new InterruptedException();
    }
    catch (Exception localException)
    {
      if (!(localException instanceof InterruptedException)) {
        break label185;
      }
      localg.aGY = 1;
      throw localException;
    }
    finally
    {
      if (this.lwP.handler != null) {
        break label220;
      }
    }
    this.lwP.lwY.a(localg);
    for (;;)
    {
      throw ((Throwable)localObject);
      label124:
      localg.aGY = 0;
      if (this.lwP.handler == null) {
        this.lwP.lwY.a(localg);
      }
      for (;;)
      {
        GMTrace.o(18632910307328L, 138826);
        return true;
        this.lwP.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18633715613696L, 138832);
            e.this.lwP.lwY.a(localg);
            GMTrace.o(18633715613696L, 138832);
          }
        });
      }
      label185:
      if ((localObject instanceof OperationCanceledException))
      {
        InterruptedException localInterruptedException = new InterruptedException(((Exception)localObject).getMessage());
        localg.aGY = 1;
        break;
      }
      localg.aGY = -1;
      break;
      label220:
      this.lwP.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18633715613696L, 138832);
          e.this.lwP.lwY.a(localg);
          GMTrace.o(18633715613696L, 138832);
        }
      });
    }
  }
  
  public String toString()
  {
    GMTrace.i(18633178742784L, 138828);
    String str = String.format("%s[%s]: %d", new Object[] { super.toString(), this.lwP.eQb, Integer.valueOf(this.lwQ) });
    GMTrace.o(18633178742784L, 138828);
    return str;
  }
  
  public String[] yT(String paramString)
  {
    GMTrace.i(18633044525056L, 138827);
    paramString = c.a.lww.split(SpellMap.nj(paramString));
    GMTrace.o(18633044525056L, 138827);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */