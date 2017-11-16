package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ez
  extends com.tencent.mm.bm.a
{
  public int tTI;
  public int tTJ;
  public LinkedList<String> tTK;
  
  public ez()
  {
    GMTrace.i(3888556015616L, 28972);
    this.tTK = new LinkedList();
    GMTrace.o(3888556015616L, 28972);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3888690233344L, 28973);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tTI);
      paramVarArgs.fk(2, this.tTJ);
      paramVarArgs.d(3, 1, this.tTK);
      GMTrace.o(3888690233344L, 28973);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tTI);
      int i = b.a.a.a.fh(2, this.tTJ);
      int j = b.a.a.a.c(3, 1, this.tTK);
      GMTrace.o(3888690233344L, 28973);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTK.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3888690233344L, 28973);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ez localez = (ez)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3888690233344L, 28973);
        return -1;
      case 1: 
        localez.tTI = locala.yqV.nj();
        GMTrace.o(3888690233344L, 28973);
        return 0;
      case 2: 
        localez.tTJ = locala.yqV.nj();
        GMTrace.o(3888690233344L, 28973);
        return 0;
      }
      localez.tTK.add(locala.yqV.readString());
      GMTrace.o(3888690233344L, 28973);
      return 0;
    }
    GMTrace.o(3888690233344L, 28973);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */