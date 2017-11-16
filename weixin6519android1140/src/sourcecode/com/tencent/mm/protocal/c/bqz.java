package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqz
  extends com.tencent.mm.bm.a
{
  public String nFA;
  public int tOG;
  public String uBW;
  public String uMU;
  public String vaK;
  public String vaL;
  public int vaM;
  public String vaN;
  public String vaO;
  public String vaP;
  
  public bqz()
  {
    GMTrace.i(3956738621440L, 29480);
    GMTrace.o(3956738621440L, 29480);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3956872839168L, 29481);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaK != null) {
        paramVarArgs.e(1, this.vaK);
      }
      if (this.vaL != null) {
        paramVarArgs.e(2, this.vaL);
      }
      if (this.uBW != null) {
        paramVarArgs.e(3, this.uBW);
      }
      if (this.uMU != null) {
        paramVarArgs.e(4, this.uMU);
      }
      paramVarArgs.fk(5, this.vaM);
      if (this.nFA != null) {
        paramVarArgs.e(6, this.nFA);
      }
      if (this.vaN != null) {
        paramVarArgs.e(7, this.vaN);
      }
      if (this.vaO != null) {
        paramVarArgs.e(8, this.vaO);
      }
      paramVarArgs.fk(9, this.tOG);
      if (this.vaP != null) {
        paramVarArgs.e(19, this.vaP);
      }
      GMTrace.o(3956872839168L, 29481);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaK == null) {
        break label834;
      }
    }
    label834:
    for (int i = b.a.a.b.b.a.f(1, this.vaK) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vaL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vaL);
      }
      i = paramInt;
      if (this.uBW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uBW);
      }
      paramInt = i;
      if (this.uMU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uMU);
      }
      i = paramInt + b.a.a.a.fh(5, this.vaM);
      paramInt = i;
      if (this.nFA != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.nFA);
      }
      i = paramInt;
      if (this.vaN != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.vaN);
      }
      paramInt = i;
      if (this.vaO != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.vaO);
      }
      i = paramInt + b.a.a.a.fh(9, this.tOG);
      paramInt = i;
      if (this.vaP != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.vaP);
      }
      GMTrace.o(3956872839168L, 29481);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3956872839168L, 29481);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqz localbqz = (bqz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        default: 
          GMTrace.o(3956872839168L, 29481);
          return -1;
        case 1: 
          localbqz.vaK = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 2: 
          localbqz.vaL = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 3: 
          localbqz.uBW = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 4: 
          localbqz.uMU = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 5: 
          localbqz.vaM = locala.yqV.nj();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 6: 
          localbqz.nFA = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 7: 
          localbqz.vaN = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 8: 
          localbqz.vaO = locala.yqV.readString();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        case 9: 
          localbqz.tOG = locala.yqV.nj();
          GMTrace.o(3956872839168L, 29481);
          return 0;
        }
        localbqz.vaP = locala.yqV.readString();
        GMTrace.o(3956872839168L, 29481);
        return 0;
      }
      GMTrace.o(3956872839168L, 29481);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */