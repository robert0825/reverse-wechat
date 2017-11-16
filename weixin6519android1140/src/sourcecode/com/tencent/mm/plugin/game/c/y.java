package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class y
  extends com.tencent.mm.bm.a
{
  public bd lQv;
  public bd lQw;
  public bd lQx;
  public cb lQy;
  
  public y()
  {
    GMTrace.i(12653376307200L, 94275);
    GMTrace.o(12653376307200L, 94275);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12653510524928L, 94276);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQv != null)
      {
        paramVarArgs.fm(1, this.lQv.aYq());
        this.lQv.a(paramVarArgs);
      }
      if (this.lQw != null)
      {
        paramVarArgs.fm(2, this.lQw.aYq());
        this.lQw.a(paramVarArgs);
      }
      if (this.lQx != null)
      {
        paramVarArgs.fm(3, this.lQx.aYq());
        this.lQx.a(paramVarArgs);
      }
      if (this.lQy != null)
      {
        paramVarArgs.fm(4, this.lQy.aYq());
        this.lQy.a(paramVarArgs);
      }
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lQv != null) {
        i = b.a.a.a.fj(1, this.lQv.aYq()) + 0;
      }
      paramInt = i;
      if (this.lQw != null) {
        paramInt = i + b.a.a.a.fj(2, this.lQw.aYq());
      }
      i = paramInt;
      if (this.lQx != null) {
        i = paramInt + b.a.a.a.fj(3, this.lQx.aYq());
      }
      paramInt = i;
      if (this.lQy != null) {
        paramInt = i + b.a.a.a.fj(4, this.lQy.aYq());
      }
      GMTrace.o(12653510524928L, 94276);
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
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      y localy = (y)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12653510524928L, 94276);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localy.lQv = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localy.lQw = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localy.lQx = ((bd)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12653510524928L, 94276);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localy.lQy = ((cb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12653510524928L, 94276);
      return 0;
    }
    GMTrace.o(12653510524928L, 94276);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */