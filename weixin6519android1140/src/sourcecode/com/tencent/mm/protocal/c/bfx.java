package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfx
  extends com.tencent.mm.bm.a
{
  public float aFG;
  public int pTO;
  public float uRK;
  public float uRL;
  public float uRM;
  public float uRN;
  public int uRO;
  public long uRP;
  public long uRQ;
  
  public bfx()
  {
    GMTrace.i(3926673850368L, 29256);
    GMTrace.o(3926673850368L, 29256);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3926808068096L, 29257);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.uRK);
      paramVarArgs.n(2, this.uRL);
      paramVarArgs.n(3, this.uRM);
      paramVarArgs.n(4, this.uRN);
      paramVarArgs.fk(5, this.uRO);
      paramVarArgs.T(6, this.uRP);
      paramVarArgs.T(7, this.uRQ);
      paramVarArgs.n(8, this.aFG);
      paramVarArgs.fk(9, this.pTO);
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.b.b.a.cK(1);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      int k = b.a.a.b.b.a.cK(4);
      int m = b.a.a.a.fh(5, this.uRO);
      int n = b.a.a.a.S(6, this.uRP);
      int i1 = b.a.a.a.S(7, this.uRQ);
      int i2 = b.a.a.b.b.a.cK(8);
      int i3 = b.a.a.a.fh(9, this.pTO);
      GMTrace.o(3926808068096L, 29257);
      return paramInt + 4 + 0 + (i + 4) + (j + 4) + (k + 4) + m + n + i1 + (i2 + 4) + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bfx localbfx = (bfx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3926808068096L, 29257);
        return -1;
      case 1: 
        localbfx.uRK = locala.yqV.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 2: 
        localbfx.uRL = locala.yqV.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 3: 
        localbfx.uRM = locala.yqV.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 4: 
        localbfx.uRN = locala.yqV.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 5: 
        localbfx.uRO = locala.yqV.nj();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 6: 
        localbfx.uRP = locala.yqV.nk();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 7: 
        localbfx.uRQ = locala.yqV.nk();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      case 8: 
        localbfx.aFG = locala.yqV.readFloat();
        GMTrace.o(3926808068096L, 29257);
        return 0;
      }
      localbfx.pTO = locala.yqV.nj();
      GMTrace.o(3926808068096L, 29257);
      return 0;
    }
    GMTrace.o(3926808068096L, 29257);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */