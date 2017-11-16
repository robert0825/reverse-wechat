package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class biq
  extends com.tencent.mm.bm.a
{
  public int uKd;
  public int uTR;
  
  public biq()
  {
    GMTrace.i(3957812363264L, 29488);
    GMTrace.o(3957812363264L, 29488);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3957946580992L, 29489);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTR);
      paramVarArgs.fk(2, this.uKd);
      GMTrace.o(3957946580992L, 29489);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uTR);
      int i = b.a.a.a.fh(2, this.uKd);
      GMTrace.o(3957946580992L, 29489);
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
      GMTrace.o(3957946580992L, 29489);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      biq localbiq = (biq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3957946580992L, 29489);
        return -1;
      case 1: 
        localbiq.uTR = locala.yqV.nj();
        GMTrace.o(3957946580992L, 29489);
        return 0;
      }
      localbiq.uKd = locala.yqV.nj();
      GMTrace.o(3957946580992L, 29489);
      return 0;
    }
    GMTrace.o(3957946580992L, 29489);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\biq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */