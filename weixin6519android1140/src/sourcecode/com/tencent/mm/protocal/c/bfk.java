package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfk
  extends com.tencent.mm.bm.a
{
  public int lQF;
  public long tXT;
  public azp uHZ;
  
  public bfk()
  {
    GMTrace.i(3681994932224L, 27433);
    GMTrace.o(3681994932224L, 27433);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3682129149952L, 27434);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.tXT);
      paramVarArgs.fk(2, this.lQF);
      if (this.uHZ != null)
      {
        paramVarArgs.fm(3, this.uHZ.aYq());
        this.uHZ.a(paramVarArgs);
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.tXT) + 0 + b.a.a.a.fh(2, this.lQF);
      paramInt = i;
      if (this.uHZ != null) {
        paramInt = i + b.a.a.a.fj(3, this.uHZ.aYq());
      }
      GMTrace.o(3682129149952L, 27434);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfk localbfk = (bfk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3682129149952L, 27434);
        return -1;
      case 1: 
        localbfk.tXT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3682129149952L, 27434);
        return 0;
      case 2: 
        localbfk.lQF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3682129149952L, 27434);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbfk.uHZ = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3682129149952L, 27434);
      return 0;
    }
    GMTrace.o(3682129149952L, 27434);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */