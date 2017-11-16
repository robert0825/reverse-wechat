package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ee
  extends com.tencent.mm.bm.a
{
  public long endTime;
  public long startTime;
  
  public ee()
  {
    GMTrace.i(17868674564096L, 133132);
    GMTrace.o(17868674564096L, 133132);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17868808781824L, 133133);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.startTime);
      paramVarArgs.T(2, this.endTime);
      GMTrace.o(17868808781824L, 133133);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.startTime);
      int i = b.a.a.a.S(2, this.endTime);
      GMTrace.o(17868808781824L, 133133);
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
      GMTrace.o(17868808781824L, 133133);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ee localee = (ee)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17868808781824L, 133133);
        return -1;
      case 1: 
        localee.startTime = locala.yqV.nk();
        GMTrace.o(17868808781824L, 133133);
        return 0;
      }
      localee.endTime = locala.yqV.nk();
      GMTrace.o(17868808781824L, 133133);
      return 0;
    }
    GMTrace.o(17868808781824L, 133133);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */