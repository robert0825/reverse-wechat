package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aev
  extends ayx
{
  public azp tUK;
  public azq ufy;
  public azq uuJ;
  public azq uuK;
  public azp uuL;
  
  public aev()
  {
    GMTrace.i(3782658228224L, 28183);
    GMTrace.o(3782658228224L, 28183);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3782792445952L, 28184);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uuJ == null) {
        throw new b("Not all required fields were included: Pwd");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(2, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      if (this.uuJ != null)
      {
        paramVarArgs.fm(3, this.uuJ.aYq());
        this.uuJ.a(paramVarArgs);
      }
      if (this.uuK != null)
      {
        paramVarArgs.fm(4, this.uuK.aYq());
        this.uuK.a(paramVarArgs);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(5, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.uuL != null)
      {
        paramVarArgs.fm(6, this.uuL.aYq());
        this.uuL.a(paramVarArgs);
      }
      GMTrace.o(3782792445952L, 28184);
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
      if (this.ufy != null) {
        paramInt = i + b.a.a.a.fj(2, this.ufy.aYq());
      }
      i = paramInt;
      if (this.uuJ != null) {
        i = paramInt + b.a.a.a.fj(3, this.uuJ.aYq());
      }
      paramInt = i;
      if (this.uuK != null) {
        paramInt = i + b.a.a.a.fj(4, this.uuK.aYq());
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(5, this.tUK.aYq());
      }
      paramInt = i;
      if (this.uuL != null) {
        paramInt = i + b.a.a.a.fj(6, this.uuL.aYq());
      }
      GMTrace.o(3782792445952L, 28184);
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
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uuJ == null) {
        throw new b("Not all required fields were included: Pwd");
      }
      GMTrace.o(3782792445952L, 28184);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aev localaev = (aev)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3782792445952L, 28184);
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
          localaev.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3782792445952L, 28184);
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
          localaev.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3782792445952L, 28184);
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
          localaev.uuJ = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3782792445952L, 28184);
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
          localaev.uuK = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3782792445952L, 28184);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaev.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3782792445952L, 28184);
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
        localaev.uuL = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3782792445952L, 28184);
      return 0;
    }
    GMTrace.o(3782792445952L, 28184);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */