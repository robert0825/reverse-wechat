package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ami
  extends com.tencent.mm.bm.a
{
  public String v;
  
  public ami()
  {
    GMTrace.i(3801582927872L, 28324);
    GMTrace.o(3801582927872L, 28324);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3801717145600L, 28325);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.v != null) {
        paramVarArgs.e(1, this.v);
      }
      GMTrace.o(3801717145600L, 28325);
      return 0;
    }
    if (paramInt == 1) {
      if (this.v == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.v) + 0;; paramInt = 0)
    {
      GMTrace.o(3801717145600L, 28325);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3801717145600L, 28325);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ami localami = (ami)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3801717145600L, 28325);
          return -1;
        }
        localami.v = locala.yqV.readString();
        GMTrace.o(3801717145600L, 28325);
        return 0;
      }
      GMTrace.o(3801717145600L, 28325);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ami.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */