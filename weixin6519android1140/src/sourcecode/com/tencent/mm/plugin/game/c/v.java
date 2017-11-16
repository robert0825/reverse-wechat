package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class v
  extends com.tencent.mm.bm.a
{
  public String lPE;
  public int lQl;
  
  public v()
  {
    GMTrace.i(16561528111104L, 123393);
    GMTrace.o(16561528111104L, 123393);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16561662328832L, 123394);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lQl);
      if (this.lPE != null) {
        paramVarArgs.e(2, this.lPE);
      }
      GMTrace.o(16561662328832L, 123394);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lQl) + 0;
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPE);
      }
      GMTrace.o(16561662328832L, 123394);
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
      GMTrace.o(16561662328832L, 123394);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      v localv = (v)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(16561662328832L, 123394);
        return -1;
      case 1: 
        localv.lQl = locala.yqV.nj();
        GMTrace.o(16561662328832L, 123394);
        return 0;
      }
      localv.lPE = locala.yqV.readString();
      GMTrace.o(16561662328832L, 123394);
      return 0;
    }
    GMTrace.o(16561662328832L, 123394);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */