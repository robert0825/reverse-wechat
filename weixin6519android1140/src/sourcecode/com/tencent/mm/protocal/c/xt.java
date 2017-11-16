package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xt
  extends azh
{
  public String result;
  public awq tWa;
  
  public xt()
  {
    GMTrace.i(3981971554304L, 29668);
    GMTrace.o(3981971554304L, 29668);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3982105772032L, 29669);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tWa != null)
      {
        paramVarArgs.fm(2, this.tWa.aYq());
        this.tWa.a(paramVarArgs);
      }
      if (this.result != null) {
        paramVarArgs.e(3, this.result);
      }
      GMTrace.o(3982105772032L, 29669);
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
      if (this.tWa != null) {
        paramInt = i + b.a.a.a.fj(2, this.tWa.aYq());
      }
      i = paramInt;
      if (this.result != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.result);
      }
      GMTrace.o(3982105772032L, 29669);
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
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      GMTrace.o(3982105772032L, 29669);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xt localxt = (xt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3982105772032L, 29669);
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
          localxt.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3982105772032L, 29669);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxt.tWa = ((awq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3982105772032L, 29669);
        return 0;
      }
      localxt.result = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3982105772032L, 29669);
      return 0;
    }
    GMTrace.o(3982105772032L, 29669);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\xt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */