package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class act
  extends azh
{
  public apk usL;
  public bmq usM;
  
  public act()
  {
    GMTrace.i(13169577689088L, 98121);
    GMTrace.o(13169577689088L, 98121);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13169711906816L, 98122);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usL == null) {
        throw new b("Not all required fields were included: UserInfo");
      }
      if (this.usM == null) {
        throw new b("Not all required fields were included: UserInfoExt");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.usL != null)
      {
        paramVarArgs.fm(2, this.usL.aYq());
        this.usL.a(paramVarArgs);
      }
      if (this.usM != null)
      {
        paramVarArgs.fm(3, this.usM.aYq());
        this.usM.a(paramVarArgs);
      }
      GMTrace.o(13169711906816L, 98122);
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
      if (this.usL != null) {
        paramInt = i + b.a.a.a.fj(2, this.usL.aYq());
      }
      i = paramInt;
      if (this.usM != null) {
        i = paramInt + b.a.a.a.fj(3, this.usM.aYq());
      }
      GMTrace.o(13169711906816L, 98122);
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
      if (this.usL == null) {
        throw new b("Not all required fields were included: UserInfo");
      }
      if (this.usM == null) {
        throw new b("Not all required fields were included: UserInfoExt");
      }
      GMTrace.o(13169711906816L, 98122);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      act localact = (act)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13169711906816L, 98122);
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
          localact.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169711906816L, 98122);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((apk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localact.usL = ((apk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13169711906816L, 98122);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bmq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bmq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localact.usM = ((bmq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13169711906816L, 98122);
      return 0;
    }
    GMTrace.o(13169711906816L, 98122);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\act.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */