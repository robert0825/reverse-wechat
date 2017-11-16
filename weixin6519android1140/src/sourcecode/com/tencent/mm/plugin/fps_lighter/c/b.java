package com.tencent.mm.plugin.fps_lighter.c;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public long beginTime;
  public int gLU;
  public long iyA;
  public long lns;
  public long lnt;
  public int lnu;
  
  public b()
  {
    GMTrace.i(5218787917824L, 38883);
    GMTrace.o(5218787917824L, 38883);
  }
  
  public final String getKey()
  {
    GMTrace.i(5218922135552L, 38884);
    String str = this.lnt + ">" + this.gLU;
    GMTrace.o(5218922135552L, 38884);
    return str;
  }
  
  public final String toString()
  {
    GMTrace.i(5219056353280L, 38885);
    Object localObject = new StringBuilder(16);
    int i = 0;
    while (i < this.gLU)
    {
      ((StringBuilder)localObject).append(" ");
      i += 1;
    }
    ((StringBuilder)localObject).append(this.lnt);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.iyA);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.beginTime);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.gLU);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append(this.lns);
    ((StringBuilder)localObject).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(5219056353280L, 38885);
    return (String)localObject;
  }
  
  public static final class a
  {
    public long gVB;
    public long lnt;
    public int lnu;
    public boolean lnv;
    public long lnw;
    
    public a()
    {
      GMTrace.i(5220935401472L, 38899);
      GMTrace.o(5220935401472L, 38899);
    }
    
    public final String toString()
    {
      GMTrace.i(5221069619200L, 38900);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.lnv);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(this.lnw);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(this.lnt);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(this.gVB);
      ((StringBuilder)localObject).append("\n");
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(5221069619200L, 38900);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */