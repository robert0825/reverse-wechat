package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ub
  extends com.tencent.mm.bm.a
{
  public int ulL;
  public LinkedList<ua> ulM;
  
  public ub()
  {
    GMTrace.i(3965060120576L, 29542);
    this.ulM = new LinkedList();
    GMTrace.o(3965060120576L, 29542);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3965194338304L, 29543);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ulL);
      paramVarArgs.d(2, 8, this.ulM);
      GMTrace.o(3965194338304L, 29543);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ulL);
      i = b.a.a.a.c(2, 8, this.ulM);
      GMTrace.o(3965194338304L, 29543);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3965194338304L, 29543);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ub localub = (ub)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3965194338304L, 29543);
        return -1;
      case 1: 
        localub.ulL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3965194338304L, 29543);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ua();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ua)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localub.ulM.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3965194338304L, 29543);
      return 0;
    }
    GMTrace.o(3965194338304L, 29543);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */