package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class aqx
  extends com.tencent.mm.bm.a
{
  public int uHe;
  public b uHf;
  
  public aqx()
  {
    GMTrace.i(20024211275776L, 149192);
    GMTrace.o(20024211275776L, 149192);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20024345493504L, 149193);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uHe);
      if (this.uHf != null) {
        paramVarArgs.b(2, this.uHf);
      }
      GMTrace.o(20024345493504L, 149193);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uHe) + 0;
      paramInt = i;
      if (this.uHf != null) {
        paramInt = i + b.a.a.a.a(2, this.uHf);
      }
      GMTrace.o(20024345493504L, 149193);
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
      GMTrace.o(20024345493504L, 149193);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aqx localaqx = (aqx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20024345493504L, 149193);
        return -1;
      case 1: 
        localaqx.uHe = locala.yqV.nj();
        GMTrace.o(20024345493504L, 149193);
        return 0;
      }
      localaqx.uHf = locala.csV();
      GMTrace.o(20024345493504L, 149193);
      return 0;
    }
    GMTrace.o(20024345493504L, 149193);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */