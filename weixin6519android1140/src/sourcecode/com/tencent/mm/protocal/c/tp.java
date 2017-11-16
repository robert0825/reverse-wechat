package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tp
  extends com.tencent.mm.bm.a
{
  public String ult;
  public String ulu;
  
  public tp()
  {
    GMTrace.i(20970043604992L, 156239);
    GMTrace.o(20970043604992L, 156239);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20970177822720L, 156240);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ult != null) {
        paramVarArgs.e(1, this.ult);
      }
      if (this.ulu != null) {
        paramVarArgs.e(2, this.ulu);
      }
      GMTrace.o(20970177822720L, 156240);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ult == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.ult) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ulu != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ulu);
      }
      GMTrace.o(20970177822720L, 156240);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20970177822720L, 156240);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tp localtp = (tp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20970177822720L, 156240);
          return -1;
        case 1: 
          localtp.ult = locala.yqV.readString();
          GMTrace.o(20970177822720L, 156240);
          return 0;
        }
        localtp.ulu = locala.yqV.readString();
        GMTrace.o(20970177822720L, 156240);
        return 0;
      }
      GMTrace.o(20970177822720L, 156240);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */