package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jf
  extends ayx
{
  public String tRU;
  public String tYS;
  public at tYT;
  
  public jf()
  {
    GMTrace.i(3858088591360L, 28745);
    GMTrace.o(3858088591360L, 28745);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3858222809088L, 28746);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tYS != null) {
        paramVarArgs.e(2, this.tYS);
      }
      if (this.tRU != null) {
        paramVarArgs.e(3, this.tRU);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(4, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3858222809088L, 28746);
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
      if (this.tYS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tYS);
      }
      i = paramInt;
      if (this.tRU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tRU);
      }
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(4, this.tYT.aYq());
      }
      GMTrace.o(3858222809088L, 28746);
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
      GMTrace.o(3858222809088L, 28746);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jf localjf = (jf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3858222809088L, 28746);
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
          localjf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3858222809088L, 28746);
        return 0;
      case 2: 
        localjf.tYS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3858222809088L, 28746);
        return 0;
      case 3: 
        localjf.tRU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3858222809088L, 28746);
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
        localjf.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3858222809088L, 28746);
      return 0;
    }
    GMTrace.o(3858222809088L, 28746);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */