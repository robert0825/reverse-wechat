package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqd
  extends ayx
{
  public String jhi;
  public String kBh;
  public azp uFZ;
  public azp uGa;
  
  public aqd()
  {
    GMTrace.i(13581089243136L, 101187);
    GMTrace.o(13581089243136L, 101187);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13581223460864L, 101188);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uFZ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.uGa == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.uFZ != null)
      {
        paramVarArgs.fm(3, this.uFZ.aYq());
        this.uFZ.a(paramVarArgs);
      }
      if (this.uGa != null)
      {
        paramVarArgs.fm(4, this.uGa.aYq());
        this.uGa.a(paramVarArgs);
      }
      if (this.kBh != null) {
        paramVarArgs.e(5, this.kBh);
      }
      GMTrace.o(13581223460864L, 101188);
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
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.uFZ != null) {
        i = paramInt + b.a.a.a.fj(3, this.uFZ.aYq());
      }
      paramInt = i;
      if (this.uGa != null) {
        paramInt = i + b.a.a.a.fj(4, this.uGa.aYq());
      }
      i = paramInt;
      if (this.kBh != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.kBh);
      }
      GMTrace.o(13581223460864L, 101188);
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
      if (this.uFZ == null) {
        throw new b("Not all required fields were included: CurrentSynckey");
      }
      if (this.uGa == null) {
        throw new b("Not all required fields were included: MaxSynckey");
      }
      GMTrace.o(13581223460864L, 101188);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqd localaqd = (aqd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13581223460864L, 101188);
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
          localaqd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581223460864L, 101188);
        return 0;
      case 2: 
        localaqd.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13581223460864L, 101188);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaqd.uFZ = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581223460864L, 101188);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaqd.uGa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581223460864L, 101188);
        return 0;
      }
      localaqd.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13581223460864L, 101188);
      return 0;
    }
    GMTrace.o(13581223460864L, 101188);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */