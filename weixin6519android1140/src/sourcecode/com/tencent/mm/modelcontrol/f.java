package com.tencent.mm.modelcontrol;

import com.tencent.gmtrace.GMTrace;

public final class f
  implements Comparable
{
  public int gBq;
  public int gBr;
  public int gBs;
  public int gBt;
  public int gBu;
  public int gBv;
  public int gBw;
  
  public f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    GMTrace.i(4104109686784L, 30578);
    this.gBq = paramInt1;
    this.gBr = paramInt2;
    this.gBs = paramInt3;
    this.gBt = paramInt4;
    this.gBu = paramInt5;
    this.gBv = paramInt6;
    this.gBw = paramInt7;
    GMTrace.o(4104109686784L, 30578);
  }
  
  public final int compareTo(Object paramObject)
  {
    GMTrace.i(4104243904512L, 30579);
    if (paramObject == null)
    {
      GMTrace.o(4104243904512L, 30579);
      return 0;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      int i = this.gBq;
      int j = ((f)paramObject).gBq;
      GMTrace.o(4104243904512L, 30579);
      return i - j;
    }
    GMTrace.o(4104243904512L, 30579);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */