package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bm.a
{
  public LinkedList<e> pyZ;
  public LinkedList<e> pza;
  public LinkedList<e> pzb;
  public LinkedList<e> pzc;
  public LinkedList<f> pzd;
  public LinkedList<f> pze;
  
  public d()
  {
    GMTrace.i(8865349369856L, 66052);
    this.pyZ = new LinkedList();
    this.pza = new LinkedList();
    this.pzb = new LinkedList();
    this.pzc = new LinkedList();
    this.pzd = new LinkedList();
    this.pze = new LinkedList();
    GMTrace.o(8865349369856L, 66052);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8865483587584L, 66053);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.pyZ);
      paramVarArgs.d(2, 8, this.pza);
      paramVarArgs.d(3, 8, this.pzb);
      paramVarArgs.d(4, 8, this.pzc);
      paramVarArgs.d(5, 8, this.pzd);
      paramVarArgs.d(6, 8, this.pze);
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.pyZ);
      i = b.a.a.a.c(2, 8, this.pza);
      int j = b.a.a.a.c(3, 8, this.pzb);
      int k = b.a.a.a.c(4, 8, this.pzc);
      int m = b.a.a.a.c(5, 8, this.pzd);
      int n = b.a.a.a.c(6, 8, this.pze);
      GMTrace.o(8865483587584L, 66053);
      return paramInt + 0 + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.pyZ.clear();
      this.pza.clear();
      this.pzb.clear();
      this.pzc.clear();
      this.pzd.clear();
      this.pze.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(8865483587584L, 66053);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.pyZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.pza.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.pzb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.pzc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new f();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((f)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.pzd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(8865483587584L, 66053);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new f();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((f)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        locald.pze.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(8865483587584L, 66053);
      return 0;
    }
    GMTrace.o(8865483587584L, 66053);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */