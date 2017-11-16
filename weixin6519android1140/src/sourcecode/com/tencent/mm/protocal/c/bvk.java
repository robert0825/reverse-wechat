package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvk
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int tVE;
  public int uyt;
  public int vdF;
  public int vdG;
  
  public bvk()
  {
    GMTrace.i(17615271493632L, 131244);
    GMTrace.o(17615271493632L, 131244);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615405711360L, 131245);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uyt);
      paramVarArgs.fk(2, this.tVE);
      paramVarArgs.fk(3, this.vdF);
      paramVarArgs.fk(4, this.tOG);
      paramVarArgs.fk(10, this.vdG);
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uyt);
      int i = b.a.a.a.fh(2, this.tVE);
      int j = b.a.a.a.fh(3, this.vdF);
      int k = b.a.a.a.fh(4, this.tOG);
      int m = b.a.a.a.fh(10, this.vdG);
      GMTrace.o(17615405711360L, 131245);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvk localbvk = (bvk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        GMTrace.o(17615405711360L, 131245);
        return -1;
      case 1: 
        localbvk.uyt = locala.yqV.nj();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 2: 
        localbvk.tVE = locala.yqV.nj();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 3: 
        localbvk.vdF = locala.yqV.nj();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      case 4: 
        localbvk.tOG = locala.yqV.nj();
        GMTrace.o(17615405711360L, 131245);
        return 0;
      }
      localbvk.vdG = locala.yqV.nj();
      GMTrace.o(17615405711360L, 131245);
      return 0;
    }
    GMTrace.o(17615405711360L, 131245);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bvk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */