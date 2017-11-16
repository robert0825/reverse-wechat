package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amm
  extends com.tencent.mm.bm.a
{
  public String eSd;
  public String uBA;
  public String uBi;
  public String uBj;
  public String uBk;
  public String uBl;
  public int uBm;
  public int uBn;
  public String uBo;
  public int uBp;
  public int uBq;
  public String uBr;
  public int uBs;
  public int uBt;
  public String uBu;
  public int uBv;
  public int uBw;
  public String uBx;
  public String uBy;
  public String uBz;
  public String ubG;
  public int ufO;
  
  public amm()
  {
    GMTrace.i(4016465510400L, 29925);
    GMTrace.o(4016465510400L, 29925);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016599728128L, 29926);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eSd != null) {
        paramVarArgs.e(1, this.eSd);
      }
      if (this.uBi != null) {
        paramVarArgs.e(20, this.uBi);
      }
      if (this.uBj != null) {
        paramVarArgs.e(21, this.uBj);
      }
      if (this.uBk != null) {
        paramVarArgs.e(22, this.uBk);
      }
      if (this.uBl != null) {
        paramVarArgs.e(23, this.uBl);
      }
      if (this.ubG != null) {
        paramVarArgs.e(31, this.ubG);
      }
      paramVarArgs.fk(32, this.uBm);
      paramVarArgs.fk(33, this.uBn);
      if (this.uBo != null) {
        paramVarArgs.e(34, this.uBo);
      }
      paramVarArgs.fk(35, this.uBp);
      paramVarArgs.fk(36, this.uBq);
      if (this.uBr != null) {
        paramVarArgs.e(37, this.uBr);
      }
      paramVarArgs.fk(38, this.uBs);
      paramVarArgs.fk(39, this.uBt);
      if (this.uBu != null) {
        paramVarArgs.e(41, this.uBu);
      }
      paramVarArgs.fk(200, this.uBv);
      paramVarArgs.fk(201, this.uBw);
      paramVarArgs.fk(202, this.ufO);
      if (this.uBx != null) {
        paramVarArgs.e(203, this.uBx);
      }
      if (this.uBy != null) {
        paramVarArgs.e(204, this.uBy);
      }
      if (this.uBz != null) {
        paramVarArgs.e(205, this.uBz);
      }
      if (this.uBA != null) {
        paramVarArgs.e(206, this.uBA);
      }
      GMTrace.o(4016599728128L, 29926);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eSd == null) {
        break label1574;
      }
    }
    label1574:
    for (int i = b.a.a.b.b.a.f(1, this.eSd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uBi != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.uBi);
      }
      i = paramInt;
      if (this.uBj != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.uBj);
      }
      paramInt = i;
      if (this.uBk != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.uBk);
      }
      i = paramInt;
      if (this.uBl != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.uBl);
      }
      paramInt = i;
      if (this.ubG != null) {
        paramInt = i + b.a.a.b.b.a.f(31, this.ubG);
      }
      i = paramInt + b.a.a.a.fh(32, this.uBm) + b.a.a.a.fh(33, this.uBn);
      paramInt = i;
      if (this.uBo != null) {
        paramInt = i + b.a.a.b.b.a.f(34, this.uBo);
      }
      i = paramInt + b.a.a.a.fh(35, this.uBp) + b.a.a.a.fh(36, this.uBq);
      paramInt = i;
      if (this.uBr != null) {
        paramInt = i + b.a.a.b.b.a.f(37, this.uBr);
      }
      i = paramInt + b.a.a.a.fh(38, this.uBs) + b.a.a.a.fh(39, this.uBt);
      paramInt = i;
      if (this.uBu != null) {
        paramInt = i + b.a.a.b.b.a.f(41, this.uBu);
      }
      i = paramInt + b.a.a.a.fh(200, this.uBv) + b.a.a.a.fh(201, this.uBw) + b.a.a.a.fh(202, this.ufO);
      paramInt = i;
      if (this.uBx != null) {
        paramInt = i + b.a.a.b.b.a.f(203, this.uBx);
      }
      i = paramInt;
      if (this.uBy != null) {
        i = paramInt + b.a.a.b.b.a.f(204, this.uBy);
      }
      paramInt = i;
      if (this.uBz != null) {
        paramInt = i + b.a.a.b.b.a.f(205, this.uBz);
      }
      i = paramInt;
      if (this.uBA != null) {
        i = paramInt + b.a.a.b.b.a.f(206, this.uBA);
      }
      GMTrace.o(4016599728128L, 29926);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4016599728128L, 29926);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amm localamm = (amm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4016599728128L, 29926);
          return -1;
        case 1: 
          localamm.eSd = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 20: 
          localamm.uBi = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 21: 
          localamm.uBj = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 22: 
          localamm.uBk = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 23: 
          localamm.uBl = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 31: 
          localamm.ubG = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 32: 
          localamm.uBm = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 33: 
          localamm.uBn = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 34: 
          localamm.uBo = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 35: 
          localamm.uBp = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 36: 
          localamm.uBq = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 37: 
          localamm.uBr = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 38: 
          localamm.uBs = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 39: 
          localamm.uBt = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 41: 
          localamm.uBu = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 200: 
          localamm.uBv = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 201: 
          localamm.uBw = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 202: 
          localamm.ufO = locala.yqV.nj();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 203: 
          localamm.uBx = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 204: 
          localamm.uBy = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        case 205: 
          localamm.uBz = locala.yqV.readString();
          GMTrace.o(4016599728128L, 29926);
          return 0;
        }
        localamm.uBA = locala.yqV.readString();
        GMTrace.o(4016599728128L, 29926);
        return 0;
      }
      GMTrace.o(4016599728128L, 29926);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */