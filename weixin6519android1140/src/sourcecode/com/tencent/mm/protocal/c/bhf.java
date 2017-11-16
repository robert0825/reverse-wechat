package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bhf
  extends com.tencent.mm.bm.a
{
  public bhg uTb;
  public bhe uTc;
  public bhd uTd;
  
  public bhf()
  {
    GMTrace.i(3936874397696L, 29332);
    GMTrace.o(3936874397696L, 29332);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3937008615424L, 29333);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uTb != null)
      {
        paramVarArgs.fm(1, this.uTb.aYq());
        this.uTb.a(paramVarArgs);
      }
      if (this.uTc != null)
      {
        paramVarArgs.fm(2, this.uTc.aYq());
        this.uTc.a(paramVarArgs);
      }
      if (this.uTd != null)
      {
        paramVarArgs.fm(3, this.uTd.aYq());
        this.uTd.a(paramVarArgs);
      }
      GMTrace.o(3937008615424L, 29333);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uTb != null) {
        i = b.a.a.a.fj(1, this.uTb.aYq()) + 0;
      }
      paramInt = i;
      if (this.uTc != null) {
        paramInt = i + b.a.a.a.fj(2, this.uTc.aYq());
      }
      i = paramInt;
      if (this.uTd != null) {
        i = paramInt + b.a.a.a.fj(3, this.uTd.aYq());
      }
      GMTrace.o(3937008615424L, 29333);
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
      GMTrace.o(3937008615424L, 29333);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bhf localbhf = (bhf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3937008615424L, 29333);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhg();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhg)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbhf.uTb = ((bhg)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937008615424L, 29333);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhe();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhe)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbhf.uTc = ((bhe)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937008615424L, 29333);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bhd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbhf.uTd = ((bhd)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3937008615424L, 29333);
      return 0;
    }
    GMTrace.o(3937008615424L, 29333);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */