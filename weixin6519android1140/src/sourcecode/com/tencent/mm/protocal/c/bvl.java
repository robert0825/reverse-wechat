package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvl
  extends com.tencent.mm.bm.a
{
  public int vdH;
  public boolean vdI;
  public boolean vdJ;
  
  public bvl()
  {
    GMTrace.i(20073200746496L, 149557);
    GMTrace.o(20073200746496L, 149557);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20073334964224L, 149558);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.vdH);
      paramVarArgs.ah(2, this.vdI);
      paramVarArgs.ah(3, this.vdJ);
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.vdH);
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.b.b.a.cK(3);
      GMTrace.o(20073334964224L, 149558);
      return paramInt + 0 + (i + 1) + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bvl localbvl = (bvl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20073334964224L, 149558);
        return -1;
      case 1: 
        localbvl.vdH = locala.yqV.nj();
        GMTrace.o(20073334964224L, 149558);
        return 0;
      case 2: 
        localbvl.vdI = locala.csU();
        GMTrace.o(20073334964224L, 149558);
        return 0;
      }
      localbvl.vdJ = locala.csU();
      GMTrace.o(20073334964224L, 149558);
      return 0;
    }
    GMTrace.o(20073334964224L, 149558);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */