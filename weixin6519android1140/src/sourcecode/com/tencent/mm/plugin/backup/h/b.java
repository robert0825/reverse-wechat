package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public int jgO;
  public com.tencent.mm.bm.b jgP;
  
  public b()
  {
    GMTrace.i(14838977789952L, 110559);
    GMTrace.o(14838977789952L, 110559);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14839112007680L, 110560);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jgO);
      if (this.jgP != null) {
        paramVarArgs.b(2, this.jgP);
      }
      GMTrace.o(14839112007680L, 110560);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jgO) + 0;
      paramInt = i;
      if (this.jgP != null) {
        paramInt = i + b.a.a.a.a(2, this.jgP);
      }
      GMTrace.o(14839112007680L, 110560);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14839112007680L, 110560);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14839112007680L, 110560);
        return -1;
      case 1: 
        localb.jgO = locala.yqV.nj();
        GMTrace.o(14839112007680L, 110560);
        return 0;
      }
      localb.jgP = locala.csV();
      GMTrace.o(14839112007680L, 110560);
      return 0;
    }
    GMTrace.o(14839112007680L, 110560);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */