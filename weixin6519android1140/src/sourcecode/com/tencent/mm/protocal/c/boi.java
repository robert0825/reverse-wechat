package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class boi
  extends com.tencent.mm.bm.a
{
  public int uYw;
  public int uYx;
  
  public boi()
  {
    GMTrace.i(3895266902016L, 29022);
    GMTrace.o(3895266902016L, 29022);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3895401119744L, 29023);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uYw);
      paramVarArgs.fk(2, this.uYx);
      GMTrace.o(3895401119744L, 29023);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uYw);
      int i = b.a.a.a.fh(2, this.uYx);
      GMTrace.o(3895401119744L, 29023);
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
      GMTrace.o(3895401119744L, 29023);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      boi localboi = (boi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3895401119744L, 29023);
        return -1;
      case 1: 
        localboi.uYw = locala.yqV.nj();
        GMTrace.o(3895401119744L, 29023);
        return 0;
      }
      localboi.uYx = locala.yqV.nj();
      GMTrace.o(3895401119744L, 29023);
      return 0;
    }
    GMTrace.o(3895401119744L, 29023);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */