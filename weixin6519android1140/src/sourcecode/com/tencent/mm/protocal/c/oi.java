package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class oi
  extends ayx
{
  public String tVU;
  public us ufl;
  
  public oi()
  {
    GMTrace.i(3793261428736L, 28262);
    GMTrace.o(3793261428736L, 28262);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3793395646464L, 28263);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufl == null) {
        throw new b("Not all required fields were included: full_chat");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVU != null) {
        paramVarArgs.e(2, this.tVU);
      }
      if (this.ufl != null)
      {
        paramVarArgs.fm(3, this.ufl.aYq());
        this.ufl.a(paramVarArgs);
      }
      GMTrace.o(3793395646464L, 28263);
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
      if (this.tVU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVU);
      }
      i = paramInt;
      if (this.ufl != null) {
        i = paramInt + b.a.a.a.fj(3, this.ufl.aYq());
      }
      GMTrace.o(3793395646464L, 28263);
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
      if (this.ufl == null) {
        throw new b("Not all required fields were included: full_chat");
      }
      GMTrace.o(3793395646464L, 28263);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      oi localoi = (oi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3793395646464L, 28263);
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
          localoi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3793395646464L, 28263);
        return 0;
      case 2: 
        localoi.tVU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3793395646464L, 28263);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new us();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((us)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localoi.ufl = ((us)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3793395646464L, 28263);
      return 0;
    }
    GMTrace.o(3793395646464L, 28263);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */