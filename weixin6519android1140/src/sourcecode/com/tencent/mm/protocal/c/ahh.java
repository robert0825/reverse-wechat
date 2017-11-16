package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class ahh
  extends com.tencent.mm.bm.a
{
  public long eYB;
  public b uwL;
  
  public ahh()
  {
    GMTrace.i(3687632076800L, 27475);
    GMTrace.o(3687632076800L, 27475);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3687766294528L, 27476);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.eYB);
      if (this.uwL != null) {
        paramVarArgs.b(2, this.uwL);
      }
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.eYB) + 0;
      paramInt = i;
      if (this.uwL != null) {
        paramInt = i + b.a.a.a.a(2, this.uwL);
      }
      GMTrace.o(3687766294528L, 27476);
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
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ahh localahh = (ahh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3687766294528L, 27476);
        return -1;
      case 1: 
        localahh.eYB = locala.yqV.nk();
        GMTrace.o(3687766294528L, 27476);
        return 0;
      }
      localahh.uwL = locala.csV();
      GMTrace.o(3687766294528L, 27476);
      return 0;
    }
    GMTrace.o(3687766294528L, 27476);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ahh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */