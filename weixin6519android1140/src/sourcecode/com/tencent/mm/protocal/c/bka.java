package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bka
  extends com.tencent.mm.bm.a
{
  public b uUS;
  public String uUT;
  public b uUU;
  public int uin;
  
  public bka()
  {
    GMTrace.i(3622268043264L, 26988);
    GMTrace.o(3622268043264L, 26988);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3622402260992L, 26989);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uUS != null) {
        paramVarArgs.b(1, this.uUS);
      }
      if (this.uUT != null) {
        paramVarArgs.e(2, this.uUT);
      }
      if (this.uUU != null) {
        paramVarArgs.b(3, this.uUU);
      }
      paramVarArgs.fk(4, this.uin);
      GMTrace.o(3622402260992L, 26989);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uUS == null) {
        break label412;
      }
    }
    label412:
    for (int i = b.a.a.a.a(1, this.uUS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uUT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uUT);
      }
      i = paramInt;
      if (this.uUU != null) {
        i = paramInt + b.a.a.a.a(3, this.uUU);
      }
      paramInt = b.a.a.a.fh(4, this.uin);
      GMTrace.o(3622402260992L, 26989);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3622402260992L, 26989);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bka localbka = (bka)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3622402260992L, 26989);
          return -1;
        case 1: 
          localbka.uUS = locala.csV();
          GMTrace.o(3622402260992L, 26989);
          return 0;
        case 2: 
          localbka.uUT = locala.yqV.readString();
          GMTrace.o(3622402260992L, 26989);
          return 0;
        case 3: 
          localbka.uUU = locala.csV();
          GMTrace.o(3622402260992L, 26989);
          return 0;
        }
        localbka.uin = locala.yqV.nj();
        GMTrace.o(3622402260992L, 26989);
        return 0;
      }
      GMTrace.o(3622402260992L, 26989);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */