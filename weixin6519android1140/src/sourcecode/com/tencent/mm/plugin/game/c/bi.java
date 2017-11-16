package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bi
  extends com.tencent.mm.bm.a
{
  public ch lSd;
  public bt lSe;
  public o lSf;
  
  public bi()
  {
    GMTrace.i(12653913178112L, 94279);
    GMTrace.o(12653913178112L, 94279);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12654047395840L, 94280);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSd != null)
      {
        paramVarArgs.fm(1, this.lSd.aYq());
        this.lSd.a(paramVarArgs);
      }
      if (this.lSe != null)
      {
        paramVarArgs.fm(2, this.lSe.aYq());
        this.lSe.a(paramVarArgs);
      }
      if (this.lSf != null)
      {
        paramVarArgs.fm(3, this.lSf.aYq());
        this.lSf.a(paramVarArgs);
      }
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lSd != null) {
        i = b.a.a.a.fj(1, this.lSd.aYq()) + 0;
      }
      paramInt = i;
      if (this.lSe != null) {
        paramInt = i + b.a.a.a.fj(2, this.lSe.aYq());
      }
      i = paramInt;
      if (this.lSf != null) {
        i = paramInt + b.a.a.a.fj(3, this.lSf.aYq());
      }
      GMTrace.o(12654047395840L, 94280);
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
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bi localbi = (bi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12654047395840L, 94280);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ch();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ch)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbi.lSd = ((ch)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12654047395840L, 94280);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bt();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bt)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbi.lSe = ((bt)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12654047395840L, 94280);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new o();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbi.lSf = ((o)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12654047395840L, 94280);
      return 0;
    }
    GMTrace.o(12654047395840L, 94280);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */