package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bat
  extends com.tencent.mm.bm.a
{
  public long uKe;
  public String uOq;
  
  public bat()
  {
    GMTrace.i(15351286857728L, 114376);
    GMTrace.o(15351286857728L, 114376);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15351421075456L, 114377);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uOq == null) {
        throw new b("Not all required fields were included: Query");
      }
      if (this.uOq != null) {
        paramVarArgs.e(1, this.uOq);
      }
      paramVarArgs.T(2, this.uKe);
      GMTrace.o(15351421075456L, 114377);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uOq == null) {
        break label318;
      }
    }
    label318:
    for (paramInt = b.a.a.b.b.a.f(1, this.uOq) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.uKe);
      GMTrace.o(15351421075456L, 114377);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uOq == null) {
          throw new b("Not all required fields were included: Query");
        }
        GMTrace.o(15351421075456L, 114377);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bat localbat = (bat)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15351421075456L, 114377);
          return -1;
        case 1: 
          localbat.uOq = locala.yqV.readString();
          GMTrace.o(15351421075456L, 114377);
          return 0;
        }
        localbat.uKe = locala.yqV.nk();
        GMTrace.o(15351421075456L, 114377);
        return 0;
      }
      GMTrace.o(15351421075456L, 114377);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */