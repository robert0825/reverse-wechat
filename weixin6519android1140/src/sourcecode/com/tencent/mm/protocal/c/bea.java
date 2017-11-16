package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bea
  extends com.tencent.mm.bm.a
{
  public String uPR;
  public String uPS;
  public String uPT;
  
  public bea()
  {
    GMTrace.i(3745077264384L, 27903);
    GMTrace.o(3745077264384L, 27903);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745211482112L, 27904);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uPR != null) {
        paramVarArgs.e(1, this.uPR);
      }
      if (this.uPS != null) {
        paramVarArgs.e(2, this.uPS);
      }
      if (this.uPT != null) {
        paramVarArgs.e(3, this.uPT);
      }
      GMTrace.o(3745211482112L, 27904);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uPR == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.uPR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uPS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uPS);
      }
      i = paramInt;
      if (this.uPT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uPT);
      }
      GMTrace.o(3745211482112L, 27904);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3745211482112L, 27904);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bea localbea = (bea)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3745211482112L, 27904);
          return -1;
        case 1: 
          localbea.uPR = locala.yqV.readString();
          GMTrace.o(3745211482112L, 27904);
          return 0;
        case 2: 
          localbea.uPS = locala.yqV.readString();
          GMTrace.o(3745211482112L, 27904);
          return 0;
        }
        localbea.uPT = locala.yqV.readString();
        GMTrace.o(3745211482112L, 27904);
        return 0;
      }
      GMTrace.o(3745211482112L, 27904);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */