package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class k
  extends com.tencent.mm.bm.a
{
  public int tLA;
  public LinkedList<l> tLB;
  
  public k()
  {
    GMTrace.i(13100589776896L, 97607);
    this.tLB = new LinkedList();
    GMTrace.o(13100589776896L, 97607);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13100723994624L, 97608);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLA);
      paramVarArgs.d(2, 8, this.tLB);
      GMTrace.o(13100723994624L, 97608);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tLA);
      i = b.a.a.a.c(2, 8, this.tLB);
      GMTrace.o(13100723994624L, 97608);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLB.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13100723994624L, 97608);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      k localk = (k)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13100723994624L, 97608);
        return -1;
      case 1: 
        localk.tLA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13100723994624L, 97608);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new l();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((l)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localk.tLB.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13100723994624L, 97608);
      return 0;
    }
    GMTrace.o(13100723994624L, 97608);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */