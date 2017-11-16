package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ck
  extends com.tencent.mm.bm.a
{
  public String mac;
  public String ssid;
  public int tQu;
  
  public ck()
  {
    GMTrace.i(4033779597312L, 30054);
    GMTrace.o(4033779597312L, 30054);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4033913815040L, 30055);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mac != null) {
        paramVarArgs.e(1, this.mac);
      }
      paramVarArgs.fk(2, this.tQu);
      if (this.ssid != null) {
        paramVarArgs.e(3, this.ssid);
      }
      GMTrace.o(4033913815040L, 30055);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mac == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.mac) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tQu);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ssid);
      }
      GMTrace.o(4033913815040L, 30055);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4033913815040L, 30055);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ck localck = (ck)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4033913815040L, 30055);
          return -1;
        case 1: 
          localck.mac = locala.yqV.readString();
          GMTrace.o(4033913815040L, 30055);
          return 0;
        case 2: 
          localck.tQu = locala.yqV.nj();
          GMTrace.o(4033913815040L, 30055);
          return 0;
        }
        localck.ssid = locala.yqV.readString();
        GMTrace.o(4033913815040L, 30055);
        return 0;
      }
      GMTrace.o(4033913815040L, 30055);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */