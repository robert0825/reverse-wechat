package com.tencent.mm.bt;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public LinkedList<d> vnh;
  public LinkedList<c> vni;
  
  public a()
  {
    GMTrace.i(4522063691776L, 33692);
    this.vnh = new LinkedList();
    this.vni = new LinkedList();
    GMTrace.o(4522063691776L, 33692);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4522197909504L, 33693);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(3, 8, this.vnh);
      paramVarArgs.d(4, 8, this.vni);
      GMTrace.o(4522197909504L, 33693);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(3, 8, this.vnh);
      i = b.a.a.a.c(4, 8, this.vni);
      GMTrace.o(4522197909504L, 33693);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vnh.clear();
      this.vni.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4522197909504L, 33693);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4522197909504L, 33693);
        return -1;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locala.vnh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4522197909504L, 33693);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new c();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locala.vni.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4522197909504L, 33693);
      return 0;
    }
    GMTrace.o(4522197909504L, 33693);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */