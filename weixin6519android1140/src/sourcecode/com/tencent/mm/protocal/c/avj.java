package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class avj
  extends com.tencent.mm.bm.a
{
  public int kBk;
  public String kBl;
  public int mjL;
  public String mjM;
  public int uJk;
  public int uKF;
  public int uKG;
  
  public avj()
  {
    GMTrace.i(4019149864960L, 29945);
    GMTrace.o(4019149864960L, 29945);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4019284082688L, 29946);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uJk);
      paramVarArgs.fk(2, this.uKG);
      paramVarArgs.fk(3, this.uKF);
      paramVarArgs.fk(4, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(5, this.kBl);
      }
      paramVarArgs.fk(6, this.mjL);
      if (this.mjM != null) {
        paramVarArgs.e(7, this.mjM);
      }
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uJk) + 0 + b.a.a.a.fh(2, this.uKG) + b.a.a.a.fh(3, this.uKF) + b.a.a.a.fh(4, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.kBl);
      }
      i = paramInt + b.a.a.a.fh(6, this.mjL);
      paramInt = i;
      if (this.mjM != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mjM);
      }
      GMTrace.o(4019284082688L, 29946);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      avj localavj = (avj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4019284082688L, 29946);
        return -1;
      case 1: 
        localavj.uJk = locala.yqV.nj();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 2: 
        localavj.uKG = locala.yqV.nj();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 3: 
        localavj.uKF = locala.yqV.nj();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 4: 
        localavj.kBk = locala.yqV.nj();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 5: 
        localavj.kBl = locala.yqV.readString();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      case 6: 
        localavj.mjL = locala.yqV.nj();
        GMTrace.o(4019284082688L, 29946);
        return 0;
      }
      localavj.mjM = locala.yqV.readString();
      GMTrace.o(4019284082688L, 29946);
      return 0;
    }
    GMTrace.o(4019284082688L, 29946);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */