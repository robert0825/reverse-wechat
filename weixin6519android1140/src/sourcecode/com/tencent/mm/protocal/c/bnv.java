package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bnv
  extends com.tencent.mm.bm.a
{
  public int tRF;
  public int tRG;
  public int tRH;
  public int tRI;
  
  public bnv()
  {
    GMTrace.i(3839566544896L, 28607);
    GMTrace.o(3839566544896L, 28607);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3839700762624L, 28608);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRF);
      paramVarArgs.fk(2, this.tRG);
      paramVarArgs.fk(3, this.tRH);
      paramVarArgs.fk(4, this.tRI);
      GMTrace.o(3839700762624L, 28608);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRF);
      int i = b.a.a.a.fh(2, this.tRG);
      int j = b.a.a.a.fh(3, this.tRH);
      int k = b.a.a.a.fh(4, this.tRI);
      GMTrace.o(3839700762624L, 28608);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3839700762624L, 28608);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bnv localbnv = (bnv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3839700762624L, 28608);
        return -1;
      case 1: 
        localbnv.tRF = locala.yqV.nj();
        GMTrace.o(3839700762624L, 28608);
        return 0;
      case 2: 
        localbnv.tRG = locala.yqV.nj();
        GMTrace.o(3839700762624L, 28608);
        return 0;
      case 3: 
        localbnv.tRH = locala.yqV.nj();
        GMTrace.o(3839700762624L, 28608);
        return 0;
      }
      localbnv.tRI = locala.yqV.nj();
      GMTrace.o(3839700762624L, 28608);
      return 0;
    }
    GMTrace.o(3839700762624L, 28608);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */