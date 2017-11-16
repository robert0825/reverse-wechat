package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class ci
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPE;
  public String lPF;
  public String lRV;
  
  public ci()
  {
    GMTrace.i(12649886646272L, 94249);
    GMTrace.o(12649886646272L, 94249);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12650020864000L, 94250);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRV != null) {
        paramVarArgs.e(1, this.lRV);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.lPE != null) {
        paramVarArgs.e(3, this.lPE);
      }
      if (this.lPF != null) {
        paramVarArgs.e(4, this.lPF);
      }
      GMTrace.o(12650020864000L, 94250);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRV == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.lRV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPE);
      }
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPF);
      }
      GMTrace.o(12650020864000L, 94250);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12650020864000L, 94250);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ci localci = (ci)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12650020864000L, 94250);
          return -1;
        case 1: 
          localci.lRV = locala.yqV.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        case 2: 
          localci.eBt = locala.yqV.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        case 3: 
          localci.lPE = locala.yqV.readString();
          GMTrace.o(12650020864000L, 94250);
          return 0;
        }
        localci.lPF = locala.yqV.readString();
        GMTrace.o(12650020864000L, 94250);
        return 0;
      }
      GMTrace.o(12650020864000L, 94250);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */