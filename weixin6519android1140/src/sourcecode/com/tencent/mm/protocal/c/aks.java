package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class aks
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public int uzM;
  public b uzN;
  public int uzU;
  public int uzV;
  
  public aks()
  {
    GMTrace.i(3662130708480L, 27285);
    GMTrace.o(3662130708480L, 27285);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3662264926208L, 27286);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uzM);
      if (this.uzN != null) {
        paramVarArgs.b(2, this.uzN);
      }
      paramVarArgs.fk(3, this.uzU);
      paramVarArgs.fk(4, this.jhc);
      paramVarArgs.fk(5, this.uzV);
      GMTrace.o(3662264926208L, 27286);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uzM) + 0;
      paramInt = i;
      if (this.uzN != null) {
        paramInt = i + b.a.a.a.a(2, this.uzN);
      }
      i = b.a.a.a.fh(3, this.uzU);
      int j = b.a.a.a.fh(4, this.jhc);
      int k = b.a.a.a.fh(5, this.uzV);
      GMTrace.o(3662264926208L, 27286);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3662264926208L, 27286);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aks localaks = (aks)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3662264926208L, 27286);
        return -1;
      case 1: 
        localaks.uzM = locala.yqV.nj();
        GMTrace.o(3662264926208L, 27286);
        return 0;
      case 2: 
        localaks.uzN = locala.csV();
        GMTrace.o(3662264926208L, 27286);
        return 0;
      case 3: 
        localaks.uzU = locala.yqV.nj();
        GMTrace.o(3662264926208L, 27286);
        return 0;
      case 4: 
        localaks.jhc = locala.yqV.nj();
        GMTrace.o(3662264926208L, 27286);
        return 0;
      }
      localaks.uzV = locala.yqV.nj();
      GMTrace.o(3662264926208L, 27286);
      return 0;
    }
    GMTrace.o(3662264926208L, 27286);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */