package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class s
  extends com.tencent.mm.bm.a
{
  public c lPb;
  public String lPj;
  public LinkedList<x> lQg;
  
  public s()
  {
    GMTrace.i(12644786372608L, 94211);
    this.lQg = new LinkedList();
    GMTrace.o(12644786372608L, 94211);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12644920590336L, 94212);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(1, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.lQg);
      if (this.lPj != null) {
        paramVarArgs.e(3, this.lPj);
      }
      GMTrace.o(12644920590336L, 94212);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPb != null) {
        paramInt = b.a.a.a.fj(1, this.lPb.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.lQg);
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPj);
      }
      GMTrace.o(12644920590336L, 94212);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lQg.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      GMTrace.o(12644920590336L, 94212);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      s locals = (s)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12644920590336L, 94212);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locals.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12644920590336L, 94212);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new x();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((x)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locals.lQg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12644920590336L, 94212);
        return 0;
      }
      locals.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12644920590336L, 94212);
      return 0;
    }
    GMTrace.o(12644920590336L, 94212);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */