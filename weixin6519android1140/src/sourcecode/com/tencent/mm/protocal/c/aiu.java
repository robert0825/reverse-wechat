package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aiu
  extends com.tencent.mm.bm.a
{
  public String upu;
  
  public aiu()
  {
    GMTrace.i(3846545866752L, 28659);
    GMTrace.o(3846545866752L, 28659);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3846680084480L, 28660);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upu != null) {
        paramVarArgs.e(1, this.upu);
      }
      GMTrace.o(3846680084480L, 28660);
      return 0;
    }
    if (paramInt == 1) {
      if (this.upu == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.upu) + 0;; paramInt = 0)
    {
      GMTrace.o(3846680084480L, 28660);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3846680084480L, 28660);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aiu localaiu = (aiu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3846680084480L, 28660);
          return -1;
        }
        localaiu.upu = locala.yqV.readString();
        GMTrace.o(3846680084480L, 28660);
        return 0;
      }
      GMTrace.o(3846680084480L, 28660);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */