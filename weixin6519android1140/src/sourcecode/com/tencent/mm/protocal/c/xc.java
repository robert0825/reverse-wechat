package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xc
  extends ayx
{
  public LinkedList<ahz> uoQ;
  public aib uoS;
  public long uoT;
  
  public xc()
  {
    GMTrace.i(3725749911552L, 27759);
    this.uoQ = new LinkedList();
    GMTrace.o(3725749911552L, 27759);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3725884129280L, 27760);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.uoQ);
      if (this.uoS != null)
      {
        paramVarArgs.fm(4, this.uoS.aYq());
        this.uoS.a(paramVarArgs);
      }
      paramVarArgs.T(5, this.uoT);
      GMTrace.o(3725884129280L, 27760);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.uoQ);
      paramInt = i;
      if (this.uoS != null) {
        paramInt = i + b.a.a.a.fj(4, this.uoS.aYq());
      }
      i = b.a.a.a.S(5, this.uoT);
      GMTrace.o(3725884129280L, 27760);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uoQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3725884129280L, 27760);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xc localxc = (xc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 3: 
      default: 
        GMTrace.o(3725884129280L, 27760);
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
          localxc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3725884129280L, 27760);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localxc.uoQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3725884129280L, 27760);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aib();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aib)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localxc.uoS = ((aib)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3725884129280L, 27760);
        return 0;
      }
      localxc.uoT = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3725884129280L, 27760);
      return 0;
    }
    GMTrace.o(3725884129280L, 27760);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */