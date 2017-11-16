package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class rc
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPj;
  public String uhb;
  public String uhc;
  public String uhd;
  
  public rc()
  {
    GMTrace.i(4029753065472L, 30024);
    GMTrace.o(4029753065472L, 30024);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4029887283200L, 30025);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.uhb != null) {
        paramVarArgs.e(2, this.uhb);
      }
      if (this.uhc != null) {
        paramVarArgs.e(3, this.uhc);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.uhd != null) {
        paramVarArgs.e(5, this.uhd);
      }
      GMTrace.o(4029887283200L, 30025);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uhb != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uhb);
      }
      i = paramInt;
      if (this.uhc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uhc);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.uhd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uhd);
      }
      GMTrace.o(4029887283200L, 30025);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4029887283200L, 30025);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        rc localrc = (rc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4029887283200L, 30025);
          return -1;
        case 1: 
          localrc.eBt = locala.yqV.readString();
          GMTrace.o(4029887283200L, 30025);
          return 0;
        case 2: 
          localrc.uhb = locala.yqV.readString();
          GMTrace.o(4029887283200L, 30025);
          return 0;
        case 3: 
          localrc.uhc = locala.yqV.readString();
          GMTrace.o(4029887283200L, 30025);
          return 0;
        case 4: 
          localrc.lPj = locala.yqV.readString();
          GMTrace.o(4029887283200L, 30025);
          return 0;
        }
        localrc.uhd = locala.yqV.readString();
        GMTrace.o(4029887283200L, 30025);
        return 0;
      }
      GMTrace.o(4029887283200L, 30025);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */