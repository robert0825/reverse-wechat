package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apz
  extends com.tencent.mm.bm.a
{
  public aho tUS;
  public hz tUT;
  public apx tUU;
  
  public apz()
  {
    GMTrace.i(13575854751744L, 101148);
    GMTrace.o(13575854751744L, 101148);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13575988969472L, 101149);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUS != null)
      {
        paramVarArgs.fm(1, this.tUS.aYq());
        this.tUS.a(paramVarArgs);
      }
      if (this.tUU != null)
      {
        paramVarArgs.fm(2, this.tUU.aYq());
        this.tUU.a(paramVarArgs);
      }
      if (this.tUT != null)
      {
        paramVarArgs.fm(3, this.tUT.aYq());
        this.tUT.a(paramVarArgs);
      }
      GMTrace.o(13575988969472L, 101149);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tUS != null) {
        i = b.a.a.a.fj(1, this.tUS.aYq()) + 0;
      }
      paramInt = i;
      if (this.tUU != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUU.aYq());
      }
      i = paramInt;
      if (this.tUT != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUT.aYq());
      }
      GMTrace.o(13575988969472L, 101149);
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
      GMTrace.o(13575988969472L, 101149);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      apz localapz = (apz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13575988969472L, 101149);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aho();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aho)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapz.tUS = ((aho)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575988969472L, 101149);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localapz.tUU = ((apx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575988969472L, 101149);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new hz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((hz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localapz.tUT = ((hz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13575988969472L, 101149);
      return 0;
    }
    GMTrace.o(13575988969472L, 101149);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */