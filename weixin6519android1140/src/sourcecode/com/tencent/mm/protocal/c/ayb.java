package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayb
  extends ayx
{
  public azp tUK;
  public String uMy;
  public String uMz;
  public String uoX;
  public long uoY;
  
  public ayb()
  {
    GMTrace.i(14517257895936L, 108162);
    GMTrace.o(14517257895936L, 108162);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14517392113664L, 108163);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.uoY);
      if (this.uMy != null) {
        paramVarArgs.e(3, this.uMy);
      }
      if (this.uMz != null) {
        paramVarArgs.e(4, this.uMz);
      }
      if (this.uoX != null) {
        paramVarArgs.e(5, this.uoX);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(6, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(14517392113664L, 108163);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.uoY);
      paramInt = i;
      if (this.uMy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uMy);
      }
      i = paramInt;
      if (this.uMz != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uMz);
      }
      paramInt = i;
      if (this.uoX != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uoX);
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(6, this.tUK.aYq());
      }
      GMTrace.o(14517392113664L, 108163);
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
      GMTrace.o(14517392113664L, 108163);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayb localayb = (ayb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(14517392113664L, 108163);
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
          localayb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14517392113664L, 108163);
        return 0;
      case 2: 
        localayb.uoY = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14517392113664L, 108163);
        return 0;
      case 3: 
        localayb.uMy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517392113664L, 108163);
        return 0;
      case 4: 
        localayb.uMz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517392113664L, 108163);
        return 0;
      case 5: 
        localayb.uoX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14517392113664L, 108163);
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
        localayb.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(14517392113664L, 108163);
      return 0;
    }
    GMTrace.o(14517392113664L, 108163);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */