package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdp
  extends com.tencent.mm.bm.a
{
  public String eTJ;
  public int jAW;
  public long uPF;
  public int ubf;
  
  public bdp()
  {
    GMTrace.i(3758767472640L, 28005);
    GMTrace.o(3758767472640L, 28005);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3758901690368L, 28006);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ != null) {
        paramVarArgs.e(1, this.eTJ);
      }
      paramVarArgs.fk(2, this.jAW);
      paramVarArgs.fk(3, this.ubf);
      paramVarArgs.T(4, this.uPF);
      GMTrace.o(3758901690368L, 28006);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eTJ == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.eTJ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jAW);
      int j = b.a.a.a.fh(3, this.ubf);
      int k = b.a.a.a.S(4, this.uPF);
      GMTrace.o(3758901690368L, 28006);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3758901690368L, 28006);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdp localbdp = (bdp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3758901690368L, 28006);
          return -1;
        case 1: 
          localbdp.eTJ = locala.yqV.readString();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        case 2: 
          localbdp.jAW = locala.yqV.nj();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        case 3: 
          localbdp.ubf = locala.yqV.nj();
          GMTrace.o(3758901690368L, 28006);
          return 0;
        }
        localbdp.uPF = locala.yqV.nk();
        GMTrace.o(3758901690368L, 28006);
        return 0;
      }
      GMTrace.o(3758901690368L, 28006);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */