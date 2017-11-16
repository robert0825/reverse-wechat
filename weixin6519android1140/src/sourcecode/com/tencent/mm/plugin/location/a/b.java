package com.tencent.mm.plugin.location.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public LinkedList<a> mwE;
  public String mwF;
  
  public b()
  {
    GMTrace.i(9724745482240L, 72455);
    this.mwE = new LinkedList();
    GMTrace.o(9724745482240L, 72455);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9724879699968L, 72456);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.mwE);
      if (this.mwF != null) {
        paramVarArgs.e(2, this.mwF);
      }
      GMTrace.o(9724879699968L, 72456);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.mwE) + 0;
      paramInt = i;
      if (this.mwF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mwF);
      }
      GMTrace.o(9724879699968L, 72456);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mwE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(9724879699968L, 72456);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(9724879699968L, 72456);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localb.mwE.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(9724879699968L, 72456);
        return 0;
      }
      localb.mwF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(9724879699968L, 72456);
      return 0;
    }
    GMTrace.o(9724879699968L, 72456);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */