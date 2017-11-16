package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btw
  extends com.tencent.mm.bm.a
{
  public String eDW;
  public int tWR;
  public String url;
  public int vcC;
  
  public btw()
  {
    GMTrace.i(17826530197504L, 132818);
    GMTrace.o(17826530197504L, 132818);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17826664415232L, 132819);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vcC);
      paramVarArgs.fk(2, this.tWR);
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      if (this.eDW != null) {
        paramVarArgs.e(4, this.eDW);
      }
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.vcC) + 0 + b.a.a.a.fh(2, this.tWR);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.url);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.eDW);
      }
      GMTrace.o(17826664415232L, 132819);
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
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      btw localbtw = (btw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17826664415232L, 132819);
        return -1;
      case 1: 
        localbtw.vcC = locala.yqV.nj();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      case 2: 
        localbtw.tWR = locala.yqV.nj();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      case 3: 
        localbtw.url = locala.yqV.readString();
        GMTrace.o(17826664415232L, 132819);
        return 0;
      }
      localbtw.eDW = locala.yqV.readString();
      GMTrace.o(17826664415232L, 132819);
      return 0;
    }
    GMTrace.o(17826664415232L, 132819);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\btw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */