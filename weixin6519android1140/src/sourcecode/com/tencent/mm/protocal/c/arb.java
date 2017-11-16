package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arb
  extends ayx
{
  public int nJ;
  public azp uHn;
  public azp uHo;
  
  public arb()
  {
    GMTrace.i(3824131506176L, 28492);
    GMTrace.o(3824131506176L, 28492);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3824265723904L, 28493);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.nJ);
      if (this.uHn != null)
      {
        paramVarArgs.fm(3, this.uHn.aYq());
        this.uHn.a(paramVarArgs);
      }
      if (this.uHo != null)
      {
        paramVarArgs.fm(4, this.uHo.aYq());
        this.uHo.a(paramVarArgs);
      }
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.nJ);
      paramInt = i;
      if (this.uHn != null) {
        paramInt = i + b.a.a.a.fj(3, this.uHn.aYq());
      }
      i = paramInt;
      if (this.uHo != null) {
        i = paramInt + b.a.a.a.fj(4, this.uHo.aYq());
      }
      GMTrace.o(3824265723904L, 28493);
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
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arb localarb = (arb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3824265723904L, 28493);
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
          localarb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3824265723904L, 28493);
        return 0;
      case 2: 
        localarb.nJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3824265723904L, 28493);
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
          localarb.uHn = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3824265723904L, 28493);
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
        localarb.uHo = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3824265723904L, 28493);
      return 0;
    }
    GMTrace.o(3824265723904L, 28493);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\arb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */