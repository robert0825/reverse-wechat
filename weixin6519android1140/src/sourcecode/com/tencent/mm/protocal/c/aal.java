package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aal
  extends ayx
{
  public String urd;
  public String ure;
  
  public aal()
  {
    GMTrace.i(4012975849472L, 29899);
    GMTrace.o(4012975849472L, 29899);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4013110067200L, 29900);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.urd == null) {
        throw new b("Not all required fields were included: FunctionMsgID");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.urd != null) {
        paramVarArgs.e(2, this.urd);
      }
      if (this.ure != null) {
        paramVarArgs.e(3, this.ure);
      }
      GMTrace.o(4013110067200L, 29900);
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
      if (this.urd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.urd);
      }
      i = paramInt;
      if (this.ure != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ure);
      }
      GMTrace.o(4013110067200L, 29900);
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
      if (this.urd == null) {
        throw new b("Not all required fields were included: FunctionMsgID");
      }
      GMTrace.o(4013110067200L, 29900);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aal localaal = (aal)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4013110067200L, 29900);
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
          localaal.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4013110067200L, 29900);
        return 0;
      case 2: 
        localaal.urd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4013110067200L, 29900);
        return 0;
      }
      localaal.ure = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4013110067200L, 29900);
      return 0;
    }
    GMTrace.o(4013110067200L, 29900);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */