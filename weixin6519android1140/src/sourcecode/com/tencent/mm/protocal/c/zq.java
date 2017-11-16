package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zq
  extends azh
{
  public String content;
  
  public zq()
  {
    GMTrace.i(4023847485440L, 29980);
    GMTrace.o(4023847485440L, 29980);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4023981703168L, 29981);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.content != null) {
        paramVarArgs.e(2, this.content);
      }
      GMTrace.o(4023981703168L, 29981);
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
      if (this.content != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.content);
      }
      GMTrace.o(4023981703168L, 29981);
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
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      GMTrace.o(4023981703168L, 29981);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zq localzq = (zq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4023981703168L, 29981);
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
          localzq.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4023981703168L, 29981);
        return 0;
      }
      localzq.content = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4023981703168L, 29981);
      return 0;
    }
    GMTrace.o(4023981703168L, 29981);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */