package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bps
  extends com.tencent.mm.bm.a
{
  public int uZW;
  public int uZX;
  public int uZY;
  public int uZZ;
  public int vaa;
  
  public bps()
  {
    GMTrace.i(3935532220416L, 29322);
    GMTrace.o(3935532220416L, 29322);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3935666438144L, 29323);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uZW);
      paramVarArgs.fk(2, this.uZX);
      paramVarArgs.fk(3, this.uZY);
      paramVarArgs.fk(4, this.uZZ);
      paramVarArgs.fk(5, this.vaa);
      GMTrace.o(3935666438144L, 29323);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uZW);
      int i = b.a.a.a.fh(2, this.uZX);
      int j = b.a.a.a.fh(3, this.uZY);
      int k = b.a.a.a.fh(4, this.uZZ);
      int m = b.a.a.a.fh(5, this.vaa);
      GMTrace.o(3935666438144L, 29323);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3935666438144L, 29323);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bps localbps = (bps)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3935666438144L, 29323);
        return -1;
      case 1: 
        localbps.uZW = locala.yqV.nj();
        GMTrace.o(3935666438144L, 29323);
        return 0;
      case 2: 
        localbps.uZX = locala.yqV.nj();
        GMTrace.o(3935666438144L, 29323);
        return 0;
      case 3: 
        localbps.uZY = locala.yqV.nj();
        GMTrace.o(3935666438144L, 29323);
        return 0;
      case 4: 
        localbps.uZZ = locala.yqV.nj();
        GMTrace.o(3935666438144L, 29323);
        return 0;
      }
      localbps.vaa = locala.yqV.nj();
      GMTrace.o(3935666438144L, 29323);
      return 0;
    }
    GMTrace.o(3935666438144L, 29323);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */