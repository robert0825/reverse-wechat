package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbn
  extends ayx
{
  public agx tUt;
  public ahb uOL;
  public azp uww;
  
  public bbn()
  {
    GMTrace.i(3981703118848L, 29666);
    GMTrace.o(3981703118848L, 29666);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3981837336576L, 29667);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.uOL == null) {
        throw new b("Not all required fields were included: HardDeviceMsg");
      }
      if (this.uww == null) {
        throw new b("Not all required fields were included: SessionBuffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(2, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.uOL != null)
      {
        paramVarArgs.fm(3, this.uOL.aYq());
        this.uOL.a(paramVarArgs);
      }
      if (this.uww != null)
      {
        paramVarArgs.fm(4, this.uww.aYq());
        this.uww.a(paramVarArgs);
      }
      GMTrace.o(3981837336576L, 29667);
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
      if (this.tUt != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUt.aYq());
      }
      i = paramInt;
      if (this.uOL != null) {
        i = paramInt + b.a.a.a.fj(3, this.uOL.aYq());
      }
      paramInt = i;
      if (this.uww != null) {
        paramInt = i + b.a.a.a.fj(4, this.uww.aYq());
      }
      GMTrace.o(3981837336576L, 29667);
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
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.uOL == null) {
        throw new b("Not all required fields were included: HardDeviceMsg");
      }
      if (this.uww == null) {
        throw new b("Not all required fields were included: SessionBuffer");
      }
      GMTrace.o(3981837336576L, 29667);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbn localbbn = (bbn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3981837336576L, 29667);
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
          localbbn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3981837336576L, 29667);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbbn.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3981837336576L, 29667);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ahb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ahb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbbn.uOL = ((ahb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3981837336576L, 29667);
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
        localbbn.uww = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3981837336576L, 29667);
      return 0;
    }
    GMTrace.o(3981837336576L, 29667);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */