package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnq
  extends ayx
{
  public azp tUK;
  public int uME;
  public int uMG;
  public bnw uXz;
  public String uuN;
  
  public bnq()
  {
    GMTrace.i(3704006639616L, 27597);
    GMTrace.o(3704006639616L, 27597);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3704140857344L, 27598);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXz == null) {
        throw new b("Not all required fields were included: Piece");
      }
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uXz != null)
      {
        paramVarArgs.fm(2, this.uXz.aYq());
        this.uXz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uME);
      paramVarArgs.fk(4, this.uMG);
      if (this.uuN != null) {
        paramVarArgs.e(5, this.uuN);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(6, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(3704140857344L, 27598);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uXz != null) {
        i = paramInt + b.a.a.a.fj(2, this.uXz.aYq());
      }
      i = i + b.a.a.a.fh(3, this.uME) + b.a.a.a.fh(4, this.uMG);
      paramInt = i;
      if (this.uuN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uuN);
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(6, this.tUK.aYq());
      }
      GMTrace.o(3704140857344L, 27598);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXz == null) {
        throw new b("Not all required fields were included: Piece");
      }
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      GMTrace.o(3704140857344L, 27598);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnq localbnq = (bnq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3704140857344L, 27598);
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
          localbnq.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3704140857344L, 27598);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnq.uXz = ((bnw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3704140857344L, 27598);
        return 0;
      case 3: 
        localbnq.uME = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3704140857344L, 27598);
        return 0;
      case 4: 
        localbnq.uMG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3704140857344L, 27598);
        return 0;
      case 5: 
        localbnq.uuN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3704140857344L, 27598);
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
        localbnq.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3704140857344L, 27598);
      return 0;
    }
    GMTrace.o(3704140857344L, 27598);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */