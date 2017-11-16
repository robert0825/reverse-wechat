package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class em
  extends com.tencent.mm.bm.a
{
  public String mhU;
  public String nDt;
  public String nDu;
  public String rcs;
  public String tTk;
  public String tTl;
  public String tTm;
  public String tTn;
  
  public em()
  {
    GMTrace.i(3809635991552L, 28384);
    GMTrace.o(3809635991552L, 28384);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3809770209280L, 28385);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTk != null) {
        paramVarArgs.e(1, this.tTk);
      }
      if (this.rcs != null) {
        paramVarArgs.e(2, this.rcs);
      }
      if (this.nDt != null) {
        paramVarArgs.e(3, this.nDt);
      }
      if (this.nDu != null) {
        paramVarArgs.e(4, this.nDu);
      }
      if (this.mhU != null) {
        paramVarArgs.e(5, this.mhU);
      }
      if (this.tTl != null) {
        paramVarArgs.e(6, this.tTl);
      }
      if (this.tTm != null) {
        paramVarArgs.e(7, this.tTm);
      }
      if (this.tTn != null) {
        paramVarArgs.e(8, this.tTn);
      }
      GMTrace.o(3809770209280L, 28385);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTk == null) {
        break label698;
      }
    }
    label698:
    for (int i = b.a.a.b.b.a.f(1, this.tTk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rcs != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.rcs);
      }
      i = paramInt;
      if (this.nDt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nDt);
      }
      paramInt = i;
      if (this.nDu != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nDu);
      }
      i = paramInt;
      if (this.mhU != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mhU);
      }
      paramInt = i;
      if (this.tTl != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tTl);
      }
      i = paramInt;
      if (this.tTm != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tTm);
      }
      paramInt = i;
      if (this.tTn != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tTn);
      }
      GMTrace.o(3809770209280L, 28385);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3809770209280L, 28385);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        em localem = (em)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3809770209280L, 28385);
          return -1;
        case 1: 
          localem.tTk = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 2: 
          localem.rcs = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 3: 
          localem.nDt = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 4: 
          localem.nDu = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 5: 
          localem.mhU = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 6: 
          localem.tTl = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        case 7: 
          localem.tTm = locala.yqV.readString();
          GMTrace.o(3809770209280L, 28385);
          return 0;
        }
        localem.tTn = locala.yqV.readString();
        GMTrace.o(3809770209280L, 28385);
        return 0;
      }
      GMTrace.o(3809770209280L, 28385);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */