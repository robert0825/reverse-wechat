package com.tencent.mm.plugin.report.kvdata;

import com.tencent.gmtrace.GMTrace;

public class IMBehaviorChattingOP
  extends com.tencent.mm.bm.a
{
  public int changeNotifyStatus;
  public int changeSaveAddress;
  public int changeTop;
  public int changeUnread;
  public int expose;
  
  public IMBehaviorChattingOP()
  {
    GMTrace.i(10715138097152L, 79834);
    GMTrace.o(10715138097152L, 79834);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(10715272314880L, 79835);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.changeUnread);
      paramVarArgs.fk(2, this.changeTop);
      paramVarArgs.fk(3, this.changeNotifyStatus);
      paramVarArgs.fk(4, this.changeSaveAddress);
      paramVarArgs.fk(5, this.expose);
      GMTrace.o(10715272314880L, 79835);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.changeUnread);
      int i = b.a.a.a.fh(2, this.changeTop);
      int j = b.a.a.a.fh(3, this.changeNotifyStatus);
      int k = b.a.a.a.fh(4, this.changeSaveAddress);
      int m = b.a.a.a.fh(5, this.expose);
      GMTrace.o(10715272314880L, 79835);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(10715272314880L, 79835);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      IMBehaviorChattingOP localIMBehaviorChattingOP = (IMBehaviorChattingOP)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(10715272314880L, 79835);
        return -1;
      case 1: 
        localIMBehaviorChattingOP.changeUnread = locala.yqV.nj();
        GMTrace.o(10715272314880L, 79835);
        return 0;
      case 2: 
        localIMBehaviorChattingOP.changeTop = locala.yqV.nj();
        GMTrace.o(10715272314880L, 79835);
        return 0;
      case 3: 
        localIMBehaviorChattingOP.changeNotifyStatus = locala.yqV.nj();
        GMTrace.o(10715272314880L, 79835);
        return 0;
      case 4: 
        localIMBehaviorChattingOP.changeSaveAddress = locala.yqV.nj();
        GMTrace.o(10715272314880L, 79835);
        return 0;
      }
      localIMBehaviorChattingOP.expose = locala.yqV.nj();
      GMTrace.o(10715272314880L, 79835);
      return 0;
    }
    GMTrace.o(10715272314880L, 79835);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\kvdata\IMBehaviorChattingOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */