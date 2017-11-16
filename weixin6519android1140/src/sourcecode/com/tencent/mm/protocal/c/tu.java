package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tu
  extends com.tencent.mm.bm.a
{
  public int lQF;
  public String ulE;
  public LinkedList<tr> ulF;
  public tr ulG;
  
  public tu()
  {
    GMTrace.i(20969372516352L, 156234);
    this.ulF = new LinkedList();
    GMTrace.o(20969372516352L, 156234);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20969506734080L, 156235);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lQF);
      if (this.ulE != null) {
        paramVarArgs.e(2, this.ulE);
      }
      paramVarArgs.d(3, 8, this.ulF);
      if (this.ulG != null)
      {
        paramVarArgs.fm(4, this.ulG.aYq());
        this.ulG.a(paramVarArgs);
      }
      GMTrace.o(20969506734080L, 156235);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.lQF) + 0;
      paramInt = i;
      if (this.ulE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ulE);
      }
      i = paramInt + b.a.a.a.c(3, 8, this.ulF);
      paramInt = i;
      if (this.ulG != null) {
        paramInt = i + b.a.a.a.fj(4, this.ulG.aYq());
      }
      GMTrace.o(20969506734080L, 156235);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulF.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20969506734080L, 156235);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tu localtu = (tu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20969506734080L, 156235);
        return -1;
      case 1: 
        localtu.lQF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20969506734080L, 156235);
        return 0;
      case 2: 
        localtu.ulE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20969506734080L, 156235);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localtu.ulF.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20969506734080L, 156235);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new tr();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((tr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localtu.ulG = ((tr)localObject1);
        paramInt += 1;
      }
      GMTrace.o(20969506734080L, 156235);
      return 0;
    }
    GMTrace.o(20969506734080L, 156235);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */