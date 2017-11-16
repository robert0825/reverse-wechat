package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class rz
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public int lSW;
  public int tXI;
  public String uhq;
  
  public rz()
  {
    GMTrace.i(3828694908928L, 28526);
    GMTrace.o(3828694908928L, 28526);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3828829126656L, 28527);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      paramVarArgs.fk(2, this.tXI);
      if (this.uhq != null) {
        paramVarArgs.e(3, this.uhq);
      }
      paramVarArgs.fk(4, this.lSW);
      GMTrace.o(3828829126656L, 28527);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPi) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tXI);
      paramInt = i;
      if (this.uhq != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uhq);
      }
      i = b.a.a.a.fh(4, this.lSW);
      GMTrace.o(3828829126656L, 28527);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3828829126656L, 28527);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        rz localrz = (rz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3828829126656L, 28527);
          return -1;
        case 1: 
          localrz.lPi = locala.yqV.readString();
          GMTrace.o(3828829126656L, 28527);
          return 0;
        case 2: 
          localrz.tXI = locala.yqV.nj();
          GMTrace.o(3828829126656L, 28527);
          return 0;
        case 3: 
          localrz.uhq = locala.yqV.readString();
          GMTrace.o(3828829126656L, 28527);
          return 0;
        }
        localrz.lSW = locala.yqV.nj();
        GMTrace.o(3828829126656L, 28527);
        return 0;
      }
      GMTrace.o(3828829126656L, 28527);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\rz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */