package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class apg
  extends com.tencent.mm.bm.a
{
  public int lQF;
  public String oqQ;
  
  public apg()
  {
    GMTrace.i(13334128623616L, 99347);
    GMTrace.o(13334128623616L, 99347);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13334262841344L, 99348);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.lQF);
      if (this.oqQ != null) {
        paramVarArgs.e(2, this.oqQ);
      }
      GMTrace.o(13334262841344L, 99348);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lQF) + 0;
      paramInt = i;
      if (this.oqQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.oqQ);
      }
      GMTrace.o(13334262841344L, 99348);
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
      GMTrace.o(13334262841344L, 99348);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      apg localapg = (apg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13334262841344L, 99348);
        return -1;
      case 1: 
        localapg.lQF = locala.yqV.nj();
        GMTrace.o(13334262841344L, 99348);
        return 0;
      }
      localapg.oqQ = locala.yqV.readString();
      GMTrace.o(13334262841344L, 99348);
      return 0;
    }
    GMTrace.o(13334262841344L, 99348);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */