package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjy
  extends com.tencent.mm.bm.a
{
  public String jhi;
  
  public bjy()
  {
    GMTrace.i(3692463915008L, 27511);
    GMTrace.o(3692463915008L, 27511);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3692598132736L, 27512);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      GMTrace.o(3692598132736L, 27512);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      GMTrace.o(3692598132736L, 27512);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3692598132736L, 27512);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjy localbjy = (bjy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3692598132736L, 27512);
          return -1;
        }
        localbjy.jhi = locala.yqV.readString();
        GMTrace.o(3692598132736L, 27512);
        return 0;
      }
      GMTrace.o(3692598132736L, 27512);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */