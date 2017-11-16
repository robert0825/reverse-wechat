package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class agq
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public LinkedList<anu> ueW;
  
  public agq()
  {
    GMTrace.i(3678773706752L, 27409);
    this.ueW = new LinkedList();
    GMTrace.o(3678773706752L, 27409);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3678907924480L, 27410);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      paramVarArgs.d(2, 8, this.ueW);
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPi != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lPi) + 0;
      }
      i = b.a.a.a.c(2, 8, this.ueW);
      GMTrace.o(3678907924480L, 27410);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ueW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      agq localagq = (agq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3678907924480L, 27410);
        return -1;
      case 1: 
        localagq.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3678907924480L, 27410);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new anu();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((anu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localagq.ueW.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3678907924480L, 27410);
      return 0;
    }
    GMTrace.o(3678907924480L, 27410);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\agq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */