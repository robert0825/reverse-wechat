package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;

public final class g
  extends com.tencent.mm.bm.a
{
  public String pzj;
  public int pzk;
  
  public g()
  {
    GMTrace.i(8864812498944L, 66048);
    GMTrace.o(8864812498944L, 66048);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(8864946716672L, 66049);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.pzj != null) {
        paramVarArgs.e(1, this.pzj);
      }
      paramVarArgs.fk(2, this.pzk);
      GMTrace.o(8864946716672L, 66049);
      return 0;
    }
    if (paramInt == 1) {
      if (this.pzj == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.pzj) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.pzk);
      GMTrace.o(8864946716672L, 66049);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(8864946716672L, 66049);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        g localg = (g)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(8864946716672L, 66049);
          return -1;
        case 1: 
          localg.pzj = locala.yqV.readString();
          GMTrace.o(8864946716672L, 66049);
          return 0;
        }
        localg.pzk = locala.yqV.nj();
        GMTrace.o(8864946716672L, 66049);
        return 0;
      }
      GMTrace.o(8864946716672L, 66049);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\g\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */