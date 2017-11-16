package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ny
  extends com.tencent.mm.bm.a
{
  public int tRD;
  public int ueT;
  public azp ueU;
  
  public ny()
  {
    GMTrace.i(3761451827200L, 28025);
    GMTrace.o(3761451827200L, 28025);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3761586044928L, 28026);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ueU == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fk(1, this.tRD);
      paramVarArgs.fk(2, this.ueT);
      if (this.ueU != null)
      {
        paramVarArgs.fm(3, this.ueU.aYq());
        this.ueU.a(paramVarArgs);
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tRD) + 0 + b.a.a.a.fh(2, this.ueT);
      paramInt = i;
      if (this.ueU != null) {
        paramInt = i + b.a.a.a.fj(3, this.ueU.aYq());
      }
      GMTrace.o(3761586044928L, 28026);
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
      if (this.ueU == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ny localny = (ny)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3761586044928L, 28026);
        return -1;
      case 1: 
        localny.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3761586044928L, 28026);
        return 0;
      case 2: 
        localny.ueT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3761586044928L, 28026);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localny.ueU = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3761586044928L, 28026);
      return 0;
    }
    GMTrace.o(3761586044928L, 28026);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */