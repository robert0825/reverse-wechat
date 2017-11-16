package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aey
  extends ayx
{
  public azp tUK;
  public int uuM;
  public String uuN;
  
  public aey()
  {
    GMTrace.i(3706154123264L, 27613);
    GMTrace.o(3706154123264L, 27613);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3706288340992L, 27614);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uuM);
      if (this.uuN != null) {
        paramVarArgs.e(3, this.uuN);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(4, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      GMTrace.o(3706288340992L, 27614);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uuM);
      paramInt = i;
      if (this.uuN != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uuN);
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(4, this.tUK.aYq());
      }
      GMTrace.o(3706288340992L, 27614);
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
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      GMTrace.o(3706288340992L, 27614);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aey localaey = (aey)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3706288340992L, 27614);
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
          localaey.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3706288340992L, 27614);
        return 0;
      case 2: 
        localaey.uuM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3706288340992L, 27614);
        return 0;
      case 3: 
        localaey.uuN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706288340992L, 27614);
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
        localaey.tUK = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3706288340992L, 27614);
      return 0;
    }
    GMTrace.o(3706288340992L, 27614);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */