package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayh
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public LinkedList<azj> tRy;
  
  public ayh()
  {
    GMTrace.i(19141863931904L, 142618);
    this.tRy = new LinkedList();
    GMTrace.o(19141863931904L, 142618);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19141998149632L, 142619);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      paramVarArgs.d(2, 8, this.tRy);
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eBt != null) {
        paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      i = b.a.a.a.c(2, 8, this.tRy);
      GMTrace.o(19141998149632L, 142619);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tRy.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayh localayh = (ayh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19141998149632L, 142619);
        return -1;
      case 1: 
        localayh.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19141998149632L, 142619);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localayh.tRy.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(19141998149632L, 142619);
      return 0;
    }
    GMTrace.o(19141998149632L, 142619);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ayh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */