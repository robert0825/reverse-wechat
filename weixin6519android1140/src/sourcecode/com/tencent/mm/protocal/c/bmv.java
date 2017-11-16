package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmv
  extends com.tencent.mm.bm.a
{
  public String tRz;
  public aub uWX;
  
  public bmv()
  {
    GMTrace.i(3760378085376L, 28017);
    GMTrace.o(3760378085376L, 28017);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3760512303104L, 28018);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uWX == null) {
        throw new b("Not all required fields were included: Position");
      }
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      if (this.uWX != null)
      {
        paramVarArgs.fm(2, this.uWX.aYq());
        this.uWX.a(paramVarArgs);
      }
      GMTrace.o(3760512303104L, 28018);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tRz != null) {
        paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;
      }
      i = paramInt;
      if (this.uWX != null) {
        i = paramInt + b.a.a.a.fj(2, this.uWX.aYq());
      }
      GMTrace.o(3760512303104L, 28018);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uWX == null) {
        throw new b("Not all required fields were included: Position");
      }
      GMTrace.o(3760512303104L, 28018);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmv localbmv = (bmv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3760512303104L, 28018);
        return -1;
      case 1: 
        localbmv.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3760512303104L, 28018);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aub();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((aub)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbmv.uWX = ((aub)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3760512303104L, 28018);
      return 0;
    }
    GMTrace.o(3760512303104L, 28018);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */