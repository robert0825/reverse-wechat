package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cq
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lQa;
  public int tQB;
  public String tQC;
  
  public cq()
  {
    GMTrace.i(3684679286784L, 27453);
    GMTrace.o(3684679286784L, 27453);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684813504512L, 27454);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa != null) {
        paramVarArgs.e(1, this.lQa);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.tQB);
      if (this.tQC != null) {
        paramVarArgs.e(4, this.tQC);
      }
      GMTrace.o(3684813504512L, 27454);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lQa == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = b.a.a.b.b.a.f(1, this.lQa) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jib) + b.a.a.a.fh(3, this.tQB);
      paramInt = i;
      if (this.tQC != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tQC);
      }
      GMTrace.o(3684813504512L, 27454);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3684813504512L, 27454);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cq localcq = (cq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684813504512L, 27454);
          return -1;
        case 1: 
          localcq.lQa = locala.yqV.readString();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        case 2: 
          localcq.jib = locala.yqV.nj();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        case 3: 
          localcq.tQB = locala.yqV.nj();
          GMTrace.o(3684813504512L, 27454);
          return 0;
        }
        localcq.tQC = locala.yqV.readString();
        GMTrace.o(3684813504512L, 27454);
        return 0;
      }
      GMTrace.o(3684813504512L, 27454);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */