package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class di
  extends com.tencent.mm.bm.a
{
  public int tRC;
  public int tRD;
  public int tRE;
  
  public di()
  {
    GMTrace.i(3677968400384L, 27403);
    GMTrace.o(3677968400384L, 27403);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3678102618112L, 27404);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRC);
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRE);
      GMTrace.o(3678102618112L, 27404);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRC);
      int i = b.a.a.a.fh(2, this.tRD);
      int j = b.a.a.a.fh(3, this.tRE);
      GMTrace.o(3678102618112L, 27404);
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
      GMTrace.o(3678102618112L, 27404);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      di localdi = (di)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3678102618112L, 27404);
        return -1;
      case 1: 
        localdi.tRC = locala.yqV.nj();
        GMTrace.o(3678102618112L, 27404);
        return 0;
      case 2: 
        localdi.tRD = locala.yqV.nj();
        GMTrace.o(3678102618112L, 27404);
        return 0;
      }
      localdi.tRE = locala.yqV.nj();
      GMTrace.o(3678102618112L, 27404);
      return 0;
    }
    GMTrace.o(3678102618112L, 27404);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */