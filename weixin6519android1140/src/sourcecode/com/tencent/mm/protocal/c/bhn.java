package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhn
  extends com.tencent.mm.bm.a
{
  public int hZC;
  public int jWT;
  
  public bhn()
  {
    GMTrace.i(3619315253248L, 26966);
    GMTrace.o(3619315253248L, 26966);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3619449470976L, 26967);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jWT);
      paramVarArgs.fk(2, this.hZC);
      GMTrace.o(3619449470976L, 26967);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jWT);
      int i = b.a.a.a.fh(2, this.hZC);
      GMTrace.o(3619449470976L, 26967);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3619449470976L, 26967);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhn localbhn = (bhn)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3619449470976L, 26967);
        return -1;
      case 1: 
        localbhn.jWT = locala.yqV.nj();
        GMTrace.o(3619449470976L, 26967);
        return 0;
      }
      localbhn.hZC = locala.yqV.nj();
      GMTrace.o(3619449470976L, 26967);
      return 0;
    }
    GMTrace.o(3619449470976L, 26967);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */