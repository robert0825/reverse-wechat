package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ca
  extends com.tencent.mm.bm.a
{
  public bem tQn;
  public azq tQo;
  
  public ca()
  {
    GMTrace.i(4000359383040L, 29805);
    GMTrace.o(4000359383040L, 29805);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4000493600768L, 29806);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQn == null) {
        throw new b("Not all required fields were included: SnsADObject");
      }
      if (this.tQn != null)
      {
        paramVarArgs.fm(1, this.tQn.aYq());
        this.tQn.a(paramVarArgs);
      }
      if (this.tQo != null)
      {
        paramVarArgs.fm(2, this.tQo.aYq());
        this.tQo.a(paramVarArgs);
      }
      GMTrace.o(4000493600768L, 29806);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tQn != null) {
        paramInt = b.a.a.a.fj(1, this.tQn.aYq()) + 0;
      }
      i = paramInt;
      if (this.tQo != null) {
        i = paramInt + b.a.a.a.fj(2, this.tQo.aYq());
      }
      GMTrace.o(4000493600768L, 29806);
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
      if (this.tQn == null) {
        throw new b("Not all required fields were included: SnsADObject");
      }
      GMTrace.o(4000493600768L, 29806);
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
        GMTrace.o(4000493600768L, 29806);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bem();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bem)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localca.tQn = ((bem)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4000493600768L, 29806);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localca.tQo = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4000493600768L, 29806);
      return 0;
    }
    GMTrace.o(4000493600768L, 29806);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */