package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bkz
  extends com.tencent.mm.bm.a
{
  public int tMX;
  
  public bkz()
  {
    GMTrace.i(3706422558720L, 27615);
    GMTrace.o(3706422558720L, 27615);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3706556776448L, 27616);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.tMX);
      GMTrace.o(3706556776448L, 27616);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tMX);
      GMTrace.o(3706556776448L, 27616);
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
      GMTrace.o(3706556776448L, 27616);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bkz localbkz = (bkz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3706556776448L, 27616);
        return -1;
      }
      localbkz.tMX = locala.yqV.nj();
      GMTrace.o(3706556776448L, 27616);
      return 0;
    }
    GMTrace.o(3706556776448L, 27616);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bkz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */