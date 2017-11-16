package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjz
  extends com.tencent.mm.bm.a
{
  public String uUQ;
  public String uUR;
  
  public bjz()
  {
    GMTrace.i(3723065556992L, 27739);
    GMTrace.o(3723065556992L, 27739);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3723199774720L, 27740);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uUQ != null) {
        paramVarArgs.e(1, this.uUQ);
      }
      if (this.uUR != null) {
        paramVarArgs.e(2, this.uUR);
      }
      GMTrace.o(3723199774720L, 27740);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uUQ == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uUQ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uUR != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uUR);
      }
      GMTrace.o(3723199774720L, 27740);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3723199774720L, 27740);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjz localbjz = (bjz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3723199774720L, 27740);
          return -1;
        case 1: 
          localbjz.uUQ = locala.yqV.readString();
          GMTrace.o(3723199774720L, 27740);
          return 0;
        }
        localbjz.uUR = locala.yqV.readString();
        GMTrace.o(3723199774720L, 27740);
        return 0;
      }
      GMTrace.o(3723199774720L, 27740);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */