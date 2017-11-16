package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bml
  extends ayx
{
  public String udw;
  public bnv udx;
  public bmk udz;
  public azp ues;
  
  public bml()
  {
    GMTrace.i(3977676587008L, 29636);
    GMTrace.o(3977676587008L, 29636);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977810804736L, 29637);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.udx == null) {
        throw new b("Not all required fields were included: VoiceAttr");
      }
      if (this.udz == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.udw != null) {
        paramVarArgs.e(2, this.udw);
      }
      if (this.udx != null)
      {
        paramVarArgs.fm(3, this.udx.aYq());
        this.udx.a(paramVarArgs);
      }
      if (this.udz != null)
      {
        paramVarArgs.fm(4, this.udz.aYq());
        this.udz.a(paramVarArgs);
      }
      if (this.ues != null)
      {
        paramVarArgs.fm(5, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      GMTrace.o(3977810804736L, 29637);
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
      if (this.udw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.udw);
      }
      i = paramInt;
      if (this.udx != null) {
        i = paramInt + b.a.a.a.fj(3, this.udx.aYq());
      }
      paramInt = i;
      if (this.udz != null) {
        paramInt = i + b.a.a.a.fj(4, this.udz.aYq());
      }
      i = paramInt;
      if (this.ues != null) {
        i = paramInt + b.a.a.a.fj(5, this.ues.aYq());
      }
      GMTrace.o(3977810804736L, 29637);
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
      if (this.udx == null) {
        throw new b("Not all required fields were included: VoiceAttr");
      }
      if (this.udz == null) {
        throw new b("Not all required fields were included: UploadCtx");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3977810804736L, 29637);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bml localbml = (bml)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977810804736L, 29637);
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
          localbml.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977810804736L, 29637);
        return 0;
      case 2: 
        localbml.udw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977810804736L, 29637);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbml.udx = ((bnv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977810804736L, 29637);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bmk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bmk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbml.udz = ((bmk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977810804736L, 29637);
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
        localbml.ues = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3977810804736L, 29637);
      return 0;
    }
    GMTrace.o(3977810804736L, 29637);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */