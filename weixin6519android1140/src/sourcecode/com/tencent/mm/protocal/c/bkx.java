package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bkx
  extends ayx
{
  public int tOG;
  public azp tUK;
  public String uVj;
  public String uVk;
  
  public bkx()
  {
    GMTrace.i(3792187686912L, 28254);
    GMTrace.o(3792187686912L, 28254);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3792321904640L, 28255);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uVj != null) {
        paramVarArgs.e(2, this.uVj);
      }
      if (this.uVk != null) {
        paramVarArgs.e(3, this.uVk);
      }
      paramVarArgs.fk(4, this.tOG);
      if (this.tUK != null)
      {
        paramVarArgs.fm(5, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uVj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uVj);
      }
      i = paramInt;
      if (this.uVk != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uVk);
      }
      i += b.a.a.a.fh(4, this.tOG);
      paramInt = i;
      if (this.tUK != null) {
        paramInt = i + b.a.a.a.fj(5, this.tUK.aYq());
      }
      GMTrace.o(3792321904640L, 28255);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bkx localbkx = (bkx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3792321904640L, 28255);
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
          localbkx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 2: 
        localbkx.uVj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 3: 
        localbkx.uVk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3792321904640L, 28255);
        return 0;
      case 4: 
        localbkx.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3792321904640L, 28255);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbkx.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3792321904640L, 28255);
      return 0;
    }
    GMTrace.o(3792321904640L, 28255);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */