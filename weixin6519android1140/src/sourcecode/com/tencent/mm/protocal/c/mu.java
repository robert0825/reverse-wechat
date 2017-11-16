package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mu
  extends ayx
{
  public int tPV;
  public long tQd;
  public int tRC;
  public String udw;
  public bnv udx;
  
  public mu()
  {
    GMTrace.i(3672733908992L, 27364);
    GMTrace.o(3672733908992L, 27364);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3672868126720L, 27365);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.udw != null) {
        paramVarArgs.e(2, this.udw);
      }
      paramVarArgs.fk(3, this.tRC);
      paramVarArgs.fk(4, this.tPV);
      if (this.udx != null)
      {
        paramVarArgs.fm(5, this.udx.aYq());
        this.udx.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.tQd);
      GMTrace.o(3672868126720L, 27365);
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
      if (this.udw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.udw);
      }
      i = i + b.a.a.a.fh(3, this.tRC) + b.a.a.a.fh(4, this.tPV);
      paramInt = i;
      if (this.udx != null) {
        paramInt = i + b.a.a.a.fj(5, this.udx.aYq());
      }
      i = b.a.a.a.S(6, this.tQd);
      GMTrace.o(3672868126720L, 27365);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3672868126720L, 27365);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mu localmu = (mu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3672868126720L, 27365);
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
          localmu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3672868126720L, 27365);
        return 0;
      case 2: 
        localmu.udw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3672868126720L, 27365);
        return 0;
      case 3: 
        localmu.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3672868126720L, 27365);
        return 0;
      case 4: 
        localmu.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3672868126720L, 27365);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localmu.udx = ((bnv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3672868126720L, 27365);
        return 0;
      }
      localmu.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3672868126720L, 27365);
      return 0;
    }
    GMTrace.o(3672868126720L, 27365);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\mu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */