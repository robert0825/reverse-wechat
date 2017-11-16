package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjo
  extends azh
{
  public String uUB;
  public String username;
  
  public bjo()
  {
    GMTrace.i(3749640667136L, 27937);
    GMTrace.o(3749640667136L, 27937);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3749774884864L, 27938);
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
      if (this.uUB != null) {
        paramVarArgs.e(2, this.uUB);
      }
      if (this.username != null) {
        paramVarArgs.e(3, this.username);
      }
      GMTrace.o(3749774884864L, 27938);
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
      if (this.uUB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uUB);
      }
      i = paramInt;
      if (this.username != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.username);
      }
      GMTrace.o(3749774884864L, 27938);
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
      GMTrace.o(3749774884864L, 27938);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjo localbjo = (bjo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3749774884864L, 27938);
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
          localbjo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3749774884864L, 27938);
        return 0;
      case 2: 
        localbjo.uUB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3749774884864L, 27938);
        return 0;
      }
      localbjo.username = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3749774884864L, 27938);
      return 0;
    }
    GMTrace.o(3749774884864L, 27938);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */