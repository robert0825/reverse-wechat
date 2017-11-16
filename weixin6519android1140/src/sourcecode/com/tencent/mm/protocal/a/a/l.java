package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;

public final class l
  extends com.tencent.mm.bm.a
{
  public int action;
  public int tLC;
  public int tLD;
  public int tLE;
  public int tLF;
  public int tLG;
  public int tLH;
  public int tLI;
  
  public l()
  {
    GMTrace.i(13102200389632L, 97619);
    GMTrace.o(13102200389632L, 97619);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13102334607360L, 97620);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tLC);
      paramVarArgs.fk(2, this.action);
      paramVarArgs.fk(3, this.tLD);
      paramVarArgs.fk(4, this.tLE);
      paramVarArgs.fk(5, this.tLF);
      paramVarArgs.fk(6, this.tLG);
      paramVarArgs.fk(7, this.tLH);
      paramVarArgs.fk(8, this.tLI);
      GMTrace.o(13102334607360L, 97620);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tLC);
      int i = b.a.a.a.fh(2, this.action);
      int j = b.a.a.a.fh(3, this.tLD);
      int k = b.a.a.a.fh(4, this.tLE);
      int m = b.a.a.a.fh(5, this.tLF);
      int n = b.a.a.a.fh(6, this.tLG);
      int i1 = b.a.a.a.fh(7, this.tLH);
      int i2 = b.a.a.a.fh(8, this.tLI);
      GMTrace.o(13102334607360L, 97620);
      return paramInt + 0 + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13102334607360L, 97620);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13102334607360L, 97620);
        return -1;
      case 1: 
        locall.tLC = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 2: 
        locall.action = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 3: 
        locall.tLD = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 4: 
        locall.tLE = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 5: 
        locall.tLF = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 6: 
        locall.tLG = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      case 7: 
        locall.tLH = locala.yqV.nj();
        GMTrace.o(13102334607360L, 97620);
        return 0;
      }
      locall.tLI = locala.yqV.nj();
      GMTrace.o(13102334607360L, 97620);
      return 0;
    }
    GMTrace.o(13102334607360L, 97620);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */