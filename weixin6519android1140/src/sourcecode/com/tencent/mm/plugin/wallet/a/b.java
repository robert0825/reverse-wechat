package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public String nDu;
  public LinkedList<c> qXq;
  
  public b()
  {
    GMTrace.i(18427154530304L, 137293);
    this.qXq = new LinkedList();
    GMTrace.o(18427154530304L, 137293);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18427288748032L, 137294);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nDu != null) {
        paramVarArgs.e(1, this.nDu);
      }
      paramVarArgs.d(2, 8, this.qXq);
      GMTrace.o(18427288748032L, 137294);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nDu != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nDu) + 0;
      }
      i = b.a.a.a.c(2, 8, this.qXq);
      GMTrace.o(18427288748032L, 137294);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18427288748032L, 137294);
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
        GMTrace.o(18427288748032L, 137294);
        return -1;
      case 1: 
        localb.nDu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(18427288748032L, 137294);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new c();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localb.qXq.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(18427288748032L, 137294);
      return 0;
    }
    GMTrace.o(18427288748032L, 137294);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */