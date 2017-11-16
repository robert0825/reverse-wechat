package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class l
  extends com.tencent.mm.bm.a
{
  public String qXr;
  
  public l()
  {
    GMTrace.i(18428228272128L, 137301);
    GMTrace.o(18428228272128L, 137301);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18428362489856L, 137302);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.qXr != null) {
        paramVarArgs.e(1, this.qXr);
      }
      GMTrace.o(18428362489856L, 137302);
      return 0;
    }
    if (paramInt == 1) {
      if (this.qXr == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.qXr) + 0;; paramInt = 0)
    {
      GMTrace.o(18428362489856L, 137302);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18428362489856L, 137302);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        l locall = (l)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18428362489856L, 137302);
          return -1;
        }
        locall.qXr = locala.yqV.readString();
        GMTrace.o(18428362489856L, 137302);
        return 0;
      }
      GMTrace.o(18428362489856L, 137302);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */