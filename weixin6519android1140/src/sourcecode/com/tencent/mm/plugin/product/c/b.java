package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public LinkedList<i> nIq;
  public String name;
  
  public b()
  {
    GMTrace.i(6039126671360L, 44995);
    this.nIq = new LinkedList();
    GMTrace.o(6039126671360L, 44995);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6039260889088L, 44996);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.e(1, this.name);
      }
      paramVarArgs.d(2, 8, this.nIq);
      GMTrace.o(6039260889088L, 44996);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.name != null) {
        paramInt = b.a.a.b.b.a.f(1, this.name) + 0;
      }
      i = b.a.a.a.c(2, 8, this.nIq);
      GMTrace.o(6039260889088L, 44996);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nIq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6039260889088L, 44996);
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
        GMTrace.o(6039260889088L, 44996);
        return -1;
      case 1: 
        localb.name = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6039260889088L, 44996);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new i();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((i)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localb.nIq.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(6039260889088L, 44996);
      return 0;
    }
    GMTrace.o(6039260889088L, 44996);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */