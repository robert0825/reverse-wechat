package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsd
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String nIp;
  public String vbv;
  public long vbw;
  
  public bsd()
  {
    GMTrace.i(3665486151680L, 27310);
    GMTrace.o(3665486151680L, 27310);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3665620369408L, 27311);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.nIp == null) {
        throw new b("Not all required fields were included: Content");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.nIp != null) {
        paramVarArgs.e(3, this.nIp);
      }
      paramVarArgs.T(4, this.vbw);
      GMTrace.o(3665620369408L, 27311);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label522;
      }
    }
    label522:
    for (int i = b.a.a.b.b.a.f(1, this.vbv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIp);
      }
      paramInt = b.a.a.a.S(4, this.vbw);
      GMTrace.o(3665620369408L, 27311);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.eBt == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.nIp == null) {
          throw new b("Not all required fields were included: Content");
        }
        GMTrace.o(3665620369408L, 27311);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsd localbsd = (bsd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3665620369408L, 27311);
          return -1;
        case 1: 
          localbsd.vbv = locala.yqV.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        case 2: 
          localbsd.eBt = locala.yqV.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        case 3: 
          localbsd.nIp = locala.yqV.readString();
          GMTrace.o(3665620369408L, 27311);
          return 0;
        }
        localbsd.vbw = locala.yqV.nk();
        GMTrace.o(3665620369408L, 27311);
        return 0;
      }
      GMTrace.o(3665620369408L, 27311);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */