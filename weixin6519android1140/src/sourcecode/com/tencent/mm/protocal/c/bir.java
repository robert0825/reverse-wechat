package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bir
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int uTS;
  
  public bir()
  {
    GMTrace.i(4026800275456L, 30002);
    GMTrace.o(4026800275456L, 30002);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4026934493184L, 30003);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uTS);
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      GMTrace.o(4026934493184L, 30003);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uTS) + 0;
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      GMTrace.o(4026934493184L, 30003);
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
      GMTrace.o(4026934493184L, 30003);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bir localbir = (bir)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4026934493184L, 30003);
        return -1;
      case 1: 
        localbir.uTS = locala.yqV.nj();
        GMTrace.o(4026934493184L, 30003);
        return 0;
      }
      localbir.jhi = locala.yqV.readString();
      GMTrace.o(4026934493184L, 30003);
      return 0;
    }
    GMTrace.o(4026934493184L, 30003);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */