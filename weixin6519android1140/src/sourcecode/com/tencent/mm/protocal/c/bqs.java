package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bqs
  extends com.tencent.mm.bm.a
{
  public b vaB;
  public b vaC;
  public b vaD;
  public b vaE;
  
  public bqs()
  {
    GMTrace.i(3835808448512L, 28579);
    GMTrace.o(3835808448512L, 28579);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835942666240L, 28580);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaB != null) {
        paramVarArgs.b(1, this.vaB);
      }
      if (this.vaC != null) {
        paramVarArgs.b(2, this.vaC);
      }
      if (this.vaD != null) {
        paramVarArgs.b(3, this.vaD);
      }
      if (this.vaE != null) {
        paramVarArgs.b(4, this.vaE);
      }
      GMTrace.o(3835942666240L, 28580);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vaB == null) {
        break label422;
      }
    }
    label422:
    for (int i = b.a.a.a.a(1, this.vaB) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vaC != null) {
        paramInt = i + b.a.a.a.a(2, this.vaC);
      }
      i = paramInt;
      if (this.vaD != null) {
        i = paramInt + b.a.a.a.a(3, this.vaD);
      }
      paramInt = i;
      if (this.vaE != null) {
        paramInt = i + b.a.a.a.a(4, this.vaE);
      }
      GMTrace.o(3835942666240L, 28580);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3835942666240L, 28580);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqs localbqs = (bqs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3835942666240L, 28580);
          return -1;
        case 1: 
          localbqs.vaB = locala.csV();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        case 2: 
          localbqs.vaC = locala.csV();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        case 3: 
          localbqs.vaD = locala.csV();
          GMTrace.o(3835942666240L, 28580);
          return 0;
        }
        localbqs.vaE = locala.csV();
        GMTrace.o(3835942666240L, 28580);
        return 0;
      }
      GMTrace.o(3835942666240L, 28580);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */