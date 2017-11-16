package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ber
  extends com.tencent.mm.bm.a
{
  public String tPP;
  public long tXT;
  public long uQs;
  public beq uQt;
  public beq uQu;
  
  public ber()
  {
    GMTrace.i(3638911041536L, 27112);
    GMTrace.o(3638911041536L, 27112);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3639045259264L, 27113);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQt == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      paramVarArgs.T(1, this.tXT);
      paramVarArgs.T(2, this.uQs);
      if (this.uQt != null)
      {
        paramVarArgs.fm(3, this.uQt.aYq());
        this.uQt.a(paramVarArgs);
      }
      if (this.uQu != null)
      {
        paramVarArgs.fm(4, this.uQu.aYq());
        this.uQu.a(paramVarArgs);
      }
      if (this.tPP != null) {
        paramVarArgs.e(5, this.tPP);
      }
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.tXT) + 0 + b.a.a.a.S(2, this.uQs);
      paramInt = i;
      if (this.uQt != null) {
        paramInt = i + b.a.a.a.fj(3, this.uQt.aYq());
      }
      i = paramInt;
      if (this.uQu != null) {
        i = paramInt + b.a.a.a.fj(4, this.uQu.aYq());
      }
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tPP);
      }
      GMTrace.o(3639045259264L, 27113);
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
      if (this.uQt == null) {
        throw new b("Not all required fields were included: CurrentAction");
      }
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ber localber = (ber)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3639045259264L, 27113);
        return -1;
      case 1: 
        localber.tXT = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 2: 
        localber.uQs = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((beq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localber.uQt = ((beq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3639045259264L, 27113);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((beq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localber.uQu = ((beq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3639045259264L, 27113);
        return 0;
      }
      localber.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3639045259264L, 27113);
      return 0;
    }
    GMTrace.o(3639045259264L, 27113);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ber.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */