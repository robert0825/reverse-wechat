package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class hf
  extends com.tencent.mm.bm.a
{
  public String jBs;
  public String tVP;
  public int tVQ;
  public String tVT;
  public String tVV;
  public String tWd;
  public int ver;
  
  public hf()
  {
    GMTrace.i(3910030852096L, 29132);
    GMTrace.o(3910030852096L, 29132);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3910165069824L, 29133);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVV != null) {
        paramVarArgs.e(1, this.tVV);
      }
      if (this.jBs != null) {
        paramVarArgs.e(2, this.jBs);
      }
      paramVarArgs.fk(3, this.ver);
      if (this.tVP != null) {
        paramVarArgs.e(4, this.tVP);
      }
      if (this.tWd != null) {
        paramVarArgs.e(5, this.tWd);
      }
      paramVarArgs.fk(6, this.tVQ);
      if (this.tVT != null) {
        paramVarArgs.e(7, this.tVT);
      }
      GMTrace.o(3910165069824L, 29133);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVV == null) {
        break label598;
      }
    }
    label598:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVV) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jBs != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jBs);
      }
      i += b.a.a.a.fh(3, this.ver);
      paramInt = i;
      if (this.tVP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tVP);
      }
      i = paramInt;
      if (this.tWd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWd);
      }
      i += b.a.a.a.fh(6, this.tVQ);
      paramInt = i;
      if (this.tVT != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tVT);
      }
      GMTrace.o(3910165069824L, 29133);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3910165069824L, 29133);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        hf localhf = (hf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3910165069824L, 29133);
          return -1;
        case 1: 
          localhf.tVV = locala.yqV.readString();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        case 2: 
          localhf.jBs = locala.yqV.readString();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        case 3: 
          localhf.ver = locala.yqV.nj();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        case 4: 
          localhf.tVP = locala.yqV.readString();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        case 5: 
          localhf.tWd = locala.yqV.readString();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        case 6: 
          localhf.tVQ = locala.yqV.nj();
          GMTrace.o(3910165069824L, 29133);
          return 0;
        }
        localhf.tVT = locala.yqV.readString();
        GMTrace.o(3910165069824L, 29133);
        return 0;
      }
      GMTrace.o(3910165069824L, 29133);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */