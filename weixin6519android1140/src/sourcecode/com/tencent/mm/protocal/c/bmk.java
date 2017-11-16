package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bmk
  extends com.tencent.mm.bm.a
{
  public int tRC;
  public int tRD;
  public int tRE;
  
  public bmk()
  {
    GMTrace.i(3897951256576L, 29042);
    GMTrace.o(3897951256576L, 29042);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3898085474304L, 29043);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRC);
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRE);
      GMTrace.o(3898085474304L, 29043);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRC);
      int i = b.a.a.a.fh(2, this.tRD);
      int j = b.a.a.a.fh(3, this.tRE);
      GMTrace.o(3898085474304L, 29043);
      return paramInt + 0 + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3898085474304L, 29043);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bmk localbmk = (bmk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3898085474304L, 29043);
        return -1;
      case 1: 
        localbmk.tRC = locala.yqV.nj();
        GMTrace.o(3898085474304L, 29043);
        return 0;
      case 2: 
        localbmk.tRD = locala.yqV.nj();
        GMTrace.o(3898085474304L, 29043);
        return 0;
      }
      localbmk.tRE = locala.yqV.nj();
      GMTrace.o(3898085474304L, 29043);
      return 0;
    }
    GMTrace.o(3898085474304L, 29043);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */