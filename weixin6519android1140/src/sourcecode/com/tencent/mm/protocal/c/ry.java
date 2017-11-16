package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ry
  extends com.tencent.mm.bm.a
{
  public int priority;
  public int ufJ;
  
  public ry()
  {
    GMTrace.i(3643206008832L, 27144);
    GMTrace.o(3643206008832L, 27144);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3643340226560L, 27145);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ufJ);
      paramVarArgs.fk(2, this.priority);
      GMTrace.o(3643340226560L, 27145);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ufJ);
      int i = b.a.a.a.fh(2, this.priority);
      GMTrace.o(3643340226560L, 27145);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3643340226560L, 27145);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ry localry = (ry)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3643340226560L, 27145);
        return -1;
      case 1: 
        localry.ufJ = locala.yqV.nj();
        GMTrace.o(3643340226560L, 27145);
        return 0;
      }
      localry.priority = locala.yqV.nj();
      GMTrace.o(3643340226560L, 27145);
      return 0;
    }
    GMTrace.o(3643340226560L, 27145);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */