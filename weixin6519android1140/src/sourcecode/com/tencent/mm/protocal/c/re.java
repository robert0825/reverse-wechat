package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class re
  extends com.tencent.mm.bm.a
{
  public String uhA;
  
  public re()
  {
    GMTrace.i(3795945783296L, 28282);
    GMTrace.o(3795945783296L, 28282);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3796080001024L, 28283);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhA == null) {
        throw new b("Not all required fields were included: HeadUrl");
      }
      if (this.uhA != null) {
        paramVarArgs.e(1, this.uhA);
      }
      GMTrace.o(3796080001024L, 28283);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uhA == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.uhA) + 0;; paramInt = 0)
    {
      GMTrace.o(3796080001024L, 28283);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uhA == null) {
          throw new b("Not all required fields were included: HeadUrl");
        }
        GMTrace.o(3796080001024L, 28283);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        re localre = (re)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3796080001024L, 28283);
          return -1;
        }
        localre.uhA = locala.yqV.readString();
        GMTrace.o(3796080001024L, 28283);
        return 0;
      }
      GMTrace.o(3796080001024L, 28283);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */