package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class ahe
  extends com.tencent.mm.bm.a
{
  public int lQF;
  public b tTB;
  public b tTD;
  
  public ahe()
  {
    GMTrace.i(4009486188544L, 29873);
    GMTrace.o(4009486188544L, 29873);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4009620406272L, 29874);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTD != null) {
        paramVarArgs.b(1, this.tTD);
      }
      if (this.tTB != null) {
        paramVarArgs.b(2, this.tTB);
      }
      paramVarArgs.fk(3, this.lQF);
      GMTrace.o(4009620406272L, 29874);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTD == null) {
        break label348;
      }
    }
    label348:
    for (paramInt = b.a.a.a.a(1, this.tTD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tTB != null) {
        i = paramInt + b.a.a.a.a(2, this.tTB);
      }
      paramInt = b.a.a.a.fh(3, this.lQF);
      GMTrace.o(4009620406272L, 29874);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4009620406272L, 29874);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahe localahe = (ahe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4009620406272L, 29874);
          return -1;
        case 1: 
          localahe.tTD = locala.csV();
          GMTrace.o(4009620406272L, 29874);
          return 0;
        case 2: 
          localahe.tTB = locala.csV();
          GMTrace.o(4009620406272L, 29874);
          return 0;
        }
        localahe.lQF = locala.yqV.nj();
        GMTrace.o(4009620406272L, 29874);
        return 0;
      }
      GMTrace.o(4009620406272L, 29874);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */