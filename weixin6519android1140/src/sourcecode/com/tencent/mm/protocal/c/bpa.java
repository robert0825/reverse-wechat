package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpa
  extends com.tencent.mm.bm.a
{
  public String lSY;
  public int uei;
  public azp uej;
  
  public bpa()
  {
    GMTrace.i(3824936812544L, 28498);
    GMTrace.o(3824936812544L, 28498);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3825071030272L, 28499);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uej == null) {
        throw new b("Not all required fields were included: CmdBuf");
      }
      paramVarArgs.fk(1, this.uei);
      if (this.uej != null)
      {
        paramVarArgs.fm(2, this.uej.aYq());
        this.uej.a(paramVarArgs);
      }
      if (this.lSY != null) {
        paramVarArgs.e(3, this.lSY);
      }
      GMTrace.o(3825071030272L, 28499);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uei) + 0;
      paramInt = i;
      if (this.uej != null) {
        paramInt = i + b.a.a.a.fj(2, this.uej.aYq());
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSY);
      }
      GMTrace.o(3825071030272L, 28499);
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
      if (this.uej == null) {
        throw new b("Not all required fields were included: CmdBuf");
      }
      GMTrace.o(3825071030272L, 28499);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpa localbpa = (bpa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3825071030272L, 28499);
        return -1;
      case 1: 
        localbpa.uei = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825071030272L, 28499);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbpa.uej = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3825071030272L, 28499);
        return 0;
      }
      localbpa.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3825071030272L, 28499);
      return 0;
    }
    GMTrace.o(3825071030272L, 28499);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */