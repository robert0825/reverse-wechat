package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class wy
  extends com.tencent.mm.bm.a
{
  public at tYT;
  public LinkedList<String> uoN;
  
  public wy()
  {
    GMTrace.i(3770041761792L, 28089);
    this.uoN = new LinkedList();
    GMTrace.o(3770041761792L, 28089);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3770175979520L, 28090);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.uoN);
      if (this.tYT != null)
      {
        paramVarArgs.fm(2, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3770175979520L, 28090);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 1, this.uoN) + 0;
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(2, this.tYT.aYq());
      }
      GMTrace.o(3770175979520L, 28090);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uoN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3770175979520L, 28090);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wy localwy = (wy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3770175979520L, 28090);
        return -1;
      case 1: 
        localwy.uoN.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3770175979520L, 28090);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localwy.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3770175979520L, 28090);
      return 0;
    }
    GMTrace.o(3770175979520L, 28090);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */