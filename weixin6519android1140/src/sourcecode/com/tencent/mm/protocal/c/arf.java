package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arf
  extends ayx
{
  public int tMX;
  public int uHr;
  public LinkedList<bnx> uHs;
  
  public arf()
  {
    GMTrace.i(3820910280704L, 28468);
    this.uHs = new LinkedList();
    GMTrace.o(3820910280704L, 28468);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3821044498432L, 28469);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.fk(3, this.uHr);
      paramVarArgs.d(4, 8, this.uHs);
      GMTrace.o(3821044498432L, 28469);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tMX);
      int j = b.a.a.a.fh(3, this.uHr);
      int k = b.a.a.a.c(4, 8, this.uHs);
      GMTrace.o(3821044498432L, 28469);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uHs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3821044498432L, 28469);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arf localarf = (arf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3821044498432L, 28469);
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
          localarf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3821044498432L, 28469);
        return 0;
      case 2: 
        localarf.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3821044498432L, 28469);
        return 0;
      case 3: 
        localarf.uHr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3821044498432L, 28469);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bnx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bnx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localarf.uHs.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3821044498432L, 28469);
      return 0;
    }
    GMTrace.o(3821044498432L, 28469);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\arf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */