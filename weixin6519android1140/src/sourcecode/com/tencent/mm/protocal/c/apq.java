package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class apq
  extends com.tencent.mm.bm.a
{
  public String tRz;
  public double uFo;
  public long uFp;
  
  public apq()
  {
    GMTrace.i(3996601286656L, 29777);
    GMTrace.o(3996601286656L, 29777);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3996735504384L, 29778);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      paramVarArgs.a(2, this.uFo);
      paramVarArgs.T(3, this.uFp);
      GMTrace.o(3996735504384L, 29778);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label374;
      }
    }
    label374:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.a.S(3, this.uFp);
      GMTrace.o(3996735504384L, 29778);
      return paramInt + (i + 8) + j;
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
        GMTrace.o(3996735504384L, 29778);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        apq localapq = (apq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3996735504384L, 29778);
          return -1;
        case 1: 
          localapq.tRz = locala.yqV.readString();
          GMTrace.o(3996735504384L, 29778);
          return 0;
        case 2: 
          localapq.uFo = locala.yqV.readDouble();
          GMTrace.o(3996735504384L, 29778);
          return 0;
        }
        localapq.uFp = locala.yqV.nk();
        GMTrace.o(3996735504384L, 29778);
        return 0;
      }
      GMTrace.o(3996735504384L, 29778);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */