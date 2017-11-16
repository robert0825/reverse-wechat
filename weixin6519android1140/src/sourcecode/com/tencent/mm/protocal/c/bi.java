package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bi
  extends com.tencent.mm.bm.a
{
  public int tPD;
  public String username;
  
  public bi()
  {
    GMTrace.i(3966939168768L, 29556);
    GMTrace.o(3966939168768L, 29556);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3967073386496L, 29557);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.fk(2, this.tPD);
      GMTrace.o(3967073386496L, 29557);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.tPD);
      GMTrace.o(3967073386496L, 29557);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3967073386496L, 29557);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bi localbi = (bi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3967073386496L, 29557);
          return -1;
        case 1: 
          localbi.username = locala.yqV.readString();
          GMTrace.o(3967073386496L, 29557);
          return 0;
        }
        localbi.tPD = locala.yqV.nj();
        GMTrace.o(3967073386496L, 29557);
        return 0;
      }
      GMTrace.o(3967073386496L, 29557);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */