package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avd
  extends ayx
{
  public int uKA;
  public long uKh;
  public azq uKx;
  public azq uKy;
  public azq uKz;
  public int uhU;
  
  public avd()
  {
    GMTrace.i(3847888044032L, 28669);
    GMTrace.o(3847888044032L, 28669);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3848022261760L, 28670);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uKx == null) {
        throw new b("Not all required fields were included: ClientReport");
      }
      if (this.uKy == null) {
        throw new b("Not all required fields were included: ChannelReport");
      }
      if (this.uKz == null) {
        throw new b("Not all required fields were included: EngineReport");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKx != null)
      {
        paramVarArgs.fm(2, this.uKx.aYq());
        this.uKx.a(paramVarArgs);
      }
      if (this.uKy != null)
      {
        paramVarArgs.fm(3, this.uKy.aYq());
        this.uKy.a(paramVarArgs);
      }
      if (this.uKz != null)
      {
        paramVarArgs.fm(4, this.uKz.aYq());
        this.uKz.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uhU);
      paramVarArgs.T(6, this.uKh);
      paramVarArgs.fk(7, this.uKA);
      GMTrace.o(3848022261760L, 28670);
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
      if (this.uKx != null) {
        paramInt = i + b.a.a.a.fj(2, this.uKx.aYq());
      }
      i = paramInt;
      if (this.uKy != null) {
        i = paramInt + b.a.a.a.fj(3, this.uKy.aYq());
      }
      paramInt = i;
      if (this.uKz != null) {
        paramInt = i + b.a.a.a.fj(4, this.uKz.aYq());
      }
      i = b.a.a.a.fh(5, this.uhU);
      int j = b.a.a.a.S(6, this.uKh);
      int k = b.a.a.a.fh(7, this.uKA);
      GMTrace.o(3848022261760L, 28670);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uKx == null) {
        throw new b("Not all required fields were included: ClientReport");
      }
      if (this.uKy == null) {
        throw new b("Not all required fields were included: ChannelReport");
      }
      if (this.uKz == null) {
        throw new b("Not all required fields were included: EngineReport");
      }
      GMTrace.o(3848022261760L, 28670);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avd localavd = (avd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3848022261760L, 28670);
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
          localavd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localavd.uKx = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localavd.uKy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localavd.uKz = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 5: 
        localavd.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3848022261760L, 28670);
        return 0;
      case 6: 
        localavd.uKh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3848022261760L, 28670);
        return 0;
      }
      localavd.uKA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3848022261760L, 28670);
      return 0;
    }
    GMTrace.o(3848022261760L, 28670);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */