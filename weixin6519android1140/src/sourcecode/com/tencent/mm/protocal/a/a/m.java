package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class m
  extends com.tencent.mm.bm.a
{
  public int tLJ;
  public int tLK;
  public LinkedList<n> tLL;
  
  public m()
  {
    GMTrace.i(13101663518720L, 97615);
    this.tLL = new LinkedList();
    GMTrace.o(13101663518720L, 97615);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13101797736448L, 97616);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLJ);
      paramVarArgs.fk(2, this.tLK);
      paramVarArgs.d(3, 8, this.tLL);
      GMTrace.o(13101797736448L, 97616);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tLJ);
      i = b.a.a.a.fh(2, this.tLK);
      int j = b.a.a.a.c(3, 8, this.tLL);
      GMTrace.o(13101797736448L, 97616);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13101797736448L, 97616);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13101797736448L, 97616);
        return -1;
      case 1: 
        localm.tLJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13101797736448L, 97616);
        return 0;
      case 2: 
        localm.tLK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13101797736448L, 97616);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new n();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((n)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localm.tLL.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13101797736448L, 97616);
      return 0;
    }
    GMTrace.o(13101797736448L, 97616);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */