package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cy
  extends com.tencent.mm.bm.a
{
  public int hQU;
  public int hQW;
  public int tRe;
  public int tRf;
  public int tRg;
  public int tRh;
  public int tRi;
  public int tRj;
  public int tRk;
  public int tRl;
  
  public cy()
  {
    GMTrace.i(3644011315200L, 27150);
    GMTrace.o(3644011315200L, 27150);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3644145532928L, 27151);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tRe);
      paramVarArgs.fk(2, this.tRf);
      paramVarArgs.fk(3, this.tRg);
      paramVarArgs.fk(4, this.tRh);
      paramVarArgs.fk(5, this.tRi);
      paramVarArgs.fk(6, this.tRj);
      paramVarArgs.fk(7, this.tRk);
      paramVarArgs.fk(8, this.tRl);
      paramVarArgs.fk(9, this.hQW);
      paramVarArgs.fk(10, this.hQU);
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tRe);
      int i = b.a.a.a.fh(2, this.tRf);
      int j = b.a.a.a.fh(3, this.tRg);
      int k = b.a.a.a.fh(4, this.tRh);
      int m = b.a.a.a.fh(5, this.tRi);
      int n = b.a.a.a.fh(6, this.tRj);
      int i1 = b.a.a.a.fh(7, this.tRk);
      int i2 = b.a.a.a.fh(8, this.tRl);
      int i3 = b.a.a.a.fh(9, this.hQW);
      int i4 = b.a.a.a.fh(10, this.hQU);
      GMTrace.o(3644145532928L, 27151);
      return paramInt + 0 + i + j + k + m + n + i1 + i2 + i3 + i4;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      cy localcy = (cy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3644145532928L, 27151);
        return -1;
      case 1: 
        localcy.tRe = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 2: 
        localcy.tRf = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 3: 
        localcy.tRg = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 4: 
        localcy.tRh = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 5: 
        localcy.tRi = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 6: 
        localcy.tRj = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 7: 
        localcy.tRk = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 8: 
        localcy.tRl = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      case 9: 
        localcy.hQW = locala.yqV.nj();
        GMTrace.o(3644145532928L, 27151);
        return 0;
      }
      localcy.hQU = locala.yqV.nj();
      GMTrace.o(3644145532928L, 27151);
      return 0;
    }
    GMTrace.o(3644145532928L, 27151);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */