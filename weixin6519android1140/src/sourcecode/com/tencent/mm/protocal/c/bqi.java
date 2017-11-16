package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqi
  extends com.tencent.mm.bm.a
{
  public String gCG;
  public String vaw;
  public int vax;
  
  public bqi()
  {
    GMTrace.i(14998562668544L, 111748);
    GMTrace.o(14998562668544L, 111748);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14998696886272L, 111749);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaw != null) {
        paramVarArgs.e(1, this.vaw);
      }
      if (this.gCG != null) {
        paramVarArgs.e(2, this.gCG);
      }
      paramVarArgs.fk(3, this.vax);
      GMTrace.o(14998696886272L, 111749);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaw == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.vaw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gCG);
      }
      paramInt = b.a.a.a.fh(3, this.vax);
      GMTrace.o(14998696886272L, 111749);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(14998696886272L, 111749);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqi localbqi = (bqi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14998696886272L, 111749);
          return -1;
        case 1: 
          localbqi.vaw = locala.yqV.readString();
          GMTrace.o(14998696886272L, 111749);
          return 0;
        case 2: 
          localbqi.gCG = locala.yqV.readString();
          GMTrace.o(14998696886272L, 111749);
          return 0;
        }
        localbqi.vax = locala.yqV.nj();
        GMTrace.o(14998696886272L, 111749);
        return 0;
      }
      GMTrace.o(14998696886272L, 111749);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */