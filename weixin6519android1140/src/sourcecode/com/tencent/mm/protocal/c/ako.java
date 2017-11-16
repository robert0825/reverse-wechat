package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class ako
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public int ufZ;
  public int uzM;
  public b uzN;
  public int uzO;
  public int uzP;
  
  public ako()
  {
    GMTrace.i(13099247599616L, 97597);
    GMTrace.o(13099247599616L, 97597);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13099381817344L, 97598);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uzM);
      if (this.uzN != null) {
        paramVarArgs.b(2, this.uzN);
      }
      paramVarArgs.fk(3, this.uzO);
      paramVarArgs.fk(4, this.ufZ);
      paramVarArgs.fk(5, this.jhc);
      paramVarArgs.fk(6, this.uzP);
      GMTrace.o(13099381817344L, 97598);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uzM) + 0;
      paramInt = i;
      if (this.uzN != null) {
        paramInt = i + b.a.a.a.a(2, this.uzN);
      }
      i = b.a.a.a.fh(3, this.uzO);
      int j = b.a.a.a.fh(4, this.ufZ);
      int k = b.a.a.a.fh(5, this.jhc);
      int m = b.a.a.a.fh(6, this.uzP);
      GMTrace.o(13099381817344L, 97598);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13099381817344L, 97598);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ako localako = (ako)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13099381817344L, 97598);
        return -1;
      case 1: 
        localako.uzM = locala.yqV.nj();
        GMTrace.o(13099381817344L, 97598);
        return 0;
      case 2: 
        localako.uzN = locala.csV();
        GMTrace.o(13099381817344L, 97598);
        return 0;
      case 3: 
        localako.uzO = locala.yqV.nj();
        GMTrace.o(13099381817344L, 97598);
        return 0;
      case 4: 
        localako.ufZ = locala.yqV.nj();
        GMTrace.o(13099381817344L, 97598);
        return 0;
      case 5: 
        localako.jhc = locala.yqV.nj();
        GMTrace.o(13099381817344L, 97598);
        return 0;
      }
      localako.uzP = locala.yqV.nj();
      GMTrace.o(13099381817344L, 97598);
      return 0;
    }
    GMTrace.o(13099381817344L, 97598);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ako.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */