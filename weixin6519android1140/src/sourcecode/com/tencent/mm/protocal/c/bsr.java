package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsr
  extends com.tencent.mm.bm.a
{
  public long vbw;
  
  public bsr()
  {
    GMTrace.i(3858625462272L, 28749);
    GMTrace.o(3858625462272L, 28749);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3858759680000L, 28750);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).T(1, this.vbw);
      GMTrace.o(3858759680000L, 28750);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.vbw);
      GMTrace.o(3858759680000L, 28750);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3858759680000L, 28750);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsr localbsr = (bsr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3858759680000L, 28750);
        return -1;
      }
      localbsr.vbw = locala.yqV.nk();
      GMTrace.o(3858759680000L, 28750);
      return 0;
    }
    GMTrace.o(3858759680000L, 28750);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */