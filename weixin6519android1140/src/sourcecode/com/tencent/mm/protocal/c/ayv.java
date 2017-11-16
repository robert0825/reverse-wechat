package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayv
  extends ayx
{
  public amz uNf;
  public String uni;
  
  public ayv()
  {
    GMTrace.i(16869826232320L, 125690);
    GMTrace.o(16869826232320L, 125690);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16869960450048L, 125691);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uNf != null)
      {
        paramVarArgs.fm(2, this.uNf.aYq());
        this.uNf.a(paramVarArgs);
      }
      if (this.uni != null) {
        paramVarArgs.e(3, this.uni);
      }
      GMTrace.o(16869960450048L, 125691);
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
      if (this.uNf != null) {
        paramInt = i + b.a.a.a.fj(2, this.uNf.aYq());
      }
      i = paramInt;
      if (this.uni != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uni);
      }
      GMTrace.o(16869960450048L, 125691);
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
      GMTrace.o(16869960450048L, 125691);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayv localayv = (ayv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(16869960450048L, 125691);
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
          localayv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16869960450048L, 125691);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((amz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localayv.uNf = ((amz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16869960450048L, 125691);
        return 0;
      }
      localayv.uni = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(16869960450048L, 125691);
      return 0;
    }
    GMTrace.o(16869960450048L, 125691);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ayv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */