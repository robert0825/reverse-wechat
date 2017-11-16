package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aym
  extends com.tencent.mm.bm.a
{
  public String jhN;
  public int oWm;
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public int uMO;
  public int uMP;
  public String uMQ;
  
  public aym()
  {
    GMTrace.i(3805072588800L, 28350);
    GMTrace.o(3805072588800L, 28350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3805206806528L, 28351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhN != null) {
        paramVarArgs.e(1, this.jhN);
      }
      paramVarArgs.fk(2, this.uMO);
      if (this.tWD != null) {
        paramVarArgs.e(3, this.tWD);
      }
      if (this.tWE != null) {
        paramVarArgs.e(4, this.tWE);
      }
      paramVarArgs.fk(5, this.oWm);
      paramVarArgs.fk(6, this.uMP);
      if (this.tWF != null) {
        paramVarArgs.e(7, this.tWF);
      }
      if (this.tWG != null) {
        paramVarArgs.e(8, this.tWG);
      }
      if (this.uMQ != null) {
        paramVarArgs.e(9, this.uMQ);
      }
      GMTrace.o(3805206806528L, 28351);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhN == null) {
        break label714;
      }
    }
    label714:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhN) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uMO);
      paramInt = i;
      if (this.tWD != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tWD);
      }
      i = paramInt;
      if (this.tWE != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tWE);
      }
      i = i + b.a.a.a.fh(5, this.oWm) + b.a.a.a.fh(6, this.uMP);
      paramInt = i;
      if (this.tWF != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tWF);
      }
      i = paramInt;
      if (this.tWG != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tWG);
      }
      paramInt = i;
      if (this.uMQ != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uMQ);
      }
      GMTrace.o(3805206806528L, 28351);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3805206806528L, 28351);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aym localaym = (aym)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3805206806528L, 28351);
          return -1;
        case 1: 
          localaym.jhN = locala.yqV.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 2: 
          localaym.uMO = locala.yqV.nj();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 3: 
          localaym.tWD = locala.yqV.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 4: 
          localaym.tWE = locala.yqV.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 5: 
          localaym.oWm = locala.yqV.nj();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 6: 
          localaym.uMP = locala.yqV.nj();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 7: 
          localaym.tWF = locala.yqV.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        case 8: 
          localaym.tWG = locala.yqV.readString();
          GMTrace.o(3805206806528L, 28351);
          return 0;
        }
        localaym.uMQ = locala.yqV.readString();
        GMTrace.o(3805206806528L, 28351);
        return 0;
      }
      GMTrace.o(3805206806528L, 28351);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */