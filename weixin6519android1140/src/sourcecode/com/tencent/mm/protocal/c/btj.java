package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btj
  extends com.tencent.mm.bm.a
{
  public long vcc;
  public hw vcd;
  
  public btj()
  {
    GMTrace.i(17827603939328L, 132826);
    GMTrace.o(17827603939328L, 132826);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17827738157056L, 132827);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.vcc);
      if (this.vcd != null)
      {
        paramVarArgs.fm(2, this.vcd.aYq());
        this.vcd.a(paramVarArgs);
      }
      GMTrace.o(17827738157056L, 132827);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.vcc) + 0;
      paramInt = i;
      if (this.vcd != null) {
        paramInt = i + b.a.a.a.fj(2, this.vcd.aYq());
      }
      GMTrace.o(17827738157056L, 132827);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(17827738157056L, 132827);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btj localbtj = (btj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17827738157056L, 132827);
        return -1;
      case 1: 
        localbtj.vcc = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(17827738157056L, 132827);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new hw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((hw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbtj.vcd = ((hw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(17827738157056L, 132827);
      return 0;
    }
    GMTrace.o(17827738157056L, 132827);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */