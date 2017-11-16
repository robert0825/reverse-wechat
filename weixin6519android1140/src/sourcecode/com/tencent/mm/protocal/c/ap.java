package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ap
  extends com.tencent.mm.bm.a
{
  public String gCC;
  public int jhA;
  public String jhi;
  public String jio;
  public String tOA;
  public int tOB;
  public String tOC;
  public int tOs;
  public String tOt;
  public String tOu;
  public int tOv;
  public int tOw;
  public String tOx;
  public int tOy;
  public String tOz;
  
  public ap()
  {
    GMTrace.i(13576391622656L, 101152);
    GMTrace.o(13576391622656L, 101152);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13576525840384L, 101153);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      paramVarArgs.fk(3, this.tOs);
      if (this.tOt != null) {
        paramVarArgs.e(4, this.tOt);
      }
      if (this.tOu != null) {
        paramVarArgs.e(5, this.tOu);
      }
      if (this.gCC != null) {
        paramVarArgs.e(6, this.gCC);
      }
      paramVarArgs.fk(8, this.jhA);
      paramVarArgs.fk(9, this.tOv);
      paramVarArgs.fk(10, this.tOw);
      if (this.tOx != null) {
        paramVarArgs.e(11, this.tOx);
      }
      paramVarArgs.fk(12, this.tOy);
      if (this.tOz != null) {
        paramVarArgs.e(13, this.tOz);
      }
      if (this.tOA != null) {
        paramVarArgs.e(14, this.tOA);
      }
      paramVarArgs.fk(15, this.tOB);
      if (this.tOC != null) {
        paramVarArgs.e(16, this.tOC);
      }
      GMTrace.o(13576525840384L, 101153);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label1041;
      }
    }
    label1041:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jio);
      }
      i += b.a.a.a.fh(3, this.tOs);
      paramInt = i;
      if (this.tOt != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tOt);
      }
      i = paramInt;
      if (this.tOu != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tOu);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.gCC);
      }
      i = paramInt + b.a.a.a.fh(8, this.jhA) + b.a.a.a.fh(9, this.tOv) + b.a.a.a.fh(10, this.tOw);
      paramInt = i;
      if (this.tOx != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tOx);
      }
      i = paramInt + b.a.a.a.fh(12, this.tOy);
      paramInt = i;
      if (this.tOz != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.tOz);
      }
      i = paramInt;
      if (this.tOA != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.tOA);
      }
      i += b.a.a.a.fh(15, this.tOB);
      paramInt = i;
      if (this.tOC != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tOC);
      }
      GMTrace.o(13576525840384L, 101153);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13576525840384L, 101153);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ap localap = (ap)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 7: 
        default: 
          GMTrace.o(13576525840384L, 101153);
          return -1;
        case 1: 
          localap.jhi = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 2: 
          localap.jio = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 3: 
          localap.tOs = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 4: 
          localap.tOt = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 5: 
          localap.tOu = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 6: 
          localap.gCC = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 8: 
          localap.jhA = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 9: 
          localap.tOv = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 10: 
          localap.tOw = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 11: 
          localap.tOx = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 12: 
          localap.tOy = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 13: 
          localap.tOz = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 14: 
          localap.tOA = locala.yqV.readString();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        case 15: 
          localap.tOB = locala.yqV.nj();
          GMTrace.o(13576525840384L, 101153);
          return 0;
        }
        localap.tOC = locala.yqV.readString();
        GMTrace.o(13576525840384L, 101153);
        return 0;
      }
      GMTrace.o(13576525840384L, 101153);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */