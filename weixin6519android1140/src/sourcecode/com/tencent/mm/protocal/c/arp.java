package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arp
  extends azh
{
  public arp()
  {
    GMTrace.i(20213860925440L, 150605);
    GMTrace.o(20213860925440L, 150605);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20213995143168L, 150606);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      GMTrace.o(20213995143168L, 150606);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      GMTrace.o(20213995143168L, 150606);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(20213995143168L, 150606);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arp localarp = (arp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20213995143168L, 150606);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new es();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localarp.uND = ((es)localObject1);
        paramInt += 1;
      }
      GMTrace.o(20213995143168L, 150606);
      return 0;
    }
    GMTrace.o(20213995143168L, 150606);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\arp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */