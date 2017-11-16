package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boa
  extends com.tencent.mm.bm.a
{
  public int tTL;
  public int uXJ;
  public String uXN;
  
  public boa()
  {
    GMTrace.i(3825742118912L, 28504);
    GMTrace.o(3825742118912L, 28504);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3825876336640L, 28505);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uXJ);
      paramVarArgs.fk(2, this.tTL);
      if (this.uXN != null) {
        paramVarArgs.e(3, this.uXN);
      }
      GMTrace.o(3825876336640L, 28505);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uXJ) + 0 + b.a.a.a.fh(2, this.tTL);
      paramInt = i;
      if (this.uXN != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uXN);
      }
      GMTrace.o(3825876336640L, 28505);
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
      GMTrace.o(3825876336640L, 28505);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      boa localboa = (boa)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3825876336640L, 28505);
        return -1;
      case 1: 
        localboa.uXJ = locala.yqV.nj();
        GMTrace.o(3825876336640L, 28505);
        return 0;
      case 2: 
        localboa.tTL = locala.yqV.nj();
        GMTrace.o(3825876336640L, 28505);
        return 0;
      }
      localboa.uXN = locala.yqV.readString();
      GMTrace.o(3825876336640L, 28505);
      return 0;
    }
    GMTrace.o(3825876336640L, 28505);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */