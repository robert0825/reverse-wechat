package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ca
  extends com.tencent.mm.bm.a
{
  public g lSL;
  public bz lSM;
  public bz lSN;
  
  public ca()
  {
    GMTrace.i(12651497259008L, 94261);
    GMTrace.o(12651497259008L, 94261);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651631476736L, 94262);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSL != null)
      {
        paramVarArgs.fm(1, this.lSL.aYq());
        this.lSL.a(paramVarArgs);
      }
      if (this.lSM != null)
      {
        paramVarArgs.fm(2, this.lSM.aYq());
        this.lSM.a(paramVarArgs);
      }
      if (this.lSN != null)
      {
        paramVarArgs.fm(3, this.lSN.aYq());
        this.lSN.a(paramVarArgs);
      }
      GMTrace.o(12651631476736L, 94262);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lSL != null) {
        i = b.a.a.a.fj(1, this.lSL.aYq()) + 0;
      }
      paramInt = i;
      if (this.lSM != null) {
        paramInt = i + b.a.a.a.fj(2, this.lSM.aYq());
      }
      i = paramInt;
      if (this.lSN != null) {
        i = paramInt + b.a.a.a.fj(3, this.lSN.aYq());
      }
      GMTrace.o(12651631476736L, 94262);
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
      GMTrace.o(12651631476736L, 94262);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ca localca = (ca)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12651631476736L, 94262);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new g();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localca.lSL = ((g)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12651631476736L, 94262);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localca.lSM = ((bz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12651631476736L, 94262);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localca.lSN = ((bz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12651631476736L, 94262);
      return 0;
    }
    GMTrace.o(12651631476736L, 94262);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */