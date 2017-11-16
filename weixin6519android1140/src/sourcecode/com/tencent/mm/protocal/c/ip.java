package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ip
  extends com.tencent.mm.bm.a
{
  public ip()
  {
    GMTrace.i(3752325021696L, 27957);
    GMTrace.o(3752325021696L, 27957);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3752459239424L, 27958);
    if (paramInt == 0)
    {
      GMTrace.o(3752459239424L, 27958);
      return 0;
    }
    if (paramInt == 1)
    {
      GMTrace.o(3752459239424L, 27958);
      return 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3752459239424L, 27958);
      return 0;
    }
    if (paramInt == 3)
    {
      ((Integer)paramVarArgs[2]).intValue();
      GMTrace.o(3752459239424L, 27958);
      return -1;
    }
    GMTrace.o(3752459239424L, 27958);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */