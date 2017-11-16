package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bit
  extends ayx
{
  public int tOG;
  public int uTU;
  public LinkedList<bis> uTV;
  
  public bit()
  {
    GMTrace.i(3808025378816L, 28372);
    this.uTV = new LinkedList();
    GMTrace.o(3808025378816L, 28372);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3808159596544L, 28373);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uTU);
      paramVarArgs.d(3, 8, this.uTV);
      paramVarArgs.fk(4, this.tOG);
      GMTrace.o(3808159596544L, 28373);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uTU);
      int j = b.a.a.a.c(3, 8, this.uTV);
      int k = b.a.a.a.fh(4, this.tOG);
      GMTrace.o(3808159596544L, 28373);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uTV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3808159596544L, 28373);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bit localbit = (bit)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3808159596544L, 28373);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbit.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3808159596544L, 28373);
        return 0;
      case 2: 
        localbit.uTU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808159596544L, 28373);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bis();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bis)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbit.uTV.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3808159596544L, 28373);
        return 0;
      }
      localbit.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3808159596544L, 28373);
      return 0;
    }
    GMTrace.o(3808159596544L, 28373);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */