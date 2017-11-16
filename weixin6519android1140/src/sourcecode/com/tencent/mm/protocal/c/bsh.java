package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bsh
  extends com.tencent.mm.bm.a
{
  public b jgP;
  public long vbl;
  
  public bsh()
  {
    GMTrace.i(3929895075840L, 29280);
    GMTrace.o(3929895075840L, 29280);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3930029293568L, 29281);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.vbl);
      if (this.jgP != null) {
        paramVarArgs.b(2, this.jgP);
      }
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.vbl) + 0;
      paramInt = i;
      if (this.jgP != null) {
        paramInt = i + b.a.a.a.a(2, this.jgP);
      }
      GMTrace.o(3930029293568L, 29281);
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
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsh localbsh = (bsh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3930029293568L, 29281);
        return -1;
      case 1: 
        localbsh.vbl = locala.yqV.nk();
        GMTrace.o(3930029293568L, 29281);
        return 0;
      }
      localbsh.jgP = locala.csV();
      GMTrace.o(3930029293568L, 29281);
      return 0;
    }
    GMTrace.o(3930029293568L, 29281);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */