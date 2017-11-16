package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.bm.a
{
  public int jgO;
  public int jhA;
  public q jis;
  public p jit;
  public r jiu;
  public s jiv;
  
  public ac()
  {
    GMTrace.i(14837098741760L, 110545);
    GMTrace.o(14837098741760L, 110545);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14837232959488L, 110546);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jgO);
      paramVarArgs.fk(2, this.jhA);
      if (this.jis != null)
      {
        paramVarArgs.fm(3, this.jis.aYq());
        this.jis.a(paramVarArgs);
      }
      if (this.jit != null)
      {
        paramVarArgs.fm(4, this.jit.aYq());
        this.jit.a(paramVarArgs);
      }
      if (this.jiu != null)
      {
        paramVarArgs.fm(5, this.jiu.aYq());
        this.jiu.a(paramVarArgs);
      }
      if (this.jiv != null)
      {
        paramVarArgs.fm(6, this.jiv.aYq());
        this.jiv.a(paramVarArgs);
      }
      GMTrace.o(14837232959488L, 110546);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jgO) + 0 + b.a.a.a.fh(2, this.jhA);
      paramInt = i;
      if (this.jis != null) {
        paramInt = i + b.a.a.a.fj(3, this.jis.aYq());
      }
      i = paramInt;
      if (this.jit != null) {
        i = paramInt + b.a.a.a.fj(4, this.jit.aYq());
      }
      paramInt = i;
      if (this.jiu != null) {
        paramInt = i + b.a.a.a.fj(5, this.jiu.aYq());
      }
      i = paramInt;
      if (this.jiv != null) {
        i = paramInt + b.a.a.a.fj(6, this.jiv.aYq());
      }
      GMTrace.o(14837232959488L, 110546);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14837232959488L, 110546);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(14837232959488L, 110546);
        return -1;
      case 1: 
        localac.jgO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837232959488L, 110546);
        return 0;
      case 2: 
        localac.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14837232959488L, 110546);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localac.jis = ((q)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14837232959488L, 110546);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new p();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((p)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localac.jit = ((p)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14837232959488L, 110546);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new r();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((r)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localac.jiu = ((r)localObject1);
          paramInt += 1;
        }
        GMTrace.o(14837232959488L, 110546);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new s();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((s)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localac.jiv = ((s)localObject1);
        paramInt += 1;
      }
      GMTrace.o(14837232959488L, 110546);
      return 0;
    }
    GMTrace.o(14837232959488L, 110546);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */