package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agx
  extends com.tencent.mm.bm.a
{
  public String jhl;
  public String tSz;
  
  public agx()
  {
    GMTrace.i(3901977788416L, 29072);
    GMTrace.o(3901977788416L, 29072);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3902112006144L, 29073);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSz != null) {
        paramVarArgs.e(1, this.tSz);
      }
      if (this.jhl != null) {
        paramVarArgs.e(2, this.jhl);
      }
      GMTrace.o(3902112006144L, 29073);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tSz == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tSz) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jhl != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhl);
      }
      GMTrace.o(3902112006144L, 29073);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3902112006144L, 29073);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agx localagx = (agx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3902112006144L, 29073);
          return -1;
        case 1: 
          localagx.tSz = locala.yqV.readString();
          GMTrace.o(3902112006144L, 29073);
          return 0;
        }
        localagx.jhl = locala.yqV.readString();
        GMTrace.o(3902112006144L, 29073);
        return 0;
      }
      GMTrace.o(3902112006144L, 29073);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\agx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */