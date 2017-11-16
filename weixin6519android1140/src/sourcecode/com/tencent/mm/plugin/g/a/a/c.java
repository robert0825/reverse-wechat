package com.tencent.mm.plugin.g.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.Arrays;

public final class c
{
  public String aKJ;
  String jkh;
  public e jki;
  public double jkj;
  
  public c()
  {
    GMTrace.i(4801773436928L, 35776);
    this.jkh = null;
    this.jki = null;
    this.jkj = 0.0D;
    this.aKJ = "";
    GMTrace.o(4801773436928L, 35776);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(4802041872384L, 35778);
    if ((this.jki == null) || (paramObject == null))
    {
      GMTrace.o(4802041872384L, 35778);
      return false;
    }
    if (this == paramObject)
    {
      GMTrace.o(4802041872384L, 35778);
      return true;
    }
    boolean bool = Arrays.equals(((c)paramObject).jki.jkn.jkO, this.jki.jkn.jkO);
    GMTrace.o(4802041872384L, 35778);
    return bool;
  }
  
  public final int hashCode()
  {
    GMTrace.i(4801907654656L, 35777);
    if (this.jki == null)
    {
      GMTrace.o(4801907654656L, 35777);
      return 0;
    }
    int i = Arrays.hashCode(this.jki.jkn.jkO);
    GMTrace.o(4801907654656L, 35777);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\g\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */