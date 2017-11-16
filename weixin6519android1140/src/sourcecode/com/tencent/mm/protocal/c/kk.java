package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kk
  extends com.tencent.mm.bm.a
{
  public kj ubi;
  public kj ubj;
  public kj ubk;
  public kj ubl;
  public kj ubm;
  
  public kk()
  {
    GMTrace.i(3807220072448L, 28366);
    GMTrace.o(3807220072448L, 28366);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3807354290176L, 28367);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ubi != null)
      {
        paramVarArgs.fm(1, this.ubi.aYq());
        this.ubi.a(paramVarArgs);
      }
      if (this.ubj != null)
      {
        paramVarArgs.fm(2, this.ubj.aYq());
        this.ubj.a(paramVarArgs);
      }
      if (this.ubk != null)
      {
        paramVarArgs.fm(3, this.ubk.aYq());
        this.ubk.a(paramVarArgs);
      }
      if (this.ubl != null)
      {
        paramVarArgs.fm(4, this.ubl.aYq());
        this.ubl.a(paramVarArgs);
      }
      if (this.ubm != null)
      {
        paramVarArgs.fm(5, this.ubm.aYq());
        this.ubm.a(paramVarArgs);
      }
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.ubi != null) {
        i = b.a.a.a.fj(1, this.ubi.aYq()) + 0;
      }
      paramInt = i;
      if (this.ubj != null) {
        paramInt = i + b.a.a.a.fj(2, this.ubj.aYq());
      }
      i = paramInt;
      if (this.ubk != null) {
        i = paramInt + b.a.a.a.fj(3, this.ubk.aYq());
      }
      paramInt = i;
      if (this.ubl != null) {
        paramInt = i + b.a.a.a.fj(4, this.ubl.aYq());
      }
      i = paramInt;
      if (this.ubm != null) {
        i = paramInt + b.a.a.a.fj(5, this.ubm.aYq());
      }
      GMTrace.o(3807354290176L, 28367);
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
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kk localkk = (kk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3807354290176L, 28367);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localkk.ubi = ((kj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localkk.ubj = ((kj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localkk.ubk = ((kj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new kj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((kj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localkk.ubl = ((kj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3807354290176L, 28367);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new kj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((kj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localkk.ubm = ((kj)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3807354290176L, 28367);
      return 0;
    }
    GMTrace.o(3807354290176L, 28367);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */