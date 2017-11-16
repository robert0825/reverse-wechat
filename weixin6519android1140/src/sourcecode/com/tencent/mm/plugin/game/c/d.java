package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public int lPA;
  public int lPy;
  public int lPz;
  
  public d()
  {
    GMTrace.i(16560722804736L, 123387);
    GMTrace.o(16560722804736L, 123387);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16560857022464L, 123388);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lPy);
      paramVarArgs.fk(2, this.lPz);
      paramVarArgs.fk(3, this.lPA);
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.lPy);
      int i = b.a.a.a.fh(2, this.lPz);
      int j = b.a.a.a.fh(3, this.lPA);
      GMTrace.o(16560857022464L, 123388);
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
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16560857022464L, 123388);
        return -1;
      case 1: 
        locald.lPy = locala.yqV.nj();
        GMTrace.o(16560857022464L, 123388);
        return 0;
      case 2: 
        locald.lPz = locala.yqV.nj();
        GMTrace.o(16560857022464L, 123388);
        return 0;
      }
      locald.lPA = locala.yqV.nj();
      GMTrace.o(16560857022464L, 123388);
      return 0;
    }
    GMTrace.o(16560857022464L, 123388);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */