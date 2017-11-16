package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akq
  extends com.tencent.mm.bm.a
{
  public String oqQ;
  public String tVN;
  
  public akq()
  {
    GMTrace.i(3682531803136L, 27437);
    GMTrace.o(3682531803136L, 27437);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3682666020864L, 27438);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVN != null) {
        paramVarArgs.e(1, this.tVN);
      }
      if (this.oqQ != null) {
        paramVarArgs.e(2, this.oqQ);
      }
      GMTrace.o(3682666020864L, 27438);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVN == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVN) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.oqQ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.oqQ);
      }
      GMTrace.o(3682666020864L, 27438);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3682666020864L, 27438);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        akq localakq = (akq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3682666020864L, 27438);
          return -1;
        case 1: 
          localakq.tVN = locala.yqV.readString();
          GMTrace.o(3682666020864L, 27438);
          return 0;
        }
        localakq.oqQ = locala.yqV.readString();
        GMTrace.o(3682666020864L, 27438);
        return 0;
      }
      GMTrace.o(3682666020864L, 27438);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\akq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */