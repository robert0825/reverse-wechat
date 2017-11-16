package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends ayx
{
  public String tLZ;
  public String tMa;
  
  public b()
  {
    GMTrace.i(3856477978624L, 28733);
    GMTrace.o(3856477978624L, 28733);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3856612196352L, 28734);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tLZ != null) {
        paramVarArgs.e(2, this.tLZ);
      }
      if (this.tMa != null) {
        paramVarArgs.e(3, this.tMa);
      }
      GMTrace.o(3856612196352L, 28734);
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
      if (this.tLZ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tLZ);
      }
      i = paramInt;
      if (this.tMa != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tMa);
      }
      GMTrace.o(3856612196352L, 28734);
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
      GMTrace.o(3856612196352L, 28734);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3856612196352L, 28734);
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
          localb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3856612196352L, 28734);
        return 0;
      case 2: 
        localb.tLZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3856612196352L, 28734);
        return 0;
      }
      localb.tMa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3856612196352L, 28734);
      return 0;
    }
    GMTrace.o(3856612196352L, 28734);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */