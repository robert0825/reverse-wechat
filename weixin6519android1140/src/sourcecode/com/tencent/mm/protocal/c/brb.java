package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brb
  extends ayx
{
  public double vaQ;
  public double vaR;
  public String vaS;
  
  public brb()
  {
    GMTrace.i(20025016582144L, 149198);
    GMTrace.o(20025016582144L, 149198);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20025150799872L, 149199);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.a(2, this.vaQ);
      paramVarArgs.a(3, this.vaR);
      if (this.vaS != null) {
        paramVarArgs.e(4, this.vaS);
      }
      GMTrace.o(20025150799872L, 149199);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.vaS != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vaS);
      }
      GMTrace.o(20025150799872L, 149199);
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
      GMTrace.o(20025150799872L, 149199);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brb localbrb = (brb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20025150799872L, 149199);
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
          localbrb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20025150799872L, 149199);
        return 0;
      case 2: 
        localbrb.vaQ = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(20025150799872L, 149199);
        return 0;
      case 3: 
        localbrb.vaR = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(20025150799872L, 149199);
        return 0;
      }
      localbrb.vaS = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20025150799872L, 149199);
      return 0;
    }
    GMTrace.o(20025150799872L, 149199);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */