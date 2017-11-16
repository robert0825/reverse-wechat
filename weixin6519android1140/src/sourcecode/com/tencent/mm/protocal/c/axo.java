package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axo
  extends azh
{
  public axf uLW;
  
  public axo()
  {
    GMTrace.i(3946806509568L, 29406);
    GMTrace.o(3946806509568L, 29406);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3946940727296L, 29407);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uLW == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uLW != null)
      {
        paramVarArgs.fm(1, this.uLW.aYq());
        this.uLW.a(paramVarArgs);
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(2, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      GMTrace.o(3946940727296L, 29407);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uLW != null) {
        paramInt = b.a.a.a.fj(1, this.uLW.aYq()) + 0;
      }
      i = paramInt;
      if (this.uND != null) {
        i = paramInt + b.a.a.a.fj(2, this.uND.aYq());
      }
      GMTrace.o(3946940727296L, 29407);
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
      if (this.uLW == null) {
        throw new b("Not all required fields were included: rcptinfolist");
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3946940727296L, 29407);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axo localaxo = (axo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3946940727296L, 29407);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new axf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((axf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaxo.uLW = ((axf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3946940727296L, 29407);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new es();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaxo.uND = ((es)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3946940727296L, 29407);
      return 0;
    }
    GMTrace.o(3946940727296L, 29407);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */