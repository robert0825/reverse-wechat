package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class asw
  extends com.tencent.mm.bm.a
{
  public String title;
  public String uIN;
  public String uIO;
  
  public asw()
  {
    GMTrace.i(20964540678144L, 156198);
    GMTrace.o(20964540678144L, 156198);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20964674895872L, 156199);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.uIN != null) {
        paramVarArgs.e(2, this.uIN);
      }
      if (this.uIO != null) {
        paramVarArgs.e(3, this.uIO);
      }
      GMTrace.o(20964674895872L, 156199);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uIN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uIN);
      }
      i = paramInt;
      if (this.uIO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uIO);
      }
      GMTrace.o(20964674895872L, 156199);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20964674895872L, 156199);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        asw localasw = (asw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20964674895872L, 156199);
          return -1;
        case 1: 
          localasw.title = locala.yqV.readString();
          GMTrace.o(20964674895872L, 156199);
          return 0;
        case 2: 
          localasw.uIN = locala.yqV.readString();
          GMTrace.o(20964674895872L, 156199);
          return 0;
        }
        localasw.uIO = locala.yqV.readString();
        GMTrace.o(20964674895872L, 156199);
        return 0;
      }
      GMTrace.o(20964674895872L, 156199);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\asw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */