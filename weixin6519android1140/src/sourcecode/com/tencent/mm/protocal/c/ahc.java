package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class ahc
  extends com.tencent.mm.bm.a
{
  public b tTB;
  public b tTD;
  public b uwC;
  
  public ahc()
  {
    GMTrace.i(3894730031104L, 29018);
    GMTrace.o(3894730031104L, 29018);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3894864248832L, 29019);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTD != null) {
        paramVarArgs.b(1, this.tTD);
      }
      if (this.tTB != null) {
        paramVarArgs.b(2, this.tTB);
      }
      if (this.uwC != null) {
        paramVarArgs.b(3, this.uwC);
      }
      GMTrace.o(3894864248832L, 29019);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tTD == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.a.a(1, this.tTD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tTB != null) {
        paramInt = i + b.a.a.a.a(2, this.tTB);
      }
      i = paramInt;
      if (this.uwC != null) {
        i = paramInt + b.a.a.a.a(3, this.uwC);
      }
      GMTrace.o(3894864248832L, 29019);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3894864248832L, 29019);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahc localahc = (ahc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3894864248832L, 29019);
          return -1;
        case 1: 
          localahc.tTD = locala.csV();
          GMTrace.o(3894864248832L, 29019);
          return 0;
        case 2: 
          localahc.tTB = locala.csV();
          GMTrace.o(3894864248832L, 29019);
          return 0;
        }
        localahc.uwC = locala.csV();
        GMTrace.o(3894864248832L, 29019);
        return 0;
      }
      GMTrace.o(3894864248832L, 29019);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */