package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqu
  extends ayx
{
  public String mmR;
  public String riF;
  public at tYT;
  public int uGZ;
  
  public aqu()
  {
    GMTrace.i(3854598930432L, 28719);
    GMTrace.o(3854598930432L, 28719);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3854733148160L, 28720);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uGZ);
      if (this.mmR != null) {
        paramVarArgs.e(3, this.mmR);
      }
      if (this.riF != null) {
        paramVarArgs.e(4, this.riF);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(5, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uGZ);
      paramInt = i;
      if (this.mmR != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mmR);
      }
      i = paramInt;
      if (this.riF != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.riF);
      }
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(5, this.tYT.aYq());
      }
      GMTrace.o(3854733148160L, 28720);
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
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqu localaqu = (aqu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3854733148160L, 28720);
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
          localaqu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 2: 
        localaqu.uGZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 3: 
        localaqu.mmR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      case 4: 
        localaqu.riF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3854733148160L, 28720);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localaqu.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3854733148160L, 28720);
      return 0;
    }
    GMTrace.o(3854733148160L, 28720);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\aqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */