package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bjg
  extends com.tencent.mm.bm.a
{
  public String username;
  
  public bjg()
  {
    GMTrace.i(3752593457152L, 27959);
    GMTrace.o(3752593457152L, 27959);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3752727674880L, 27960);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      GMTrace.o(3752727674880L, 27960);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      GMTrace.o(3752727674880L, 27960);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        GMTrace.o(3752727674880L, 27960);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjg localbjg = (bjg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3752727674880L, 27960);
          return -1;
        }
        localbjg.username = locala.yqV.readString();
        GMTrace.o(3752727674880L, 27960);
        return 0;
      }
      GMTrace.o(3752727674880L, 27960);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bjg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */