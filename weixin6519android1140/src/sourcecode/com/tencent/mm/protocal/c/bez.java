package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bez
  extends com.tencent.mm.bm.a
{
  public int uQH;
  
  public bez()
  {
    GMTrace.i(19141327060992L, 142614);
    GMTrace.o(19141327060992L, 142614);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19141461278720L, 142615);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.uQH);
      GMTrace.o(19141461278720L, 142615);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uQH);
      GMTrace.o(19141461278720L, 142615);
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
      GMTrace.o(19141461278720L, 142615);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bez localbez = (bez)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(19141461278720L, 142615);
        return -1;
      }
      localbez.uQH = locala.yqV.nj();
      GMTrace.o(19141461278720L, 142615);
      return 0;
    }
    GMTrace.o(19141461278720L, 142615);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */