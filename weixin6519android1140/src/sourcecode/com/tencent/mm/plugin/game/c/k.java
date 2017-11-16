package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bm.a
{
  public String lPO;
  public String lPP;
  public String lPQ;
  
  public k()
  {
    GMTrace.i(12634854260736L, 94137);
    GMTrace.o(12634854260736L, 94137);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12634988478464L, 94138);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPO != null) {
        paramVarArgs.e(1, this.lPO);
      }
      if (this.lPP != null) {
        paramVarArgs.e(2, this.lPP);
      }
      if (this.lPQ != null) {
        paramVarArgs.e(3, this.lPQ);
      }
      GMTrace.o(12634988478464L, 94138);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPO == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.lPO) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPP != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPP);
      }
      i = paramInt;
      if (this.lPQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPQ);
      }
      GMTrace.o(12634988478464L, 94138);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12634988478464L, 94138);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12634988478464L, 94138);
          return -1;
        case 1: 
          localk.lPO = locala.yqV.readString();
          GMTrace.o(12634988478464L, 94138);
          return 0;
        case 2: 
          localk.lPP = locala.yqV.readString();
          GMTrace.o(12634988478464L, 94138);
          return 0;
        }
        localk.lPQ = locala.yqV.readString();
        GMTrace.o(12634988478464L, 94138);
        return 0;
      }
      GMTrace.o(12634988478464L, 94138);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */