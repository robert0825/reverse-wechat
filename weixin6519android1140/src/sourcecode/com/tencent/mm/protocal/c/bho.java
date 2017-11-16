package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bho
  extends com.tencent.mm.bm.a
{
  public int uTx;
  public boolean uTy;
  
  public bho()
  {
    GMTrace.i(18666330521600L, 139075);
    GMTrace.o(18666330521600L, 139075);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18666464739328L, 139076);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTx);
      paramVarArgs.ah(2, this.uTy);
      GMTrace.o(18666464739328L, 139076);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uTx);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(18666464739328L, 139076);
      return paramInt + 0 + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18666464739328L, 139076);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bho localbho = (bho)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(18666464739328L, 139076);
        return -1;
      case 1: 
        localbho.uTx = locala.yqV.nj();
        GMTrace.o(18666464739328L, 139076);
        return 0;
      }
      localbho.uTy = locala.csU();
      GMTrace.o(18666464739328L, 139076);
      return 0;
    }
    GMTrace.o(18666464739328L, 139076);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */