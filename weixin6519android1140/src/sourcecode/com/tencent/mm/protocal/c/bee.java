package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bee
  extends com.tencent.mm.bm.a
{
  public String mmS;
  public String uhc;
  
  public bee()
  {
    GMTrace.i(3973650055168L, 29606);
    GMTrace.o(3973650055168L, 29606);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3973784272896L, 29607);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhc != null) {
        paramVarArgs.e(1, this.uhc);
      }
      if (this.mmS != null) {
        paramVarArgs.e(2, this.mmS);
      }
      GMTrace.o(3973784272896L, 29607);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uhc == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uhc) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mmS != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mmS);
      }
      GMTrace.o(3973784272896L, 29607);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3973784272896L, 29607);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bee localbee = (bee)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3973784272896L, 29607);
          return -1;
        case 1: 
          localbee.uhc = locala.yqV.readString();
          GMTrace.o(3973784272896L, 29607);
          return 0;
        }
        localbee.mmS = locala.yqV.readString();
        GMTrace.o(3973784272896L, 29607);
        return 0;
      }
      GMTrace.o(3973784272896L, 29607);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */