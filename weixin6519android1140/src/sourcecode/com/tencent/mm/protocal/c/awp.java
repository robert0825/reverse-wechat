package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awp
  extends com.tencent.mm.bm.a
{
  public azq tPF;
  public azq ufy;
  
  public awp()
  {
    GMTrace.i(3629784236032L, 27044);
    GMTrace.o(3629784236032L, 27044);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3629918453760L, 27045);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.tPF != null)
      {
        paramVarArgs.fm(1, this.tPF.aYq());
        this.tPF.a(paramVarArgs);
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(2, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      GMTrace.o(3629918453760L, 27045);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tPF != null) {
        paramInt = b.a.a.a.fj(1, this.tPF.aYq()) + 0;
      }
      i = paramInt;
      if (this.ufy != null) {
        i = paramInt + b.a.a.a.fj(2, this.ufy.aYq());
      }
      GMTrace.o(3629918453760L, 27045);
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
      if (this.tPF == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      GMTrace.o(3629918453760L, 27045);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awp localawp = (awp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3629918453760L, 27045);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localawp.tPF = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3629918453760L, 27045);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localawp.ufy = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3629918453760L, 27045);
      return 0;
    }
    GMTrace.o(3629918453760L, 27045);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */