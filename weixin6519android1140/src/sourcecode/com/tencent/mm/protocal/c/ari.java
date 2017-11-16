package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ari
  extends ayx
{
  public int lQc;
  public nz uHA;
  public nz uHB;
  public String uHz;
  
  public ari()
  {
    GMTrace.i(3923452624896L, 29232);
    GMTrace.o(3923452624896L, 29232);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923586842624L, 29233);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHA == null) {
        throw new b("Not all required fields were included: BigContentInfo");
      }
      if (this.uHB == null) {
        throw new b("Not all required fields were included: SmallContentInfo");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uHz != null) {
        paramVarArgs.e(2, this.uHz);
      }
      if (this.uHA != null)
      {
        paramVarArgs.fm(3, this.uHA.aYq());
        this.uHA.a(paramVarArgs);
      }
      if (this.uHB != null)
      {
        paramVarArgs.fm(4, this.uHB.aYq());
        this.uHB.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.lQc);
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uHz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uHz);
      }
      i = paramInt;
      if (this.uHA != null) {
        i = paramInt + b.a.a.a.fj(3, this.uHA.aYq());
      }
      paramInt = i;
      if (this.uHB != null) {
        paramInt = i + b.a.a.a.fj(4, this.uHB.aYq());
      }
      i = b.a.a.a.fh(5, this.lQc);
      GMTrace.o(3923586842624L, 29233);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uHA == null) {
        throw new b("Not all required fields were included: BigContentInfo");
      }
      if (this.uHB == null) {
        throw new b("Not all required fields were included: SmallContentInfo");
      }
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ari localari = (ari)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3923586842624L, 29233);
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
          localari.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 2: 
        localari.uHz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localari.uHA = ((nz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localari.uHB = ((nz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3923586842624L, 29233);
        return 0;
      }
      localari.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3923586842624L, 29233);
      return 0;
    }
    GMTrace.o(3923586842624L, 29233);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ari.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */