package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cx
  extends com.tencent.mm.bm.a
{
  public long tQW;
  public int tQX;
  public int tQY;
  public int tQZ;
  public int tRa;
  public int tRb;
  public int tRc;
  public String tRd;
  
  public cx()
  {
    GMTrace.i(3962107330560L, 29520);
    GMTrace.o(3962107330560L, 29520);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962241548288L, 29521);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.tQW);
      paramVarArgs.fk(2, this.tQX);
      paramVarArgs.fk(3, this.tQY);
      paramVarArgs.fk(4, this.tQZ);
      paramVarArgs.fk(5, this.tRa);
      paramVarArgs.fk(6, this.tRb);
      paramVarArgs.fk(7, this.tRc);
      if (this.tRd != null) {
        paramVarArgs.e(8, this.tRd);
      }
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.tQW) + 0 + b.a.a.a.fh(2, this.tQX) + b.a.a.a.fh(3, this.tQY) + b.a.a.a.fh(4, this.tQZ) + b.a.a.a.fh(5, this.tRa) + b.a.a.a.fh(6, this.tRb) + b.a.a.a.fh(7, this.tRc);
      paramInt = i;
      if (this.tRd != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tRd);
      }
      GMTrace.o(3962241548288L, 29521);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cx localcx = (cx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3962241548288L, 29521);
        return -1;
      case 1: 
        localcx.tQW = locala.yqV.nk();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 2: 
        localcx.tQX = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 3: 
        localcx.tQY = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 4: 
        localcx.tQZ = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 5: 
        localcx.tRa = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 6: 
        localcx.tRb = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      case 7: 
        localcx.tRc = locala.yqV.nj();
        GMTrace.o(3962241548288L, 29521);
        return 0;
      }
      localcx.tRd = locala.yqV.readString();
      GMTrace.o(3962241548288L, 29521);
      return 0;
    }
    GMTrace.o(3962241548288L, 29521);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */