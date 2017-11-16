package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ayi
  extends ayx
{
  public at tYT;
  public int uMK;
  public String uML;
  
  public ayi()
  {
    GMTrace.i(3750714408960L, 27945);
    GMTrace.o(3750714408960L, 27945);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3750848626688L, 27946);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uMK);
      if (this.uML != null) {
        paramVarArgs.e(3, this.uML);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(4, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3750848626688L, 27946);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uMK);
      paramInt = i;
      if (this.uML != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uML);
      }
      i = paramInt;
      if (this.tYT != null) {
        i = paramInt + b.a.a.a.fj(4, this.tYT.aYq());
      }
      GMTrace.o(3750848626688L, 27946);
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
      GMTrace.o(3750848626688L, 27946);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ayi localayi = (ayi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3750848626688L, 27946);
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
          localayi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3750848626688L, 27946);
        return 0;
      case 2: 
        localayi.uMK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3750848626688L, 27946);
        return 0;
      case 3: 
        localayi.uML = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3750848626688L, 27946);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localayi.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3750848626688L, 27946);
      return 0;
    }
    GMTrace.o(3750848626688L, 27946);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ayi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */