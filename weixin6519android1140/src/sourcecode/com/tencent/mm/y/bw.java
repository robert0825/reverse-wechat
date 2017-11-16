package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;

public final class bw
{
  public boolean aDI;
  public Set<a> gpv;
  
  public bw()
  {
    GMTrace.i(13477473157120L, 100415);
    this.aDI = false;
    this.gpv = new HashSet();
    GMTrace.o(13477473157120L, 100415);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(13477607374848L, 100416);
    if (this.aDI)
    {
      w.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
      GMTrace.o(13477607374848L, 100416);
      return false;
    }
    boolean bool = this.gpv.add(parama);
    GMTrace.o(13477607374848L, 100416);
    return bool;
  }
  
  public final boolean b(a parama)
  {
    GMTrace.i(13477741592576L, 100417);
    if (this.aDI)
    {
      w.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
      GMTrace.o(13477741592576L, 100417);
      return false;
    }
    boolean bool = this.gpv.remove(parama);
    GMTrace.o(13477741592576L, 100417);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract boolean BU();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */