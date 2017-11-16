package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bns
  extends com.tencent.mm.bm.a
{
  public int type;
  public int version;
  
  public bns()
  {
    GMTrace.i(3821447151616L, 28472);
    GMTrace.o(3821447151616L, 28472);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3821581369344L, 28473);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      paramVarArgs.fk(2, this.version);
      GMTrace.o(3821581369344L, 28473);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.type);
      int i = b.a.a.a.fh(2, this.version);
      GMTrace.o(3821581369344L, 28473);
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
      GMTrace.o(3821581369344L, 28473);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bns localbns = (bns)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3821581369344L, 28473);
        return -1;
      case 1: 
        localbns.type = locala.yqV.nj();
        GMTrace.o(3821581369344L, 28473);
        return 0;
      }
      localbns.version = locala.yqV.nj();
      GMTrace.o(3821581369344L, 28473);
      return 0;
    }
    GMTrace.o(3821581369344L, 28473);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */