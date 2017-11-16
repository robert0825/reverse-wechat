package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class lb
  extends com.tencent.mm.bm.a
{
  public String nDw;
  public int ubD;
  public String ubE;
  public String ubF;
  public String ubG;
  public int ubH;
  public String ubI;
  public int ubJ;
  public String ubK;
  public int ubL;
  public String ubM;
  
  public lb()
  {
    GMTrace.i(3716891541504L, 27693);
    GMTrace.o(3716891541504L, 27693);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3717025759232L, 27694);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ubD);
      if (this.ubE != null) {
        paramVarArgs.e(2, this.ubE);
      }
      if (this.ubF != null) {
        paramVarArgs.e(3, this.ubF);
      }
      if (this.ubG != null) {
        paramVarArgs.e(4, this.ubG);
      }
      paramVarArgs.fk(5, this.ubH);
      if (this.ubI != null) {
        paramVarArgs.e(6, this.ubI);
      }
      paramVarArgs.fk(7, this.ubJ);
      if (this.nDw != null) {
        paramVarArgs.e(8, this.nDw);
      }
      if (this.ubK != null) {
        paramVarArgs.e(9, this.ubK);
      }
      paramVarArgs.fk(10, this.ubL);
      if (this.ubM != null) {
        paramVarArgs.e(11, this.ubM);
      }
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.ubD) + 0;
      paramInt = i;
      if (this.ubE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ubE);
      }
      i = paramInt;
      if (this.ubF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubF);
      }
      paramInt = i;
      if (this.ubG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubG);
      }
      i = paramInt + b.a.a.a.fh(5, this.ubH);
      paramInt = i;
      if (this.ubI != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ubI);
      }
      i = paramInt + b.a.a.a.fh(7, this.ubJ);
      paramInt = i;
      if (this.nDw != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.nDw);
      }
      i = paramInt;
      if (this.ubK != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ubK);
      }
      i += b.a.a.a.fh(10, this.ubL);
      paramInt = i;
      if (this.ubM != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ubM);
      }
      GMTrace.o(3717025759232L, 27694);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      lb locallb = (lb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3717025759232L, 27694);
        return -1;
      case 1: 
        locallb.ubD = locala.yqV.nj();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 2: 
        locallb.ubE = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 3: 
        locallb.ubF = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 4: 
        locallb.ubG = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 5: 
        locallb.ubH = locala.yqV.nj();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 6: 
        locallb.ubI = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 7: 
        locallb.ubJ = locala.yqV.nj();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 8: 
        locallb.nDw = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 9: 
        locallb.ubK = locala.yqV.readString();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      case 10: 
        locallb.ubL = locala.yqV.nj();
        GMTrace.o(3717025759232L, 27694);
        return 0;
      }
      locallb.ubM = locala.yqV.readString();
      GMTrace.o(3717025759232L, 27694);
      return 0;
    }
    GMTrace.o(3717025759232L, 27694);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */