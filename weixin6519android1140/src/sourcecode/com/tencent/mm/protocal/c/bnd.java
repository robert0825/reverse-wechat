package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bnd
  extends com.tencent.mm.bm.a
{
  public int state;
  public int uXe;
  public String uxW;
  
  public bnd()
  {
    GMTrace.i(3877684379648L, 28891);
    GMTrace.o(3877684379648L, 28891);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3877818597376L, 28892);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxW != null) {
        paramVarArgs.e(1, this.uxW);
      }
      paramVarArgs.fk(2, this.state);
      paramVarArgs.fk(3, this.uXe);
      GMTrace.o(3877818597376L, 28892);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uxW == null) {
        break label342;
      }
    }
    label342:
    for (paramInt = b.a.a.b.b.a.f(1, this.uxW) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.state);
      int j = b.a.a.a.fh(3, this.uXe);
      GMTrace.o(3877818597376L, 28892);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3877818597376L, 28892);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bnd localbnd = (bnd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3877818597376L, 28892);
          return -1;
        case 1: 
          localbnd.uxW = locala.yqV.readString();
          GMTrace.o(3877818597376L, 28892);
          return 0;
        case 2: 
          localbnd.state = locala.yqV.nj();
          GMTrace.o(3877818597376L, 28892);
          return 0;
        }
        localbnd.uXe = locala.yqV.nj();
        GMTrace.o(3877818597376L, 28892);
        return 0;
      }
      GMTrace.o(3877818597376L, 28892);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */