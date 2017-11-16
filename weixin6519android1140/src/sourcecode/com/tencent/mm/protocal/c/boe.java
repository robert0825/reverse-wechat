package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boe
  extends com.tencent.mm.bm.a
{
  public int uKd;
  public int uTR;
  
  public boe()
  {
    GMTrace.i(4046664499200L, 30150);
    GMTrace.o(4046664499200L, 30150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4046798716928L, 30151);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTR);
      paramVarArgs.fk(2, this.uKd);
      GMTrace.o(4046798716928L, 30151);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uTR);
      int i = b.a.a.a.fh(2, this.uKd);
      GMTrace.o(4046798716928L, 30151);
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
      GMTrace.o(4046798716928L, 30151);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      boe localboe = (boe)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4046798716928L, 30151);
        return -1;
      case 1: 
        localboe.uTR = locala.yqV.nj();
        GMTrace.o(4046798716928L, 30151);
        return 0;
      }
      localboe.uKd = locala.yqV.nj();
      GMTrace.o(4046798716928L, 30151);
      return 0;
    }
    GMTrace.o(4046798716928L, 30151);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */