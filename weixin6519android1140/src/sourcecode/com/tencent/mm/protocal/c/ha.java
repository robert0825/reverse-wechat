package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ha
  extends com.tencent.mm.bm.a
{
  public String jBs;
  public String tVV;
  public int ver;
  
  public ha()
  {
    GMTrace.i(3685216157696L, 27457);
    GMTrace.o(3685216157696L, 27457);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3685350375424L, 27458);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVV != null) {
        paramVarArgs.e(1, this.tVV);
      }
      if (this.jBs != null) {
        paramVarArgs.e(2, this.jBs);
      }
      paramVarArgs.fk(3, this.ver);
      GMTrace.o(3685350375424L, 27458);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVV == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVV) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jBs != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jBs);
      }
      paramInt = b.a.a.a.fh(3, this.ver);
      GMTrace.o(3685350375424L, 27458);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3685350375424L, 27458);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ha localha = (ha)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3685350375424L, 27458);
          return -1;
        case 1: 
          localha.tVV = locala.yqV.readString();
          GMTrace.o(3685350375424L, 27458);
          return 0;
        case 2: 
          localha.jBs = locala.yqV.readString();
          GMTrace.o(3685350375424L, 27458);
          return 0;
        }
        localha.ver = locala.yqV.nj();
        GMTrace.o(3685350375424L, 27458);
        return 0;
      }
      GMTrace.o(3685350375424L, 27458);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */