package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcz
  extends ayx
{
  public String kAY;
  public azp tSb;
  public String ugx;
  
  public bcz()
  {
    GMTrace.i(13167967076352L, 98109);
    GMTrace.o(13167967076352L, 98109);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13168101294080L, 98110);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.kAY != null) {
        paramVarArgs.e(2, this.kAY);
      }
      if (this.ugx != null) {
        paramVarArgs.e(3, this.ugx);
      }
      if (this.tSb != null)
      {
        paramVarArgs.fm(4, this.tSb.aYq());
        this.tSb.a(paramVarArgs);
      }
      GMTrace.o(13168101294080L, 98110);
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
      if (this.kAY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kAY);
      }
      i = paramInt;
      if (this.ugx != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugx);
      }
      paramInt = i;
      if (this.tSb != null) {
        paramInt = i + b.a.a.a.fj(4, this.tSb.aYq());
      }
      GMTrace.o(13168101294080L, 98110);
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
      GMTrace.o(13168101294080L, 98110);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcz localbcz = (bcz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13168101294080L, 98110);
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
          localbcz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13168101294080L, 98110);
        return 0;
      case 2: 
        localbcz.kAY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168101294080L, 98110);
        return 0;
      case 3: 
        localbcz.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13168101294080L, 98110);
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
        localbcz.tSb = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13168101294080L, 98110);
      return 0;
    }
    GMTrace.o(13168101294080L, 98110);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */