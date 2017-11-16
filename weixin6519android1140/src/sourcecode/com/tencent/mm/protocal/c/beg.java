package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class beg
  extends com.tencent.mm.bm.a
{
  public String tRS;
  public int tTI;
  
  public beg()
  {
    GMTrace.i(3763599310848L, 28041);
    GMTrace.o(3763599310848L, 28041);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3763733528576L, 28042);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRS == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.tRS != null) {
        paramVarArgs.e(1, this.tRS);
      }
      paramVarArgs.fk(2, this.tTI);
      GMTrace.o(3763733528576L, 28042);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRS == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRS) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.tTI);
      GMTrace.o(3763733528576L, 28042);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tRS == null) {
          throw new b("Not all required fields were included: ProductID");
        }
        GMTrace.o(3763733528576L, 28042);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        beg localbeg = (beg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3763733528576L, 28042);
          return -1;
        case 1: 
          localbeg.tRS = locala.yqV.readString();
          GMTrace.o(3763733528576L, 28042);
          return 0;
        }
        localbeg.tTI = locala.yqV.nj();
        GMTrace.o(3763733528576L, 28042);
        return 0;
      }
      GMTrace.o(3763733528576L, 28042);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\beg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */