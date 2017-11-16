package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ok
  extends ayx
{
  public int jNj;
  public int tOG;
  public LinkedList<any> tPE;
  public azq ufm;
  public azp ufn;
  
  public ok()
  {
    GMTrace.i(3942779977728L, 29376);
    this.tPE = new LinkedList();
    GMTrace.o(3942779977728L, 29376);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3942914195456L, 29377);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufm == null) {
        throw new b("Not all required fields were included: Topic");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufm != null)
      {
        paramVarArgs.fm(2, this.ufm.aYq());
        this.ufm.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.jNj);
      paramVarArgs.d(4, 8, this.tPE);
      paramVarArgs.fk(5, this.tOG);
      if (this.ufn != null)
      {
        paramVarArgs.fm(6, this.ufn.aYq());
        this.ufn.a(paramVarArgs);
      }
      GMTrace.o(3942914195456L, 29377);
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
      if (this.ufm != null) {
        i = paramInt + b.a.a.a.fj(2, this.ufm.aYq());
      }
      i = i + b.a.a.a.fh(3, this.jNj) + b.a.a.a.c(4, 8, this.tPE) + b.a.a.a.fh(5, this.tOG);
      paramInt = i;
      if (this.ufn != null) {
        paramInt = i + b.a.a.a.fj(6, this.ufn.aYq());
      }
      GMTrace.o(3942914195456L, 29377);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufm == null) {
        throw new b("Not all required fields were included: Topic");
      }
      GMTrace.o(3942914195456L, 29377);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ok localok = (ok)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3942914195456L, 29377);
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
          localok.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3942914195456L, 29377);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localok.ufm = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3942914195456L, 29377);
        return 0;
      case 3: 
        localok.jNj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3942914195456L, 29377);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new any();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((any)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localok.tPE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3942914195456L, 29377);
        return 0;
      case 5: 
        localok.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3942914195456L, 29377);
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
        localok.ufn = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3942914195456L, 29377);
      return 0;
    }
    GMTrace.o(3942914195456L, 29377);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */