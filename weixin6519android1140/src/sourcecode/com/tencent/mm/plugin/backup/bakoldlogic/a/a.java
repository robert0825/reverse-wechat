package com.tencent.mm.plugin.backup.bakoldlogic.a;

import com.tencent.gmtrace.GMTrace;

public final class a
  implements Cloneable, Comparable<a>
{
  public String iVh;
  public long iVk;
  public long iVl;
  
  public a()
  {
    GMTrace.i(14810523631616L, 110347);
    GMTrace.o(14810523631616L, 110347);
  }
  
  public final a afQ()
  {
    GMTrace.i(14810657849344L, 110348);
    a locala = new a();
    locala.iVh = this.iVh;
    locala.iVk = this.iVk;
    locala.iVl = this.iVl;
    GMTrace.o(14810657849344L, 110348);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */