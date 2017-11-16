package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class zj
  extends com.tencent.mm.bm.a
{
  public double tWm;
  public double tWn;
  
  public zj()
  {
    GMTrace.i(3824399941632L, 28494);
    GMTrace.o(3824399941632L, 28494);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3824534159360L, 28495);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.tWm);
      paramVarArgs.a(2, this.tWn);
      GMTrace.o(3824534159360L, 28495);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      int i = b.a.a.b.b.a.cK(2);
      GMTrace.o(3824534159360L, 28495);
      return paramInt + 8 + 0 + (i + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3824534159360L, 28495);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      zj localzj = (zj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3824534159360L, 28495);
        return -1;
      case 1: 
        localzj.tWm = locala.yqV.readDouble();
        GMTrace.o(3824534159360L, 28495);
        return 0;
      }
      localzj.tWn = locala.yqV.readDouble();
      GMTrace.o(3824534159360L, 28495);
      return 0;
    }
    GMTrace.o(3824534159360L, 28495);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */