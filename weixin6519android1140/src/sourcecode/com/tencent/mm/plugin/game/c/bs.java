package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bs
  extends com.tencent.mm.bm.a
{
  public String lPd;
  public String lSu;
  
  public bs()
  {
    GMTrace.i(12649081339904L, 94243);
    GMTrace.o(12649081339904L, 94243);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12649215557632L, 94244);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSu != null) {
        paramVarArgs.e(1, this.lSu);
      }
      if (this.lPd != null) {
        paramVarArgs.e(2, this.lPd);
      }
      GMTrace.o(12649215557632L, 94244);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lSu == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.lSu) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPd);
      }
      GMTrace.o(12649215557632L, 94244);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12649215557632L, 94244);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bs localbs = (bs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12649215557632L, 94244);
          return -1;
        case 1: 
          localbs.lSu = locala.yqV.readString();
          GMTrace.o(12649215557632L, 94244);
          return 0;
        }
        localbs.lPd = locala.yqV.readString();
        GMTrace.o(12649215557632L, 94244);
        return 0;
      }
      GMTrace.o(12649215557632L, 94244);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */