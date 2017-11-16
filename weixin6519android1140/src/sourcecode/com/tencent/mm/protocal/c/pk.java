package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pk
  extends com.tencent.mm.bm.a
{
  public String info;
  public int ufI;
  public int ufJ;
  
  public pk()
  {
    GMTrace.i(3654077644800L, 27225);
    GMTrace.o(3654077644800L, 27225);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3654211862528L, 27226);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ufI);
      paramVarArgs.fk(2, this.ufJ);
      if (this.info != null) {
        paramVarArgs.e(3, this.info);
      }
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.ufI) + 0 + b.a.a.a.fh(2, this.ufJ);
      paramInt = i;
      if (this.info != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.info);
      }
      GMTrace.o(3654211862528L, 27226);
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
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      pk localpk = (pk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3654211862528L, 27226);
        return -1;
      case 1: 
        localpk.ufI = locala.yqV.nj();
        GMTrace.o(3654211862528L, 27226);
        return 0;
      case 2: 
        localpk.ufJ = locala.yqV.nj();
        GMTrace.o(3654211862528L, 27226);
        return 0;
      }
      localpk.info = locala.yqV.readString();
      GMTrace.o(3654211862528L, 27226);
      return 0;
    }
    GMTrace.o(3654211862528L, 27226);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */