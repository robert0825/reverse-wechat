package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;

public final class g
  extends com.tencent.mm.bm.a
{
  public int gPO;
  public int gPZ;
  public int gQa;
  
  public g()
  {
    GMTrace.i(12948923744256L, 96477);
    GMTrace.o(12948923744256L, 96477);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12949057961984L, 96478);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.gPO);
      paramVarArgs.fk(2, this.gPZ);
      paramVarArgs.fk(3, this.gQa);
      GMTrace.o(12949057961984L, 96478);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.gPO);
      int i = b.a.a.a.fh(2, this.gPZ);
      int j = b.a.a.a.fh(3, this.gQa);
      GMTrace.o(12949057961984L, 96478);
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
      GMTrace.o(12949057961984L, 96478);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12949057961984L, 96478);
        return -1;
      case 1: 
        localg.gPO = locala.yqV.nj();
        GMTrace.o(12949057961984L, 96478);
        return 0;
      case 2: 
        localg.gPZ = locala.yqV.nj();
        GMTrace.o(12949057961984L, 96478);
        return 0;
      }
      localg.gQa = locala.yqV.nj();
      GMTrace.o(12949057961984L, 96478);
      return 0;
    }
    GMTrace.o(12949057961984L, 96478);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */