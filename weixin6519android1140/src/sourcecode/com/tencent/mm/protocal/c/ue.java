package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ue
  extends com.tencent.mm.bm.a
{
  public int ulQ;
  public int ulR;
  public int ulS;
  public int ulT;
  public int ulU;
  public int ulV;
  public int ulW;
  public int ulX;
  public int ulY;
  public int ulZ;
  public int uma;
  public int umb;
  public int umc;
  public int umd;
  public int ume;
  
  public ue()
  {
    GMTrace.i(3968012910592L, 29564);
    GMTrace.o(3968012910592L, 29564);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3968147128320L, 29565);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ulQ);
      paramVarArgs.fk(2, this.ulR);
      paramVarArgs.fk(3, this.ulS);
      paramVarArgs.fk(4, this.ulT);
      paramVarArgs.fk(5, this.ulU);
      paramVarArgs.fk(6, this.ulV);
      paramVarArgs.fk(7, this.ulW);
      paramVarArgs.fk(8, this.ulX);
      paramVarArgs.fk(9, this.ulY);
      paramVarArgs.fk(10, this.ulZ);
      paramVarArgs.fk(11, this.uma);
      paramVarArgs.fk(12, this.umb);
      paramVarArgs.fk(13, this.umc);
      paramVarArgs.fk(14, this.umd);
      paramVarArgs.fk(15, this.ume);
      GMTrace.o(3968147128320L, 29565);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ulQ);
      int i = b.a.a.a.fh(2, this.ulR);
      int j = b.a.a.a.fh(3, this.ulS);
      int k = b.a.a.a.fh(4, this.ulT);
      int m = b.a.a.a.fh(5, this.ulU);
      int n = b.a.a.a.fh(6, this.ulV);
      int i1 = b.a.a.a.fh(7, this.ulW);
      int i2 = b.a.a.a.fh(8, this.ulX);
      int i3 = b.a.a.a.fh(9, this.ulY);
      int i4 = b.a.a.a.fh(10, this.ulZ);
      int i5 = b.a.a.a.fh(11, this.uma);
      int i6 = b.a.a.a.fh(12, this.umb);
      int i7 = b.a.a.a.fh(13, this.umc);
      int i8 = b.a.a.a.fh(14, this.umd);
      int i9 = b.a.a.a.fh(15, this.ume);
      GMTrace.o(3968147128320L, 29565);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3968147128320L, 29565);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ue localue = (ue)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3968147128320L, 29565);
        return -1;
      case 1: 
        localue.ulQ = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 2: 
        localue.ulR = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 3: 
        localue.ulS = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 4: 
        localue.ulT = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 5: 
        localue.ulU = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 6: 
        localue.ulV = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 7: 
        localue.ulW = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 8: 
        localue.ulX = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 9: 
        localue.ulY = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 10: 
        localue.ulZ = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 11: 
        localue.uma = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 12: 
        localue.umb = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 13: 
        localue.umc = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      case 14: 
        localue.umd = locala.yqV.nj();
        GMTrace.o(3968147128320L, 29565);
        return 0;
      }
      localue.ume = locala.yqV.nj();
      GMTrace.o(3968147128320L, 29565);
      return 0;
    }
    GMTrace.o(3968147128320L, 29565);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */