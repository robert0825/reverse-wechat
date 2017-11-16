package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class hw
  extends com.tencent.mm.bm.a
{
  public String eSd;
  public int tWR;
  public int tWS;
  public String tWT;
  
  public hw()
  {
    GMTrace.i(17826798632960L, 132820);
    GMTrace.o(17826798632960L, 132820);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17826932850688L, 132821);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eSd != null) {
        paramVarArgs.e(1, this.eSd);
      }
      paramVarArgs.fk(2, this.tWR);
      paramVarArgs.fk(3, this.tWS);
      if (this.tWT != null) {
        paramVarArgs.e(4, this.tWT);
      }
      GMTrace.o(17826932850688L, 132821);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eSd == null) {
        break label392;
      }
    }
    label392:
    for (paramInt = b.a.a.b.b.a.f(1, this.eSd) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tWR) + b.a.a.a.fh(3, this.tWS);
      paramInt = i;
      if (this.tWT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWT);
      }
      GMTrace.o(17826932850688L, 132821);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(17826932850688L, 132821);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        hw localhw = (hw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(17826932850688L, 132821);
          return -1;
        case 1: 
          localhw.eSd = locala.yqV.readString();
          GMTrace.o(17826932850688L, 132821);
          return 0;
        case 2: 
          localhw.tWR = locala.yqV.nj();
          GMTrace.o(17826932850688L, 132821);
          return 0;
        case 3: 
          localhw.tWS = locala.yqV.nj();
          GMTrace.o(17826932850688L, 132821);
          return 0;
        }
        localhw.tWT = locala.yqV.readString();
        GMTrace.o(17826932850688L, 132821);
        return 0;
      }
      GMTrace.o(17826932850688L, 132821);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */