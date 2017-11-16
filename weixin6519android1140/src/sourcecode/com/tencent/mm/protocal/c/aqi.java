package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqi
  extends com.tencent.mm.bm.a
{
  public int uGA;
  public int uGB;
  public int uGC;
  public int uGD;
  public int uGy;
  public int uGz;
  public int uzM;
  
  public aqi()
  {
    GMTrace.i(13096160591872L, 97574);
    GMTrace.o(13096160591872L, 97574);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13096294809600L, 97575);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uzM);
      paramVarArgs.fk(2, this.uGy);
      paramVarArgs.fk(3, this.uGz);
      paramVarArgs.fk(4, this.uGA);
      paramVarArgs.fk(5, this.uGB);
      paramVarArgs.fk(6, this.uGC);
      paramVarArgs.fk(7, this.uGD);
      GMTrace.o(13096294809600L, 97575);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uzM);
      int i = b.a.a.a.fh(2, this.uGy);
      int j = b.a.a.a.fh(3, this.uGz);
      int k = b.a.a.a.fh(4, this.uGA);
      int m = b.a.a.a.fh(5, this.uGB);
      int n = b.a.a.a.fh(6, this.uGC);
      int i1 = b.a.a.a.fh(7, this.uGD);
      GMTrace.o(13096294809600L, 97575);
      return paramInt + 0 + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13096294809600L, 97575);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aqi localaqi = (aqi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13096294809600L, 97575);
        return -1;
      case 1: 
        localaqi.uzM = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      case 2: 
        localaqi.uGy = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      case 3: 
        localaqi.uGz = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      case 4: 
        localaqi.uGA = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      case 5: 
        localaqi.uGB = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      case 6: 
        localaqi.uGC = locala.yqV.nj();
        GMTrace.o(13096294809600L, 97575);
        return 0;
      }
      localaqi.uGD = locala.yqV.nj();
      GMTrace.o(13096294809600L, 97575);
      return 0;
    }
    GMTrace.o(13096294809600L, 97575);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */