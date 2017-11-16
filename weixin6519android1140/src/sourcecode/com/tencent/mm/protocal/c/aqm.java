package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqm
  extends com.tencent.mm.bm.a
{
  public int uGI;
  public long uGJ;
  public long uGK;
  
  public aqm()
  {
    GMTrace.i(3832989876224L, 28558);
    GMTrace.o(3832989876224L, 28558);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3833124093952L, 28559);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uGI);
      paramVarArgs.T(2, this.uGJ);
      paramVarArgs.T(3, this.uGK);
      GMTrace.o(3833124093952L, 28559);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uGI);
      int i = b.a.a.a.S(2, this.uGJ);
      int j = b.a.a.a.S(3, this.uGK);
      GMTrace.o(3833124093952L, 28559);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3833124093952L, 28559);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aqm localaqm = (aqm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3833124093952L, 28559);
        return -1;
      case 1: 
        localaqm.uGI = locala.yqV.nj();
        GMTrace.o(3833124093952L, 28559);
        return 0;
      case 2: 
        localaqm.uGJ = locala.yqV.nk();
        GMTrace.o(3833124093952L, 28559);
        return 0;
      }
      localaqm.uGK = locala.yqV.nk();
      GMTrace.o(3833124093952L, 28559);
      return 0;
    }
    GMTrace.o(3833124093952L, 28559);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */