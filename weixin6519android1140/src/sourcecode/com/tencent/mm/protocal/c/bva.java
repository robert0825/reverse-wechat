package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bva
  extends com.tencent.mm.bm.a
{
  public int tPN;
  public int uBN;
  public int vds;
  
  public bva()
  {
    GMTrace.i(15350749986816L, 114372);
    GMTrace.o(15350749986816L, 114372);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15350884204544L, 114373);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uBN);
      paramVarArgs.fk(2, this.tPN);
      paramVarArgs.fk(3, this.vds);
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uBN);
      int i = b.a.a.a.fh(2, this.tPN);
      int j = b.a.a.a.fh(3, this.vds);
      GMTrace.o(15350884204544L, 114373);
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
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bva localbva = (bva)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15350884204544L, 114373);
        return -1;
      case 1: 
        localbva.uBN = locala.yqV.nj();
        GMTrace.o(15350884204544L, 114373);
        return 0;
      case 2: 
        localbva.tPN = locala.yqV.nj();
        GMTrace.o(15350884204544L, 114373);
        return 0;
      }
      localbva.vds = locala.yqV.nj();
      GMTrace.o(15350884204544L, 114373);
      return 0;
    }
    GMTrace.o(15350884204544L, 114373);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */