package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xa
  extends ayx
{
  public String eSd;
  public LinkedList<ahz> uoQ;
  
  public xa()
  {
    GMTrace.i(3638642606080L, 27110);
    this.uoQ = new LinkedList();
    GMTrace.o(3638642606080L, 27110);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3638776823808L, 27111);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.uoQ);
      if (this.eSd != null) {
        paramVarArgs.e(3, this.eSd);
      }
      GMTrace.o(3638776823808L, 27111);
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
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eSd);
      }
      GMTrace.o(3638776823808L, 27111);
      return paramInt;
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
      GMTrace.o(3638776823808L, 27111);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xa localxa = (xa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3638776823808L, 27111);
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
          localxa.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3638776823808L, 27111);
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
          localxa.uoQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3638776823808L, 27111);
        return 0;
      }
      localxa.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3638776823808L, 27111);
      return 0;
    }
    GMTrace.o(3638776823808L, 27111);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */