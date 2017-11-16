package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bvq
  extends com.tencent.mm.bm.a
{
  public int jWT;
  public String username;
  
  public bvq()
  {
    GMTrace.i(3957543927808L, 29486);
    GMTrace.o(3957543927808L, 29486);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3957678145536L, 29487);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      paramVarArgs.fk(1, this.jWT);
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      GMTrace.o(3957678145536L, 29487);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jWT) + 0;
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.username);
      }
      GMTrace.o(3957678145536L, 29487);
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
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      GMTrace.o(3957678145536L, 29487);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvq localbvq = (bvq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3957678145536L, 29487);
        return -1;
      case 1: 
        localbvq.jWT = locala.yqV.nj();
        GMTrace.o(3957678145536L, 29487);
        return 0;
      }
      localbvq.username = locala.yqV.readString();
      GMTrace.o(3957678145536L, 29487);
      return 0;
    }
    GMTrace.o(3957678145536L, 29487);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */