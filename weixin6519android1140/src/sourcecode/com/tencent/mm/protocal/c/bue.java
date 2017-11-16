package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bue
  extends com.tencent.mm.bm.a
{
  public int kBk;
  public String kBl;
  
  public bue()
  {
    GMTrace.i(3869631315968L, 28831);
    GMTrace.o(3869631315968L, 28831);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3869765533696L, 28832);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(2, this.kBl);
      }
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.kBk) + 0;
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kBl);
      }
      GMTrace.o(3869765533696L, 28832);
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
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bue localbue = (bue)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3869765533696L, 28832);
        return -1;
      case 1: 
        localbue.kBk = locala.yqV.nj();
        GMTrace.o(3869765533696L, 28832);
        return 0;
      }
      localbue.kBl = locala.yqV.readString();
      GMTrace.o(3869765533696L, 28832);
      return 0;
    }
    GMTrace.o(3869765533696L, 28832);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */