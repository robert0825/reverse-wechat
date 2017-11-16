package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class sa
  extends com.tencent.mm.bm.a
{
  public int lQF;
  public int uig;
  
  public sa()
  {
    GMTrace.i(3804535717888L, 28346);
    GMTrace.o(3804535717888L, 28346);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3804669935616L, 28347);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lQF);
      paramVarArgs.fk(2, this.uig);
      GMTrace.o(3804669935616L, 28347);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.lQF);
      int i = b.a.a.a.fh(2, this.uig);
      GMTrace.o(3804669935616L, 28347);
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
      GMTrace.o(3804669935616L, 28347);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      sa localsa = (sa)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3804669935616L, 28347);
        return -1;
      case 1: 
        localsa.lQF = locala.yqV.nj();
        GMTrace.o(3804669935616L, 28347);
        return 0;
      }
      localsa.uig = locala.yqV.nj();
      GMTrace.o(3804669935616L, 28347);
      return 0;
    }
    GMTrace.o(3804669935616L, 28347);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */