package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class beo
  extends azh
{
  public bfv uMn;
  public azp uQg;
  public bem uQh;
  
  public beo()
  {
    GMTrace.i(3715012493312L, 27679);
    GMTrace.o(3715012493312L, 27679);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715146711040L, 27680);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uQh != null)
      {
        paramVarArgs.fm(2, this.uQh.aYq());
        this.uQh.a(paramVarArgs);
      }
      if (this.uQg != null)
      {
        paramVarArgs.fm(3, this.uQg.aYq());
        this.uQg.a(paramVarArgs);
      }
      if (this.uMn != null)
      {
        paramVarArgs.fm(4, this.uMn.aYq());
        this.uMn.a(paramVarArgs);
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uQh != null) {
        paramInt = i + b.a.a.a.fj(2, this.uQh.aYq());
      }
      i = paramInt;
      if (this.uQg != null) {
        i = paramInt + b.a.a.a.fj(3, this.uQg.aYq());
      }
      paramInt = i;
      if (this.uMn != null) {
        paramInt = i + b.a.a.a.fj(4, this.uMn.aYq());
      }
      GMTrace.o(3715146711040L, 27680);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      beo localbeo = (beo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3715146711040L, 27680);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbeo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bem();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bem)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbeo.uQh = ((bem)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbeo.uQg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3715146711040L, 27680);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bfv();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bfv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbeo.uMn = ((bfv)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3715146711040L, 27680);
      return 0;
    }
    GMTrace.o(3715146711040L, 27680);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\beo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */