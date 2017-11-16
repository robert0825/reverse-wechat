package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ga
  extends com.tencent.mm.bm.a
{
  public String eCQ;
  public String nDw;
  public String username;
  
  public ga()
  {
    GMTrace.i(20965748637696L, 156207);
    GMTrace.o(20965748637696L, 156207);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20965882855424L, 156208);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      if (this.nDw != null) {
        paramVarArgs.e(2, this.nDw);
      }
      if (this.eCQ != null) {
        paramVarArgs.e(3, this.eCQ);
      }
      GMTrace.o(20965882855424L, 156208);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.username) + 0;; i = 0)
    {
      paramInt = i;
      if (this.nDw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nDw);
      }
      i = paramInt;
      if (this.eCQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eCQ);
      }
      GMTrace.o(20965882855424L, 156208);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20965882855424L, 156208);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ga localga = (ga)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20965882855424L, 156208);
          return -1;
        case 1: 
          localga.username = locala.yqV.readString();
          GMTrace.o(20965882855424L, 156208);
          return 0;
        case 2: 
          localga.nDw = locala.yqV.readString();
          GMTrace.o(20965882855424L, 156208);
          return 0;
        }
        localga.eCQ = locala.yqV.readString();
        GMTrace.o(20965882855424L, 156208);
        return 0;
      }
      GMTrace.o(20965882855424L, 156208);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */