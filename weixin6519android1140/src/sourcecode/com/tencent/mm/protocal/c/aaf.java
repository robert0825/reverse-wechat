package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class aaf
  extends ayx
{
  public String extra;
  public int tNq;
  public b uqW;
  
  public aaf()
  {
    GMTrace.i(3903588401152L, 29084);
    GMTrace.o(3903588401152L, 29084);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3903722618880L, 29085);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tNq);
      if (this.extra != null) {
        paramVarArgs.e(3, this.extra);
      }
      if (this.uqW != null) {
        paramVarArgs.b(4, this.uqW);
      }
      GMTrace.o(3903722618880L, 29085);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tNq);
      paramInt = i;
      if (this.extra != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.extra);
      }
      i = paramInt;
      if (this.uqW != null) {
        i = paramInt + b.a.a.a.a(4, this.uqW);
      }
      GMTrace.o(3903722618880L, 29085);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3903722618880L, 29085);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aaf localaaf = (aaf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3903722618880L, 29085);
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
          localaaf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3903722618880L, 29085);
        return 0;
      case 2: 
        localaaf.tNq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3903722618880L, 29085);
        return 0;
      case 3: 
        localaaf.extra = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3903722618880L, 29085);
        return 0;
      }
      localaaf.uqW = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3903722618880L, 29085);
      return 0;
    }
    GMTrace.o(3903722618880L, 29085);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */