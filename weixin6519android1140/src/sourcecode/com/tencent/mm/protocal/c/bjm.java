package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjm
  extends com.tencent.mm.bm.a
{
  public String tYJ;
  public long uUA;
  public int uUy;
  public int uUz;
  public String ugB;
  
  public bjm()
  {
    GMTrace.i(3750445973504L, 27943);
    GMTrace.o(3750445973504L, 27943);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3750580191232L, 27944);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uUy);
      if (this.tYJ != null) {
        paramVarArgs.e(2, this.tYJ);
      }
      if (this.ugB != null) {
        paramVarArgs.e(3, this.ugB);
      }
      paramVarArgs.fk(4, this.uUz);
      paramVarArgs.T(5, this.uUA);
      GMTrace.o(3750580191232L, 27944);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uUy) + 0;
      paramInt = i;
      if (this.tYJ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tYJ);
      }
      i = paramInt;
      if (this.ugB != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugB);
      }
      paramInt = b.a.a.a.fh(4, this.uUz);
      int j = b.a.a.a.S(5, this.uUA);
      GMTrace.o(3750580191232L, 27944);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3750580191232L, 27944);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bjm localbjm = (bjm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3750580191232L, 27944);
        return -1;
      case 1: 
        localbjm.uUy = locala.yqV.nj();
        GMTrace.o(3750580191232L, 27944);
        return 0;
      case 2: 
        localbjm.tYJ = locala.yqV.readString();
        GMTrace.o(3750580191232L, 27944);
        return 0;
      case 3: 
        localbjm.ugB = locala.yqV.readString();
        GMTrace.o(3750580191232L, 27944);
        return 0;
      case 4: 
        localbjm.uUz = locala.yqV.nj();
        GMTrace.o(3750580191232L, 27944);
        return 0;
      }
      localbjm.uUA = locala.yqV.nk();
      GMTrace.o(3750580191232L, 27944);
      return 0;
    }
    GMTrace.o(3750580191232L, 27944);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */