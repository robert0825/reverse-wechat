package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class dj
  extends com.tencent.mm.bm.a
{
  public int tRF;
  public int tRG;
  public int tRH;
  public int tRI;
  
  public dj()
  {
    GMTrace.i(3762525569024L, 28033);
    GMTrace.o(3762525569024L, 28033);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3762659786752L, 28034);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRF);
      paramVarArgs.fk(2, this.tRG);
      paramVarArgs.fk(3, this.tRH);
      paramVarArgs.fk(4, this.tRI);
      GMTrace.o(3762659786752L, 28034);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRF);
      int i = b.a.a.a.fh(2, this.tRG);
      int j = b.a.a.a.fh(3, this.tRH);
      int k = b.a.a.a.fh(4, this.tRI);
      GMTrace.o(3762659786752L, 28034);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3762659786752L, 28034);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      dj localdj = (dj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3762659786752L, 28034);
        return -1;
      case 1: 
        localdj.tRF = locala.yqV.nj();
        GMTrace.o(3762659786752L, 28034);
        return 0;
      case 2: 
        localdj.tRG = locala.yqV.nj();
        GMTrace.o(3762659786752L, 28034);
        return 0;
      case 3: 
        localdj.tRH = locala.yqV.nj();
        GMTrace.o(3762659786752L, 28034);
        return 0;
      }
      localdj.tRI = locala.yqV.nj();
      GMTrace.o(3762659786752L, 28034);
      return 0;
    }
    GMTrace.o(3762659786752L, 28034);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */