package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pz
  extends com.tencent.mm.bm.a
{
  public int ufY;
  public int ufZ;
  
  public pz()
  {
    GMTrace.i(13341107945472L, 99399);
    GMTrace.o(13341107945472L, 99399);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13341242163200L, 99400);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ufY);
      paramVarArgs.fk(2, this.ufZ);
      GMTrace.o(13341242163200L, 99400);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ufY);
      int i = b.a.a.a.fh(2, this.ufZ);
      GMTrace.o(13341242163200L, 99400);
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
      GMTrace.o(13341242163200L, 99400);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      pz localpz = (pz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13341242163200L, 99400);
        return -1;
      case 1: 
        localpz.ufY = locala.yqV.nj();
        GMTrace.o(13341242163200L, 99400);
        return 0;
      }
      localpz.ufZ = locala.yqV.nj();
      GMTrace.o(13341242163200L, 99400);
      return 0;
    }
    GMTrace.o(13341242163200L, 99400);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */