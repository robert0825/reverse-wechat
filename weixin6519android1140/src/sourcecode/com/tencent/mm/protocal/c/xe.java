package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xe
  extends ayx
{
  public int jib;
  public int tOG;
  public azp tUK;
  public String uoX;
  
  public xe()
  {
    GMTrace.i(3869094445056L, 28827);
    GMTrace.o(3869094445056L, 28827);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3869228662784L, 28828);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.tOG);
      if (this.uoX != null) {
        paramVarArgs.e(4, this.uoX);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(5, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(3869228662784L, 28828);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jib) + b.a.a.a.fh(3, this.tOG);
      paramInt = i;
      if (this.uoX != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uoX);
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(5, this.tUK.aYq());
      }
      GMTrace.o(3869228662784L, 28828);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3869228662784L, 28828);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xe localxe = (xe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3869228662784L, 28828);
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
          localxe.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3869228662784L, 28828);
        return 0;
      case 2: 
        localxe.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3869228662784L, 28828);
        return 0;
      case 3: 
        localxe.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3869228662784L, 28828);
        return 0;
      case 4: 
        localxe.uoX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3869228662784L, 28828);
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
        localxe.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3869228662784L, 28828);
      return 0;
    }
    GMTrace.o(3869228662784L, 28828);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */