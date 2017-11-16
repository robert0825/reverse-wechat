package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpe
  extends ayx
{
  public azp tTe;
  public int uKq;
  public int uYS;
  public int uYT;
  public int uYU;
  public int uYV;
  public int uYW;
  public int uhU;
  public long uhV;
  
  public bpe()
  {
    GMTrace.i(3874194718720L, 28865);
    GMTrace.o(3874194718720L, 28865);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3874328936448L, 28866);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uKq);
      paramVarArgs.fk(5, this.uYS);
      paramVarArgs.fk(6, this.uYT);
      paramVarArgs.fk(7, this.uYU);
      paramVarArgs.fk(8, this.uYV);
      paramVarArgs.fk(9, this.uYW);
      if (this.tTe != null)
      {
        paramVarArgs.fm(10, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      GMTrace.o(3874328936448L, 28866);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uhU) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.uKq) + b.a.a.a.fh(5, this.uYS) + b.a.a.a.fh(6, this.uYT) + b.a.a.a.fh(7, this.uYU) + b.a.a.a.fh(8, this.uYV) + b.a.a.a.fh(9, this.uYW);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(10, this.tTe.aYq());
      }
      GMTrace.o(3874328936448L, 28866);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3874328936448L, 28866);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpe localbpe = (bpe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3874328936448L, 28866);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpe.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 2: 
        localbpe.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 3: 
        localbpe.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 4: 
        localbpe.uKq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 5: 
        localbpe.uYS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 6: 
        localbpe.uYT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 7: 
        localbpe.uYU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 8: 
        localbpe.uYV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      case 9: 
        localbpe.uYW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3874328936448L, 28866);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbpe.tTe = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3874328936448L, 28866);
      return 0;
    }
    GMTrace.o(3874328936448L, 28866);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */