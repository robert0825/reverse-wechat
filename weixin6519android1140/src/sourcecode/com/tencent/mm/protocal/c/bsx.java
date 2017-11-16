package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsx
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public String ulE;
  public String vbv;
  
  public bsx()
  {
    GMTrace.i(3757156859904L, 27993);
    GMTrace.o(3757156859904L, 27993);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3757291077632L, 27994);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.ulE == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.ulE != null) {
        paramVarArgs.e(2, this.ulE);
      }
      paramVarArgs.fk(3, this.tOG);
      GMTrace.o(3757291077632L, 27994);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ulE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ulE);
      }
      paramInt = b.a.a.a.fh(3, this.tOG);
      GMTrace.o(3757291077632L, 27994);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.ulE == null) {
          throw new b("Not all required fields were included: Text");
        }
        GMTrace.o(3757291077632L, 27994);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsx localbsx = (bsx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3757291077632L, 27994);
          return -1;
        case 1: 
          localbsx.vbv = locala.yqV.readString();
          GMTrace.o(3757291077632L, 27994);
          return 0;
        case 2: 
          localbsx.ulE = locala.yqV.readString();
          GMTrace.o(3757291077632L, 27994);
          return 0;
        }
        localbsx.tOG = locala.yqV.nj();
        GMTrace.o(3757291077632L, 27994);
        return 0;
      }
      GMTrace.o(3757291077632L, 27994);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */