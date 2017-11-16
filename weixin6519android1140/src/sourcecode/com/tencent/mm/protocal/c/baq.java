package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class baq
  extends azh
{
  public String uni;
  
  public baq()
  {
    GMTrace.i(3984521691136L, 29687);
    GMTrace.o(3984521691136L, 29687);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3984655908864L, 29688);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uni == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uni != null) {
        paramVarArgs.e(2, this.uni);
      }
      GMTrace.o(3984655908864L, 29688);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uni != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uni);
      }
      GMTrace.o(3984655908864L, 29688);
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
      if (this.uni == null) {
        throw new b("Not all required fields were included: JsonData");
      }
      GMTrace.o(3984655908864L, 29688);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      baq localbaq = (baq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3984655908864L, 29688);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbaq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3984655908864L, 29688);
        return 0;
      }
      localbaq.uni = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3984655908864L, 29688);
      return 0;
    }
    GMTrace.o(3984655908864L, 29688);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\baq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */