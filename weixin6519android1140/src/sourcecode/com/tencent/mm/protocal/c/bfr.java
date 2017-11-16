package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfr
  extends com.tencent.mm.bm.a
{
  public int pRL;
  public int pRM;
  public String tQR;
  public String tQS;
  public String tQT;
  
  public bfr()
  {
    GMTrace.i(3639179476992L, 27114);
    GMTrace.o(3639179476992L, 27114);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3639313694720L, 27115);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQR != null) {
        paramVarArgs.e(1, this.tQR);
      }
      if (this.tQS != null) {
        paramVarArgs.e(2, this.tQS);
      }
      if (this.tQT != null) {
        paramVarArgs.e(3, this.tQT);
      }
      paramVarArgs.fk(4, this.pRL);
      paramVarArgs.fk(5, this.pRM);
      GMTrace.o(3639313694720L, 27115);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tQR == null) {
        break label470;
      }
    }
    label470:
    for (int i = b.a.a.b.b.a.f(1, this.tQR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tQS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tQS);
      }
      i = paramInt;
      if (this.tQT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tQT);
      }
      paramInt = b.a.a.a.fh(4, this.pRL);
      int j = b.a.a.a.fh(5, this.pRM);
      GMTrace.o(3639313694720L, 27115);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3639313694720L, 27115);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bfr localbfr = (bfr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3639313694720L, 27115);
          return -1;
        case 1: 
          localbfr.tQR = locala.yqV.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 2: 
          localbfr.tQS = locala.yqV.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 3: 
          localbfr.tQT = locala.yqV.readString();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        case 4: 
          localbfr.pRL = locala.yqV.nj();
          GMTrace.o(3639313694720L, 27115);
          return 0;
        }
        localbfr.pRM = locala.yqV.nj();
        GMTrace.o(3639313694720L, 27115);
        return 0;
      }
      GMTrace.o(3639313694720L, 27115);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */