package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jc
  extends com.tencent.mm.bm.a
{
  public String tTy;
  public String tYK;
  public int tYL;
  public String tYM;
  public String tYN;
  
  public jc()
  {
    GMTrace.i(18667135827968L, 139081);
    GMTrace.o(18667135827968L, 139081);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18667270045696L, 139082);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tYK != null) {
        paramVarArgs.e(1, this.tYK);
      }
      paramVarArgs.fk(2, this.tYL);
      if (this.tYM != null) {
        paramVarArgs.e(3, this.tYM);
      }
      if (this.tTy != null) {
        paramVarArgs.e(4, this.tTy);
      }
      if (this.tYN != null) {
        paramVarArgs.e(5, this.tYN);
      }
      GMTrace.o(18667270045696L, 139082);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tYK == null) {
        break label471;
      }
    }
    label471:
    for (paramInt = b.a.a.b.b.a.f(1, this.tYK) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tYL);
      paramInt = i;
      if (this.tYM != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tYM);
      }
      i = paramInt;
      if (this.tTy != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tTy);
      }
      paramInt = i;
      if (this.tYN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tYN);
      }
      GMTrace.o(18667270045696L, 139082);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18667270045696L, 139082);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jc localjc = (jc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18667270045696L, 139082);
          return -1;
        case 1: 
          localjc.tYK = locala.yqV.readString();
          GMTrace.o(18667270045696L, 139082);
          return 0;
        case 2: 
          localjc.tYL = locala.yqV.nj();
          GMTrace.o(18667270045696L, 139082);
          return 0;
        case 3: 
          localjc.tYM = locala.yqV.readString();
          GMTrace.o(18667270045696L, 139082);
          return 0;
        case 4: 
          localjc.tTy = locala.yqV.readString();
          GMTrace.o(18667270045696L, 139082);
          return 0;
        }
        localjc.tYN = locala.yqV.readString();
        GMTrace.o(18667270045696L, 139082);
        return 0;
      }
      GMTrace.o(18667270045696L, 139082);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */