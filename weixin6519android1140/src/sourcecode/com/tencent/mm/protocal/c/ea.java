package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ea
  extends com.tencent.mm.bm.a
{
  public azp tSE;
  public qm tSF;
  
  public ea()
  {
    GMTrace.i(13582162984960L, 101195);
    GMTrace.o(13582162984960L, 101195);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13582297202688L, 101196);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSE == null) {
        throw new b("Not all required fields were included: AesEncryptKey");
      }
      if (this.tSE != null)
      {
        paramVarArgs.fm(2, this.tSE.aYq());
        this.tSE.a(paramVarArgs);
      }
      if (this.tSF != null)
      {
        paramVarArgs.fm(3, this.tSF.aYq());
        this.tSF.a(paramVarArgs);
      }
      GMTrace.o(13582297202688L, 101196);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tSE != null) {
        paramInt = b.a.a.a.fj(2, this.tSE.aYq()) + 0;
      }
      i = paramInt;
      if (this.tSF != null) {
        i = paramInt + b.a.a.a.fj(3, this.tSF.aYq());
      }
      GMTrace.o(13582297202688L, 101196);
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
      if (this.tSE == null) {
        throw new b("Not all required fields were included: AesEncryptKey");
      }
      GMTrace.o(13582297202688L, 101196);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ea localea = (ea)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13582297202688L, 101196);
        return -1;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localea.tSE = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13582297202688L, 101196);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new qm();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((qm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localea.tSF = ((qm)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13582297202688L, 101196);
      return 0;
    }
    GMTrace.o(13582297202688L, 101196);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */