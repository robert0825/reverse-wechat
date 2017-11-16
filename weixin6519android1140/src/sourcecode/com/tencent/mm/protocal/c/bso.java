package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bso
  extends com.tencent.mm.bm.a
{
  public String tRz;
  public long uKe;
  
  public bso()
  {
    GMTrace.i(3782926663680L, 28185);
    GMTrace.o(3782926663680L, 28185);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3783060881408L, 28186);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      paramVarArgs.T(2, this.uKe);
      GMTrace.o(3783060881408L, 28186);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.uKe);
      GMTrace.o(3783060881408L, 28186);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tRz == null) {
          throw new b("Not all required fields were included: Username");
        }
        GMTrace.o(3783060881408L, 28186);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bso localbso = (bso)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3783060881408L, 28186);
          return -1;
        case 1: 
          localbso.tRz = locala.yqV.readString();
          GMTrace.o(3783060881408L, 28186);
          return 0;
        }
        localbso.uKe = locala.yqV.nk();
        GMTrace.o(3783060881408L, 28186);
        return 0;
      }
      GMTrace.o(3783060881408L, 28186);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */