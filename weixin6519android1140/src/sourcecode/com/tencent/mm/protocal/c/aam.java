package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aam
  extends azh
{
  public int tMX;
  public String ure;
  public long urf;
  public bu urg;
  
  public aam()
  {
    GMTrace.i(3622804914176L, 26992);
    GMTrace.o(3622804914176L, 26992);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3622939131904L, 26993);
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
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.T(3, this.urf);
      if (this.urg != null)
      {
        paramVarArgs.fm(4, this.urg.aYq());
        this.urg.a(paramVarArgs);
      }
      if (this.ure != null) {
        paramVarArgs.e(5, this.ure);
      }
      GMTrace.o(3622939131904L, 26993);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX) + b.a.a.a.S(3, this.urf);
      paramInt = i;
      if (this.urg != null) {
        paramInt = i + b.a.a.a.fj(4, this.urg.aYq());
      }
      i = paramInt;
      if (this.ure != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ure);
      }
      GMTrace.o(3622939131904L, 26993);
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
      GMTrace.o(3622939131904L, 26993);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aam localaam = (aam)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3622939131904L, 26993);
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
          localaam.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3622939131904L, 26993);
        return 0;
      case 2: 
        localaam.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3622939131904L, 26993);
        return 0;
      case 3: 
        localaam.urf = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3622939131904L, 26993);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaam.urg = ((bu)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3622939131904L, 26993);
        return 0;
      }
      localaam.ure = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3622939131904L, 26993);
      return 0;
    }
    GMTrace.o(3622939131904L, 26993);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */