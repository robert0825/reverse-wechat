package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bmw
  extends com.tencent.mm.bm.a
{
  public String jhm;
  public String lRT;
  public String lRV;
  public String tSz;
  public String uIj;
  public long uWY;
  public String ueB;
  public String uwk;
  
  public bmw()
  {
    GMTrace.i(3866946961408L, 28811);
    GMTrace.o(3866946961408L, 28811);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3867081179136L, 28812);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ueB != null) {
        paramVarArgs.e(1, this.ueB);
      }
      if (this.tSz != null) {
        paramVarArgs.e(2, this.tSz);
      }
      if (this.uIj != null) {
        paramVarArgs.e(3, this.uIj);
      }
      if (this.lRT != null) {
        paramVarArgs.e(4, this.lRT);
      }
      if (this.jhm != null) {
        paramVarArgs.e(5, this.jhm);
      }
      if (this.lRV != null) {
        paramVarArgs.e(6, this.lRV);
      }
      if (this.uwk != null) {
        paramVarArgs.e(7, this.uwk);
      }
      paramVarArgs.T(8, this.uWY);
      GMTrace.o(3867081179136L, 28812);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ueB == null) {
        break label682;
      }
    }
    label682:
    for (int i = b.a.a.b.b.a.f(1, this.ueB) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tSz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tSz);
      }
      i = paramInt;
      if (this.uIj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uIj);
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRT);
      }
      i = paramInt;
      if (this.jhm != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jhm);
      }
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lRV);
      }
      i = paramInt;
      if (this.uwk != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uwk);
      }
      paramInt = b.a.a.a.S(8, this.uWY);
      GMTrace.o(3867081179136L, 28812);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3867081179136L, 28812);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bmw localbmw = (bmw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3867081179136L, 28812);
          return -1;
        case 1: 
          localbmw.ueB = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 2: 
          localbmw.tSz = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 3: 
          localbmw.uIj = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 4: 
          localbmw.lRT = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 5: 
          localbmw.jhm = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 6: 
          localbmw.lRV = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        case 7: 
          localbmw.uwk = locala.yqV.readString();
          GMTrace.o(3867081179136L, 28812);
          return 0;
        }
        localbmw.uWY = locala.yqV.nk();
        GMTrace.o(3867081179136L, 28812);
        return 0;
      }
      GMTrace.o(3867081179136L, 28812);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */