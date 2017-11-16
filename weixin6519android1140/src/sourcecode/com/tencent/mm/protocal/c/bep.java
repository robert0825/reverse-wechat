package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bep
  extends com.tencent.mm.bm.a
{
  public azq uQa;
  public long uQi;
  
  public bep()
  {
    GMTrace.i(3974455361536L, 29612);
    GMTrace.o(3974455361536L, 29612);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3974589579264L, 29613);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.uQi);
      if (this.uQa != null)
      {
        paramVarArgs.fm(2, this.uQa.aYq());
        this.uQa.a(paramVarArgs);
      }
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.uQi) + 0;
      paramInt = i;
      if (this.uQa != null) {
        paramInt = i + b.a.a.a.fj(2, this.uQa.aYq());
      }
      GMTrace.o(3974589579264L, 29613);
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
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bep localbep = (bep)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3974589579264L, 29613);
        return -1;
      case 1: 
        localbep.uQi = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3974589579264L, 29613);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbep.uQa = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3974589579264L, 29613);
      return 0;
    }
    GMTrace.o(3974589579264L, 29613);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */