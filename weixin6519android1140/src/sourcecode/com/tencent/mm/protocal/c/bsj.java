package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsj
  extends com.tencent.mm.bm.a
{
  public String tRz;
  public long uKe;
  public boolean vbE;
  
  public bsj()
  {
    GMTrace.i(4038611435520L, 30090);
    GMTrace.o(4038611435520L, 30090);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4038745653248L, 30091);
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
      paramVarArgs.ah(3, this.vbE);
      GMTrace.o(4038745653248L, 30091);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label371;
      }
    }
    label371:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.uKe);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(4038745653248L, 30091);
      return paramInt + i + (j + 1);
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
        GMTrace.o(4038745653248L, 30091);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsj localbsj = (bsj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4038745653248L, 30091);
          return -1;
        case 1: 
          localbsj.tRz = locala.yqV.readString();
          GMTrace.o(4038745653248L, 30091);
          return 0;
        case 2: 
          localbsj.uKe = locala.yqV.nk();
          GMTrace.o(4038745653248L, 30091);
          return 0;
        }
        localbsj.vbE = locala.csU();
        GMTrace.o(4038745653248L, 30091);
        return 0;
      }
      GMTrace.o(4038745653248L, 30091);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */