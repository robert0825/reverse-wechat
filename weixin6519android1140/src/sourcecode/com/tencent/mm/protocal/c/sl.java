package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class sl
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public long ory;
  public int uiD;
  
  public sl()
  {
    GMTrace.i(4033242726400L, 30050);
    GMTrace.o(4033242726400L, 30050);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4033376944128L, 30051);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.ory);
      if (this.lPi != null) {
        paramVarArgs.e(2, this.lPi);
      }
      paramVarArgs.fk(3, this.uiD);
      GMTrace.o(4033376944128L, 30051);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.ory) + 0;
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPi);
      }
      i = b.a.a.a.fh(3, this.uiD);
      GMTrace.o(4033376944128L, 30051);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4033376944128L, 30051);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      sl localsl = (sl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4033376944128L, 30051);
        return -1;
      case 1: 
        localsl.ory = locala.yqV.nk();
        GMTrace.o(4033376944128L, 30051);
        return 0;
      case 2: 
        localsl.lPi = locala.yqV.readString();
        GMTrace.o(4033376944128L, 30051);
        return 0;
      }
      localsl.uiD = locala.yqV.nj();
      GMTrace.o(4033376944128L, 30051);
      return 0;
    }
    GMTrace.o(4033376944128L, 30051);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\sl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */