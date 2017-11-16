package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsc
  extends com.tencent.mm.bm.a
{
  public String kBh;
  public String tRz;
  public boolean vbu;
  
  public bsc()
  {
    GMTrace.i(3735413587968L, 27831);
    GMTrace.o(3735413587968L, 27831);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3735547805696L, 27832);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz == null) {
        throw new b("Not all required fields were included: Username");
      }
      if (this.kBh == null) {
        throw new b("Not all required fields were included: Language");
      }
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      if (this.kBh != null) {
        paramVarArgs.e(2, this.kBh);
      }
      paramVarArgs.ah(3, this.vbu);
      GMTrace.o(3735547805696L, 27832);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label419;
      }
    }
    label419:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kBh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.kBh);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      GMTrace.o(3735547805696L, 27832);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tRz == null) {
          throw new b("Not all required fields were included: Username");
        }
        if (this.kBh == null) {
          throw new b("Not all required fields were included: Language");
        }
        GMTrace.o(3735547805696L, 27832);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsc localbsc = (bsc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3735547805696L, 27832);
          return -1;
        case 1: 
          localbsc.tRz = locala.yqV.readString();
          GMTrace.o(3735547805696L, 27832);
          return 0;
        case 2: 
          localbsc.kBh = locala.yqV.readString();
          GMTrace.o(3735547805696L, 27832);
          return 0;
        }
        localbsc.vbu = locala.csU();
        GMTrace.o(3735547805696L, 27832);
        return 0;
      }
      GMTrace.o(3735547805696L, 27832);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */