package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rj
  extends com.tencent.mm.bm.a
{
  public rk uhR;
  public ri uhS;
  
  public rj()
  {
    GMTrace.i(3908688674816L, 29122);
    GMTrace.o(3908688674816L, 29122);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3908822892544L, 29123);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhR == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.uhS == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      if (this.uhR != null)
      {
        paramVarArgs.fm(1, this.uhR.aYq());
        this.uhR.a(paramVarArgs);
      }
      if (this.uhS != null)
      {
        paramVarArgs.fm(2, this.uhS.aYq());
        this.uhS.a(paramVarArgs);
      }
      GMTrace.o(3908822892544L, 29123);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uhR != null) {
        paramInt = b.a.a.a.fj(1, this.uhR.aYq()) + 0;
      }
      i = paramInt;
      if (this.uhS != null) {
        i = paramInt + b.a.a.a.fj(2, this.uhS.aYq());
      }
      GMTrace.o(3908822892544L, 29123);
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
      if (this.uhR == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.uhS == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      GMTrace.o(3908822892544L, 29123);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rj localrj = (rj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3908822892544L, 29123);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localrj.uhR = ((rk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3908822892544L, 29123);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ri();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ri)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localrj.uhS = ((ri)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3908822892544L, 29123);
      return 0;
    }
    GMTrace.o(3908822892544L, 29123);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */