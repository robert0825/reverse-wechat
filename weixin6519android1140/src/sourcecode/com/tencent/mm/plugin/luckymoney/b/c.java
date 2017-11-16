package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bm.a
{
  public int jWC;
  public int mHQ;
  public double mHR;
  public String mHS;
  public String mHT;
  public double mHU;
  public double mHV;
  public double mHW;
  public int mHX;
  public String mHY;
  public String mHZ;
  
  public c()
  {
    GMTrace.i(9742999093248L, 72591);
    GMTrace.o(9742999093248L, 72591);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9743133310976L, 72592);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.mHQ);
      paramVarArgs.a(2, this.mHR);
      if (this.mHS != null) {
        paramVarArgs.e(3, this.mHS);
      }
      if (this.mHT != null) {
        paramVarArgs.e(4, this.mHT);
      }
      paramVarArgs.a(5, this.mHU);
      paramVarArgs.a(6, this.mHV);
      paramVarArgs.a(7, this.mHW);
      paramVarArgs.fk(8, this.mHX);
      paramVarArgs.fk(9, this.jWC);
      if (this.mHY != null) {
        paramVarArgs.e(10, this.mHY);
      }
      if (this.mHZ != null) {
        paramVarArgs.e(11, this.mHZ);
      }
      GMTrace.o(9743133310976L, 72592);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.mHQ) + 0 + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.mHS != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mHS);
      }
      i = paramInt;
      if (this.mHT != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mHT);
      }
      i = i + (b.a.a.b.b.a.cK(5) + 8) + (b.a.a.b.b.a.cK(6) + 8) + (b.a.a.b.b.a.cK(7) + 8) + b.a.a.a.fh(8, this.mHX) + b.a.a.a.fh(9, this.jWC);
      paramInt = i;
      if (this.mHY != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.mHY);
      }
      i = paramInt;
      if (this.mHZ != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.mHZ);
      }
      GMTrace.o(9743133310976L, 72592);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(9743133310976L, 72592);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(9743133310976L, 72592);
        return -1;
      case 1: 
        localc.mHQ = locala.yqV.nj();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 2: 
        localc.mHR = locala.yqV.readDouble();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 3: 
        localc.mHS = locala.yqV.readString();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 4: 
        localc.mHT = locala.yqV.readString();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 5: 
        localc.mHU = locala.yqV.readDouble();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 6: 
        localc.mHV = locala.yqV.readDouble();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 7: 
        localc.mHW = locala.yqV.readDouble();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 8: 
        localc.mHX = locala.yqV.nj();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 9: 
        localc.jWC = locala.yqV.nj();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      case 10: 
        localc.mHY = locala.yqV.readString();
        GMTrace.o(9743133310976L, 72592);
        return 0;
      }
      localc.mHZ = locala.yqV.readString();
      GMTrace.o(9743133310976L, 72592);
      return 0;
    }
    GMTrace.o(9743133310976L, 72592);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */