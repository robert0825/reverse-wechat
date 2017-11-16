package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbd
  extends ayx
{
  public agx tUt;
  public String uOx;
  
  public bbd()
  {
    GMTrace.i(3838492803072L, 28599);
    GMTrace.o(3838492803072L, 28599);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3838627020800L, 28600);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tUt != null)
      {
        paramVarArgs.fm(2, this.tUt.aYq());
        this.tUt.a(paramVarArgs);
      }
      if (this.uOx != null) {
        paramVarArgs.e(3, this.uOx);
      }
      GMTrace.o(3838627020800L, 28600);
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
      if (this.tUt != null) {
        paramInt = i + b.a.a.a.fj(2, this.tUt.aYq());
      }
      i = paramInt;
      if (this.uOx != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uOx);
      }
      GMTrace.o(3838627020800L, 28600);
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
      if (this.tUt == null) {
        throw new b("Not all required fields were included: HardDevice");
      }
      GMTrace.o(3838627020800L, 28600);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbd localbbd = (bbd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3838627020800L, 28600);
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
          localbbd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838627020800L, 28600);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbbd.tUt = ((agx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3838627020800L, 28600);
        return 0;
      }
      localbbd.uOx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3838627020800L, 28600);
      return 0;
    }
    GMTrace.o(3838627020800L, 28600);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */