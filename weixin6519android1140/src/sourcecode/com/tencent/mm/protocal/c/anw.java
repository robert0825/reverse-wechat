package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anw
  extends com.tencent.mm.bm.a
{
  public float uDE;
  public float uDF;
  public float uDG;
  
  public anw()
  {
    GMTrace.i(3971234136064L, 29588);
    GMTrace.o(3971234136064L, 29588);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3971368353792L, 29589);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.uDE);
      paramVarArgs.n(2, this.uDF);
      paramVarArgs.n(3, this.uDG);
      GMTrace.o(3971368353792L, 29589);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(3971368353792L, 29589);
      return paramInt + 4 + 0 + (i + 4) + (j + 4);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3971368353792L, 29589);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      anw localanw = (anw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3971368353792L, 29589);
        return -1;
      case 1: 
        localanw.uDE = locala.yqV.readFloat();
        GMTrace.o(3971368353792L, 29589);
        return 0;
      case 2: 
        localanw.uDF = locala.yqV.readFloat();
        GMTrace.o(3971368353792L, 29589);
        return 0;
      }
      localanw.uDG = locala.yqV.readFloat();
      GMTrace.o(3971368353792L, 29589);
      return 0;
    }
    GMTrace.o(3971368353792L, 29589);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */