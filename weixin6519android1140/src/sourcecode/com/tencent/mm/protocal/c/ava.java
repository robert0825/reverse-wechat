package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ava
  extends com.tencent.mm.bm.a
{
  public int mka;
  public LinkedList<avj> uKw;
  public int uhU;
  public long uhV;
  
  public ava()
  {
    GMTrace.i(3667633635328L, 27326);
    this.uKw = new LinkedList();
    GMTrace.o(3667633635328L, 27326);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3667767853056L, 27327);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uhU);
      paramVarArgs.T(2, this.uhV);
      paramVarArgs.d(3, 8, this.uKw);
      paramVarArgs.fk(4, this.mka);
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uhU);
      i = b.a.a.a.S(2, this.uhV);
      int j = b.a.a.a.c(3, 8, this.uKw);
      int k = b.a.a.a.fh(4, this.mka);
      GMTrace.o(3667767853056L, 27327);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uKw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ava localava = (ava)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3667767853056L, 27327);
        return -1;
      case 1: 
        localava.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3667767853056L, 27327);
        return 0;
      case 2: 
        localava.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3667767853056L, 27327);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new avj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((avj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localava.uKw.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3667767853056L, 27327);
        return 0;
      }
      localava.mka = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3667767853056L, 27327);
      return 0;
    }
    GMTrace.o(3667767853056L, 27327);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ava.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */