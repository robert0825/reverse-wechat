package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class IMBehaviorMsgOP
  extends com.tencent.mm.bm.a
{
  public int appMsgInnerType;
  public int count;
  public int msgOpType;
  public int msgType;
  
  public IMBehaviorMsgOP()
  {
    GMTrace.i(10713527484416L, 79822);
    GMTrace.o(10713527484416L, 79822);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10713661702144L, 79823);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.msgType);
      paramVarArgs.fk(2, this.msgOpType);
      paramVarArgs.fk(3, this.appMsgInnerType);
      paramVarArgs.fk(4, this.count);
      GMTrace.o(10713661702144L, 79823);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.msgType);
      int i = b.a.a.a.fh(2, this.msgOpType);
      int j = b.a.a.a.fh(3, this.appMsgInnerType);
      int k = b.a.a.a.fh(4, this.count);
      GMTrace.o(10713661702144L, 79823);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10713661702144L, 79823);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      IMBehaviorMsgOP localIMBehaviorMsgOP = (IMBehaviorMsgOP)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10713661702144L, 79823);
        return -1;
      case 1: 
        localIMBehaviorMsgOP.msgType = locala.yqV.nj();
        GMTrace.o(10713661702144L, 79823);
        return 0;
      case 2: 
        localIMBehaviorMsgOP.msgOpType = locala.yqV.nj();
        GMTrace.o(10713661702144L, 79823);
        return 0;
      case 3: 
        localIMBehaviorMsgOP.appMsgInnerType = locala.yqV.nj();
        GMTrace.o(10713661702144L, 79823);
        return 0;
      }
      localIMBehaviorMsgOP.count = locala.yqV.nj();
      GMTrace.o(10713661702144L, 79823);
      return 0;
    }
    GMTrace.o(10713661702144L, 79823);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\IMBehaviorMsgOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */