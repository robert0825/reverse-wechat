package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btx
  extends com.tencent.mm.bm.a
{
  public int tNf;
  public String uAf;
  
  public btx()
  {
    GMTrace.i(17615539929088L, 131246);
    GMTrace.o(17615539929088L, 131246);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17615674146816L, 131247);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tNf);
      if (this.uAf != null) {
        paramVarArgs.e(2, this.uAf);
      }
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tNf) + 0;
      paramInt = i;
      if (this.uAf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uAf);
      }
      GMTrace.o(17615674146816L, 131247);
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
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      btx localbtx = (btx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(17615674146816L, 131247);
        return -1;
      case 1: 
        localbtx.tNf = locala.yqV.nj();
        GMTrace.o(17615674146816L, 131247);
        return 0;
      }
      localbtx.uAf = locala.yqV.readString();
      GMTrace.o(17615674146816L, 131247);
      return 0;
    }
    GMTrace.o(17615674146816L, 131247);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\btx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */