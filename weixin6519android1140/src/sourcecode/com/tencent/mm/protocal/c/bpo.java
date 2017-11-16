package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bpo
  extends com.tencent.mm.bm.a
{
  public String lnX;
  public int uZI;
  public int uZJ;
  public int uZK;
  public String userName;
  
  public bpo()
  {
    GMTrace.i(19145085157376L, 142642);
    GMTrace.o(19145085157376L, 142642);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19145219375104L, 142643);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uZI);
      paramVarArgs.fk(2, this.uZJ);
      paramVarArgs.fk(3, this.uZK);
      if (this.userName != null) {
        paramVarArgs.e(4, this.userName);
      }
      if (this.lnX != null) {
        paramVarArgs.e(5, this.lnX);
      }
      GMTrace.o(19145219375104L, 142643);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uZI) + 0 + b.a.a.a.fh(2, this.uZJ) + b.a.a.a.fh(3, this.uZK);
      paramInt = i;
      if (this.userName != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.userName);
      }
      i = paramInt;
      if (this.lnX != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lnX);
      }
      GMTrace.o(19145219375104L, 142643);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19145219375104L, 142643);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpo localbpo = (bpo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(19145219375104L, 142643);
        return -1;
      case 1: 
        localbpo.uZI = locala.yqV.nj();
        GMTrace.o(19145219375104L, 142643);
        return 0;
      case 2: 
        localbpo.uZJ = locala.yqV.nj();
        GMTrace.o(19145219375104L, 142643);
        return 0;
      case 3: 
        localbpo.uZK = locala.yqV.nj();
        GMTrace.o(19145219375104L, 142643);
        return 0;
      case 4: 
        localbpo.userName = locala.yqV.readString();
        GMTrace.o(19145219375104L, 142643);
        return 0;
      }
      localbpo.lnX = locala.yqV.readString();
      GMTrace.o(19145219375104L, 142643);
      return 0;
    }
    GMTrace.o(19145219375104L, 142643);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */