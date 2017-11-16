package com.tencent.mm.bt;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public int max;
  public int rqp;
  
  public d()
  {
    GMTrace.i(4518037159936L, 33662);
    GMTrace.o(4518037159936L, 33662);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4518171377664L, 33663);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.rqp);
      paramVarArgs.fk(2, this.max);
      GMTrace.o(4518171377664L, 33663);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.rqp);
      int i = b.a.a.a.fh(2, this.max);
      GMTrace.o(4518171377664L, 33663);
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
      GMTrace.o(4518171377664L, 33663);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4518171377664L, 33663);
        return -1;
      case 1: 
        locald.rqp = locala.yqV.nj();
        GMTrace.o(4518171377664L, 33663);
        return 0;
      }
      locald.max = locala.yqV.nj();
      GMTrace.o(4518171377664L, 33663);
      return 0;
    }
    GMTrace.o(4518171377664L, 33663);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */