package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public int jib;
  public c lPb;
  public a lPe;
  public String lPf;
  
  public b()
  {
    GMTrace.i(12641833582592L, 94189);
    GMTrace.o(12641833582592L, 94189);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12641967800320L, 94190);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      if (this.lPb != null)
      {
        paramVarArgs.fm(2, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lPe != null)
      {
        paramVarArgs.fm(3, this.lPe.aYq());
        this.lPe.a(paramVarArgs);
      }
      if (this.lPf != null) {
        paramVarArgs.e(4, this.lPf);
      }
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.lPb != null) {
        paramInt = i + b.a.a.a.fj(2, this.lPb.aYq());
      }
      i = paramInt;
      if (this.lPe != null) {
        i = paramInt + b.a.a.a.fj(3, this.lPe.aYq());
      }
      paramInt = i;
      if (this.lPf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPf);
      }
      GMTrace.o(12641967800320L, 94190);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12641967800320L, 94190);
        return -1;
      case 1: 
        localb.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12641967800320L, 94190);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localb.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641967800320L, 94190);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localb.lPe = ((a)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12641967800320L, 94190);
        return 0;
      }
      localb.lPf = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12641967800320L, 94190);
      return 0;
    }
    GMTrace.o(12641967800320L, 94190);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */