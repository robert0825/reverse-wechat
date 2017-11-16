package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class nz
  extends com.tencent.mm.bm.a
{
  public int tRD;
  public int ueT;
  
  public nz()
  {
    GMTrace.i(3921573576704L, 29218);
    GMTrace.o(3921573576704L, 29218);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3921707794432L, 29219);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRD);
      paramVarArgs.fk(2, this.ueT);
      GMTrace.o(3921707794432L, 29219);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRD);
      int i = b.a.a.a.fh(2, this.ueT);
      GMTrace.o(3921707794432L, 29219);
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
      GMTrace.o(3921707794432L, 29219);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      nz localnz = (nz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3921707794432L, 29219);
        return -1;
      case 1: 
        localnz.tRD = locala.yqV.nj();
        GMTrace.o(3921707794432L, 29219);
        return 0;
      }
      localnz.ueT = locala.yqV.nj();
      GMTrace.o(3921707794432L, 29219);
      return 0;
    }
    GMTrace.o(3921707794432L, 29219);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */