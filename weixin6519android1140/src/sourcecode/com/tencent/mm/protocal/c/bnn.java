package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bnn
  extends com.tencent.mm.bm.a
{
  public String uXy;
  public String username;
  
  public bnn()
  {
    GMTrace.i(3816615313408L, 28436);
    GMTrace.o(3816615313408L, 28436);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3816749531136L, 28437);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.uXy != null) {
        paramVarArgs.e(2, this.uXy);
      }
      GMTrace.o(3816749531136L, 28437);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uXy != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uXy);
      }
      GMTrace.o(3816749531136L, 28437);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3816749531136L, 28437);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bnn localbnn = (bnn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3816749531136L, 28437);
          return -1;
        case 1: 
          localbnn.username = locala.yqV.readString();
          GMTrace.o(3816749531136L, 28437);
          return 0;
        }
        localbnn.uXy = locala.yqV.readString();
        GMTrace.o(3816749531136L, 28437);
        return 0;
      }
      GMTrace.o(3816749531136L, 28437);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */