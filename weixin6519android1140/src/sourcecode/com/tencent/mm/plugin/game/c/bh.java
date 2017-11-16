package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bh
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPD;
  public String lPE;
  public String lPF;
  public String lPj;
  public String lRR;
  public String lSb;
  public String lSc;
  
  public bh()
  {
    GMTrace.i(12649349775360L, 94245);
    GMTrace.o(12649349775360L, 94245);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12649483993088L, 94246);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRR != null) {
        paramVarArgs.e(1, this.lRR);
      }
      if (this.lSb != null) {
        paramVarArgs.e(2, this.lSb);
      }
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.lSc != null) {
        paramVarArgs.e(5, this.lSc);
      }
      if (this.lPE != null) {
        paramVarArgs.e(6, this.lPE);
      }
      if (this.lPD != null) {
        paramVarArgs.e(7, this.lPD);
      }
      if (this.lPF != null) {
        paramVarArgs.e(8, this.lPF);
      }
      GMTrace.o(12649483993088L, 94246);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRR == null) {
        break label684;
      }
    }
    label684:
    for (int i = b.a.a.b.b.a.f(1, this.lRR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lSb != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSb);
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eBt);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.lSc != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lSc);
      }
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPE);
      }
      i = paramInt;
      if (this.lPD != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lPD);
      }
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.lPF);
      }
      GMTrace.o(12649483993088L, 94246);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12649483993088L, 94246);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bh localbh = (bh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12649483993088L, 94246);
          return -1;
        case 1: 
          localbh.lRR = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 2: 
          localbh.lSb = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 3: 
          localbh.eBt = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 4: 
          localbh.lPj = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 5: 
          localbh.lSc = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 6: 
          localbh.lPE = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        case 7: 
          localbh.lPD = locala.yqV.readString();
          GMTrace.o(12649483993088L, 94246);
          return 0;
        }
        localbh.lPF = locala.yqV.readString();
        GMTrace.o(12649483993088L, 94246);
        return 0;
      }
      GMTrace.o(12649483993088L, 94246);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */