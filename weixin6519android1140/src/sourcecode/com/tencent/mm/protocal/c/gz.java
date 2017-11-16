package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class gz
  extends com.tencent.mm.bm.a
{
  public String tVO;
  public String tVU;
  
  public gz()
  {
    GMTrace.i(3714475622400L, 27675);
    GMTrace.o(3714475622400L, 27675);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3714609840128L, 27676);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVU != null) {
        paramVarArgs.e(2, this.tVU);
      }
      if (this.tVO != null) {
        paramVarArgs.e(3, this.tVO);
      }
      GMTrace.o(3714609840128L, 27676);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVU == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(2, this.tVU) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tVO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVO);
      }
      GMTrace.o(3714609840128L, 27676);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3714609840128L, 27676);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        gz localgz = (gz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3714609840128L, 27676);
          return -1;
        case 2: 
          localgz.tVU = locala.yqV.readString();
          GMTrace.o(3714609840128L, 27676);
          return 0;
        }
        localgz.tVO = locala.yqV.readString();
        GMTrace.o(3714609840128L, 27676);
        return 0;
      }
      GMTrace.o(3714609840128L, 27676);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */