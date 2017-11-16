package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class py
  extends com.tencent.mm.bm.a
{
  public int ufU;
  public pz ufV;
  public int ufW;
  public pz ufX;
  
  public py()
  {
    GMTrace.i(13341376380928L, 99401);
    GMTrace.o(13341376380928L, 99401);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13341510598656L, 99402);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufV == null) {
        throw new b("Not all required fields were included: NightTime");
      }
      if (this.ufX == null) {
        throw new b("Not all required fields were included: AllDayTime");
      }
      paramVarArgs.fk(1, this.ufU);
      if (this.ufV != null)
      {
        paramVarArgs.fm(2, this.ufV.aYq());
        this.ufV.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.ufW);
      if (this.ufX != null)
      {
        paramVarArgs.fm(4, this.ufX.aYq());
        this.ufX.a(paramVarArgs);
      }
      GMTrace.o(13341510598656L, 99402);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.ufU) + 0;
      paramInt = i;
      if (this.ufV != null) {
        paramInt = i + b.a.a.a.fj(2, this.ufV.aYq());
      }
      i = paramInt + b.a.a.a.fh(3, this.ufW);
      paramInt = i;
      if (this.ufX != null) {
        paramInt = i + b.a.a.a.fj(4, this.ufX.aYq());
      }
      GMTrace.o(13341510598656L, 99402);
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
      if (this.ufV == null) {
        throw new b("Not all required fields were included: NightTime");
      }
      if (this.ufX == null) {
        throw new b("Not all required fields were included: AllDayTime");
      }
      GMTrace.o(13341510598656L, 99402);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      py localpy = (py)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13341510598656L, 99402);
        return -1;
      case 1: 
        localpy.ufU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13341510598656L, 99402);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localpy.ufV = ((pz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13341510598656L, 99402);
        return 0;
      case 3: 
        localpy.ufW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13341510598656L, 99402);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new pz();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((pz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localpy.ufX = ((pz)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13341510598656L, 99402);
      return 0;
    }
    GMTrace.o(13341510598656L, 99402);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */