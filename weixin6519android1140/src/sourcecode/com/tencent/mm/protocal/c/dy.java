package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dy
  extends com.tencent.mm.bm.a
{
  public azp tSA;
  public azp tSB;
  
  public dy()
  {
    GMTrace.i(13584847339520L, 101215);
    GMTrace.o(13584847339520L, 101215);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13584981557248L, 101216);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSA == null) {
        throw new b("Not all required fields were included: EncryptKey");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      if (this.tSA != null)
      {
        paramVarArgs.fm(1, this.tSA.aYq());
        this.tSA.a(paramVarArgs);
      }
      if (this.tSB != null)
      {
        paramVarArgs.fm(2, this.tSB.aYq());
        this.tSB.a(paramVarArgs);
      }
      GMTrace.o(13584981557248L, 101216);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tSA != null) {
        paramInt = b.a.a.a.fj(1, this.tSA.aYq()) + 0;
      }
      i = paramInt;
      if (this.tSB != null) {
        i = paramInt + b.a.a.a.fj(2, this.tSB.aYq());
      }
      GMTrace.o(13584981557248L, 101216);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSA == null) {
        throw new b("Not all required fields were included: EncryptKey");
      }
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(13584981557248L, 101216);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dy localdy = (dy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13584981557248L, 101216);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdy.tSA = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13584981557248L, 101216);
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
        localdy.tSB = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13584981557248L, 101216);
      return 0;
    }
    GMTrace.o(13584981557248L, 101216);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */