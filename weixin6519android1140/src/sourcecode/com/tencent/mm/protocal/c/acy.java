package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acy
  extends ayx
{
  public int tMX;
  public azq ufy;
  public int usX;
  
  public acy()
  {
    GMTrace.i(3871510364160L, 28845);
    GMTrace.o(3871510364160L, 28845);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3871644581888L, 28846);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(2, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.usX);
      paramVarArgs.fk(4, this.tMX);
      GMTrace.o(3871644581888L, 28846);
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
      if (this.ufy != null) {
        i = paramInt + b.a.a.a.fj(2, this.ufy.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.usX);
      int j = b.a.a.a.fh(4, this.tMX);
      GMTrace.o(3871644581888L, 28846);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      GMTrace.o(3871644581888L, 28846);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acy localacy = (acy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3871644581888L, 28846);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localacy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3871644581888L, 28846);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localacy.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3871644581888L, 28846);
        return 0;
      case 3: 
        localacy.usX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3871644581888L, 28846);
        return 0;
      }
      localacy.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3871644581888L, 28846);
      return 0;
    }
    GMTrace.o(3871644581888L, 28846);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\acy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */