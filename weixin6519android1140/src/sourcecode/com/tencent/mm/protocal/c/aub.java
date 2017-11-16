package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aub
  extends com.tencent.mm.bm.a
{
  public double tWm;
  public double tWn;
  public double uJv;
  
  public aub()
  {
    GMTrace.i(3880905605120L, 28915);
    GMTrace.o(3880905605120L, 28915);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3881039822848L, 28916);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.tWn);
      paramVarArgs.a(2, this.tWm);
      paramVarArgs.a(3, this.uJv);
      GMTrace.o(3881039822848L, 28916);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(3881039822848L, 28916);
      return paramInt + 8 + 0 + (i + 8) + (j + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3881039822848L, 28916);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aub localaub = (aub)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3881039822848L, 28916);
        return -1;
      case 1: 
        localaub.tWn = locala.yqV.readDouble();
        GMTrace.o(3881039822848L, 28916);
        return 0;
      case 2: 
        localaub.tWm = locala.yqV.readDouble();
        GMTrace.o(3881039822848L, 28916);
        return 0;
      }
      localaub.uJv = locala.yqV.readDouble();
      GMTrace.o(3881039822848L, 28916);
      return 0;
    }
    GMTrace.o(3881039822848L, 28916);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */