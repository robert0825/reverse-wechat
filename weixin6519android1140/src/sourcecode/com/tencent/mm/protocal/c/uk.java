package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class uk
  extends com.tencent.mm.bm.a
{
  public int hZC;
  public int index;
  public String username;
  
  public uk()
  {
    GMTrace.i(3933116301312L, 29304);
    GMTrace.o(3933116301312L, 29304);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3933250519040L, 29305);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.index);
      if (this.username != null) {
        paramVarArgs.e(2, this.username);
      }
      paramVarArgs.fk(3, this.hZC);
      GMTrace.o(3933250519040L, 29305);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.index) + 0;
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.username);
      }
      i = b.a.a.a.fh(3, this.hZC);
      GMTrace.o(3933250519040L, 29305);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3933250519040L, 29305);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      uk localuk = (uk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3933250519040L, 29305);
        return -1;
      case 1: 
        localuk.index = locala.yqV.nj();
        GMTrace.o(3933250519040L, 29305);
        return 0;
      case 2: 
        localuk.username = locala.yqV.readString();
        GMTrace.o(3933250519040L, 29305);
        return 0;
      }
      localuk.hZC = locala.yqV.nj();
      GMTrace.o(3933250519040L, 29305);
      return 0;
    }
    GMTrace.o(3933250519040L, 29305);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */