package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bm.a
{
  public String qXr;
  public int qXs;
  
  public c()
  {
    GMTrace.i(18427959836672L, 137299);
    GMTrace.o(18427959836672L, 137299);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18428094054400L, 137300);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.qXr != null) {
        paramVarArgs.e(1, this.qXr);
      }
      paramVarArgs.fk(2, this.qXs);
      GMTrace.o(18428094054400L, 137300);
      return 0;
    }
    if (paramInt == 1) {
      if (this.qXr == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.qXr) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.qXs);
      GMTrace.o(18428094054400L, 137300);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18428094054400L, 137300);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        c localc = (c)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18428094054400L, 137300);
          return -1;
        case 1: 
          localc.qXr = locala.yqV.readString();
          GMTrace.o(18428094054400L, 137300);
          return 0;
        }
        localc.qXs = locala.yqV.nj();
        GMTrace.o(18428094054400L, 137300);
        return 0;
      }
      GMTrace.o(18428094054400L, 137300);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */