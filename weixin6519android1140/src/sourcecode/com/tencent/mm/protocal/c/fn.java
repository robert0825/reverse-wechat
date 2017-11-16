package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class fn
  extends com.tencent.mm.bm.a
{
  public String tTT;
  
  public fn()
  {
    GMTrace.i(3701859155968L, 27581);
    GMTrace.o(3701859155968L, 27581);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3701993373696L, 27582);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTT != null) {
        paramVarArgs.e(1, this.tTT);
      }
      GMTrace.o(3701993373696L, 27582);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTT == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.tTT) + 0;; paramInt = 0)
    {
      GMTrace.o(3701993373696L, 27582);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3701993373696L, 27582);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        fn localfn = (fn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3701993373696L, 27582);
          return -1;
        }
        localfn.tTT = locala.yqV.readString();
        GMTrace.o(3701993373696L, 27582);
        return 0;
      }
      GMTrace.o(3701993373696L, 27582);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */