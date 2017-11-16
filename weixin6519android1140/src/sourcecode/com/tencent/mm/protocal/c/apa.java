package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class apa
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lRR;
  public String oqQ;
  public String uER;
  
  public apa()
  {
    GMTrace.i(3880637169664L, 28913);
    GMTrace.o(3880637169664L, 28913);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3880771387392L, 28914);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRR != null) {
        paramVarArgs.e(1, this.lRR);
      }
      if (this.uER != null) {
        paramVarArgs.e(2, this.uER);
      }
      if (this.oqQ != null) {
        paramVarArgs.e(3, this.oqQ);
      }
      paramVarArgs.fk(4, this.jib);
      GMTrace.o(3880771387392L, 28914);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRR == null) {
        break label418;
      }
    }
    label418:
    for (int i = b.a.a.b.b.a.f(1, this.lRR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uER != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uER);
      }
      i = paramInt;
      if (this.oqQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.oqQ);
      }
      paramInt = b.a.a.a.fh(4, this.jib);
      GMTrace.o(3880771387392L, 28914);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3880771387392L, 28914);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        apa localapa = (apa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3880771387392L, 28914);
          return -1;
        case 1: 
          localapa.lRR = locala.yqV.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        case 2: 
          localapa.uER = locala.yqV.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        case 3: 
          localapa.oqQ = locala.yqV.readString();
          GMTrace.o(3880771387392L, 28914);
          return 0;
        }
        localapa.jib = locala.yqV.nj();
        GMTrace.o(3880771387392L, 28914);
        return 0;
      }
      GMTrace.o(3880771387392L, 28914);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\apa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */