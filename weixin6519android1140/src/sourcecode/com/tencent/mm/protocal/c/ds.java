package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ds
  extends com.tencent.mm.bm.a
{
  public String lPF;
  public String lPg;
  public String lRT;
  public String lRV;
  public String tRV;
  public String tRW;
  public String tRX;
  public int tRm;
  
  public ds()
  {
    GMTrace.i(3902246223872L, 29074);
    GMTrace.o(3902246223872L, 29074);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3902380441600L, 29075);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.tRV != null) {
        paramVarArgs.e(2, this.tRV);
      }
      if (this.lRV != null) {
        paramVarArgs.e(3, this.lRV);
      }
      if (this.lRT != null) {
        paramVarArgs.e(4, this.lRT);
      }
      paramVarArgs.fk(5, this.tRm);
      if (this.lPF != null) {
        paramVarArgs.e(6, this.lPF);
      }
      if (this.tRW != null) {
        paramVarArgs.e(7, this.tRW);
      }
      if (this.tRX != null) {
        paramVarArgs.e(8, this.tRX);
      }
      GMTrace.o(3902380441600L, 29075);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPg == null) {
        break label682;
      }
    }
    label682:
    for (int i = b.a.a.b.b.a.f(1, this.lPg) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tRV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tRV);
      }
      i = paramInt;
      if (this.lRV != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lRV);
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRT);
      }
      i = paramInt + b.a.a.a.fh(5, this.tRm);
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPF);
      }
      i = paramInt;
      if (this.tRW != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tRW);
      }
      paramInt = i;
      if (this.tRX != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tRX);
      }
      GMTrace.o(3902380441600L, 29075);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3902380441600L, 29075);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ds localds = (ds)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3902380441600L, 29075);
          return -1;
        case 1: 
          localds.lPg = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 2: 
          localds.tRV = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 3: 
          localds.lRV = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 4: 
          localds.lRT = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 5: 
          localds.tRm = locala.yqV.nj();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 6: 
          localds.lPF = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        case 7: 
          localds.tRW = locala.yqV.readString();
          GMTrace.o(3902380441600L, 29075);
          return 0;
        }
        localds.tRX = locala.yqV.readString();
        GMTrace.o(3902380441600L, 29075);
        return 0;
      }
      GMTrace.o(3902380441600L, 29075);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */