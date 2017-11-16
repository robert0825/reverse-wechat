package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atx
  extends com.tencent.mm.bm.a
{
  public int lSW;
  public String tVN;
  
  public atx()
  {
    GMTrace.i(13576123187200L, 101150);
    GMTrace.o(13576123187200L, 101150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13576257404928L, 101151);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVN != null) {
        paramVarArgs.e(1, this.tVN);
      }
      paramVarArgs.fk(2, this.lSW);
      GMTrace.o(13576257404928L, 101151);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVN == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVN) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.lSW);
      GMTrace.o(13576257404928L, 101151);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13576257404928L, 101151);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        atx localatx = (atx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13576257404928L, 101151);
          return -1;
        case 1: 
          localatx.tVN = locala.yqV.readString();
          GMTrace.o(13576257404928L, 101151);
          return 0;
        }
        localatx.lSW = locala.yqV.nj();
        GMTrace.o(13576257404928L, 101151);
        return 0;
      }
      GMTrace.o(13576257404928L, 101151);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\atx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */