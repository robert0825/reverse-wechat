package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bm.a
{
  public LinkedList<d> gPX;
  public double gPY;
  
  public f()
  {
    GMTrace.i(12943957688320L, 96440);
    this.gPX = new LinkedList();
    GMTrace.o(12943957688320L, 96440);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12944091906048L, 96441);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.gPX);
      paramVarArgs.a(2, this.gPY);
      GMTrace.o(12944091906048L, 96441);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.gPX);
      i = b.a.a.b.b.a.cK(2);
      GMTrace.o(12944091906048L, 96441);
      return paramInt + 0 + (i + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.gPX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12944091906048L, 96441);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12944091906048L, 96441);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.gPX.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12944091906048L, 96441);
        return 0;
      }
      localf.gPY = ((b.a.a.a.a)localObject1).yqV.readDouble();
      GMTrace.o(12944091906048L, 96441);
      return 0;
    }
    GMTrace.o(12944091906048L, 96441);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */