package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agy
  extends com.tencent.mm.bm.a
{
  public int fsJ;
  public long fsK;
  public String fsL;
  public String fsM;
  public String fsN;
  public String fsO;
  public String gCC;
  public String lPE;
  public String lRV;
  public String tSi;
  public String tTU;
  public String uwj;
  public String uwk;
  public int uwl;
  public int uwm;
  public int uwn;
  public int uwo;
  public String uwp;
  public String uwq;
  public String uwr;
  public String uws;
  public int uwt;
  
  public agy()
  {
    GMTrace.i(3628442058752L, 27034);
    GMTrace.o(3628442058752L, 27034);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3628576276480L, 27035);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uwj != null) {
        paramVarArgs.e(1, this.uwj);
      }
      if (this.tSi != null) {
        paramVarArgs.e(2, this.tSi);
      }
      if (this.tTU != null) {
        paramVarArgs.e(3, this.tTU);
      }
      if (this.uwk != null) {
        paramVarArgs.e(4, this.uwk);
      }
      paramVarArgs.fk(5, this.uwl);
      paramVarArgs.fk(6, this.uwm);
      paramVarArgs.fk(7, this.uwn);
      paramVarArgs.fk(8, this.uwo);
      if (this.uwp != null) {
        paramVarArgs.e(9, this.uwp);
      }
      if (this.gCC != null) {
        paramVarArgs.e(10, this.gCC);
      }
      if (this.lRV != null) {
        paramVarArgs.e(11, this.lRV);
      }
      if (this.lPE != null) {
        paramVarArgs.e(12, this.lPE);
      }
      if (this.uwq != null) {
        paramVarArgs.e(13, this.uwq);
      }
      if (this.uwr != null) {
        paramVarArgs.e(14, this.uwr);
      }
      if (this.uws != null) {
        paramVarArgs.e(15, this.uws);
      }
      paramVarArgs.fk(16, this.uwt);
      paramVarArgs.fk(17, this.fsJ);
      paramVarArgs.T(18, this.fsK);
      if (this.fsL != null) {
        paramVarArgs.e(19, this.fsL);
      }
      if (this.fsM != null) {
        paramVarArgs.e(20, this.fsM);
      }
      if (this.fsN != null) {
        paramVarArgs.e(21, this.fsN);
      }
      if (this.fsO != null) {
        paramVarArgs.e(22, this.fsO);
      }
      GMTrace.o(3628576276480L, 27035);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uwj == null) {
        break label1498;
      }
    }
    label1498:
    for (int i = b.a.a.b.b.a.f(1, this.uwj) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tSi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tSi);
      }
      i = paramInt;
      if (this.tTU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tTU);
      }
      paramInt = i;
      if (this.uwk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uwk);
      }
      i = paramInt + b.a.a.a.fh(5, this.uwl) + b.a.a.a.fh(6, this.uwm) + b.a.a.a.fh(7, this.uwn) + b.a.a.a.fh(8, this.uwo);
      paramInt = i;
      if (this.uwp != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uwp);
      }
      i = paramInt;
      if (this.gCC != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.gCC);
      }
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.lRV);
      }
      i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.lPE);
      }
      paramInt = i;
      if (this.uwq != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uwq);
      }
      i = paramInt;
      if (this.uwr != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.uwr);
      }
      paramInt = i;
      if (this.uws != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.uws);
      }
      i = paramInt + b.a.a.a.fh(16, this.uwt) + b.a.a.a.fh(17, this.fsJ) + b.a.a.a.S(18, this.fsK);
      paramInt = i;
      if (this.fsL != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.fsL);
      }
      i = paramInt;
      if (this.fsM != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.fsM);
      }
      paramInt = i;
      if (this.fsN != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.fsN);
      }
      i = paramInt;
      if (this.fsO != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.fsO);
      }
      GMTrace.o(3628576276480L, 27035);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3628576276480L, 27035);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agy localagy = (agy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3628576276480L, 27035);
          return -1;
        case 1: 
          localagy.uwj = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 2: 
          localagy.tSi = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 3: 
          localagy.tTU = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 4: 
          localagy.uwk = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 5: 
          localagy.uwl = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 6: 
          localagy.uwm = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 7: 
          localagy.uwn = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 8: 
          localagy.uwo = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 9: 
          localagy.uwp = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 10: 
          localagy.gCC = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 11: 
          localagy.lRV = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 12: 
          localagy.lPE = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 13: 
          localagy.uwq = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 14: 
          localagy.uwr = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 15: 
          localagy.uws = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 16: 
          localagy.uwt = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 17: 
          localagy.fsJ = locala.yqV.nj();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 18: 
          localagy.fsK = locala.yqV.nk();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 19: 
          localagy.fsL = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 20: 
          localagy.fsM = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        case 21: 
          localagy.fsN = locala.yqV.readString();
          GMTrace.o(3628576276480L, 27035);
          return 0;
        }
        localagy.fsO = locala.yqV.readString();
        GMTrace.o(3628576276480L, 27035);
        return 0;
      }
      GMTrace.o(3628576276480L, 27035);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\agy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */