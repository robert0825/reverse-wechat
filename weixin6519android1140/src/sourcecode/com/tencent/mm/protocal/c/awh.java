package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class awh
  extends com.tencent.mm.bm.a
{
  public String ijm;
  public int lQF;
  
  public awh()
  {
    GMTrace.i(13170651430912L, 98129);
    GMTrace.o(13170651430912L, 98129);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13170785648640L, 98130);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ijm == null) {
        throw new b("Not all required fields were included: jsonData");
      }
      paramVarArgs.fk(1, this.lQF);
      if (this.ijm != null) {
        paramVarArgs.e(2, this.ijm);
      }
      GMTrace.o(13170785648640L, 98130);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lQF) + 0;
      paramInt = i;
      if (this.ijm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ijm);
      }
      GMTrace.o(13170785648640L, 98130);
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
      if (this.ijm == null) {
        throw new b("Not all required fields were included: jsonData");
      }
      GMTrace.o(13170785648640L, 98130);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      awh localawh = (awh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13170785648640L, 98130);
        return -1;
      case 1: 
        localawh.lQF = locala.yqV.nj();
        GMTrace.o(13170785648640L, 98130);
        return 0;
      }
      localawh.ijm = locala.yqV.readString();
      GMTrace.o(13170785648640L, 98130);
      return 0;
    }
    GMTrace.o(13170785648640L, 98130);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\awh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */