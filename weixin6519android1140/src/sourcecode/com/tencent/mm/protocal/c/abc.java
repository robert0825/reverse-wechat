package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class abc
  extends azh
{
  public String urA;
  public String urz;
  
  public abc()
  {
    GMTrace.i(3788966461440L, 28230);
    GMTrace.o(3788966461440L, 28230);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3789100679168L, 28231);
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
      if (this.urz != null) {
        paramVarArgs.e(2, this.urz);
      }
      if (this.urA != null) {
        paramVarArgs.e(3, this.urA);
      }
      GMTrace.o(3789100679168L, 28231);
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
      if (this.urz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.urz);
      }
      i = paramInt;
      if (this.urA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.urA);
      }
      GMTrace.o(3789100679168L, 28231);
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
      GMTrace.o(3789100679168L, 28231);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      abc localabc = (abc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3789100679168L, 28231);
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
          localabc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3789100679168L, 28231);
        return 0;
      case 2: 
        localabc.urz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3789100679168L, 28231);
        return 0;
      }
      localabc.urA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3789100679168L, 28231);
      return 0;
    }
    GMTrace.o(3789100679168L, 28231);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */