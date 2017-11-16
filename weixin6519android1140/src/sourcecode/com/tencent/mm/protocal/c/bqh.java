package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqh
  extends com.tencent.mm.bm.a
{
  public String lQe;
  public String lSY;
  public String uJL;
  public String vau;
  public String vav;
  
  public bqh()
  {
    GMTrace.i(3942511542272L, 29374);
    GMTrace.o(3942511542272L, 29374);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3942645760000L, 29375);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uJL != null) {
        paramVarArgs.e(1, this.uJL);
      }
      if (this.vau != null) {
        paramVarArgs.e(2, this.vau);
      }
      if (this.lSY != null) {
        paramVarArgs.e(3, this.lSY);
      }
      if (this.lQe != null) {
        paramVarArgs.e(4, this.lQe);
      }
      if (this.vav != null) {
        paramVarArgs.e(5, this.vav);
      }
      GMTrace.o(3942645760000L, 29375);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uJL == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.uJL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vau != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vau);
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSY);
      }
      paramInt = i;
      if (this.lQe != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQe);
      }
      i = paramInt;
      if (this.vav != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.vav);
      }
      GMTrace.o(3942645760000L, 29375);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3942645760000L, 29375);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqh localbqh = (bqh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3942645760000L, 29375);
          return -1;
        case 1: 
          localbqh.uJL = locala.yqV.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 2: 
          localbqh.vau = locala.yqV.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 3: 
          localbqh.lSY = locala.yqV.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        case 4: 
          localbqh.lQe = locala.yqV.readString();
          GMTrace.o(3942645760000L, 29375);
          return 0;
        }
        localbqh.vav = locala.yqV.readString();
        GMTrace.o(3942645760000L, 29375);
        return 0;
      }
      GMTrace.o(3942645760000L, 29375);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */