package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class apx
  extends com.tencent.mm.bm.a
{
  public String uFN;
  public String uFO;
  public int uFP;
  public int uFQ;
  public int uFR;
  public int uFS;
  
  public apx()
  {
    GMTrace.i(13581894549504L, 101193);
    GMTrace.o(13581894549504L, 101193);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13582028767232L, 101194);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFN != null) {
        paramVarArgs.e(1, this.uFN);
      }
      if (this.uFO != null) {
        paramVarArgs.e(2, this.uFO);
      }
      paramVarArgs.fk(3, this.uFP);
      paramVarArgs.fk(4, this.uFQ);
      paramVarArgs.fk(5, this.uFR);
      paramVarArgs.fk(7, this.uFS);
      GMTrace.o(13582028767232L, 101194);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uFN == null) {
        break label498;
      }
    }
    label498:
    for (paramInt = b.a.a.b.b.a.f(1, this.uFN) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uFO != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uFO);
      }
      paramInt = b.a.a.a.fh(3, this.uFP);
      int j = b.a.a.a.fh(4, this.uFQ);
      int k = b.a.a.a.fh(5, this.uFR);
      int m = b.a.a.a.fh(7, this.uFS);
      GMTrace.o(13582028767232L, 101194);
      return i + paramInt + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13582028767232L, 101194);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        apx localapx = (apx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 6: 
        default: 
          GMTrace.o(13582028767232L, 101194);
          return -1;
        case 1: 
          localapx.uFN = locala.yqV.readString();
          GMTrace.o(13582028767232L, 101194);
          return 0;
        case 2: 
          localapx.uFO = locala.yqV.readString();
          GMTrace.o(13582028767232L, 101194);
          return 0;
        case 3: 
          localapx.uFP = locala.yqV.nj();
          GMTrace.o(13582028767232L, 101194);
          return 0;
        case 4: 
          localapx.uFQ = locala.yqV.nj();
          GMTrace.o(13582028767232L, 101194);
          return 0;
        case 5: 
          localapx.uFR = locala.yqV.nj();
          GMTrace.o(13582028767232L, 101194);
          return 0;
        }
        localapx.uFS = locala.yqV.nj();
        GMTrace.o(13582028767232L, 101194);
        return 0;
      }
      GMTrace.o(13582028767232L, 101194);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */