package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bft
  extends azh
{
  public String uDB;
  public bfh uQe;
  
  public bft()
  {
    GMTrace.i(3754204069888L, 27971);
    GMTrace.o(3754204069888L, 27971);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3754338287616L, 27972);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uQe == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uQe != null)
      {
        paramVarArgs.fm(2, this.uQe.aYq());
        this.uQe.a(paramVarArgs);
      }
      if (this.uDB != null) {
        paramVarArgs.e(3, this.uDB);
      }
      GMTrace.o(3754338287616L, 27972);
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
      if (this.uQe != null) {
        paramInt = i + b.a.a.a.fj(2, this.uQe.aYq());
      }
      i = paramInt;
      if (this.uDB != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uDB);
      }
      GMTrace.o(3754338287616L, 27972);
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
      if (this.uQe == null) {
        throw new b("Not all required fields were included: SnsObject");
      }
      GMTrace.o(3754338287616L, 27972);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bft localbft = (bft)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3754338287616L, 27972);
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
          localbft.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3754338287616L, 27972);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbft.uQe = ((bfh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3754338287616L, 27972);
        return 0;
      }
      localbft.uDB = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3754338287616L, 27972);
      return 0;
    }
    GMTrace.o(3754338287616L, 27972);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */