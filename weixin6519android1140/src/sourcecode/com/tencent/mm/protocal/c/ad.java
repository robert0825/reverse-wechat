package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ad
  extends com.tencent.mm.bm.a
{
  public int tNA;
  public String tNw;
  public int tNx;
  public int tNy;
  public int tNz;
  
  public ad()
  {
    GMTrace.i(18919465156608L, 140961);
    GMTrace.o(18919465156608L, 140961);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18919599374336L, 140962);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tNw != null) {
        paramVarArgs.e(1, this.tNw);
      }
      paramVarArgs.fk(2, this.tNx);
      paramVarArgs.fk(3, this.tNy);
      paramVarArgs.fk(4, this.tNz);
      paramVarArgs.fk(5, this.tNA);
      GMTrace.o(18919599374336L, 140962);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tNw == null) {
        break label431;
      }
    }
    label431:
    for (paramInt = b.a.a.b.b.a.f(1, this.tNw) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.tNx);
      int j = b.a.a.a.fh(3, this.tNy);
      int k = b.a.a.a.fh(4, this.tNz);
      int m = b.a.a.a.fh(5, this.tNA);
      GMTrace.o(18919599374336L, 140962);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18919599374336L, 140962);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ad localad = (ad)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18919599374336L, 140962);
          return -1;
        case 1: 
          localad.tNw = locala.yqV.readString();
          GMTrace.o(18919599374336L, 140962);
          return 0;
        case 2: 
          localad.tNx = locala.yqV.nj();
          GMTrace.o(18919599374336L, 140962);
          return 0;
        case 3: 
          localad.tNy = locala.yqV.nj();
          GMTrace.o(18919599374336L, 140962);
          return 0;
        case 4: 
          localad.tNz = locala.yqV.nj();
          GMTrace.o(18919599374336L, 140962);
          return 0;
        }
        localad.tNA = locala.yqV.nj();
        GMTrace.o(18919599374336L, 140962);
        return 0;
      }
      GMTrace.o(18919599374336L, 140962);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */