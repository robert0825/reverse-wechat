package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ra
  extends com.tencent.mm.bm.a
{
  public String lRV;
  public int tTJ;
  public String ugY;
  public String ugZ;
  public int uha;
  
  public ra()
  {
    GMTrace.i(3873120976896L, 28857);
    GMTrace.o(3873120976896L, 28857);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3873255194624L, 28858);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugZ != null) {
        paramVarArgs.e(1, this.ugZ);
      }
      paramVarArgs.fk(2, this.tTJ);
      paramVarArgs.fk(3, this.uha);
      if (this.lRV != null) {
        paramVarArgs.e(4, this.lRV);
      }
      if (this.ugY != null) {
        paramVarArgs.e(5, this.ugY);
      }
      GMTrace.o(3873255194624L, 28858);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugZ == null) {
        break label466;
      }
    }
    label466:
    for (paramInt = b.a.a.b.b.a.f(1, this.ugZ) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.tTJ) + b.a.a.a.fh(3, this.uha);
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRV);
      }
      i = paramInt;
      if (this.ugY != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ugY);
      }
      GMTrace.o(3873255194624L, 28858);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3873255194624L, 28858);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ra localra = (ra)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3873255194624L, 28858);
          return -1;
        case 1: 
          localra.ugZ = locala.yqV.readString();
          GMTrace.o(3873255194624L, 28858);
          return 0;
        case 2: 
          localra.tTJ = locala.yqV.nj();
          GMTrace.o(3873255194624L, 28858);
          return 0;
        case 3: 
          localra.uha = locala.yqV.nj();
          GMTrace.o(3873255194624L, 28858);
          return 0;
        case 4: 
          localra.lRV = locala.yqV.readString();
          GMTrace.o(3873255194624L, 28858);
          return 0;
        }
        localra.ugY = locala.yqV.readString();
        GMTrace.o(3873255194624L, 28858);
        return 0;
      }
      GMTrace.o(3873255194624L, 28858);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */