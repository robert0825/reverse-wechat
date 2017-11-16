package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class azy
  extends ayx
{
  public int tOG;
  public aua uNX;
  public float uNY;
  public float uNZ;
  
  public azy()
  {
    GMTrace.i(3952980525056L, 29452);
    GMTrace.o(3952980525056L, 29452);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3953114742784L, 29453);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNX == null) {
        throw new b("Not all required fields were included: UserPos");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uNX != null)
      {
        paramVarArgs.fm(2, this.uNX.aYq());
        this.uNX.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tOG);
      paramVarArgs.n(4, this.uNY);
      paramVarArgs.n(5, this.uNZ);
      GMTrace.o(3953114742784L, 29453);
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
      if (this.uNX != null) {
        i = paramInt + b.a.a.a.fj(2, this.uNX.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.tOG);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.b.b.a.cK(5);
      GMTrace.o(3953114742784L, 29453);
      return i + paramInt + (j + 4) + (k + 4);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uNX == null) {
        throw new b("Not all required fields were included: UserPos");
      }
      GMTrace.o(3953114742784L, 29453);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      azy localazy = (azy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3953114742784L, 29453);
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
          localazy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953114742784L, 29453);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aua();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aua)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localazy.uNX = ((aua)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953114742784L, 29453);
        return 0;
      case 3: 
        localazy.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953114742784L, 29453);
        return 0;
      case 4: 
        localazy.uNY = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3953114742784L, 29453);
        return 0;
      }
      localazy.uNZ = ((b.a.a.a.a)localObject1).yqV.readFloat();
      GMTrace.o(3953114742784L, 29453);
      return 0;
    }
    GMTrace.o(3953114742784L, 29453);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\azy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */