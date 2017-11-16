package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bm.a
{
  public LinkedList<h> pzl;
  public g pzm;
  
  public i()
  {
    GMTrace.i(8868839030784L, 66078);
    this.pzl = new LinkedList();
    GMTrace.o(8868839030784L, 66078);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8868973248512L, 66079);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.pzl);
      if (this.pzm != null)
      {
        paramVarArgs.fm(2, this.pzm.aYq());
        this.pzm.a(paramVarArgs);
      }
      GMTrace.o(8868973248512L, 66079);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.pzl) + 0;
      paramInt = i;
      if (this.pzm != null) {
        paramInt = i + b.a.a.a.fj(2, this.pzm.aYq());
      }
      GMTrace.o(8868973248512L, 66079);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.pzl.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(8868973248512L, 66079);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(8868973248512L, 66079);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locali.pzl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8868973248512L, 66079);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new g();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locali.pzm = ((g)localObject1);
        paramInt += 1;
      }
      GMTrace.o(8868973248512L, 66079);
      return 0;
    }
    GMTrace.o(8868973248512L, 66079);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */