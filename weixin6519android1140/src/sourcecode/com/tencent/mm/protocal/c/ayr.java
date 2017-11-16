package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ayr
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public long tXu;
  public String uBW;
  public long uKe;
  public String uMT;
  public String uMU;
  public int uMV;
  public int uMW;
  public int uMX;
  public String uMY;
  public String uMZ;
  public String uNa;
  public int udW;
  public int uxH;
  
  public ayr()
  {
    GMTrace.i(3924257931264L, 29238);
    GMTrace.o(3924257931264L, 29238);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3924392148992L, 29239);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tOG);
      if (this.uBW != null) {
        paramVarArgs.e(2, this.uBW);
      }
      if (this.uMT != null) {
        paramVarArgs.e(3, this.uMT);
      }
      paramVarArgs.T(4, this.tXu);
      if (this.uMU != null) {
        paramVarArgs.e(5, this.uMU);
      }
      paramVarArgs.fk(6, this.uMV);
      paramVarArgs.fk(7, this.uMW);
      paramVarArgs.fk(8, this.uMX);
      paramVarArgs.T(9, this.uKe);
      paramVarArgs.fk(10, this.uxH);
      if (this.uMY != null) {
        paramVarArgs.e(11, this.uMY);
      }
      paramVarArgs.fk(12, this.udW);
      if (this.uMZ != null) {
        paramVarArgs.e(13, this.uMZ);
      }
      if (this.uNa != null) {
        paramVarArgs.e(14, this.uNa);
      }
      GMTrace.o(3924392148992L, 29239);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tOG) + 0;
      paramInt = i;
      if (this.uBW != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uBW);
      }
      i = paramInt;
      if (this.uMT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uMT);
      }
      i += b.a.a.a.S(4, this.tXu);
      paramInt = i;
      if (this.uMU != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uMU);
      }
      i = paramInt + b.a.a.a.fh(6, this.uMV) + b.a.a.a.fh(7, this.uMW) + b.a.a.a.fh(8, this.uMX) + b.a.a.a.S(9, this.uKe) + b.a.a.a.fh(10, this.uxH);
      paramInt = i;
      if (this.uMY != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uMY);
      }
      i = paramInt + b.a.a.a.fh(12, this.udW);
      paramInt = i;
      if (this.uMZ != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uMZ);
      }
      i = paramInt;
      if (this.uNa != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uNa);
      }
      GMTrace.o(3924392148992L, 29239);
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
      GMTrace.o(3924392148992L, 29239);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ayr localayr = (ayr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3924392148992L, 29239);
        return -1;
      case 1: 
        localayr.tOG = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 2: 
        localayr.uBW = locala.yqV.readString();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 3: 
        localayr.uMT = locala.yqV.readString();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 4: 
        localayr.tXu = locala.yqV.nk();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 5: 
        localayr.uMU = locala.yqV.readString();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 6: 
        localayr.uMV = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 7: 
        localayr.uMW = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 8: 
        localayr.uMX = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 9: 
        localayr.uKe = locala.yqV.nk();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 10: 
        localayr.uxH = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 11: 
        localayr.uMY = locala.yqV.readString();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 12: 
        localayr.udW = locala.yqV.nj();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      case 13: 
        localayr.uMZ = locala.yqV.readString();
        GMTrace.o(3924392148992L, 29239);
        return 0;
      }
      localayr.uNa = locala.yqV.readString();
      GMTrace.o(3924392148992L, 29239);
      return 0;
    }
    GMTrace.o(3924392148992L, 29239);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ayr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */