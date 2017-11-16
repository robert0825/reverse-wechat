package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class un
  extends com.tencent.mm.bm.a
{
  public int eGy;
  public String id;
  public int lra;
  public String umP;
  public long umQ;
  
  public un()
  {
    GMTrace.i(3954054266880L, 29460);
    GMTrace.o(3954054266880L, 29460);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3954188484608L, 29461);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.e(1, this.id);
      }
      paramVarArgs.fk(2, this.lra);
      if (this.umP != null) {
        paramVarArgs.e(3, this.umP);
      }
      paramVarArgs.T(4, this.umQ);
      paramVarArgs.fk(5, this.eGy);
      GMTrace.o(3954188484608L, 29461);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label454;
      }
    }
    label454:
    for (paramInt = b.a.a.b.b.a.f(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.lra);
      paramInt = i;
      if (this.umP != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.umP);
      }
      i = b.a.a.a.S(4, this.umQ);
      int j = b.a.a.a.fh(5, this.eGy);
      GMTrace.o(3954188484608L, 29461);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3954188484608L, 29461);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        un localun = (un)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3954188484608L, 29461);
          return -1;
        case 1: 
          localun.id = locala.yqV.readString();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 2: 
          localun.lra = locala.yqV.nj();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 3: 
          localun.umP = locala.yqV.readString();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        case 4: 
          localun.umQ = locala.yqV.nk();
          GMTrace.o(3954188484608L, 29461);
          return 0;
        }
        localun.eGy = locala.yqV.nj();
        GMTrace.o(3954188484608L, 29461);
        return 0;
      }
      GMTrace.o(3954188484608L, 29461);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */