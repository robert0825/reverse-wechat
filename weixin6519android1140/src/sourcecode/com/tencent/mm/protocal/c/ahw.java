package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahw
  extends com.tencent.mm.bm.a
{
  public int jhV;
  public String lPM;
  public String lPi;
  public String ugy;
  public String uhC;
  
  public ahw()
  {
    GMTrace.i(3896072208384L, 29028);
    GMTrace.o(3896072208384L, 29028);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3896206426112L, 29029);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhC != null) {
        paramVarArgs.e(1, this.uhC);
      }
      paramVarArgs.fk(2, this.jhV);
      if (this.ugy != null) {
        paramVarArgs.e(3, this.ugy);
      }
      if (this.lPM != null) {
        paramVarArgs.e(4, this.lPM);
      }
      if (this.lPi != null) {
        paramVarArgs.e(5, this.lPi);
      }
      GMTrace.o(3896206426112L, 29029);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uhC == null) {
        break label482;
      }
    }
    label482:
    for (paramInt = b.a.a.b.b.a.f(1, this.uhC) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jhV);
      paramInt = i;
      if (this.ugy != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ugy);
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPM);
      }
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lPi);
      }
      GMTrace.o(3896206426112L, 29029);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3896206426112L, 29029);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahw localahw = (ahw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3896206426112L, 29029);
          return -1;
        case 1: 
          localahw.uhC = locala.yqV.readString();
          GMTrace.o(3896206426112L, 29029);
          return 0;
        case 2: 
          localahw.jhV = locala.yqV.nj();
          GMTrace.o(3896206426112L, 29029);
          return 0;
        case 3: 
          localahw.ugy = locala.yqV.readString();
          GMTrace.o(3896206426112L, 29029);
          return 0;
        case 4: 
          localahw.lPM = locala.yqV.readString();
          GMTrace.o(3896206426112L, 29029);
          return 0;
        }
        localahw.lPi = locala.yqV.readString();
        GMTrace.o(3896206426112L, 29029);
        return 0;
      }
      GMTrace.o(3896206426112L, 29029);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */