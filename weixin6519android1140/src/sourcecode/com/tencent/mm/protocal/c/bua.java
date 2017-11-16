package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class bua
  extends com.tencent.mm.bm.a
{
  public LinkedList<bhm> vcG;
  public b vcH;
  
  public bua()
  {
    GMTrace.i(3837150625792L, 28589);
    this.vcG = new LinkedList();
    GMTrace.o(3837150625792L, 28589);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3837284843520L, 28590);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.vcG);
      if (this.vcH != null) {
        paramVarArgs.b(2, this.vcH);
      }
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.vcG) + 0;
      paramInt = i;
      if (this.vcH != null) {
        paramInt = i + b.a.a.a.a(2, this.vcH);
      }
      GMTrace.o(3837284843520L, 28590);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vcG.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bua localbua = (bua)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3837284843520L, 28590);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbua.vcG.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3837284843520L, 28590);
        return 0;
      }
      localbua.vcH = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3837284843520L, 28590);
      return 0;
    }
    GMTrace.o(3837284843520L, 28590);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */