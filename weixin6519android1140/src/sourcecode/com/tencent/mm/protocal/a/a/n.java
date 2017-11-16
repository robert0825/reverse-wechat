package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;

public final class n
  extends com.tencent.mm.bm.a
{
  public int tLM;
  public int tLN;
  public int tLO;
  public int tLP;
  public int tLQ;
  public int tLR;
  public int tLd;
  
  public n()
  {
    GMTrace.i(13102468825088L, 97621);
    GMTrace.o(13102468825088L, 97621);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13102603042816L, 97622);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLd);
      paramVarArgs.fk(2, this.tLM);
      paramVarArgs.fk(3, this.tLN);
      paramVarArgs.fk(4, this.tLO);
      paramVarArgs.fk(5, this.tLP);
      paramVarArgs.fk(6, this.tLQ);
      paramVarArgs.fk(7, this.tLR);
      GMTrace.o(13102603042816L, 97622);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tLd);
      int i = b.a.a.a.fh(2, this.tLM);
      int j = b.a.a.a.fh(3, this.tLN);
      int k = b.a.a.a.fh(4, this.tLO);
      int m = b.a.a.a.fh(5, this.tLP);
      int n = b.a.a.a.fh(6, this.tLQ);
      int i1 = b.a.a.a.fh(7, this.tLR);
      GMTrace.o(13102603042816L, 97622);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13102603042816L, 97622);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      n localn = (n)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13102603042816L, 97622);
        return -1;
      case 1: 
        localn.tLd = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      case 2: 
        localn.tLM = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      case 3: 
        localn.tLN = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      case 4: 
        localn.tLO = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      case 5: 
        localn.tLP = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      case 6: 
        localn.tLQ = locala.yqV.nj();
        GMTrace.o(13102603042816L, 97622);
        return 0;
      }
      localn.tLR = locala.yqV.nj();
      GMTrace.o(13102603042816L, 97622);
      return 0;
    }
    GMTrace.o(13102603042816L, 97622);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */