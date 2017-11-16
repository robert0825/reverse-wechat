package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqn
  extends com.tencent.mm.bm.a
{
  public int etB;
  
  public bqn()
  {
    GMTrace.i(3946538074112L, 29404);
    GMTrace.o(3946538074112L, 29404);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3946672291840L, 29405);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.etB);
      GMTrace.o(3946672291840L, 29405);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.etB);
      GMTrace.o(3946672291840L, 29405);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3946672291840L, 29405);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqn localbqn = (bqn)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3946672291840L, 29405);
        return -1;
      }
      localbqn.etB = locala.yqV.nj();
      GMTrace.o(3946672291840L, 29405);
      return 0;
    }
    GMTrace.o(3946672291840L, 29405);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */