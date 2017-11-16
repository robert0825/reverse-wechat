package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ng
  extends com.tencent.mm.bm.a
{
  public int uee;
  public LinkedList<nf> uef;
  
  public ng()
  {
    GMTrace.i(19113946644480L, 142410);
    this.uef = new LinkedList();
    GMTrace.o(19113946644480L, 142410);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19114080862208L, 142411);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uee);
      paramVarArgs.d(2, 8, this.uef);
      GMTrace.o(19114080862208L, 142411);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uee);
      i = b.a.a.a.c(2, 8, this.uef);
      GMTrace.o(19114080862208L, 142411);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uef.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19114080862208L, 142411);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ng localng = (ng)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19114080862208L, 142411);
        return -1;
      case 1: 
        localng.uee = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19114080862208L, 142411);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new nf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((nf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localng.uef.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(19114080862208L, 142411);
      return 0;
    }
    GMTrace.o(19114080862208L, 142411);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */