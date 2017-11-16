package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anl
  extends com.tencent.mm.bm.a
{
  public String bssid;
  public int eGw;
  public String ssid;
  
  public anl()
  {
    GMTrace.i(3764136181760L, 28045);
    GMTrace.o(3764136181760L, 28045);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3764270399488L, 28046);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ssid != null) {
        paramVarArgs.e(1, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.e(2, this.bssid);
      }
      paramVarArgs.fk(3, this.eGw);
      GMTrace.o(3764270399488L, 28046);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.bssid);
      }
      paramInt = b.a.a.a.fh(3, this.eGw);
      GMTrace.o(3764270399488L, 28046);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3764270399488L, 28046);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        anl localanl = (anl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3764270399488L, 28046);
          return -1;
        case 1: 
          localanl.ssid = locala.yqV.readString();
          GMTrace.o(3764270399488L, 28046);
          return 0;
        case 2: 
          localanl.bssid = locala.yqV.readString();
          GMTrace.o(3764270399488L, 28046);
          return 0;
        }
        localanl.eGw = locala.yqV.nj();
        GMTrace.o(3764270399488L, 28046);
        return 0;
      }
      GMTrace.o(3764270399488L, 28046);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\anl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */