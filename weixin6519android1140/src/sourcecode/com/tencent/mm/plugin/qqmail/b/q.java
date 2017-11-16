package com.tencent.mm.plugin.qqmail.b;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class q
  extends com.tencent.mm.bm.a
{
  public String nSb;
  
  public q()
  {
    GMTrace.i(5477425479680L, 40810);
    GMTrace.o(5477425479680L, 40810);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5477559697408L, 40811);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nSb == null) {
        throw new b("Not all required fields were included: subject");
      }
      if (this.nSb != null) {
        paramVarArgs.e(1, this.nSb);
      }
      GMTrace.o(5477559697408L, 40811);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nSb == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.nSb) + 0;; paramInt = 0)
    {
      GMTrace.o(5477559697408L, 40811);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.nSb == null) {
          throw new b("Not all required fields were included: subject");
        }
        GMTrace.o(5477559697408L, 40811);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(5477559697408L, 40811);
          return -1;
        }
        localq.nSb = locala.yqV.readString();
        GMTrace.o(5477559697408L, 40811);
        return 0;
      }
      GMTrace.o(5477559697408L, 40811);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */