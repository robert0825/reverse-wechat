package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class su
  extends ayx
{
  public int lQF;
  public String uiM;
  public String uiN;
  
  public su()
  {
    GMTrace.i(3824668377088L, 28496);
    GMTrace.o(3824668377088L, 28496);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3824802594816L, 28497);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lQF);
      if (this.uiM != null) {
        paramVarArgs.e(3, this.uiM);
      }
      if (this.uiN != null) {
        paramVarArgs.e(4, this.uiN);
      }
      GMTrace.o(3824802594816L, 28497);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lQF);
      paramInt = i;
      if (this.uiM != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uiM);
      }
      i = paramInt;
      if (this.uiN != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uiN);
      }
      GMTrace.o(3824802594816L, 28497);
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
      GMTrace.o(3824802594816L, 28497);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      su localsu = (su)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3824802594816L, 28497);
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
          localsu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3824802594816L, 28497);
        return 0;
      case 2: 
        localsu.lQF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3824802594816L, 28497);
        return 0;
      case 3: 
        localsu.uiM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3824802594816L, 28497);
        return 0;
      }
      localsu.uiN = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3824802594816L, 28497);
      return 0;
    }
    GMTrace.o(3824802594816L, 28497);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */