package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bag
  extends ayx
{
  public String category;
  public String mac;
  public String userName;
  
  public bag()
  {
    GMTrace.i(4008680882176L, 29867);
    GMTrace.o(4008680882176L, 29867);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4008815099904L, 29868);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mac == null) {
        throw new b("Not all required fields were included: mac");
      }
      if (this.userName == null) {
        throw new b("Not all required fields were included: userName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.mac != null) {
        paramVarArgs.e(2, this.mac);
      }
      if (this.userName != null) {
        paramVarArgs.e(3, this.userName);
      }
      if (this.category != null) {
        paramVarArgs.e(4, this.category);
      }
      GMTrace.o(4008815099904L, 29868);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.mac != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mac);
      }
      i = paramInt;
      if (this.userName != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.userName);
      }
      paramInt = i;
      if (this.category != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.category);
      }
      GMTrace.o(4008815099904L, 29868);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.mac == null) {
        throw new b("Not all required fields were included: mac");
      }
      if (this.userName == null) {
        throw new b("Not all required fields were included: userName");
      }
      GMTrace.o(4008815099904L, 29868);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bag localbag = (bag)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4008815099904L, 29868);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbag.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4008815099904L, 29868);
        return 0;
      case 2: 
        localbag.mac = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4008815099904L, 29868);
        return 0;
      case 3: 
        localbag.userName = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4008815099904L, 29868);
        return 0;
      }
      localbag.category = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4008815099904L, 29868);
      return 0;
    }
    GMTrace.o(4008815099904L, 29868);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */