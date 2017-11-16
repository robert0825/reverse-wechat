package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class asv
  extends com.tencent.mm.bm.a
{
  public String gJm;
  public String nEr;
  public String omN;
  public int uIG;
  public String uIH;
  public String uII;
  public int uIJ;
  public String uIK;
  public int uIL;
  public String uIM;
  
  public asv()
  {
    GMTrace.i(3892850982912L, 29004);
    GMTrace.o(3892850982912L, 29004);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3892985200640L, 29005);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uIG);
      if (this.uIH != null) {
        paramVarArgs.e(2, this.uIH);
      }
      if (this.uII != null) {
        paramVarArgs.e(3, this.uII);
      }
      paramVarArgs.fk(4, this.uIJ);
      if (this.nEr != null) {
        paramVarArgs.e(5, this.nEr);
      }
      if (this.uIK != null) {
        paramVarArgs.e(6, this.uIK);
      }
      if (this.omN != null) {
        paramVarArgs.e(7, this.omN);
      }
      paramVarArgs.fk(8, this.uIL);
      if (this.gJm != null) {
        paramVarArgs.e(9, this.gJm);
      }
      if (this.uIM != null) {
        paramVarArgs.e(10, this.uIM);
      }
      GMTrace.o(3892985200640L, 29005);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uIG) + 0;
      paramInt = i;
      if (this.uIH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uIH);
      }
      i = paramInt;
      if (this.uII != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uII);
      }
      i += b.a.a.a.fh(4, this.uIJ);
      paramInt = i;
      if (this.nEr != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nEr);
      }
      i = paramInt;
      if (this.uIK != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uIK);
      }
      paramInt = i;
      if (this.omN != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.omN);
      }
      i = paramInt + b.a.a.a.fh(8, this.uIL);
      paramInt = i;
      if (this.gJm != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gJm);
      }
      i = paramInt;
      if (this.uIM != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uIM);
      }
      GMTrace.o(3892985200640L, 29005);
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
      GMTrace.o(3892985200640L, 29005);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      asv localasv = (asv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3892985200640L, 29005);
        return -1;
      case 1: 
        localasv.uIG = locala.yqV.nj();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 2: 
        localasv.uIH = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 3: 
        localasv.uII = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 4: 
        localasv.uIJ = locala.yqV.nj();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 5: 
        localasv.nEr = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 6: 
        localasv.uIK = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 7: 
        localasv.omN = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 8: 
        localasv.uIL = locala.yqV.nj();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      case 9: 
        localasv.gJm = locala.yqV.readString();
        GMTrace.o(3892985200640L, 29005);
        return 0;
      }
      localasv.uIM = locala.yqV.readString();
      GMTrace.o(3892985200640L, 29005);
      return 0;
    }
    GMTrace.o(3892985200640L, 29005);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\asv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */