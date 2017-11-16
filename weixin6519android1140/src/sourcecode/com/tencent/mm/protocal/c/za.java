package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class za
  extends azh
{
  public int jgZ;
  public String upU;
  public lf upV;
  
  public za()
  {
    GMTrace.i(3885871661056L, 28952);
    GMTrace.o(3885871661056L, 28952);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886005878784L, 28953);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.upV == null) {
        throw new b("Not all required fields were included: NewChatroomData");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.upU != null) {
        paramVarArgs.e(2, this.upU);
      }
      paramVarArgs.fk(3, this.jgZ);
      if (this.upV != null)
      {
        paramVarArgs.fm(4, this.upV.aYq());
        this.upV.a(paramVarArgs);
      }
      GMTrace.o(3886005878784L, 28953);
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
      if (this.upU != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.upU);
      }
      i += b.a.a.a.fh(3, this.jgZ);
      paramInt = i;
      if (this.upV != null) {
        paramInt = i + b.a.a.a.fj(4, this.upV.aYq());
      }
      GMTrace.o(3886005878784L, 28953);
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
      if (this.upV == null) {
        throw new b("Not all required fields were included: NewChatroomData");
      }
      GMTrace.o(3886005878784L, 28953);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      za localza = (za)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3886005878784L, 28953);
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
          localza.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3886005878784L, 28953);
        return 0;
      case 2: 
        localza.upU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3886005878784L, 28953);
        return 0;
      case 3: 
        localza.jgZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3886005878784L, 28953);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new lf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((lf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localza.upV = ((lf)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3886005878784L, 28953);
      return 0;
    }
    GMTrace.o(3886005878784L, 28953);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */