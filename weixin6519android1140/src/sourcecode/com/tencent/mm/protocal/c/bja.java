package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bja
  extends com.tencent.mm.bm.a
{
  public long uUk;
  public long uUl;
  public int uUm;
  
  public bja()
  {
    GMTrace.i(3901440917504L, 29068);
    GMTrace.o(3901440917504L, 29068);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3901575135232L, 29069);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.uUk);
      paramVarArgs.T(2, this.uUl);
      paramVarArgs.fk(3, this.uUm);
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.uUk);
      int i = b.a.a.a.S(2, this.uUl);
      int j = b.a.a.a.fh(3, this.uUm);
      GMTrace.o(3901575135232L, 29069);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bja localbja = (bja)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3901575135232L, 29069);
        return -1;
      case 1: 
        localbja.uUk = locala.yqV.nk();
        GMTrace.o(3901575135232L, 29069);
        return 0;
      case 2: 
        localbja.uUl = locala.yqV.nk();
        GMTrace.o(3901575135232L, 29069);
        return 0;
      }
      localbja.uUm = locala.yqV.nj();
      GMTrace.o(3901575135232L, 29069);
      return 0;
    }
    GMTrace.o(3901575135232L, 29069);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */