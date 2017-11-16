package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class buw
  extends com.tencent.mm.bm.a
{
  public String oqQ;
  public String tVN;
  
  public buw()
  {
    GMTrace.i(15352897470464L, 114388);
    GMTrace.o(15352897470464L, 114388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15353031688192L, 114389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVN != null) {
        paramVarArgs.e(1, this.tVN);
      }
      if (this.oqQ != null) {
        paramVarArgs.e(2, this.oqQ);
      }
      GMTrace.o(15353031688192L, 114389);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVN == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVN) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.oqQ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.oqQ);
      }
      GMTrace.o(15353031688192L, 114389);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15353031688192L, 114389);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        buw localbuw = (buw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15353031688192L, 114389);
          return -1;
        case 1: 
          localbuw.tVN = locala.yqV.readString();
          GMTrace.o(15353031688192L, 114389);
          return 0;
        }
        localbuw.oqQ = locala.yqV.readString();
        GMTrace.o(15353031688192L, 114389);
        return 0;
      }
      GMTrace.o(15353031688192L, 114389);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */