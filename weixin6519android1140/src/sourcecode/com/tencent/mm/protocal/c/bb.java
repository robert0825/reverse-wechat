package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bb
  extends com.tencent.mm.bm.a
{
  public long endTime;
  public int png;
  public int pnh;
  public long startTime;
  public float tPl;
  public float tPm;
  public float tPn;
  public long tPo;
  public long tPp;
  public long tPq;
  public long tPr;
  
  public bb()
  {
    GMTrace.i(3663875538944L, 27298);
    GMTrace.o(3663875538944L, 27298);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3664009756672L, 27299);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.png);
      paramVarArgs.fk(2, this.pnh);
      paramVarArgs.n(3, this.tPl);
      paramVarArgs.n(4, this.tPm);
      paramVarArgs.n(5, this.tPn);
      paramVarArgs.T(6, this.startTime);
      paramVarArgs.T(7, this.endTime);
      paramVarArgs.T(8, this.tPo);
      paramVarArgs.T(9, this.tPp);
      paramVarArgs.T(10, this.tPq);
      paramVarArgs.T(11, this.tPr);
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.png);
      int i = b.a.a.a.fh(2, this.pnh);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.b.b.a.cK(5);
      int n = b.a.a.a.S(6, this.startTime);
      int i1 = b.a.a.a.S(7, this.endTime);
      int i2 = b.a.a.a.S(8, this.tPo);
      int i3 = b.a.a.a.S(9, this.tPp);
      int i4 = b.a.a.a.S(10, this.tPq);
      int i5 = b.a.a.a.S(11, this.tPr);
      GMTrace.o(3664009756672L, 27299);
      return paramInt + 0 + i + (j + 4) + (k + 4) + (m + 4) + n + i1 + i2 + i3 + i4 + i5;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bb localbb = (bb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3664009756672L, 27299);
        return -1;
      case 1: 
        localbb.png = locala.yqV.nj();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 2: 
        localbb.pnh = locala.yqV.nj();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 3: 
        localbb.tPl = locala.yqV.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 4: 
        localbb.tPm = locala.yqV.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 5: 
        localbb.tPn = locala.yqV.readFloat();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 6: 
        localbb.startTime = locala.yqV.nk();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 7: 
        localbb.endTime = locala.yqV.nk();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 8: 
        localbb.tPo = locala.yqV.nk();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 9: 
        localbb.tPp = locala.yqV.nk();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      case 10: 
        localbb.tPq = locala.yqV.nk();
        GMTrace.o(3664009756672L, 27299);
        return 0;
      }
      localbb.tPr = locala.yqV.nk();
      GMTrace.o(3664009756672L, 27299);
      return 0;
    }
    GMTrace.o(3664009756672L, 27299);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */