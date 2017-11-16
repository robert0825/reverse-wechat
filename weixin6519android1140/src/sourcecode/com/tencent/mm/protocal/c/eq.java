package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class eq
  extends com.tencent.mm.bm.a
{
  public String imei;
  public String tTx;
  public String tTy;
  public String tTz;
  
  public eq()
  {
    GMTrace.i(18665525215232L, 139069);
    GMTrace.o(18665525215232L, 139069);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18665659432960L, 139070);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.imei != null) {
        paramVarArgs.e(1, this.imei);
      }
      if (this.tTx != null) {
        paramVarArgs.e(2, this.tTx);
      }
      if (this.tTy != null) {
        paramVarArgs.e(3, this.tTy);
      }
      if (this.tTz != null) {
        paramVarArgs.e(4, this.tTz);
      }
      GMTrace.o(18665659432960L, 139070);
      return 0;
    }
    if (paramInt == 1) {
      if (this.imei == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.imei) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tTx != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tTx);
      }
      i = paramInt;
      if (this.tTy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tTy);
      }
      paramInt = i;
      if (this.tTz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tTz);
      }
      GMTrace.o(18665659432960L, 139070);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18665659432960L, 139070);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        eq localeq = (eq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18665659432960L, 139070);
          return -1;
        case 1: 
          localeq.imei = locala.yqV.readString();
          GMTrace.o(18665659432960L, 139070);
          return 0;
        case 2: 
          localeq.tTx = locala.yqV.readString();
          GMTrace.o(18665659432960L, 139070);
          return 0;
        case 3: 
          localeq.tTy = locala.yqV.readString();
          GMTrace.o(18665659432960L, 139070);
          return 0;
        }
        localeq.tTz = locala.yqV.readString();
        GMTrace.o(18665659432960L, 139070);
        return 0;
      }
      GMTrace.o(18665659432960L, 139070);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */