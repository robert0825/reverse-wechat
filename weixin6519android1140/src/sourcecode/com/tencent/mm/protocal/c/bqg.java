package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqg
  extends com.tencent.mm.bm.a
{
  public int etB;
  public String nIp;
  
  public bqg()
  {
    GMTrace.i(3733802975232L, 27819);
    GMTrace.o(3733802975232L, 27819);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3733937192960L, 27820);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.etB);
      if (this.nIp != null) {
        paramVarArgs.e(2, this.nIp);
      }
      GMTrace.o(3733937192960L, 27820);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.etB) + 0;
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nIp);
      }
      GMTrace.o(3733937192960L, 27820);
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
      GMTrace.o(3733937192960L, 27820);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bqg localbqg = (bqg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3733937192960L, 27820);
        return -1;
      case 1: 
        localbqg.etB = locala.yqV.nj();
        GMTrace.o(3733937192960L, 27820);
        return 0;
      }
      localbqg.nIp = locala.yqV.readString();
      GMTrace.o(3733937192960L, 27820);
      return 0;
    }
    GMTrace.o(3733937192960L, 27820);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */