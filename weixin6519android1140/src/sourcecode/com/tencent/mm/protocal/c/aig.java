package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aig
  extends com.tencent.mm.bm.a
{
  public int eBs;
  public int uxC;
  public int uxD;
  public int uxE;
  public int uxF;
  public int uxG;
  public int uxH;
  public int uxI;
  
  public aig()
  {
    GMTrace.i(13098442293248L, 97591);
    GMTrace.o(13098442293248L, 97591);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13098576510976L, 97592);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uxC);
      paramVarArgs.fk(2, this.eBs);
      paramVarArgs.fk(3, this.uxD);
      paramVarArgs.fk(4, this.uxE);
      paramVarArgs.fk(5, this.uxF);
      paramVarArgs.fk(6, this.uxG);
      paramVarArgs.fk(7, this.uxH);
      paramVarArgs.fk(8, this.uxI);
      GMTrace.o(13098576510976L, 97592);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uxC);
      int i = b.a.a.a.fh(2, this.eBs);
      int j = b.a.a.a.fh(3, this.uxD);
      int k = b.a.a.a.fh(4, this.uxE);
      int m = b.a.a.a.fh(5, this.uxF);
      int n = b.a.a.a.fh(6, this.uxG);
      int i1 = b.a.a.a.fh(7, this.uxH);
      int i2 = b.a.a.a.fh(8, this.uxI);
      GMTrace.o(13098576510976L, 97592);
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
      GMTrace.o(13098576510976L, 97592);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aig localaig = (aig)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13098576510976L, 97592);
        return -1;
      case 1: 
        localaig.uxC = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 2: 
        localaig.eBs = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 3: 
        localaig.uxD = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 4: 
        localaig.uxE = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 5: 
        localaig.uxF = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 6: 
        localaig.uxG = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      case 7: 
        localaig.uxH = locala.yqV.nj();
        GMTrace.o(13098576510976L, 97592);
        return 0;
      }
      localaig.uxI = locala.yqV.nj();
      GMTrace.o(13098576510976L, 97592);
      return 0;
    }
    GMTrace.o(13098576510976L, 97592);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */