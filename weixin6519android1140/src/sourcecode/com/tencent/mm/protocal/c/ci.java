package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ci
  extends com.tencent.mm.bm.a
{
  public String signature;
  public String tQt;
  
  public ci()
  {
    GMTrace.i(3944390590464L, 29388);
    GMTrace.o(3944390590464L, 29388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3944524808192L, 29389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.signature != null) {
        paramVarArgs.e(1, this.signature);
      }
      if (this.tQt != null) {
        paramVarArgs.e(2, this.tQt);
      }
      GMTrace.o(3944524808192L, 29389);
      return 0;
    }
    if (paramInt == 1) {
      if (this.signature == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.signature) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tQt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQt);
      }
      GMTrace.o(3944524808192L, 29389);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3944524808192L, 29389);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ci localci = (ci)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3944524808192L, 29389);
          return -1;
        case 1: 
          localci.signature = locala.yqV.readString();
          GMTrace.o(3944524808192L, 29389);
          return 0;
        }
        localci.tQt = locala.yqV.readString();
        GMTrace.o(3944524808192L, 29389);
        return 0;
      }
      GMTrace.o(3944524808192L, 29389);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */