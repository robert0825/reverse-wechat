package com.tencent.mm.bt;

import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bm.a
{
  public int gsM;
  public int size;
  public int vnE;
  public int vnF;
  public int vnG;
  public int vnH;
  public int vnI;
  
  public c()
  {
    GMTrace.i(4522332127232L, 33694);
    this.vnH = -1;
    GMTrace.o(4522332127232L, 33694);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4522466344960L, 33695);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vnE);
      paramVarArgs.fk(2, this.vnF);
      paramVarArgs.fk(3, this.vnG);
      paramVarArgs.fk(41, this.vnH);
      paramVarArgs.fk(5, this.vnI);
      paramVarArgs.fk(6, this.gsM);
      paramVarArgs.fk(7, this.size);
      GMTrace.o(4522466344960L, 33695);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.vnE);
      int i = b.a.a.a.fh(2, this.vnF);
      int j = b.a.a.a.fh(3, this.vnG);
      int k = b.a.a.a.fh(41, this.vnH);
      int m = b.a.a.a.fh(5, this.vnI);
      int n = b.a.a.a.fh(6, this.gsM);
      int i1 = b.a.a.a.fh(7, this.size);
      GMTrace.o(4522466344960L, 33695);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4522466344960L, 33695);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4522466344960L, 33695);
        return -1;
      case 1: 
        localc.vnE = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      case 2: 
        localc.vnF = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      case 3: 
        localc.vnG = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      case 41: 
        localc.vnH = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      case 5: 
        localc.vnI = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      case 6: 
        localc.gsM = locala.yqV.nj();
        GMTrace.o(4522466344960L, 33695);
        return 0;
      }
      localc.size = locala.yqV.nj();
      GMTrace.o(4522466344960L, 33695);
      return 0;
    }
    GMTrace.o(4522466344960L, 33695);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */