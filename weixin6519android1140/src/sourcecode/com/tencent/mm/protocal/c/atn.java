package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atn
  extends com.tencent.mm.bm.a
{
  public String lRT;
  public String nFa;
  public String nFc;
  public int nFd;
  public String nFe;
  public int nFf;
  public String nFg;
  public int nFh;
  public int nFi;
  public String nFk;
  public String nFl;
  public String nFm;
  public String nFn;
  public int uIS;
  public String uJf;
  public String uJg;
  
  public atn()
  {
    GMTrace.i(3871778799616L, 28847);
    GMTrace.o(3871778799616L, 28847);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3871913017344L, 28848);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nFa != null) {
        paramVarArgs.e(1, this.nFa);
      }
      paramVarArgs.fk(2, this.uIS);
      if (this.nFc != null) {
        paramVarArgs.e(3, this.nFc);
      }
      paramVarArgs.fk(4, this.nFd);
      if (this.nFe != null) {
        paramVarArgs.e(5, this.nFe);
      }
      paramVarArgs.fk(6, this.nFf);
      if (this.nFg != null) {
        paramVarArgs.e(7, this.nFg);
      }
      paramVarArgs.fk(8, this.nFh);
      paramVarArgs.fk(9, this.nFi);
      if (this.lRT != null) {
        paramVarArgs.e(11, this.lRT);
      }
      if (this.nFk != null) {
        paramVarArgs.e(12, this.nFk);
      }
      if (this.nFl != null) {
        paramVarArgs.e(13, this.nFl);
      }
      if (this.nFm != null) {
        paramVarArgs.e(14, this.nFm);
      }
      if (this.nFn != null) {
        paramVarArgs.e(15, this.nFn);
      }
      if (this.uJf != null) {
        paramVarArgs.e(18, this.uJf);
      }
      if (this.uJg != null) {
        paramVarArgs.e(19, this.uJg);
      }
      GMTrace.o(3871913017344L, 28848);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nFa == null) {
        break label1154;
      }
    }
    label1154:
    for (paramInt = b.a.a.b.b.a.f(1, this.nFa) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uIS);
      paramInt = i;
      if (this.nFc != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nFc);
      }
      i = paramInt + b.a.a.a.fh(4, this.nFd);
      paramInt = i;
      if (this.nFe != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nFe);
      }
      i = paramInt + b.a.a.a.fh(6, this.nFf);
      paramInt = i;
      if (this.nFg != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.nFg);
      }
      i = paramInt + b.a.a.a.fh(8, this.nFh) + b.a.a.a.fh(9, this.nFi);
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.lRT);
      }
      i = paramInt;
      if (this.nFk != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.nFk);
      }
      paramInt = i;
      if (this.nFl != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.nFl);
      }
      i = paramInt;
      if (this.nFm != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.nFm);
      }
      paramInt = i;
      if (this.nFn != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.nFn);
      }
      i = paramInt;
      if (this.uJf != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.uJf);
      }
      paramInt = i;
      if (this.uJg != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.uJg);
      }
      GMTrace.o(3871913017344L, 28848);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3871913017344L, 28848);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        atn localatn = (atn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 10: 
        case 16: 
        case 17: 
        default: 
          GMTrace.o(3871913017344L, 28848);
          return -1;
        case 1: 
          localatn.nFa = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 2: 
          localatn.uIS = locala.yqV.nj();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 3: 
          localatn.nFc = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 4: 
          localatn.nFd = locala.yqV.nj();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 5: 
          localatn.nFe = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 6: 
          localatn.nFf = locala.yqV.nj();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 7: 
          localatn.nFg = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 8: 
          localatn.nFh = locala.yqV.nj();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 9: 
          localatn.nFi = locala.yqV.nj();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 11: 
          localatn.lRT = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 12: 
          localatn.nFk = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 13: 
          localatn.nFl = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 14: 
          localatn.nFm = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 15: 
          localatn.nFn = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        case 18: 
          localatn.uJf = locala.yqV.readString();
          GMTrace.o(3871913017344L, 28848);
          return 0;
        }
        localatn.uJg = locala.yqV.readString();
        GMTrace.o(3871913017344L, 28848);
        return 0;
      }
      GMTrace.o(3871913017344L, 28848);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\atn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */