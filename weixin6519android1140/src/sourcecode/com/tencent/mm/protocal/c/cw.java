package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cw
  extends com.tencent.mm.bm.a
{
  public int tQU;
  public String tQV;
  
  public cw()
  {
    GMTrace.i(4011633672192L, 29889);
    GMTrace.o(4011633672192L, 29889);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4011767889920L, 29890);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tQU);
      if (this.tQV != null) {
        paramVarArgs.e(2, this.tQV);
      }
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tQU) + 0;
      paramInt = i;
      if (this.tQV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tQV);
      }
      GMTrace.o(4011767889920L, 29890);
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
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cw localcw = (cw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4011767889920L, 29890);
        return -1;
      case 1: 
        localcw.tQU = locala.yqV.nj();
        GMTrace.o(4011767889920L, 29890);
        return 0;
      }
      localcw.tQV = locala.yqV.readString();
      GMTrace.o(4011767889920L, 29890);
      return 0;
    }
    GMTrace.o(4011767889920L, 29890);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */