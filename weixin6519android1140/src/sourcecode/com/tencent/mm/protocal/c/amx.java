package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amx
  extends ayx
{
  public LinkedList<amu> uBJ;
  public String uxu;
  
  public amx()
  {
    GMTrace.i(3720649637888L, 27721);
    this.uBJ = new LinkedList();
    GMTrace.o(3720649637888L, 27721);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3720783855616L, 27722);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uxu != null) {
        paramVarArgs.e(2, this.uxu);
      }
      paramVarArgs.d(3, 8, this.uBJ);
      GMTrace.o(3720783855616L, 27722);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uxu != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uxu);
      }
      paramInt = b.a.a.a.c(3, 8, this.uBJ);
      GMTrace.o(3720783855616L, 27722);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uBJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3720783855616L, 27722);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amx localamx = (amx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3720783855616L, 27722);
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
          localamx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3720783855616L, 27722);
        return 0;
      case 2: 
        localamx.uxu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3720783855616L, 27722);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new amu();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((amu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localamx.uBJ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3720783855616L, 27722);
      return 0;
    }
    GMTrace.o(3720783855616L, 27722);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\amx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */