package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class uq
  extends com.tencent.mm.bm.a
{
  public int umS;
  public String umT;
  
  public uq()
  {
    GMTrace.i(3855404236800L, 28725);
    GMTrace.o(3855404236800L, 28725);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855538454528L, 28726);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.umS);
      if (this.umT != null) {
        paramVarArgs.e(2, this.umT);
      }
      GMTrace.o(3855538454528L, 28726);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.umS) + 0;
      paramInt = i;
      if (this.umT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umT);
      }
      GMTrace.o(3855538454528L, 28726);
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
      GMTrace.o(3855538454528L, 28726);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      uq localuq = (uq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3855538454528L, 28726);
        return -1;
      case 1: 
        localuq.umS = locala.yqV.nj();
        GMTrace.o(3855538454528L, 28726);
        return 0;
      }
      localuq.umT = locala.yqV.readString();
      GMTrace.o(3855538454528L, 28726);
      return 0;
    }
    GMTrace.o(3855538454528L, 28726);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\uq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */