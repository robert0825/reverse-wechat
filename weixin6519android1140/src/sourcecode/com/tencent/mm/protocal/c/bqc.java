package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqc
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public String tRz;
  
  public bqc()
  {
    GMTrace.i(3836076883968L, 28581);
    GMTrace.o(3836076883968L, 28581);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3836211101696L, 28582);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      paramVarArgs.fk(2, this.jhA);
      GMTrace.o(3836211101696L, 28582);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRz == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.tRz) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jhA);
      GMTrace.o(3836211101696L, 28582);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3836211101696L, 28582);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqc localbqc = (bqc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3836211101696L, 28582);
          return -1;
        case 1: 
          localbqc.tRz = locala.yqV.readString();
          GMTrace.o(3836211101696L, 28582);
          return 0;
        }
        localbqc.jhA = locala.yqV.nj();
        GMTrace.o(3836211101696L, 28582);
        return 0;
      }
      GMTrace.o(3836211101696L, 28582);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */