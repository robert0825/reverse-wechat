package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class iq
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPM;
  public String tXA;
  public String tXB;
  public int tXC;
  public String tXD;
  public int tXE;
  
  public iq()
  {
    GMTrace.i(3867215396864L, 28813);
    GMTrace.o(3867215396864L, 28813);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3867349614592L, 28814);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPM == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.tXA == null) {
        throw new b("Not all required fields were included: Position");
      }
      if (this.tXB == null) {
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPM != null) {
        paramVarArgs.e(2, this.lPM);
      }
      if (this.tXA != null) {
        paramVarArgs.e(3, this.tXA);
      }
      if (this.tXB != null) {
        paramVarArgs.e(4, this.tXB);
      }
      paramVarArgs.fk(5, this.tXC);
      if (this.tXD != null) {
        paramVarArgs.e(6, this.tXD);
      }
      paramVarArgs.fk(7, this.tXE);
      GMTrace.o(3867349614592L, 28814);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label734;
      }
    }
    label734:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPM);
      }
      i = paramInt;
      if (this.tXA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXA);
      }
      paramInt = i;
      if (this.tXB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tXB);
      }
      i = paramInt + b.a.a.a.fh(5, this.tXC);
      paramInt = i;
      if (this.tXD != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tXD);
      }
      i = b.a.a.a.fh(7, this.tXE);
      GMTrace.o(3867349614592L, 28814);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.eBt == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.lPM == null) {
          throw new b("Not all required fields were included: Url");
        }
        if (this.tXA == null) {
          throw new b("Not all required fields were included: Position");
        }
        if (this.tXB == null) {
          throw new b("Not all required fields were included: DetailInfo");
        }
        GMTrace.o(3867349614592L, 28814);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        iq localiq = (iq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3867349614592L, 28814);
          return -1;
        case 1: 
          localiq.eBt = locala.yqV.readString();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        case 2: 
          localiq.lPM = locala.yqV.readString();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        case 3: 
          localiq.tXA = locala.yqV.readString();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        case 4: 
          localiq.tXB = locala.yqV.readString();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        case 5: 
          localiq.tXC = locala.yqV.nj();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        case 6: 
          localiq.tXD = locala.yqV.readString();
          GMTrace.o(3867349614592L, 28814);
          return 0;
        }
        localiq.tXE = locala.yqV.nj();
        GMTrace.o(3867349614592L, 28814);
        return 0;
      }
      GMTrace.o(3867349614592L, 28814);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\iq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */