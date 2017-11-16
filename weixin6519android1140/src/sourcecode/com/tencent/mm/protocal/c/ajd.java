package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ajd
  extends com.tencent.mm.bm.a
{
  public int unG;
  public int uyj;
  public int uyk;
  public int uyl;
  
  public ajd()
  {
    GMTrace.i(3906541191168L, 29106);
    GMTrace.o(3906541191168L, 29106);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3906675408896L, 29107);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.unG);
      paramVarArgs.fk(2, this.uyj);
      paramVarArgs.fk(3, this.uyk);
      paramVarArgs.fk(4, this.uyl);
      GMTrace.o(3906675408896L, 29107);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.unG);
      int i = b.a.a.a.fh(2, this.uyj);
      int j = b.a.a.a.fh(3, this.uyk);
      int k = b.a.a.a.fh(4, this.uyl);
      GMTrace.o(3906675408896L, 29107);
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
      GMTrace.o(3906675408896L, 29107);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ajd localajd = (ajd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3906675408896L, 29107);
        return -1;
      case 1: 
        localajd.unG = locala.yqV.nj();
        GMTrace.o(3906675408896L, 29107);
        return 0;
      case 2: 
        localajd.uyj = locala.yqV.nj();
        GMTrace.o(3906675408896L, 29107);
        return 0;
      case 3: 
        localajd.uyk = locala.yqV.nj();
        GMTrace.o(3906675408896L, 29107);
        return 0;
      }
      localajd.uyl = locala.yqV.nj();
      GMTrace.o(3906675408896L, 29107);
      return 0;
    }
    GMTrace.o(3906675408896L, 29107);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */