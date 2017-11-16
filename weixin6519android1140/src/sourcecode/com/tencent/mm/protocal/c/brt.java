package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class brt
  extends com.tencent.mm.bm.a
{
  public String tXF;
  
  public brt()
  {
    GMTrace.i(3702127591424L, 27583);
    GMTrace.o(3702127591424L, 27583);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3702261809152L, 27584);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXF == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.tXF != null) {
        paramVarArgs.e(1, this.tXF);
      }
      GMTrace.o(3702261809152L, 27584);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tXF == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.tXF) + 0;; paramInt = 0)
    {
      GMTrace.o(3702261809152L, 27584);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tXF == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3702261809152L, 27584);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brt localbrt = (brt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3702261809152L, 27584);
          return -1;
        }
        localbrt.tXF = locala.yqV.readString();
        GMTrace.o(3702261809152L, 27584);
        return 0;
      }
      GMTrace.o(3702261809152L, 27584);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */