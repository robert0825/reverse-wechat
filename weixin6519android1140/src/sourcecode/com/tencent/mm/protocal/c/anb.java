package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anb
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public String tWC;
  public long uBP;
  public long uBQ;
  
  public anb()
  {
    GMTrace.i(19140253319168L, 142606);
    GMTrace.o(19140253319168L, 142606);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19140387536896L, 142607);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tOG);
      if (this.tWC != null) {
        paramVarArgs.e(2, this.tWC);
      }
      paramVarArgs.T(3, this.uBQ);
      paramVarArgs.T(4, this.uBP);
      GMTrace.o(19140387536896L, 142607);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tOG) + 0;
      paramInt = i;
      if (this.tWC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWC);
      }
      i = b.a.a.a.S(3, this.uBQ);
      int j = b.a.a.a.S(4, this.uBP);
      GMTrace.o(19140387536896L, 142607);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19140387536896L, 142607);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      anb localanb = (anb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(19140387536896L, 142607);
        return -1;
      case 1: 
        localanb.tOG = locala.yqV.nj();
        GMTrace.o(19140387536896L, 142607);
        return 0;
      case 2: 
        localanb.tWC = locala.yqV.readString();
        GMTrace.o(19140387536896L, 142607);
        return 0;
      case 3: 
        localanb.uBQ = locala.yqV.nk();
        GMTrace.o(19140387536896L, 142607);
        return 0;
      }
      localanb.uBP = locala.yqV.nk();
      GMTrace.o(19140387536896L, 142607);
      return 0;
    }
    GMTrace.o(19140387536896L, 142607);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */