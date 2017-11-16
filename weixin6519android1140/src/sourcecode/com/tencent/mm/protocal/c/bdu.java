package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdu
  extends com.tencent.mm.bm.a
{
  public String uPK;
  
  public bdu()
  {
    GMTrace.i(3828426473472L, 28524);
    GMTrace.o(3828426473472L, 28524);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3828560691200L, 28525);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uPK != null) {
        paramVarArgs.e(1, this.uPK);
      }
      GMTrace.o(3828560691200L, 28525);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uPK == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.uPK) + 0;; paramInt = 0)
    {
      GMTrace.o(3828560691200L, 28525);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3828560691200L, 28525);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdu localbdu = (bdu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3828560691200L, 28525);
          return -1;
        }
        localbdu.uPK = locala.yqV.readString();
        GMTrace.o(3828560691200L, 28525);
        return 0;
      }
      GMTrace.o(3828560691200L, 28525);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */