package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jh
  extends ayx
{
  public String eTK;
  public String jxF;
  
  public jh()
  {
    GMTrace.i(3722528686080L, 27735);
    GMTrace.o(3722528686080L, 27735);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3722662903808L, 27736);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jxF != null) {
        paramVarArgs.e(2, this.jxF);
      }
      if (this.eTK != null) {
        paramVarArgs.e(3, this.eTK);
      }
      GMTrace.o(3722662903808L, 27736);
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
      if (this.jxF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jxF);
      }
      i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eTK);
      }
      GMTrace.o(3722662903808L, 27736);
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
      GMTrace.o(3722662903808L, 27736);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jh localjh = (jh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3722662903808L, 27736);
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
          localjh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3722662903808L, 27736);
        return 0;
      case 2: 
        localjh.jxF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3722662903808L, 27736);
        return 0;
      }
      localjh.eTK = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3722662903808L, 27736);
      return 0;
    }
    GMTrace.o(3722662903808L, 27736);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */