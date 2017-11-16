package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sm
  extends ayx
{
  public double latitude;
  public double longitude;
  public String mFr;
  
  public sm()
  {
    GMTrace.i(3839834980352L, 28609);
    GMTrace.o(3839834980352L, 28609);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3839969198080L, 28610);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.mFr != null) {
        paramVarArgs.e(2, this.mFr);
      }
      paramVarArgs.a(3, this.latitude);
      paramVarArgs.a(4, this.longitude);
      GMTrace.o(3839969198080L, 28610);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.mFr != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mFr);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.b.b.a.cK(4);
      GMTrace.o(3839969198080L, 28610);
      return i + (paramInt + 8) + (j + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3839969198080L, 28610);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sm localsm = (sm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3839969198080L, 28610);
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
          localsm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3839969198080L, 28610);
        return 0;
      case 2: 
        localsm.mFr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3839969198080L, 28610);
        return 0;
      case 3: 
        localsm.latitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3839969198080L, 28610);
        return 0;
      }
      localsm.longitude = ((b.a.a.a.a)localObject1).yqV.readDouble();
      GMTrace.o(3839969198080L, 28610);
      return 0;
    }
    GMTrace.o(3839969198080L, 28610);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */