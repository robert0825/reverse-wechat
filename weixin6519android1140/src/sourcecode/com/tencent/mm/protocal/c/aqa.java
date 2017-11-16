package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqa
  extends com.tencent.mm.bm.a
{
  public int lQc;
  public String lSX;
  public String lSY;
  public int tPV;
  public long tQd;
  
  public aqa()
  {
    GMTrace.i(13336276107264L, 99363);
    GMTrace.o(13336276107264L, 99363);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13336410324992L, 99364);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSY != null) {
        paramVarArgs.e(1, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(2, this.lSX);
      }
      paramVarArgs.fk(3, this.tPV);
      paramVarArgs.fk(4, this.lQc);
      paramVarArgs.T(5, this.tQd);
      GMTrace.o(13336410324992L, 99364);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lSY == null) {
        break label443;
      }
    }
    label443:
    for (paramInt = b.a.a.b.b.a.f(1, this.lSY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lSX);
      }
      paramInt = b.a.a.a.fh(3, this.tPV);
      int j = b.a.a.a.fh(4, this.lQc);
      int k = b.a.a.a.S(5, this.tQd);
      GMTrace.o(13336410324992L, 99364);
      return i + paramInt + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13336410324992L, 99364);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aqa localaqa = (aqa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13336410324992L, 99364);
          return -1;
        case 1: 
          localaqa.lSY = locala.yqV.readString();
          GMTrace.o(13336410324992L, 99364);
          return 0;
        case 2: 
          localaqa.lSX = locala.yqV.readString();
          GMTrace.o(13336410324992L, 99364);
          return 0;
        case 3: 
          localaqa.tPV = locala.yqV.nj();
          GMTrace.o(13336410324992L, 99364);
          return 0;
        case 4: 
          localaqa.lQc = locala.yqV.nj();
          GMTrace.o(13336410324992L, 99364);
          return 0;
        }
        localaqa.tQd = locala.yqV.nk();
        GMTrace.o(13336410324992L, 99364);
        return 0;
      }
      GMTrace.o(13336410324992L, 99364);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */