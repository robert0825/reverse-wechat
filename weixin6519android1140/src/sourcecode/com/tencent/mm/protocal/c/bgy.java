package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgy
  extends com.tencent.mm.bm.a
{
  public int uSE;
  public int uSF;
  public int uSG;
  public int uSH;
  public int uSI;
  public LinkedList<Integer> uSJ;
  public int uSK;
  public int uSL;
  public LinkedList<Integer> uSM;
  public int uSN;
  public int uSO;
  public int udE;
  public int uhU;
  
  public bgy()
  {
    GMTrace.i(3668975812608L, 27336);
    this.uSJ = new LinkedList();
    this.uSM = new LinkedList();
    GMTrace.o(3668975812608L, 27336);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3669110030336L, 27337);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uhU);
      paramVarArgs.fk(2, this.uSE);
      paramVarArgs.fk(3, this.udE);
      paramVarArgs.fk(4, this.uSF);
      paramVarArgs.fk(5, this.uSG);
      paramVarArgs.fk(6, this.uSH);
      paramVarArgs.fk(7, this.uSI);
      paramVarArgs.d(8, 2, this.uSJ);
      paramVarArgs.fk(9, this.uSK);
      paramVarArgs.fk(10, this.uSL);
      paramVarArgs.d(11, 2, this.uSM);
      paramVarArgs.fk(12, this.uSN);
      paramVarArgs.fk(13, this.uSO);
      GMTrace.o(3669110030336L, 27337);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uhU);
      int i = b.a.a.a.fh(2, this.uSE);
      int j = b.a.a.a.fh(3, this.udE);
      int k = b.a.a.a.fh(4, this.uSF);
      int m = b.a.a.a.fh(5, this.uSG);
      int n = b.a.a.a.fh(6, this.uSH);
      int i1 = b.a.a.a.fh(7, this.uSI);
      int i2 = b.a.a.a.c(8, 2, this.uSJ);
      int i3 = b.a.a.a.fh(9, this.uSK);
      int i4 = b.a.a.a.fh(10, this.uSL);
      int i5 = b.a.a.a.c(11, 2, this.uSM);
      int i6 = b.a.a.a.fh(12, this.uSN);
      int i7 = b.a.a.a.fh(13, this.uSO);
      GMTrace.o(3669110030336L, 27337);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uSJ.clear();
      this.uSM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3669110030336L, 27337);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bgy localbgy = (bgy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3669110030336L, 27337);
        return -1;
      case 1: 
        localbgy.uhU = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 2: 
        localbgy.uSE = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 3: 
        localbgy.udE = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 4: 
        localbgy.uSF = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 5: 
        localbgy.uSG = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 6: 
        localbgy.uSH = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 7: 
        localbgy.uSI = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 8: 
        localbgy.uSJ.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 9: 
        localbgy.uSK = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 10: 
        localbgy.uSL = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 11: 
        localbgy.uSM.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(3669110030336L, 27337);
        return 0;
      case 12: 
        localbgy.uSN = locala.yqV.nj();
        GMTrace.o(3669110030336L, 27337);
        return 0;
      }
      localbgy.uSO = locala.yqV.nj();
      GMTrace.o(3669110030336L, 27337);
      return 0;
    }
    GMTrace.o(3669110030336L, 27337);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */