package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class be
  extends com.tencent.mm.bm.a
{
  public String lPD;
  public String lPE;
  
  public be()
  {
    GMTrace.i(12652571000832L, 94269);
    GMTrace.o(12652571000832L, 94269);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12652705218560L, 94270);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPD != null) {
        paramVarArgs.e(1, this.lPD);
      }
      if (this.lPE != null) {
        paramVarArgs.e(2, this.lPE);
      }
      GMTrace.o(12652705218560L, 94270);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPD == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPE);
      }
      GMTrace.o(12652705218560L, 94270);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12652705218560L, 94270);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        be localbe = (be)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12652705218560L, 94270);
          return -1;
        case 1: 
          localbe.lPD = locala.yqV.readString();
          GMTrace.o(12652705218560L, 94270);
          return 0;
        }
        localbe.lPE = locala.yqV.readString();
        GMTrace.o(12652705218560L, 94270);
        return 0;
      }
      GMTrace.o(12652705218560L, 94270);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */