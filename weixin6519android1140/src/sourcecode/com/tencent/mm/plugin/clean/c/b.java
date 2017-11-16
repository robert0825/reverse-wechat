package com.tencent.mm.plugin.clean.c;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
  implements Comparable<b>
{
  public long eJe;
  public ArrayList<a> jST;
  public String username;
  
  public b()
  {
    GMTrace.i(7040525139968L, 52456);
    GMTrace.o(7040525139968L, 52456);
  }
  
  public final boolean anS()
  {
    GMTrace.i(7040659357696L, 52457);
    this.eJe = 0L;
    Iterator localIterator = this.jST.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      this.eJe += locala.size;
    }
    if (this.jST.size() == 0)
    {
      GMTrace.o(7040659357696L, 52457);
      return false;
    }
    GMTrace.o(7040659357696L, 52457);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */