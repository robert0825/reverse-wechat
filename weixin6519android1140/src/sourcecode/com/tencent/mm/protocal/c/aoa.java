package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aoa
  extends com.tencent.mm.bm.a
{
  public int uDU;
  public int uDV;
  public int uDW;
  public int uDX;
  
  public aoa()
  {
    GMTrace.i(18666598957056L, 139077);
    GMTrace.o(18666598957056L, 139077);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18666733174784L, 139078);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uDU);
      paramVarArgs.fk(2, this.uDV);
      paramVarArgs.fk(3, this.uDW);
      paramVarArgs.fk(4, this.uDX);
      GMTrace.o(18666733174784L, 139078);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uDU);
      int i = b.a.a.a.fh(2, this.uDV);
      int j = b.a.a.a.fh(3, this.uDW);
      int k = b.a.a.a.fh(4, this.uDX);
      GMTrace.o(18666733174784L, 139078);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18666733174784L, 139078);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aoa localaoa = (aoa)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(18666733174784L, 139078);
        return -1;
      case 1: 
        localaoa.uDU = locala.yqV.nj();
        GMTrace.o(18666733174784L, 139078);
        return 0;
      case 2: 
        localaoa.uDV = locala.yqV.nj();
        GMTrace.o(18666733174784L, 139078);
        return 0;
      case 3: 
        localaoa.uDW = locala.yqV.nj();
        GMTrace.o(18666733174784L, 139078);
        return 0;
      }
      localaoa.uDX = locala.yqV.nj();
      GMTrace.o(18666733174784L, 139078);
      return 0;
    }
    GMTrace.o(18666733174784L, 139078);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */