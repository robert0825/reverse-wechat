package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsg
  extends com.tencent.mm.bm.a
{
  public boolean vbA;
  public long vbw;
  
  public bsg()
  {
    GMTrace.i(3781852921856L, 28177);
    GMTrace.o(3781852921856L, 28177);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3781987139584L, 28178);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.vbw);
      paramVarArgs.ah(2, this.vbA);
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.vbw);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(3781987139584L, 28178);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsg localbsg = (bsg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3781987139584L, 28178);
        return -1;
      case 1: 
        localbsg.vbw = locala.yqV.nk();
        GMTrace.o(3781987139584L, 28178);
        return 0;
      }
      localbsg.vbA = locala.csU();
      GMTrace.o(3781987139584L, 28178);
      return 0;
    }
    GMTrace.o(3781987139584L, 28178);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */