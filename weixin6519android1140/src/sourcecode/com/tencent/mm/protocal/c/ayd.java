package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayd
  extends ayx
{
  public int nJ;
  public azp uMC;
  public azp uMD;
  
  public ayd()
  {
    GMTrace.i(3849230221312L, 28679);
    GMTrace.o(3849230221312L, 28679);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3849364439040L, 28680);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uMC != null)
      {
        paramVarArgs.fm(2, this.uMC.aYq());
        this.uMC.a(paramVarArgs);
      }
      if (this.uMD != null)
      {
        paramVarArgs.fm(3, this.uMD.aYq());
        this.uMD.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.nJ);
      GMTrace.o(3849364439040L, 28680);
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
      if (this.uMC != null) {
        paramInt = i + b.a.a.a.fj(2, this.uMC.aYq());
      }
      i = paramInt;
      if (this.uMD != null) {
        i = paramInt + b.a.a.a.fj(3, this.uMD.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.nJ);
      GMTrace.o(3849364439040L, 28680);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3849364439040L, 28680);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayd localayd = (ayd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3849364439040L, 28680);
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
          localayd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayd.uMC = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayd.uMD = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3849364439040L, 28680);
        return 0;
      }
      localayd.nJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3849364439040L, 28680);
      return 0;
    }
    GMTrace.o(3849364439040L, 28680);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */