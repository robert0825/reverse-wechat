package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aom
  extends com.tencent.mm.bm.a
{
  public int oqH;
  public String ufz;
  
  public aom()
  {
    GMTrace.i(3991232577536L, 29737);
    GMTrace.o(3991232577536L, 29737);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3991366795264L, 29738);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufz != null) {
        paramVarArgs.e(1, this.ufz);
      }
      paramVarArgs.fk(2, this.oqH);
      GMTrace.o(3991366795264L, 29738);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufz == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.ufz) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.oqH);
      GMTrace.o(3991366795264L, 29738);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3991366795264L, 29738);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aom localaom = (aom)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3991366795264L, 29738);
          return -1;
        case 1: 
          localaom.ufz = locala.yqV.readString();
          GMTrace.o(3991366795264L, 29738);
          return 0;
        }
        localaom.oqH = locala.yqV.nj();
        GMTrace.o(3991366795264L, 29738);
        return 0;
      }
      GMTrace.o(3991366795264L, 29738);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */