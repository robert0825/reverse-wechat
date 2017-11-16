package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class IMBehavior
  extends com.tencent.mm.bm.a
{
  public IMBehaviorChattingOP chattingOp;
  public IMBehaviorMsgOP msgOp;
  public int opType;
  
  public IMBehavior()
  {
    GMTrace.i(10715674968064L, 79838);
    GMTrace.o(10715674968064L, 79838);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10715809185792L, 79839);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.opType);
      if (this.chattingOp != null)
      {
        paramVarArgs.fm(2, this.chattingOp.aYq());
        this.chattingOp.a(paramVarArgs);
      }
      if (this.msgOp != null)
      {
        paramVarArgs.fm(3, this.msgOp.aYq());
        this.msgOp.a(paramVarArgs);
      }
      GMTrace.o(10715809185792L, 79839);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.opType) + 0;
      paramInt = i;
      if (this.chattingOp != null) {
        paramInt = i + b.a.a.a.fj(2, this.chattingOp.aYq());
      }
      i = paramInt;
      if (this.msgOp != null) {
        i = paramInt + b.a.a.a.fj(3, this.msgOp.aYq());
      }
      GMTrace.o(10715809185792L, 79839);
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
      GMTrace.o(10715809185792L, 79839);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      IMBehavior localIMBehavior = (IMBehavior)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(10715809185792L, 79839);
        return -1;
      case 1: 
        localIMBehavior.opType = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(10715809185792L, 79839);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new IMBehaviorChattingOP();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((IMBehaviorChattingOP)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localIMBehavior.chattingOp = ((IMBehaviorChattingOP)localObject1);
          paramInt += 1;
        }
        GMTrace.o(10715809185792L, 79839);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new IMBehaviorMsgOP();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((IMBehaviorMsgOP)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localIMBehavior.msgOp = ((IMBehaviorMsgOP)localObject1);
        paramInt += 1;
      }
      GMTrace.o(10715809185792L, 79839);
      return 0;
    }
    GMTrace.o(10715809185792L, 79839);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\IMBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */