package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhh
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public String uTh;
  
  public bhh()
  {
    GMTrace.i(3852719882240L, 28705);
    GMTrace.o(3852719882240L, 28705);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3852854099968L, 28706);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.uTh != null) {
        paramVarArgs.e(2, this.uTh);
      }
      GMTrace.o(3852854099968L, 28706);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uTh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uTh);
      }
      GMTrace.o(3852854099968L, 28706);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3852854099968L, 28706);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhh localbhh = (bhh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3852854099968L, 28706);
          return -1;
        case 1: 
          localbhh.lPi = locala.yqV.readString();
          GMTrace.o(3852854099968L, 28706);
          return 0;
        }
        localbhh.uTh = locala.yqV.readString();
        GMTrace.o(3852854099968L, 28706);
        return 0;
      }
      GMTrace.o(3852854099968L, 28706);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */