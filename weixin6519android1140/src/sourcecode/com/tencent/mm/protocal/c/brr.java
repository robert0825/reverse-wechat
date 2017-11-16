package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class brr
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String ugH;
  
  public brr()
  {
    GMTrace.i(3715817799680L, 27685);
    GMTrace.o(3715817799680L, 27685);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3715952017408L, 27686);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugH == null) {
        throw new b("Not all required fields were included: MD5");
      }
      paramVarArgs.fk(1, this.jib);
      if (this.ugH != null) {
        paramVarArgs.e(2, this.ugH);
      }
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ugH);
      }
      GMTrace.o(3715952017408L, 27686);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugH == null) {
        throw new b("Not all required fields were included: MD5");
      }
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brr localbrr = (brr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3715952017408L, 27686);
        return -1;
      case 1: 
        localbrr.jib = locala.yqV.nj();
        GMTrace.o(3715952017408L, 27686);
        return 0;
      }
      localbrr.ugH = locala.yqV.readString();
      GMTrace.o(3715952017408L, 27686);
      return 0;
    }
    GMTrace.o(3715952017408L, 27686);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */