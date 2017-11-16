package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class akp
  extends ayx
{
  public azp tUK;
  public int uzQ;
  public azp uzR;
  public azp uzS;
  
  public akp()
  {
    GMTrace.i(13098710728704L, 97593);
    GMTrace.o(13098710728704L, 97593);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13098844946432L, 97594);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uzR == null) {
        throw new b("Not all required fields were included: KVBuffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uzQ);
      if (this.uzR != null)
      {
        paramVarArgs.fm(3, this.uzR.aYq());
        this.uzR.a(paramVarArgs);
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(4, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.uzS != null)
      {
        paramVarArgs.fm(5, this.uzS.aYq());
        this.uzS.a(paramVarArgs);
      }
      GMTrace.o(13098844946432L, 97594);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uzQ);
      paramInt = i;
      if (this.uzR != null) {
        paramInt = i + b.a.a.a.fj(3, this.uzR.aYq());
      }
      i = paramInt;
      if (this.tUK != null) {
        i = paramInt + b.a.a.a.fj(4, this.tUK.aYq());
      }
      paramInt = i;
      if (this.uzS != null) {
        paramInt = i + b.a.a.a.fj(5, this.uzS.aYq());
      }
      GMTrace.o(13098844946432L, 97594);
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
      if (this.uzR == null) {
        throw new b("Not all required fields were included: KVBuffer");
      }
      GMTrace.o(13098844946432L, 97594);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      akp localakp = (akp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13098844946432L, 97594);
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
          localakp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098844946432L, 97594);
        return 0;
      case 2: 
        localakp.uzQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13098844946432L, 97594);
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
          localakp.uzR = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098844946432L, 97594);
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
          localakp.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13098844946432L, 97594);
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
        localakp.uzS = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13098844946432L, 97594);
      return 0;
    }
    GMTrace.o(13098844946432L, 97594);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\akp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */