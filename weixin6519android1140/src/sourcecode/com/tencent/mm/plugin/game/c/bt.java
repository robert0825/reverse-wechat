package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bt
  extends com.tencent.mm.bm.a
{
  public String lQd;
  public bu lSv;
  public bu lSw;
  public bu lSx;
  public bu lSy;
  
  public bt()
  {
    GMTrace.i(12647202291712L, 94229);
    GMTrace.o(12647202291712L, 94229);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12647336509440L, 94230);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSv != null)
      {
        paramVarArgs.fm(1, this.lSv.aYq());
        this.lSv.a(paramVarArgs);
      }
      if (this.lSw != null)
      {
        paramVarArgs.fm(2, this.lSw.aYq());
        this.lSw.a(paramVarArgs);
      }
      if (this.lSx != null)
      {
        paramVarArgs.fm(3, this.lSx.aYq());
        this.lSx.a(paramVarArgs);
      }
      if (this.lSy != null)
      {
        paramVarArgs.fm(4, this.lSy.aYq());
        this.lSy.a(paramVarArgs);
      }
      if (this.lQd != null) {
        paramVarArgs.e(5, this.lQd);
      }
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lSv != null) {
        i = b.a.a.a.fj(1, this.lSv.aYq()) + 0;
      }
      paramInt = i;
      if (this.lSw != null) {
        paramInt = i + b.a.a.a.fj(2, this.lSw.aYq());
      }
      i = paramInt;
      if (this.lSx != null) {
        i = paramInt + b.a.a.a.fj(3, this.lSx.aYq());
      }
      paramInt = i;
      if (this.lSy != null) {
        paramInt = i + b.a.a.a.fj(4, this.lSy.aYq());
      }
      i = paramInt;
      if (this.lQd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lQd);
      }
      GMTrace.o(12647336509440L, 94230);
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
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bt localbt = (bt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12647336509440L, 94230);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbt.lSv = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbt.lSw = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbt.lSx = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbt.lSy = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12647336509440L, 94230);
        return 0;
      }
      localbt.lQd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12647336509440L, 94230);
      return 0;
    }
    GMTrace.o(12647336509440L, 94230);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */