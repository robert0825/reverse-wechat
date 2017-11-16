package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sh
  extends azh
{
  public sk uim;
  public se uio;
  public sf uip;
  public String uiq;
  public int uir;
  public int uis;
  
  public sh()
  {
    GMTrace.i(3664949280768L, 27306);
    GMTrace.o(3664949280768L, 27306);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3665083498496L, 27307);
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
      if (this.uim != null)
      {
        paramVarArgs.fm(2, this.uim.aYq());
        this.uim.a(paramVarArgs);
      }
      if (this.uio != null)
      {
        paramVarArgs.fm(3, this.uio.aYq());
        this.uio.a(paramVarArgs);
      }
      if (this.uip != null)
      {
        paramVarArgs.fm(4, this.uip.aYq());
        this.uip.a(paramVarArgs);
      }
      if (this.uiq != null) {
        paramVarArgs.e(5, this.uiq);
      }
      paramVarArgs.fk(6, this.uir);
      paramVarArgs.fk(7, this.uis);
      GMTrace.o(3665083498496L, 27307);
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
      if (this.uim != null) {
        paramInt = i + b.a.a.a.fj(2, this.uim.aYq());
      }
      i = paramInt;
      if (this.uio != null) {
        i = paramInt + b.a.a.a.fj(3, this.uio.aYq());
      }
      paramInt = i;
      if (this.uip != null) {
        paramInt = i + b.a.a.a.fj(4, this.uip.aYq());
      }
      i = paramInt;
      if (this.uiq != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uiq);
      }
      paramInt = b.a.a.a.fh(6, this.uir);
      int j = b.a.a.a.fh(7, this.uis);
      GMTrace.o(3665083498496L, 27307);
      return i + paramInt + j;
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
      GMTrace.o(3665083498496L, 27307);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sh localsh = (sh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3665083498496L, 27307);
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
          localsh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3665083498496L, 27307);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsh.uim = ((sk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3665083498496L, 27307);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new se();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((se)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsh.uio = ((se)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3665083498496L, 27307);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localsh.uip = ((sf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3665083498496L, 27307);
        return 0;
      case 5: 
        localsh.uiq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3665083498496L, 27307);
        return 0;
      case 6: 
        localsh.uir = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3665083498496L, 27307);
        return 0;
      }
      localsh.uis = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3665083498496L, 27307);
      return 0;
    }
    GMTrace.o(3665083498496L, 27307);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */