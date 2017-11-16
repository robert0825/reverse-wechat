package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bew
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int nFd;
  public String nIp;
  public int tQP;
  public String tRz;
  public String uBf;
  public int uED;
  public String uQG;
  public int uQl;
  public int uQm;
  public int uQn;
  public long uQo;
  public long uQp;
  public int uQr;
  
  public bew()
  {
    GMTrace.i(3769236455424L, 28083);
    GMTrace.o(3769236455424L, 28083);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3769370673152L, 28084);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      if (this.uBf != null) {
        paramVarArgs.e(2, this.uBf);
      }
      paramVarArgs.fk(3, this.tQP);
      paramVarArgs.fk(4, this.jib);
      if (this.nIp != null) {
        paramVarArgs.e(5, this.nIp);
      }
      paramVarArgs.fk(6, this.nFd);
      paramVarArgs.fk(7, this.uQm);
      paramVarArgs.fk(8, this.uQl);
      if (this.uQG != null) {
        paramVarArgs.e(9, this.uQG);
      }
      paramVarArgs.fk(10, this.uQn);
      paramVarArgs.T(11, this.uQo);
      paramVarArgs.T(12, this.uQp);
      paramVarArgs.fk(13, this.uED);
      paramVarArgs.fk(14, this.uQr);
      GMTrace.o(3769370673152L, 28084);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label934;
      }
    }
    label934:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uBf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uBf);
      }
      i = i + b.a.a.a.fh(3, this.tQP) + b.a.a.a.fh(4, this.jib);
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nIp);
      }
      i = paramInt + b.a.a.a.fh(6, this.nFd) + b.a.a.a.fh(7, this.uQm) + b.a.a.a.fh(8, this.uQl);
      paramInt = i;
      if (this.uQG != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uQG);
      }
      i = b.a.a.a.fh(10, this.uQn);
      int j = b.a.a.a.S(11, this.uQo);
      int k = b.a.a.a.S(12, this.uQp);
      int m = b.a.a.a.fh(13, this.uED);
      int n = b.a.a.a.fh(14, this.uQr);
      GMTrace.o(3769370673152L, 28084);
      return paramInt + i + j + k + m + n;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3769370673152L, 28084);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bew localbew = (bew)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3769370673152L, 28084);
          return -1;
        case 1: 
          localbew.tRz = locala.yqV.readString();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 2: 
          localbew.uBf = locala.yqV.readString();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 3: 
          localbew.tQP = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 4: 
          localbew.jib = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 5: 
          localbew.nIp = locala.yqV.readString();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 6: 
          localbew.nFd = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 7: 
          localbew.uQm = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 8: 
          localbew.uQl = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 9: 
          localbew.uQG = locala.yqV.readString();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 10: 
          localbew.uQn = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 11: 
          localbew.uQo = locala.yqV.nk();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 12: 
          localbew.uQp = locala.yqV.nk();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        case 13: 
          localbew.uED = locala.yqV.nj();
          GMTrace.o(3769370673152L, 28084);
          return 0;
        }
        localbew.uQr = locala.yqV.nj();
        GMTrace.o(3769370673152L, 28084);
        return 0;
      }
      GMTrace.o(3769370673152L, 28084);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */