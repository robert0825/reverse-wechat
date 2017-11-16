package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gq
  extends azh
{
  public agx tUt;
  public agy tUu;
  
  public gq()
  {
    GMTrace.i(3703469768704L, 27593);
    GMTrace.o(3703469768704L, 27593);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3703603986432L, 27594);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(2, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.tUu != null)
      {
        paramVarArgs.fm(3, this.tUu.aYq());
        this.tUu.a(paramVarArgs);
      }
      GMTrace.o(3703603986432L, 27594);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.tUt != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUt.aYq());
      }
      i = paramInt;
      if (this.tUu != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUu.aYq());
      }
      GMTrace.o(3703603986432L, 27594);
      return i;
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
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.tUu == null) {
        throw new b("Not all required fields were included: HardDeviceAttr");
      }
      GMTrace.o(3703603986432L, 27594);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gq localgq = (gq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3703603986432L, 27594);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3703603986432L, 27594);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localgq.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3703603986432L, 27594);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new agy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((agy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localgq.tUu = ((agy)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3703603986432L, 27594);
      return 0;
    }
    GMTrace.o(3703603986432L, 27594);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */