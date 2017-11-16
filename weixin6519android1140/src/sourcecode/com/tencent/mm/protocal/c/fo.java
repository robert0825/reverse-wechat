package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class fo
  extends com.tencent.mm.bm.a
{
  public String tTU;
  
  public fo()
  {
    GMTrace.i(3902783094784L, 29078);
    GMTrace.o(3902783094784L, 29078);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3902917312512L, 29079);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTU == null) {
        throw new b("Not all required fields were included: Mac");
      }
      if (this.tTU != null) {
        paramVarArgs.e(1, this.tTU);
      }
      GMTrace.o(3902917312512L, 29079);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTU == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.tTU) + 0;; paramInt = 0)
    {
      GMTrace.o(3902917312512L, 29079);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tTU == null) {
          throw new b("Not all required fields were included: Mac");
        }
        GMTrace.o(3902917312512L, 29079);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        fo localfo = (fo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3902917312512L, 29079);
          return -1;
        }
        localfo.tTU = locala.yqV.readString();
        GMTrace.o(3902917312512L, 29079);
        return 0;
      }
      GMTrace.o(3902917312512L, 29079);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */