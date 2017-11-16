package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asy
  extends com.tencent.mm.bm.a
{
  public String title;
  public LinkedList<asx> uIR;
  
  public asy()
  {
    GMTrace.i(20867098607616L, 155472);
    this.uIR = new LinkedList();
    GMTrace.o(20867098607616L, 155472);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20867232825344L, 155473);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      paramVarArgs.d(2, 8, this.uIR);
      GMTrace.o(20867232825344L, 155473);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.title != null) {
        paramInt = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      i = b.a.a.a.c(2, 8, this.uIR);
      GMTrace.o(20867232825344L, 155473);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uIR.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20867232825344L, 155473);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asy localasy = (asy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20867232825344L, 155473);
        return -1;
      case 1: 
        localasy.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20867232825344L, 155473);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new asx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((asx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localasy.uIR.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(20867232825344L, 155473);
      return 0;
    }
    GMTrace.o(20867232825344L, 155473);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\asy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */