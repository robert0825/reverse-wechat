package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ags
  extends com.tencent.mm.bm.a
{
  public String mhZ;
  public String ufN;
  public int ufO;
  
  public ags()
  {
    GMTrace.i(14997488926720L, 111740);
    GMTrace.o(14997488926720L, 111740);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14997623144448L, 111741);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufN != null) {
        paramVarArgs.e(1, this.ufN);
      }
      paramVarArgs.fk(2, this.ufO);
      if (this.mhZ != null) {
        paramVarArgs.e(3, this.mhZ);
      }
      GMTrace.o(14997623144448L, 111741);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufN == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.ufN) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.ufO);
      paramInt = i;
      if (this.mhZ != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mhZ);
      }
      GMTrace.o(14997623144448L, 111741);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(14997623144448L, 111741);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ags localags = (ags)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14997623144448L, 111741);
          return -1;
        case 1: 
          localags.ufN = locala.yqV.readString();
          GMTrace.o(14997623144448L, 111741);
          return 0;
        case 2: 
          localags.ufO = locala.yqV.nj();
          GMTrace.o(14997623144448L, 111741);
          return 0;
        }
        localags.mhZ = locala.yqV.readString();
        GMTrace.o(14997623144448L, 111741);
        return 0;
      }
      GMTrace.o(14997623144448L, 111741);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ags.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */