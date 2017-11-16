package com.tencent.mm.plugin.ipcall.a.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;

public final class e
  extends a
{
  public long mmg;
  public long mmh;
  
  public e()
  {
    GMTrace.i(11602585714688L, 86446);
    this.mmg = 0L;
    this.mmh = 0L;
    GMTrace.o(11602585714688L, 86446);
  }
  
  public final void aIS()
  {
    GMTrace.i(11602719932416L, 86447);
    g.ork.i(12935, new Object[] { Long.valueOf(this.mmg), Long.valueOf(this.mmh) });
    GMTrace.o(11602719932416L, 86447);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */