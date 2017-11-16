package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tx
  extends com.tencent.mm.bm.a
{
  public azp tZA;
  public int tZz;
  
  public tx()
  {
    GMTrace.i(3771920809984L, 28103);
    GMTrace.o(3771920809984L, 28103);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3772055027712L, 28104);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      paramVarArgs.fk(1, this.tZz);
      if (this.tZA != null)
      {
        paramVarArgs.fm(3, this.tZA.aYq());
        this.tZA.a(paramVarArgs);
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tZz) + 0;
      paramInt = i;
      if (this.tZA != null) {
        paramInt = i + b.a.a.a.fj(3, this.tZA.aYq());
      }
      GMTrace.o(3772055027712L, 28104);
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
      if (this.tZA == null) {
        throw new b("Not all required fields were included: KeyBuf");
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tx localtx = (tx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      default: 
        GMTrace.o(3772055027712L, 28104);
        return -1;
      case 1: 
        localtx.tZz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3772055027712L, 28104);
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
        localtx.tZA = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3772055027712L, 28104);
      return 0;
    }
    GMTrace.o(3772055027712L, 28104);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\tx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */