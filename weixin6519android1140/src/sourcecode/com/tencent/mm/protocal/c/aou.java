package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aou
  extends com.tencent.mm.bm.a
{
  public py uEK;
  
  public aou()
  {
    GMTrace.i(3957275492352L, 29484);
    GMTrace.o(3957275492352L, 29484);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3957409710080L, 29485);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEK == null) {
        throw new b("Not all required fields were included: DisturbSetting");
      }
      if (this.uEK != null)
      {
        paramVarArgs.fm(1, this.uEK.aYq());
        this.uEK.a(paramVarArgs);
      }
      GMTrace.o(3957409710080L, 29485);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uEK != null) {
        paramInt = b.a.a.a.fj(1, this.uEK.aYq()) + 0;
      }
      GMTrace.o(3957409710080L, 29485);
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
      if (this.uEK == null) {
        throw new b("Not all required fields were included: DisturbSetting");
      }
      GMTrace.o(3957409710080L, 29485);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aou localaou = (aou)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3957409710080L, 29485);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new py();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((py)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaou.uEK = ((py)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3957409710080L, 29485);
      return 0;
    }
    GMTrace.o(3957409710080L, 29485);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */