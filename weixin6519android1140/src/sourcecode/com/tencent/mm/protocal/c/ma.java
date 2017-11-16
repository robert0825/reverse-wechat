package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ma
  extends com.tencent.mm.bm.a
{
  public int tPL;
  public int tST;
  
  public ma()
  {
    GMTrace.i(20068100472832L, 149519);
    GMTrace.o(20068100472832L, 149519);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20068234690560L, 149520);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPL);
      paramVarArgs.fk(2, this.tST);
      GMTrace.o(20068234690560L, 149520);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tPL);
      int i = b.a.a.a.fh(2, this.tST);
      GMTrace.o(20068234690560L, 149520);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20068234690560L, 149520);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ma localma = (ma)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20068234690560L, 149520);
        return -1;
      case 1: 
        localma.tPL = locala.yqV.nj();
        GMTrace.o(20068234690560L, 149520);
        return 0;
      }
      localma.tST = locala.yqV.nj();
      GMTrace.o(20068234690560L, 149520);
      return 0;
    }
    GMTrace.o(20068234690560L, 149520);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */