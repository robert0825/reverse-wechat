package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class arh
  extends com.tencent.mm.bm.a
{
  public String lPC;
  public String lPg;
  public int lPo;
  public String lRT;
  public String tOY;
  public String tPa;
  public String tVD;
  public int tVE;
  public String uHt;
  public String uHu;
  public String uHv;
  public String uHw;
  public String uHx;
  public String uHy;
  
  public arh()
  {
    GMTrace.i(3899024998400L, 29050);
    GMTrace.o(3899024998400L, 29050);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3899159216128L, 29051);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.lRT != null) {
        paramVarArgs.e(2, this.lRT);
      }
      if (this.uHt != null) {
        paramVarArgs.e(3, this.uHt);
      }
      if (this.tOY != null) {
        paramVarArgs.e(4, this.tOY);
      }
      if (this.lPC != null) {
        paramVarArgs.e(5, this.lPC);
      }
      paramVarArgs.fk(6, this.tVE);
      if (this.uHu != null) {
        paramVarArgs.e(7, this.uHu);
      }
      if (this.tPa != null) {
        paramVarArgs.e(8, this.tPa);
      }
      if (this.tVD != null) {
        paramVarArgs.e(9, this.tVD);
      }
      if (this.uHv != null) {
        paramVarArgs.e(10, this.uHv);
      }
      if (this.uHw != null) {
        paramVarArgs.e(11, this.uHw);
      }
      if (this.uHx != null) {
        paramVarArgs.e(12, this.uHx);
      }
      if (this.uHy != null) {
        paramVarArgs.e(13, this.uHy);
      }
      paramVarArgs.fk(14, this.lPo);
      GMTrace.o(3899159216128L, 29051);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPg == null) {
        break label1062;
      }
    }
    label1062:
    for (int i = b.a.a.b.b.a.f(1, this.lPg) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRT);
      }
      i = paramInt;
      if (this.uHt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uHt);
      }
      paramInt = i;
      if (this.tOY != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tOY);
      }
      i = paramInt;
      if (this.lPC != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPC);
      }
      i += b.a.a.a.fh(6, this.tVE);
      paramInt = i;
      if (this.uHu != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uHu);
      }
      i = paramInt;
      if (this.tPa != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tPa);
      }
      paramInt = i;
      if (this.tVD != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tVD);
      }
      i = paramInt;
      if (this.uHv != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uHv);
      }
      paramInt = i;
      if (this.uHw != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uHw);
      }
      i = paramInt;
      if (this.uHx != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uHx);
      }
      paramInt = i;
      if (this.uHy != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.uHy);
      }
      i = b.a.a.a.fh(14, this.lPo);
      GMTrace.o(3899159216128L, 29051);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3899159216128L, 29051);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        arh localarh = (arh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3899159216128L, 29051);
          return -1;
        case 1: 
          localarh.lPg = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 2: 
          localarh.lRT = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 3: 
          localarh.uHt = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 4: 
          localarh.tOY = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 5: 
          localarh.lPC = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 6: 
          localarh.tVE = locala.yqV.nj();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 7: 
          localarh.uHu = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 8: 
          localarh.tPa = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 9: 
          localarh.tVD = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 10: 
          localarh.uHv = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 11: 
          localarh.uHw = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 12: 
          localarh.uHx = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        case 13: 
          localarh.uHy = locala.yqV.readString();
          GMTrace.o(3899159216128L, 29051);
          return 0;
        }
        localarh.lPo = locala.yqV.nj();
        GMTrace.o(3899159216128L, 29051);
        return 0;
      }
      GMTrace.o(3899159216128L, 29051);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\arh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */