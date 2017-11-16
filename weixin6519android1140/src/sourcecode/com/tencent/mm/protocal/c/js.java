package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class js
  extends ayx
{
  public azp tZA;
  public alh tZB;
  public int tZC;
  public int tZz;
  
  public js()
  {
    GMTrace.i(3621731172352L, 26984);
    GMTrace.o(3621731172352L, 26984);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621865390080L, 26985);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tZz);
      if (this.tZA != null)
      {
        paramVarArgs.fm(3, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      if (this.tZB != null)
      {
        paramVarArgs.fm(4, this.tZB.aYq());
        this.tZB.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.tZC);
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tZz);
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(3, this.tZA.aYq());
      }
      i = paramInt;
      if (this.tZB != null) {
        i = paramInt + b.a.a.a.fj(4, this.tZB.aYq());
      }
      paramInt = b.a.a.a.fh(5, this.tZC);
      GMTrace.o(3621865390080L, 26985);
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
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      js localjs = (js)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3621865390080L, 26985);
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
          localjs.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      case 2: 
        localjs.tZz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3621865390080L, 26985);
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
          localjs.tZA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localjs.tZB = ((alh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621865390080L, 26985);
        return 0;
      }
      localjs.tZC = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3621865390080L, 26985);
      return 0;
    }
    GMTrace.o(3621865390080L, 26985);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */