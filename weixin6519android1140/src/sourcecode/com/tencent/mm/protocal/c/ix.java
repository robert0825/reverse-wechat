package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ix
  extends com.tencent.mm.bm.a
{
  public int tXY;
  public int tXZ;
  public int tYa;
  public int tYb;
  public int tYc;
  public int tYd;
  
  public ix()
  {
    GMTrace.i(14518063202304L, 108168);
    GMTrace.o(14518063202304L, 108168);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14518197420032L, 108169);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tXY);
      paramVarArgs.fk(2, this.tXZ);
      paramVarArgs.fk(3, this.tYa);
      paramVarArgs.fk(4, this.tYb);
      paramVarArgs.fk(5, this.tYc);
      paramVarArgs.fk(6, this.tYd);
      GMTrace.o(14518197420032L, 108169);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tXY);
      int i = b.a.a.a.fh(2, this.tXZ);
      int j = b.a.a.a.fh(3, this.tYa);
      int k = b.a.a.a.fh(4, this.tYb);
      int m = b.a.a.a.fh(5, this.tYc);
      int n = b.a.a.a.fh(6, this.tYd);
      GMTrace.o(14518197420032L, 108169);
      return paramInt + 0 + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14518197420032L, 108169);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ix localix = (ix)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14518197420032L, 108169);
        return -1;
      case 1: 
        localix.tXY = locala.yqV.nj();
        GMTrace.o(14518197420032L, 108169);
        return 0;
      case 2: 
        localix.tXZ = locala.yqV.nj();
        GMTrace.o(14518197420032L, 108169);
        return 0;
      case 3: 
        localix.tYa = locala.yqV.nj();
        GMTrace.o(14518197420032L, 108169);
        return 0;
      case 4: 
        localix.tYb = locala.yqV.nj();
        GMTrace.o(14518197420032L, 108169);
        return 0;
      case 5: 
        localix.tYc = locala.yqV.nj();
        GMTrace.o(14518197420032L, 108169);
        return 0;
      }
      localix.tYd = locala.yqV.nj();
      GMTrace.o(14518197420032L, 108169);
      return 0;
    }
    GMTrace.o(14518197420032L, 108169);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */