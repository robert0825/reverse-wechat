package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bgq
  extends com.tencent.mm.bm.a
{
  public int uAb;
  public int uSl;
  public int uSm;
  public int ufI;
  
  public bgq()
  {
    GMTrace.i(4008144011264L, 29863);
    GMTrace.o(4008144011264L, 29863);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4008278228992L, 29864);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ufI);
      paramVarArgs.fk(2, this.uAb);
      paramVarArgs.fk(3, this.uSl);
      paramVarArgs.fk(4, this.uSm);
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ufI);
      int i = b.a.a.a.fh(2, this.uAb);
      int j = b.a.a.a.fh(3, this.uSl);
      int k = b.a.a.a.fh(4, this.uSm);
      GMTrace.o(4008278228992L, 29864);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bgq localbgq = (bgq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4008278228992L, 29864);
        return -1;
      case 1: 
        localbgq.ufI = locala.yqV.nj();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      case 2: 
        localbgq.uAb = locala.yqV.nj();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      case 3: 
        localbgq.uSl = locala.yqV.nj();
        GMTrace.o(4008278228992L, 29864);
        return 0;
      }
      localbgq.uSm = locala.yqV.nj();
      GMTrace.o(4008278228992L, 29864);
      return 0;
    }
    GMTrace.o(4008278228992L, 29864);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */