package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akw
  extends com.tencent.mm.bm.a
{
  public int oqG;
  public int uzX;
  
  public akw()
  {
    GMTrace.i(13583773597696L, 101207);
    GMTrace.o(13583773597696L, 101207);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13583907815424L, 101208);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.oqG);
      paramVarArgs.fk(2, this.uzX);
      GMTrace.o(13583907815424L, 101208);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.oqG);
      int i = b.a.a.a.fh(2, this.uzX);
      GMTrace.o(13583907815424L, 101208);
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
      GMTrace.o(13583907815424L, 101208);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      akw localakw = (akw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13583907815424L, 101208);
        return -1;
      case 1: 
        localakw.oqG = locala.yqV.nj();
        GMTrace.o(13583907815424L, 101208);
        return 0;
      }
      localakw.uzX = locala.yqV.nj();
      GMTrace.o(13583907815424L, 101208);
      return 0;
    }
    GMTrace.o(13583907815424L, 101208);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\akw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */