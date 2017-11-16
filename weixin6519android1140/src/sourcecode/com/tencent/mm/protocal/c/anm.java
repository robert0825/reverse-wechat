package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anm
  extends com.tencent.mm.bm.a
{
  public String bssid;
  public String eCE;
  public int eGw;
  public int low;
  public String ssid;
  public int uCo;
  public String uCp;
  
  public anm()
  {
    GMTrace.i(3886140096512L, 28954);
    GMTrace.o(3886140096512L, 28954);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3886274314240L, 28955);
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
      paramVarArgs.fk(4, this.uCo);
      if (this.uCp != null) {
        paramVarArgs.e(5, this.uCp);
      }
      if (this.eCE != null) {
        paramVarArgs.e(6, this.eCE);
      }
      paramVarArgs.fk(7, this.low);
      GMTrace.o(3886274314240L, 28955);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label582;
      }
    }
    label582:
    for (paramInt = b.a.a.b.b.a.f(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.bssid);
      }
      i = i + b.a.a.a.fh(3, this.eGw) + b.a.a.a.fh(4, this.uCo);
      paramInt = i;
      if (this.uCp != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uCp);
      }
      i = paramInt;
      if (this.eCE != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.eCE);
      }
      paramInt = b.a.a.a.fh(7, this.low);
      GMTrace.o(3886274314240L, 28955);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3886274314240L, 28955);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        anm localanm = (anm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3886274314240L, 28955);
          return -1;
        case 1: 
          localanm.ssid = locala.yqV.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 2: 
          localanm.bssid = locala.yqV.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 3: 
          localanm.eGw = locala.yqV.nj();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 4: 
          localanm.uCo = locala.yqV.nj();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 5: 
          localanm.uCp = locala.yqV.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        case 6: 
          localanm.eCE = locala.yqV.readString();
          GMTrace.o(3886274314240L, 28955);
          return 0;
        }
        localanm.low = locala.yqV.nj();
        GMTrace.o(3886274314240L, 28955);
        return 0;
      }
      GMTrace.o(3886274314240L, 28955);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\anm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */