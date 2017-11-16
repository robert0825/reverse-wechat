package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aic
  extends com.tencent.mm.bm.a
{
  public int uxx;
  public int uxy;
  
  public aic()
  {
    GMTrace.i(3707496300544L, 27623);
    GMTrace.o(3707496300544L, 27623);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3707630518272L, 27624);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uxx);
      paramVarArgs.fk(2, this.uxy);
      GMTrace.o(3707630518272L, 27624);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uxx);
      int i = b.a.a.a.fh(2, this.uxy);
      GMTrace.o(3707630518272L, 27624);
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
      GMTrace.o(3707630518272L, 27624);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aic localaic = (aic)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3707630518272L, 27624);
        return -1;
      case 1: 
        localaic.uxx = locala.yqV.nj();
        GMTrace.o(3707630518272L, 27624);
        return 0;
      }
      localaic.uxy = locala.yqV.nj();
      GMTrace.o(3707630518272L, 27624);
      return 0;
    }
    GMTrace.o(3707630518272L, 27624);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */