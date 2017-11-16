package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmy
  extends com.tencent.mm.bm.a
{
  public int etB;
  public String lPj;
  public azp uXb;
  public azp uXc;
  
  public bmy()
  {
    GMTrace.i(3791650816000L, 28250);
    GMTrace.o(3791650816000L, 28250);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3791785033728L, 28251);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXb == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (this.uXc == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      paramVarArgs.fk(1, this.etB);
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      if (this.uXb != null)
      {
        paramVarArgs.fm(3, this.uXb.aYq());
        this.uXb.a(paramVarArgs);
      }
      if (this.uXc != null)
      {
        paramVarArgs.fm(4, this.uXc.aYq());
        this.uXc.a(paramVarArgs);
      }
      GMTrace.o(3791785033728L, 28251);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.etB) + 0;
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPj);
      }
      i = paramInt;
      if (this.uXb != null) {
        i = paramInt + b.a.a.a.fj(3, this.uXb.aYq());
      }
      paramInt = i;
      if (this.uXc != null) {
        paramInt = i + b.a.a.a.fj(4, this.uXc.aYq());
      }
      GMTrace.o(3791785033728L, 28251);
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
      if (this.uXb == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (this.uXc == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      GMTrace.o(3791785033728L, 28251);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmy localbmy = (bmy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3791785033728L, 28251);
        return -1;
      case 1: 
        localbmy.etB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3791785033728L, 28251);
        return 0;
      case 2: 
        localbmy.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3791785033728L, 28251);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbmy.uXb = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3791785033728L, 28251);
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
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbmy.uXc = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3791785033728L, 28251);
      return 0;
    }
    GMTrace.o(3791785033728L, 28251);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */