package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ans
  extends com.tencent.mm.bm.a
{
  public int lSq;
  public int tQP;
  public int uCL;
  
  public ans()
  {
    GMTrace.i(16872644804608L, 125711);
    GMTrace.o(16872644804608L, 125711);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872779022336L, 125712);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tQP);
      paramVarArgs.fk(2, this.lSq);
      paramVarArgs.fk(3, this.uCL);
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tQP);
      int i = b.a.a.a.fh(2, this.lSq);
      int j = b.a.a.a.fh(3, this.uCL);
      GMTrace.o(16872779022336L, 125712);
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
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ans localans = (ans)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16872779022336L, 125712);
        return -1;
      case 1: 
        localans.tQP = locala.yqV.nj();
        GMTrace.o(16872779022336L, 125712);
        return 0;
      case 2: 
        localans.lSq = locala.yqV.nj();
        GMTrace.o(16872779022336L, 125712);
        return 0;
      }
      localans.uCL = locala.yqV.nj();
      GMTrace.o(16872779022336L, 125712);
      return 0;
    }
    GMTrace.o(16872779022336L, 125712);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */