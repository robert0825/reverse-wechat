package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class gs
  extends com.tencent.mm.bm.a
{
  public b tVs;
  public b tVt;
  
  public gs()
  {
    GMTrace.i(3815541571584L, 28428);
    GMTrace.o(3815541571584L, 28428);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3815675789312L, 28429);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVs != null) {
        paramVarArgs.b(1, this.tVs);
      }
      if (this.tVt != null) {
        paramVarArgs.b(2, this.tVt);
      }
      GMTrace.o(3815675789312L, 28429);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVs == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.tVs) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tVt != null) {
        i = paramInt + b.a.a.a.a(2, this.tVt);
      }
      GMTrace.o(3815675789312L, 28429);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3815675789312L, 28429);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        gs localgs = (gs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3815675789312L, 28429);
          return -1;
        case 1: 
          localgs.tVs = locala.csV();
          GMTrace.o(3815675789312L, 28429);
          return 0;
        }
        localgs.tVt = locala.csV();
        GMTrace.o(3815675789312L, 28429);
        return 0;
      }
      GMTrace.o(3815675789312L, 28429);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */