package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class beb
  extends com.tencent.mm.bm.a
{
  public int jia;
  public com.tencent.mm.bm.b uPU;
  
  public beb()
  {
    GMTrace.i(3678236835840L, 27405);
    GMTrace.o(3678236835840L, 27405);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3678371053568L, 27406);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uPU == null) {
        throw new b.a.a.b("Not all required fields were included: Signature");
      }
      paramVarArgs.fk(1, this.jia);
      if (this.uPU != null) {
        paramVarArgs.b(2, this.uPU);
      }
      GMTrace.o(3678371053568L, 27406);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jia) + 0;
      paramInt = i;
      if (this.uPU != null) {
        paramInt = i + b.a.a.a.a(2, this.uPU);
      }
      GMTrace.o(3678371053568L, 27406);
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
      if (this.uPU == null) {
        throw new b.a.a.b("Not all required fields were included: Signature");
      }
      GMTrace.o(3678371053568L, 27406);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      beb localbeb = (beb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3678371053568L, 27406);
        return -1;
      case 1: 
        localbeb.jia = locala.yqV.nj();
        GMTrace.o(3678371053568L, 27406);
        return 0;
      }
      localbeb.uPU = locala.csV();
      GMTrace.o(3678371053568L, 27406);
      return 0;
    }
    GMTrace.o(3678371053568L, 27406);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\beb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */