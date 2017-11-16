package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqz
  extends com.tencent.mm.bm.a
{
  public int tWZ;
  public int uHj;
  public String uHk;
  public String uHl;
  public int udE;
  
  public aqz()
  {
    GMTrace.i(3662801797120L, 27290);
    GMTrace.o(3662801797120L, 27290);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3662936014848L, 27291);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tWZ);
      if (this.uHl != null) {
        paramVarArgs.e(3, this.uHl);
      }
      paramVarArgs.fk(4, this.uHj);
      paramVarArgs.fk(5, this.udE);
      if (this.uHk != null) {
        paramVarArgs.e(6, this.uHk);
      }
      GMTrace.o(3662936014848L, 27291);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tWZ) + 0;
      paramInt = i;
      if (this.uHl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uHl);
      }
      i = paramInt + b.a.a.a.fh(4, this.uHj) + b.a.a.a.fh(5, this.udE);
      paramInt = i;
      if (this.uHk != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uHk);
      }
      GMTrace.o(3662936014848L, 27291);
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
      GMTrace.o(3662936014848L, 27291);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aqz localaqz = (aqz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 2: 
      default: 
        GMTrace.o(3662936014848L, 27291);
        return -1;
      case 1: 
        localaqz.tWZ = locala.yqV.nj();
        GMTrace.o(3662936014848L, 27291);
        return 0;
      case 3: 
        localaqz.uHl = locala.yqV.readString();
        GMTrace.o(3662936014848L, 27291);
        return 0;
      case 4: 
        localaqz.uHj = locala.yqV.nj();
        GMTrace.o(3662936014848L, 27291);
        return 0;
      case 5: 
        localaqz.udE = locala.yqV.nj();
        GMTrace.o(3662936014848L, 27291);
        return 0;
      }
      localaqz.uHk = locala.yqV.readString();
      GMTrace.o(3662936014848L, 27291);
      return 0;
    }
    GMTrace.o(3662936014848L, 27291);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */