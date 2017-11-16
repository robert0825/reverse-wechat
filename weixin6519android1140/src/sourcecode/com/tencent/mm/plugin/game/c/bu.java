package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bu
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lRV;
  
  public bu()
  {
    GMTrace.i(12652302565376L, 94267);
    GMTrace.o(12652302565376L, 94267);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12652436783104L, 94268);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRV != null) {
        paramVarArgs.e(1, this.lRV);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      GMTrace.o(12652436783104L, 94268);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRV == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.lRV) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eBt);
      }
      GMTrace.o(12652436783104L, 94268);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12652436783104L, 94268);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bu localbu = (bu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12652436783104L, 94268);
          return -1;
        case 1: 
          localbu.lRV = locala.yqV.readString();
          GMTrace.o(12652436783104L, 94268);
          return 0;
        }
        localbu.eBt = locala.yqV.readString();
        GMTrace.o(12652436783104L, 94268);
        return 0;
      }
      GMTrace.o(12652436783104L, 94268);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */