package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class buy
  extends com.tencent.mm.bm.a
{
  public b tVL;
  public String vdq;
  
  public buy()
  {
    GMTrace.i(15352629035008L, 114386);
    GMTrace.o(15352629035008L, 114386);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15352763252736L, 114387);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vdq != null) {
        paramVarArgs.e(1, this.vdq);
      }
      if (this.tVL != null) {
        paramVarArgs.b(2, this.tVL);
      }
      GMTrace.o(15352763252736L, 114387);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vdq == null) {
        break label295;
      }
    }
    label295:
    for (paramInt = b.a.a.b.b.a.f(1, this.vdq) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tVL != null) {
        i = paramInt + b.a.a.a.a(2, this.tVL);
      }
      GMTrace.o(15352763252736L, 114387);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15352763252736L, 114387);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        buy localbuy = (buy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15352763252736L, 114387);
          return -1;
        case 1: 
          localbuy.vdq = locala.yqV.readString();
          GMTrace.o(15352763252736L, 114387);
          return 0;
        }
        localbuy.tVL = locala.csV();
        GMTrace.o(15352763252736L, 114387);
        return 0;
      }
      GMTrace.o(15352763252736L, 114387);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */