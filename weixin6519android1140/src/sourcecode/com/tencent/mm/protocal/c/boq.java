package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class boq
  extends com.tencent.mm.bm.a
{
  public int uYI;
  public int uYJ;
  public int uYK;
  public int uYL;
  public b uYM;
  public long uYy;
  public long uhV;
  
  public boq()
  {
    GMTrace.i(3741856038912L, 27879);
    GMTrace.o(3741856038912L, 27879);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3741990256640L, 27880);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.uYy);
      paramVarArgs.T(2, this.uhV);
      paramVarArgs.fk(3, this.uYI);
      paramVarArgs.fk(4, this.uYJ);
      paramVarArgs.fk(5, this.uYK);
      paramVarArgs.fk(6, this.uYL);
      if (this.uYM != null) {
        paramVarArgs.b(7, this.uYM);
      }
      GMTrace.o(3741990256640L, 27880);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.uYy) + 0 + b.a.a.a.S(2, this.uhV) + b.a.a.a.fh(3, this.uYI) + b.a.a.a.fh(4, this.uYJ) + b.a.a.a.fh(5, this.uYK) + b.a.a.a.fh(6, this.uYL);
      paramInt = i;
      if (this.uYM != null) {
        paramInt = i + b.a.a.a.a(7, this.uYM);
      }
      GMTrace.o(3741990256640L, 27880);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3741990256640L, 27880);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      boq localboq = (boq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3741990256640L, 27880);
        return -1;
      case 1: 
        localboq.uYy = locala.yqV.nk();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      case 2: 
        localboq.uhV = locala.yqV.nk();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      case 3: 
        localboq.uYI = locala.yqV.nj();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      case 4: 
        localboq.uYJ = locala.yqV.nj();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      case 5: 
        localboq.uYK = locala.yqV.nj();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      case 6: 
        localboq.uYL = locala.yqV.nj();
        GMTrace.o(3741990256640L, 27880);
        return 0;
      }
      localboq.uYM = locala.csV();
      GMTrace.o(3741990256640L, 27880);
      return 0;
    }
    GMTrace.o(3741990256640L, 27880);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */