package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class an
  extends com.tencent.mm.bm.a
{
  public String jyH;
  public String jyI;
  
  public an()
  {
    GMTrace.i(16867410313216L, 125672);
    GMTrace.o(16867410313216L, 125672);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16867544530944L, 125673);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jyH != null) {
        paramVarArgs.e(1, this.jyH);
      }
      if (this.jyI != null) {
        paramVarArgs.e(2, this.jyI);
      }
      GMTrace.o(16867544530944L, 125673);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jyH == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.jyH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jyI != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jyI);
      }
      GMTrace.o(16867544530944L, 125673);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(16867544530944L, 125673);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        an localan = (an)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16867544530944L, 125673);
          return -1;
        case 1: 
          localan.jyH = locala.yqV.readString();
          GMTrace.o(16867544530944L, 125673);
          return 0;
        }
        localan.jyI = locala.yqV.readString();
        GMTrace.o(16867544530944L, 125673);
        return 0;
      }
      GMTrace.o(16867544530944L, 125673);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */