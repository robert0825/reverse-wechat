package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aug
  extends com.tencent.mm.bm.a
{
  public int uJC;
  public int uJD;
  public String uJE;
  
  public aug()
  {
    GMTrace.i(16869557796864L, 125688);
    GMTrace.o(16869557796864L, 125688);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16869692014592L, 125689);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uJC);
      paramVarArgs.fk(2, this.uJD);
      if (this.uJE != null) {
        paramVarArgs.e(3, this.uJE);
      }
      GMTrace.o(16869692014592L, 125689);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uJC) + 0 + b.a.a.a.fh(2, this.uJD);
      paramInt = i;
      if (this.uJE != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uJE);
      }
      GMTrace.o(16869692014592L, 125689);
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
      GMTrace.o(16869692014592L, 125689);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aug localaug = (aug)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16869692014592L, 125689);
        return -1;
      case 1: 
        localaug.uJC = locala.yqV.nj();
        GMTrace.o(16869692014592L, 125689);
        return 0;
      case 2: 
        localaug.uJD = locala.yqV.nj();
        GMTrace.o(16869692014592L, 125689);
        return 0;
      }
      localaug.uJE = locala.yqV.readString();
      GMTrace.o(16869692014592L, 125689);
      return 0;
    }
    GMTrace.o(16869692014592L, 125689);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */