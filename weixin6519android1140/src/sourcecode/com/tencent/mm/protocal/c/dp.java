package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dp
  extends com.tencent.mm.bm.a
{
  public anu tRR;
  
  public dp()
  {
    GMTrace.i(3871241928704L, 28843);
    GMTrace.o(3871241928704L, 28843);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3871376146432L, 28844);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRR == null) {
        throw new b("Not all required fields were included: MediaObj");
      }
      if (this.tRR != null)
      {
        paramVarArgs.fm(1, this.tRR.aYq());
        this.tRR.a(paramVarArgs);
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tRR != null) {
        paramInt = b.a.a.a.fj(1, this.tRR.aYq()) + 0;
      }
      GMTrace.o(3871376146432L, 28844);
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
      if (this.tRR == null) {
        throw new b("Not all required fields were included: MediaObj");
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dp localdp = (dp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3871376146432L, 28844);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new anu();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((anu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localdp.tRR = ((anu)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3871376146432L, 28844);
      return 0;
    }
    GMTrace.o(3871376146432L, 28844);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */