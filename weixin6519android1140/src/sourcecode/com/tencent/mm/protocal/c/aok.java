package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aok
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public String gCG;
  public int gCx;
  public String gCy;
  public String gCz;
  public String jhi;
  public int jib;
  public int uEk;
  public int uEl;
  public String ubV;
  public String ubW;
  
  public aok()
  {
    GMTrace.i(3804804153344L, 28348);
    GMTrace.o(3804804153344L, 28348);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3804938371072L, 28349);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.gCx);
      if (this.gCz != null) {
        paramVarArgs.e(4, this.gCz);
      }
      if (this.gCy != null) {
        paramVarArgs.e(5, this.gCy);
      }
      if (this.gCA != null) {
        paramVarArgs.e(6, this.gCA);
      }
      paramVarArgs.fk(7, this.uEk);
      paramVarArgs.fk(8, this.uEl);
      if (this.gCG != null) {
        paramVarArgs.e(9, this.gCG);
      }
      if (this.ubV != null) {
        paramVarArgs.e(10, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(11, this.ubW);
      }
      GMTrace.o(3804938371072L, 28349);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label826;
      }
    }
    label826:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jib) + b.a.a.a.fh(3, this.gCx);
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gCz);
      }
      i = paramInt;
      if (this.gCy != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCy);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(7, this.uEk) + b.a.a.a.fh(8, this.uEl);
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gCG);
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ubW);
      }
      GMTrace.o(3804938371072L, 28349);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3804938371072L, 28349);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aok localaok = (aok)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3804938371072L, 28349);
          return -1;
        case 1: 
          localaok.jhi = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 2: 
          localaok.jib = locala.yqV.nj();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 3: 
          localaok.gCx = locala.yqV.nj();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 4: 
          localaok.gCz = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 5: 
          localaok.gCy = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 6: 
          localaok.gCA = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 7: 
          localaok.uEk = locala.yqV.nj();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 8: 
          localaok.uEl = locala.yqV.nj();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 9: 
          localaok.gCG = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        case 10: 
          localaok.ubV = locala.yqV.readString();
          GMTrace.o(3804938371072L, 28349);
          return 0;
        }
        localaok.ubW = locala.yqV.readString();
        GMTrace.o(3804938371072L, 28349);
        return 0;
      }
      GMTrace.o(3804938371072L, 28349);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */