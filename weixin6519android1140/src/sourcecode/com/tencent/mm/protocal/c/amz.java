package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amz
  extends com.tencent.mm.bm.a
{
  public String eSd;
  public int tOG;
  public int tVE;
  public int uBK;
  public int uBL;
  public String uBM;
  public int uBN;
  public String username;
  public int uyt;
  
  public amz()
  {
    GMTrace.i(16872376369152L, 125709);
    GMTrace.o(16872376369152L, 125709);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872510586880L, 125710);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eSd != null) {
        paramVarArgs.e(1, this.eSd);
      }
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      paramVarArgs.fk(3, this.uyt);
      paramVarArgs.fk(4, this.tVE);
      paramVarArgs.fk(5, this.tOG);
      paramVarArgs.fk(6, this.uBK);
      paramVarArgs.fk(7, this.uBL);
      if (this.uBM != null) {
        paramVarArgs.e(8, this.uBM);
      }
      paramVarArgs.fk(9, this.uBN);
      GMTrace.o(16872510586880L, 125710);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eSd == null) {
        break label643;
      }
    }
    label643:
    for (paramInt = b.a.a.b.b.a.f(1, this.eSd) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.username != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.username);
      }
      i = i + b.a.a.a.fh(3, this.uyt) + b.a.a.a.fh(4, this.tVE) + b.a.a.a.fh(5, this.tOG) + b.a.a.a.fh(6, this.uBK) + b.a.a.a.fh(7, this.uBL);
      paramInt = i;
      if (this.uBM != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uBM);
      }
      i = b.a.a.a.fh(9, this.uBN);
      GMTrace.o(16872510586880L, 125710);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(16872510586880L, 125710);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amz localamz = (amz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16872510586880L, 125710);
          return -1;
        case 1: 
          localamz.eSd = locala.yqV.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 2: 
          localamz.username = locala.yqV.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 3: 
          localamz.uyt = locala.yqV.nj();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 4: 
          localamz.tVE = locala.yqV.nj();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 5: 
          localamz.tOG = locala.yqV.nj();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 6: 
          localamz.uBK = locala.yqV.nj();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 7: 
          localamz.uBL = locala.yqV.nj();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        case 8: 
          localamz.uBM = locala.yqV.readString();
          GMTrace.o(16872510586880L, 125710);
          return 0;
        }
        localamz.uBN = locala.yqV.nj();
        GMTrace.o(16872510586880L, 125710);
        return 0;
      }
      GMTrace.o(16872510586880L, 125710);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */