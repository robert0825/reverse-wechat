package com.tencent.mm.plugin.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.LinkedList;

public final class b
  extends a
  implements Runnable
{
  int errorCode;
  public f luZ;
  
  public b(f paramf)
  {
    GMTrace.i(18512517005312L, 137929);
    this.errorCode = -2;
    this.luZ = paramf;
    GMTrace.o(18512517005312L, 137929);
  }
  
  public final boolean execute()
  {
    GMTrace.i(18512651223040L, 137930);
    final g localg;
    if ((this.errorCode == -2) || (this.errorCode == -3))
    {
      localg = new g(this.luZ);
      localg.lwZ = this;
      localg.aGY = this.errorCode;
      localg.lxb = new LinkedList();
      localg.lxa = new String[] { this.luZ.eQb };
      if (this.luZ.handler != null) {
        break label113;
      }
      this.luZ.lwY.a(localg);
    }
    for (;;)
    {
      GMTrace.o(18512651223040L, 137930);
      return true;
      label113:
      this.luZ.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16715073191936L, 124537);
          b.this.luZ.lwY.a(localg);
          GMTrace.o(16715073191936L, 124537);
        }
      });
    }
  }
  
  public final int getId()
  {
    GMTrace.i(18513053876224L, 137933);
    GMTrace.o(18513053876224L, 137933);
    return -1;
  }
  
  public final int getPriority()
  {
    GMTrace.i(18512785440768L, 137931);
    GMTrace.o(18512785440768L, 137931);
    return 0;
  }
  
  public final boolean isCancelled()
  {
    GMTrace.i(18512919658496L, 137932);
    GMTrace.o(18512919658496L, 137932);
    return false;
  }
  
  public final void run()
  {
    GMTrace.i(16713596796928L, 124526);
    try
    {
      execute();
      GMTrace.o(16713596796928L, 124526);
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(16713596796928L, 124526);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */