package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class rg
  extends com.tencent.mm.bm.a
{
  public int tPM;
  public String uhE;
  public String uhF;
  public String uhG;
  public String uhH;
  public String uhI;
  public int uhJ;
  public int uhK;
  public String uhL;
  
  public rg()
  {
    GMTrace.i(3631394848768L, 27056);
    GMTrace.o(3631394848768L, 27056);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3631529066496L, 27057);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhE == null) {
        throw new b("Not all required fields were included: BegWord");
      }
      if (this.uhF == null) {
        throw new b("Not all required fields were included: BegPicUrl");
      }
      if (this.uhG == null) {
        throw new b("Not all required fields were included: ThanksPicUrl");
      }
      if (this.uhE != null) {
        paramVarArgs.e(1, this.uhE);
      }
      if (this.uhF != null) {
        paramVarArgs.e(2, this.uhF);
      }
      if (this.uhG != null) {
        paramVarArgs.e(3, this.uhG);
      }
      if (this.uhH != null) {
        paramVarArgs.e(4, this.uhH);
      }
      if (this.uhI != null) {
        paramVarArgs.e(5, this.uhI);
      }
      paramVarArgs.fk(6, this.uhJ);
      paramVarArgs.fk(7, this.uhK);
      if (this.uhL != null) {
        paramVarArgs.e(8, this.uhL);
      }
      paramVarArgs.fk(9, this.tPM);
      GMTrace.o(3631529066496L, 27057);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uhE == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.uhE) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uhF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uhF);
      }
      i = paramInt;
      if (this.uhG != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uhG);
      }
      paramInt = i;
      if (this.uhH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhH);
      }
      i = paramInt;
      if (this.uhI != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uhI);
      }
      i = i + b.a.a.a.fh(6, this.uhJ) + b.a.a.a.fh(7, this.uhK);
      paramInt = i;
      if (this.uhL != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uhL);
      }
      i = b.a.a.a.fh(9, this.tPM);
      GMTrace.o(3631529066496L, 27057);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uhE == null) {
          throw new b("Not all required fields were included: BegWord");
        }
        if (this.uhF == null) {
          throw new b("Not all required fields were included: BegPicUrl");
        }
        if (this.uhG == null) {
          throw new b("Not all required fields were included: ThanksPicUrl");
        }
        GMTrace.o(3631529066496L, 27057);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        rg localrg = (rg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3631529066496L, 27057);
          return -1;
        case 1: 
          localrg.uhE = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 2: 
          localrg.uhF = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 3: 
          localrg.uhG = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 4: 
          localrg.uhH = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 5: 
          localrg.uhI = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 6: 
          localrg.uhJ = locala.yqV.nj();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 7: 
          localrg.uhK = locala.yqV.nj();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        case 8: 
          localrg.uhL = locala.yqV.readString();
          GMTrace.o(3631529066496L, 27057);
          return 0;
        }
        localrg.tPM = locala.yqV.nj();
        GMTrace.o(3631529066496L, 27057);
        return 0;
      }
      GMTrace.o(3631529066496L, 27057);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */