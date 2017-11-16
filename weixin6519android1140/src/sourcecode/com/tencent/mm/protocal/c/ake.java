package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ake
  extends com.tencent.mm.bm.a
{
  public akr tPA;
  public LinkedList<aks> tPB;
  
  public ake()
  {
    GMTrace.i(3819836538880L, 28460);
    this.tPB = new LinkedList();
    GMTrace.o(3819836538880L, 28460);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3819970756608L, 28461);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPA == null) {
        throw new b("Not all required fields were included: LogHead");
      }
      if (this.tPA != null)
      {
        paramVarArgs.fm(1, this.tPA.aYq());
        this.tPA.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.tPB);
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tPA != null) {
        paramInt = b.a.a.a.fj(1, this.tPA.aYq()) + 0;
      }
      i = b.a.a.a.c(2, 8, this.tPB);
      GMTrace.o(3819970756608L, 28461);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tPB.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPA == null) {
        throw new b("Not all required fields were included: LogHead");
      }
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ake localake = (ake)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3819970756608L, 28461);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new akr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((akr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localake.tPA = ((akr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3819970756608L, 28461);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aks();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((aks)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localake.tPB.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3819970756608L, 28461);
      return 0;
    }
    GMTrace.o(3819970756608L, 28461);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */