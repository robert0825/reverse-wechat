package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agi
  extends com.tencent.mm.bm.a
{
  public int tNN;
  public String tNO;
  
  public agi()
  {
    GMTrace.i(3798093266944L, 28298);
    GMTrace.o(3798093266944L, 28298);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3798227484672L, 28299);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tNN);
      if (this.tNO != null) {
        paramVarArgs.e(2, this.tNO);
      }
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tNN) + 0;
      paramInt = i;
      if (this.tNO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tNO);
      }
      GMTrace.o(3798227484672L, 28299);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      agi localagi = (agi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3798227484672L, 28299);
        return -1;
      case 1: 
        localagi.tNN = locala.yqV.nj();
        GMTrace.o(3798227484672L, 28299);
        return 0;
      }
      localagi.tNO = locala.yqV.readString();
      GMTrace.o(3798227484672L, 28299);
      return 0;
    }
    GMTrace.o(3798227484672L, 28299);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\agi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */