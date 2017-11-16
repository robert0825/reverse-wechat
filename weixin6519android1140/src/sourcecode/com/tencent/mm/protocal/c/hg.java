package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class hg
  extends com.tencent.mm.bm.a
{
  public String tVU;
  public int tWe;
  public int tWf;
  public int tWg;
  public int tWh;
  public long tWi;
  public long tWj;
  
  public hg()
  {
    GMTrace.i(3667096764416L, 27322);
    GMTrace.o(3667096764416L, 27322);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3667230982144L, 27323);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.tVU != null) {
        paramVarArgs.e(1, this.tVU);
      }
      paramVarArgs.fk(2, this.tWe);
      paramVarArgs.fk(3, this.tWf);
      paramVarArgs.fk(4, this.tWg);
      paramVarArgs.fk(5, this.tWh);
      paramVarArgs.T(6, this.tWi);
      paramVarArgs.T(7, this.tWj);
      GMTrace.o(3667230982144L, 27323);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVU == null) {
        break label578;
      }
    }
    label578:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVU) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.tWe);
      int j = b.a.a.a.fh(3, this.tWf);
      int k = b.a.a.a.fh(4, this.tWg);
      int m = b.a.a.a.fh(5, this.tWh);
      int n = b.a.a.a.S(6, this.tWi);
      int i1 = b.a.a.a.S(7, this.tWj);
      GMTrace.o(3667230982144L, 27323);
      return paramInt + i + j + k + m + n + i1;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tVU == null) {
          throw new b("Not all required fields were included: brand_user_name");
        }
        GMTrace.o(3667230982144L, 27323);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        hg localhg = (hg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3667230982144L, 27323);
          return -1;
        case 1: 
          localhg.tVU = locala.yqV.readString();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        case 2: 
          localhg.tWe = locala.yqV.nj();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        case 3: 
          localhg.tWf = locala.yqV.nj();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        case 4: 
          localhg.tWg = locala.yqV.nj();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        case 5: 
          localhg.tWh = locala.yqV.nj();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        case 6: 
          localhg.tWi = locala.yqV.nk();
          GMTrace.o(3667230982144L, 27323);
          return 0;
        }
        localhg.tWj = locala.yqV.nk();
        GMTrace.o(3667230982144L, 27323);
        return 0;
      }
      GMTrace.o(3667230982144L, 27323);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */