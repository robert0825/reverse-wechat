package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class at
  extends com.tencent.mm.bm.a
{
  public String fjk;
  public String fjl;
  public double latitude;
  public double longitude;
  public long tOQ;
  public String tOR;
  public String tOS;
  public String tOT;
  public String tOU;
  
  public at()
  {
    GMTrace.i(3956201750528L, 29476);
    GMTrace.o(3956201750528L, 29476);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3956335968256L, 29477);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.fjk != null) {
        paramVarArgs.e(1, this.fjk);
      }
      if (this.fjl != null) {
        paramVarArgs.e(2, this.fjl);
      }
      paramVarArgs.a(3, this.latitude);
      paramVarArgs.a(4, this.longitude);
      paramVarArgs.T(5, this.tOQ);
      if (this.tOR != null) {
        paramVarArgs.e(6, this.tOR);
      }
      if (this.tOS != null) {
        paramVarArgs.e(7, this.tOS);
      }
      if (this.tOT != null) {
        paramVarArgs.e(8, this.tOT);
      }
      if (this.tOU != null) {
        paramVarArgs.e(9, this.tOU);
      }
      GMTrace.o(3956335968256L, 29477);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fjk == null) {
        break label710;
      }
    }
    label710:
    for (paramInt = b.a.a.b.b.a.f(1, this.fjk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.fjl != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.fjl);
      }
      i = i + (b.a.a.b.b.a.cK(3) + 8) + (b.a.a.b.b.a.cK(4) + 8) + b.a.a.a.S(5, this.tOQ);
      paramInt = i;
      if (this.tOR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tOR);
      }
      i = paramInt;
      if (this.tOS != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tOS);
      }
      paramInt = i;
      if (this.tOT != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tOT);
      }
      i = paramInt;
      if (this.tOU != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tOU);
      }
      GMTrace.o(3956335968256L, 29477);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3956335968256L, 29477);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        at localat = (at)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3956335968256L, 29477);
          return -1;
        case 1: 
          localat.fjk = locala.yqV.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 2: 
          localat.fjl = locala.yqV.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 3: 
          localat.latitude = locala.yqV.readDouble();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 4: 
          localat.longitude = locala.yqV.readDouble();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 5: 
          localat.tOQ = locala.yqV.nk();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 6: 
          localat.tOR = locala.yqV.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 7: 
          localat.tOS = locala.yqV.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        case 8: 
          localat.tOT = locala.yqV.readString();
          GMTrace.o(3956335968256L, 29477);
          return 0;
        }
        localat.tOU = locala.yqV.readString();
        GMTrace.o(3956335968256L, 29477);
        return 0;
      }
      GMTrace.o(3956335968256L, 29477);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */