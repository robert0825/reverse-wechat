package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bch
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b uOX;
  public com.tencent.mm.bm.b uzN;
  
  public bch()
  {
    GMTrace.i(4048811982848L, 30166);
    GMTrace.o(4048811982848L, 30166);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4048946200576L, 30167);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uOX == null) {
        throw new b.a.a.b("Not all required fields were included: Name");
      }
      if (this.uzN == null) {
        throw new b.a.a.b("Not all required fields were included: Value");
      }
      if (this.uOX != null) {
        paramVarArgs.b(1, this.uOX);
      }
      if (this.uzN != null) {
        paramVarArgs.b(2, this.uzN);
      }
      GMTrace.o(4048946200576L, 30167);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uOX == null) {
        break label368;
      }
    }
    label368:
    for (paramInt = b.a.a.a.a(1, this.uOX) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uzN != null) {
        i = paramInt + b.a.a.a.a(2, this.uzN);
      }
      GMTrace.o(4048946200576L, 30167);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uOX == null) {
          throw new b.a.a.b("Not all required fields were included: Name");
        }
        if (this.uzN == null) {
          throw new b.a.a.b("Not all required fields were included: Value");
        }
        GMTrace.o(4048946200576L, 30167);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bch localbch = (bch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4048946200576L, 30167);
          return -1;
        case 1: 
          localbch.uOX = locala.csV();
          GMTrace.o(4048946200576L, 30167);
          return 0;
        }
        localbch.uzN = locala.csV();
        GMTrace.o(4048946200576L, 30167);
        return 0;
      }
      GMTrace.o(4048946200576L, 30167);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */