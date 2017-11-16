package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class asa
  extends com.tencent.mm.bm.a
{
  public String lPj;
  public String uHY;
  
  public asa()
  {
    GMTrace.i(3939827187712L, 29354);
    GMTrace.o(3939827187712L, 29354);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3939961405440L, 29355);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHY != null) {
        paramVarArgs.e(1, this.uHY);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      GMTrace.o(3939961405440L, 29355);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uHY == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uHY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPj != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPj);
      }
      GMTrace.o(3939961405440L, 29355);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3939961405440L, 29355);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        asa localasa = (asa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3939961405440L, 29355);
          return -1;
        case 1: 
          localasa.uHY = locala.yqV.readString();
          GMTrace.o(3939961405440L, 29355);
          return 0;
        }
        localasa.lPj = locala.yqV.readString();
        GMTrace.o(3939961405440L, 29355);
        return 0;
      }
      GMTrace.o(3939961405440L, 29355);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\asa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */