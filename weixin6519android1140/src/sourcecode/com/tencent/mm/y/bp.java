package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bp
  extends com.tencent.mm.bm.a
{
  public LinkedList<bo> gpa;
  
  public bp()
  {
    GMTrace.i(627602096128L, 4676);
    this.gpa = new LinkedList();
    GMTrace.o(627602096128L, 4676);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(627736313856L, 4677);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.gpa);
      GMTrace.o(627736313856L, 4677);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.gpa);
      GMTrace.o(627736313856L, 4677);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.gpa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(627736313856L, 4677);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bp localbp = (bp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(627736313856L, 4677);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bo();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbp.gpa.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(627736313856L, 4677);
      return 0;
    }
    GMTrace.o(627736313856L, 4677);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */