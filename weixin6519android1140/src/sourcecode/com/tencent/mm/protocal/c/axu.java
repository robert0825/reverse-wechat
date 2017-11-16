package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axu
  extends com.tencent.mm.bm.a
{
  public azq uMq;
  public int uMr;
  public LinkedList<bbb> uMs;
  
  public axu()
  {
    GMTrace.i(3726018347008L, 27761);
    this.uMs = new LinkedList();
    GMTrace.o(3726018347008L, 27761);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3726152564736L, 27762);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uMq == null) {
        throw new b("Not all required fields were included: GroupName");
      }
      if (this.uMq != null)
      {
        paramVarArgs.fm(1, this.uMq.aYq());
        this.uMq.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uMr);
      paramVarArgs.d(3, 8, this.uMs);
      GMTrace.o(3726152564736L, 27762);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uMq != null) {
        paramInt = b.a.a.a.fj(1, this.uMq.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uMr);
      int j = b.a.a.a.c(3, 8, this.uMs);
      GMTrace.o(3726152564736L, 27762);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uMs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uMq == null) {
        throw new b("Not all required fields were included: GroupName");
      }
      GMTrace.o(3726152564736L, 27762);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axu localaxu = (axu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3726152564736L, 27762);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxu.uMq = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3726152564736L, 27762);
        return 0;
      case 2: 
        localaxu.uMr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3726152564736L, 27762);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bbb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bbb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaxu.uMs.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3726152564736L, 27762);
      return 0;
    }
    GMTrace.o(3726152564736L, 27762);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */