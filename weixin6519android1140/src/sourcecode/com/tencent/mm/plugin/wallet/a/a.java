package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public LinkedList<b> qXo;
  public k qXp;
  
  public a()
  {
    GMTrace.i(18427422965760L, 137295);
    this.qXo = new LinkedList();
    GMTrace.o(18427422965760L, 137295);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18427557183488L, 137296);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.qXo);
      if (this.qXp != null)
      {
        paramVarArgs.fm(2, this.qXp.aYq());
        this.qXp.a(paramVarArgs);
      }
      GMTrace.o(18427557183488L, 137296);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.qXo) + 0;
      paramInt = i;
      if (this.qXp != null) {
        paramInt = i + b.a.a.a.fj(2, this.qXp.aYq());
      }
      GMTrace.o(18427557183488L, 137296);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXo.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18427557183488L, 137296);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(18427557183488L, 137296);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locala.qXo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(18427557183488L, 137296);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new k();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locala.qXp = ((k)localObject1);
        paramInt += 1;
      }
      GMTrace.o(18427557183488L, 137296);
      return 0;
    }
    GMTrace.o(18427557183488L, 137296);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */