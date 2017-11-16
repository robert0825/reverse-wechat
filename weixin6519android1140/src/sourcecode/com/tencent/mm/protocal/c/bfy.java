package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfy
  extends com.tencent.mm.bm.a
{
  public int uRR;
  public int uRS;
  
  public bfy()
  {
    GMTrace.i(3680652754944L, 27423);
    GMTrace.o(3680652754944L, 27423);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3680786972672L, 27424);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uRR);
      paramVarArgs.fk(2, this.uRS);
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uRR);
      int i = b.a.a.a.fh(2, this.uRS);
      GMTrace.o(3680786972672L, 27424);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bfy localbfy = (bfy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3680786972672L, 27424);
        return -1;
      case 1: 
        localbfy.uRR = locala.yqV.nj();
        GMTrace.o(3680786972672L, 27424);
        return 0;
      }
      localbfy.uRS = locala.yqV.nj();
      GMTrace.o(3680786972672L, 27424);
      return 0;
    }
    GMTrace.o(3680786972672L, 27424);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */