package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bgm
  extends com.tencent.mm.bm.a
{
  public int gCI;
  public String gCJ;
  public long gCK;
  public int uSi;
  
  public bgm()
  {
    GMTrace.i(13340571074560L, 99395);
    GMTrace.o(13340571074560L, 99395);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13340705292288L, 99396);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.gCI);
      if (this.gCJ != null) {
        paramVarArgs.e(2, this.gCJ);
      }
      paramVarArgs.T(3, this.gCK);
      paramVarArgs.fk(4, this.uSi);
      GMTrace.o(13340705292288L, 99396);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.gCI) + 0;
      paramInt = i;
      if (this.gCJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.gCJ);
      }
      i = b.a.a.a.S(3, this.gCK);
      int j = b.a.a.a.fh(4, this.uSi);
      GMTrace.o(13340705292288L, 99396);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13340705292288L, 99396);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bgm localbgm = (bgm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13340705292288L, 99396);
        return -1;
      case 1: 
        localbgm.gCI = locala.yqV.nj();
        GMTrace.o(13340705292288L, 99396);
        return 0;
      case 2: 
        localbgm.gCJ = locala.yqV.readString();
        GMTrace.o(13340705292288L, 99396);
        return 0;
      case 3: 
        localbgm.gCK = locala.yqV.nk();
        GMTrace.o(13340705292288L, 99396);
        return 0;
      }
      localbgm.uSi = locala.yqV.nj();
      GMTrace.o(13340705292288L, 99396);
      return 0;
    }
    GMTrace.o(13340705292288L, 99396);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */