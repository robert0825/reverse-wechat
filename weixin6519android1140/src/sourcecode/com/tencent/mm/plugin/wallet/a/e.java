package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class e
  extends com.tencent.mm.bm.a
{
  public String qXt;
  public String qXu;
  public String qXv;
  
  public e()
  {
    GMTrace.i(7697386700800L, 57350);
    GMTrace.o(7697386700800L, 57350);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7697520918528L, 57351);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.qXt != null) {
        paramVarArgs.e(1, this.qXt);
      }
      if (this.qXu != null) {
        paramVarArgs.e(2, this.qXu);
      }
      if (this.qXv != null) {
        paramVarArgs.e(3, this.qXv);
      }
      GMTrace.o(7697520918528L, 57351);
      return 0;
    }
    if (paramInt == 1) {
      if (this.qXt == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.qXt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.qXu != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.qXu);
      }
      i = paramInt;
      if (this.qXv != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.qXv);
      }
      GMTrace.o(7697520918528L, 57351);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(7697520918528L, 57351);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        e locale = (e)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(7697520918528L, 57351);
          return -1;
        case 1: 
          locale.qXt = locala.yqV.readString();
          GMTrace.o(7697520918528L, 57351);
          return 0;
        case 2: 
          locale.qXu = locala.yqV.readString();
          GMTrace.o(7697520918528L, 57351);
          return 0;
        }
        locale.qXv = locala.yqV.readString();
        GMTrace.o(7697520918528L, 57351);
        return 0;
      }
      GMTrace.o(7697520918528L, 57351);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */