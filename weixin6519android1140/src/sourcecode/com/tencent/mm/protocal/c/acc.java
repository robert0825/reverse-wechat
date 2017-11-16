package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acc
  extends ayx
{
  public String lTj;
  public LinkedList<azq> usA;
  public String usy;
  public int usz;
  
  public acc()
  {
    GMTrace.i(3850303963136L, 28687);
    this.usA = new LinkedList();
    GMTrace.o(3850303963136L, 28687);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3850438180864L, 28688);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.usy != null) {
        paramVarArgs.e(2, this.usy);
      }
      paramVarArgs.fk(3, this.usz);
      paramVarArgs.d(4, 8, this.usA);
      if (this.lTj != null) {
        paramVarArgs.e(5, this.lTj);
      }
      GMTrace.o(3850438180864L, 28688);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.usy != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.usy);
      }
      i = i + b.a.a.a.fh(3, this.usz) + b.a.a.a.c(4, 8, this.usA);
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lTj);
      }
      GMTrace.o(3850438180864L, 28688);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.usA.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3850438180864L, 28688);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acc localacc = (acc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3850438180864L, 28688);
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
          localacc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3850438180864L, 28688);
        return 0;
      case 2: 
        localacc.usy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850438180864L, 28688);
        return 0;
      case 3: 
        localacc.usz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3850438180864L, 28688);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localacc.usA.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3850438180864L, 28688);
        return 0;
      }
      localacc.lTj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3850438180864L, 28688);
      return 0;
    }
    GMTrace.o(3850438180864L, 28688);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\acc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */