package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class fy
  extends com.tencent.mm.bm.a
{
  public int tTC;
  public int tUh;
  public int tUi;
  public int tUj;
  
  public fy()
  {
    GMTrace.i(3771115503616L, 28097);
    GMTrace.o(3771115503616L, 28097);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3771249721344L, 28098);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tTC);
      paramVarArgs.fk(2, this.tUh);
      paramVarArgs.fk(3, this.tUi);
      paramVarArgs.fk(4, this.tUj);
      GMTrace.o(3771249721344L, 28098);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tTC);
      int i = b.a.a.a.fh(2, this.tUh);
      int j = b.a.a.a.fh(3, this.tUi);
      int k = b.a.a.a.fh(4, this.tUj);
      GMTrace.o(3771249721344L, 28098);
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
      GMTrace.o(3771249721344L, 28098);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      fy localfy = (fy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3771249721344L, 28098);
        return -1;
      case 1: 
        localfy.tTC = locala.yqV.nj();
        GMTrace.o(3771249721344L, 28098);
        return 0;
      case 2: 
        localfy.tUh = locala.yqV.nj();
        GMTrace.o(3771249721344L, 28098);
        return 0;
      case 3: 
        localfy.tUi = locala.yqV.nj();
        GMTrace.o(3771249721344L, 28098);
        return 0;
      }
      localfy.tUj = locala.yqV.nj();
      GMTrace.o(3771249721344L, 28098);
      return 0;
    }
    GMTrace.o(3771249721344L, 28098);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */