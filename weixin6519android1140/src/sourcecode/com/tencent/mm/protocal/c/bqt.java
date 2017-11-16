package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bqt
  extends com.tencent.mm.bm.a
{
  public b vaF;
  public b vaG;
  
  public bqt()
  {
    GMTrace.i(3823863070720L, 28490);
    GMTrace.o(3823863070720L, 28490);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3823997288448L, 28491);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaF != null) {
        paramVarArgs.b(1, this.vaF);
      }
      if (this.vaG != null) {
        paramVarArgs.b(2, this.vaG);
      }
      GMTrace.o(3823997288448L, 28491);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaF == null) {
        break label300;
      }
    }
    label300:
    for (paramInt = b.a.a.a.a(1, this.vaF) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.vaG != null) {
        i = paramInt + b.a.a.a.a(2, this.vaG);
      }
      GMTrace.o(3823997288448L, 28491);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3823997288448L, 28491);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqt localbqt = (bqt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3823997288448L, 28491);
          return -1;
        case 1: 
          localbqt.vaF = locala.csV();
          GMTrace.o(3823997288448L, 28491);
          return 0;
        }
        localbqt.vaG = locala.csV();
        GMTrace.o(3823997288448L, 28491);
        return 0;
      }
      GMTrace.o(3823997288448L, 28491);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */