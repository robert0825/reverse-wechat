package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bub
  extends com.tencent.mm.bm.a
{
  public String utF;
  public String utG;
  
  public bub()
  {
    GMTrace.i(13577465364480L, 101160);
    GMTrace.o(13577465364480L, 101160);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13577599582208L, 101161);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.utF != null) {
        paramVarArgs.e(1, this.utF);
      }
      if (this.utG != null) {
        paramVarArgs.e(2, this.utG);
      }
      GMTrace.o(13577599582208L, 101161);
      return 0;
    }
    if (paramInt == 1) {
      if (this.utF == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.utF) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.utG != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.utG);
      }
      GMTrace.o(13577599582208L, 101161);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13577599582208L, 101161);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bub localbub = (bub)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13577599582208L, 101161);
          return -1;
        case 1: 
          localbub.utF = locala.yqV.readString();
          GMTrace.o(13577599582208L, 101161);
          return 0;
        }
        localbub.utG = locala.yqV.readString();
        GMTrace.o(13577599582208L, 101161);
        return 0;
      }
      GMTrace.o(13577599582208L, 101161);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */