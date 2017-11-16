package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bah
  extends azh
{
  public String tTZ;
  public aos tUa;
  public agx tUt;
  public agy tUu;
  
  public bah()
  {
    GMTrace.i(3731387056128L, 27801);
    GMTrace.o(3731387056128L, 27801);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3731521273856L, 27802);
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
      if (this.tUt != null)
      {
        paramVarArgs.fm(2, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.tUu != null)
      {
        paramVarArgs.fm(3, this.tUu.aYq());
        this.tUu.a(paramVarArgs);
      }
      if (this.tTZ != null) {
        paramVarArgs.e(4, this.tTZ);
      }
      if (this.tUa != null)
      {
        paramVarArgs.fm(5, this.tUa.aYq());
        this.tUa.a(paramVarArgs);
      }
      GMTrace.o(3731521273856L, 27802);
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
      if (this.tUt != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUt.aYq());
      }
      i = paramInt;
      if (this.tUu != null) {
        i = paramInt + b.a.a.a.fj(3, this.tUu.aYq());
      }
      paramInt = i;
      if (this.tTZ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tTZ);
      }
      i = paramInt;
      if (this.tUa != null) {
        i = paramInt + b.a.a.a.fj(5, this.tUa.aYq());
      }
      GMTrace.o(3731521273856L, 27802);
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
      GMTrace.o(3731521273856L, 27802);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bah localbah = (bah)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3731521273856L, 27802);
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
          localbah.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731521273856L, 27802);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbah.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731521273856L, 27802);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbah.tUu = ((agy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3731521273856L, 27802);
        return 0;
      case 4: 
        localbah.tTZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3731521273856L, 27802);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aos();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((aos)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbah.tUa = ((aos)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3731521273856L, 27802);
      return 0;
    }
    GMTrace.o(3731521273856L, 27802);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */