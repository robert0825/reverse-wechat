package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class zt
  extends com.tencent.mm.bm.a
{
  public String ugy;
  public String uqy;
  
  public zt()
  {
    GMTrace.i(18615596220416L, 138697);
    GMTrace.o(18615596220416L, 138697);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18615730438144L, 138698);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uqy == null) {
        throw new b("Not all required fields were included: ActivityId");
      }
      if (this.uqy != null) {
        paramVarArgs.e(1, this.uqy);
      }
      if (this.ugy != null) {
        paramVarArgs.e(2, this.ugy);
      }
      GMTrace.o(18615730438144L, 138698);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uqy == null) {
        break label334;
      }
    }
    label334:
    for (paramInt = b.a.a.b.b.a.f(1, this.uqy) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ugy != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ugy);
      }
      GMTrace.o(18615730438144L, 138698);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uqy == null) {
          throw new b("Not all required fields were included: ActivityId");
        }
        GMTrace.o(18615730438144L, 138698);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        zt localzt = (zt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18615730438144L, 138698);
          return -1;
        case 1: 
          localzt.uqy = locala.yqV.readString();
          GMTrace.o(18615730438144L, 138698);
          return 0;
        }
        localzt.ugy = locala.yqV.readString();
        GMTrace.o(18615730438144L, 138698);
        return 0;
      }
      GMTrace.o(18615730438144L, 138698);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */