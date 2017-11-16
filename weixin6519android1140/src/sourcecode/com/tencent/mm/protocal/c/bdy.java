package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdy
  extends com.tencent.mm.bm.a
{
  public int tVE;
  public String username;
  public int uyt;
  
  public bdy()
  {
    GMTrace.i(20072932311040L, 149555);
    GMTrace.o(20072932311040L, 149555);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20073066528768L, 149556);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.fk(2, this.uyt);
      paramVarArgs.fk(3, this.tVE);
      GMTrace.o(20073066528768L, 149556);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label333;
      }
    }
    label333:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uyt);
      int j = b.a.a.a.fh(3, this.tVE);
      GMTrace.o(20073066528768L, 149556);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20073066528768L, 149556);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdy localbdy = (bdy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20073066528768L, 149556);
          return -1;
        case 1: 
          localbdy.username = locala.yqV.readString();
          GMTrace.o(20073066528768L, 149556);
          return 0;
        case 2: 
          localbdy.uyt = locala.yqV.nj();
          GMTrace.o(20073066528768L, 149556);
          return 0;
        }
        localbdy.tVE = locala.yqV.nj();
        GMTrace.o(20073066528768L, 149556);
        return 0;
      }
      GMTrace.o(20073066528768L, 149556);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */