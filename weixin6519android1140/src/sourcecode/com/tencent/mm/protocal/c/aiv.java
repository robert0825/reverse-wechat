package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aiv
  extends com.tencent.mm.bm.a
{
  public int tSt;
  public String uxW;
  public String uxX;
  
  public aiv()
  {
    GMTrace.i(3736487329792L, 27839);
    GMTrace.o(3736487329792L, 27839);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3736621547520L, 27840);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxW != null) {
        paramVarArgs.e(1, this.uxW);
      }
      paramVarArgs.fk(2, this.tSt);
      if (this.uxX != null) {
        paramVarArgs.e(3, this.uxX);
      }
      GMTrace.o(3736621547520L, 27840);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uxW == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.uxW) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tSt);
      paramInt = i;
      if (this.uxX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uxX);
      }
      GMTrace.o(3736621547520L, 27840);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3736621547520L, 27840);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aiv localaiv = (aiv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3736621547520L, 27840);
          return -1;
        case 1: 
          localaiv.uxW = locala.yqV.readString();
          GMTrace.o(3736621547520L, 27840);
          return 0;
        case 2: 
          localaiv.tSt = locala.yqV.nj();
          GMTrace.o(3736621547520L, 27840);
          return 0;
        }
        localaiv.uxX = locala.yqV.readString();
        GMTrace.o(3736621547520L, 27840);
        return 0;
      }
      GMTrace.o(3736621547520L, 27840);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */