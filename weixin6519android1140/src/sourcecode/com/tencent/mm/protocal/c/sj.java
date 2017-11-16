package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sj
  extends azh
{
  public com.tencent.mm.bm.b uiw;
  
  public sj()
  {
    GMTrace.i(3651930161152L, 27209);
    GMTrace.o(3651930161152L, 27209);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3652064378880L, 27210);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uiw != null) {
        paramVarArgs.b(2, this.uiw);
      }
      GMTrace.o(3652064378880L, 27210);
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
      if (this.uiw != null) {
        i = paramInt + b.a.a.a.a(2, this.uiw);
      }
      GMTrace.o(3652064378880L, 27210);
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
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3652064378880L, 27210);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sj localsj = (sj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3652064378880L, 27210);
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
          localsj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3652064378880L, 27210);
        return 0;
      }
      localsj.uiw = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3652064378880L, 27210);
      return 0;
    }
    GMTrace.o(3652064378880L, 27210);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */