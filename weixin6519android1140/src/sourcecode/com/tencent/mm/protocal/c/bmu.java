package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bmu
  extends com.tencent.mm.bm.a
{
  public String eAR;
  public int errCode;
  
  public bmu()
  {
    GMTrace.i(3758230601728L, 28001);
    GMTrace.o(3758230601728L, 28001);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3758364819456L, 28002);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.errCode);
      if (this.eAR != null) {
        paramVarArgs.e(2, this.eAR);
      }
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.errCode) + 0;
      paramInt = i;
      if (this.eAR != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eAR);
      }
      GMTrace.o(3758364819456L, 28002);
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
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bmu localbmu = (bmu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3758364819456L, 28002);
        return -1;
      case 1: 
        localbmu.errCode = locala.yqV.nj();
        GMTrace.o(3758364819456L, 28002);
        return 0;
      }
      localbmu.eAR = locala.yqV.readString();
      GMTrace.o(3758364819456L, 28002);
      return 0;
    }
    GMTrace.o(3758364819456L, 28002);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */