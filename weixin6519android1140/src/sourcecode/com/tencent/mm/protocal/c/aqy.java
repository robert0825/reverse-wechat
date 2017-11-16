package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aqy
  extends com.tencent.mm.bm.a
{
  public String gPS;
  public int tWZ;
  public int uHg;
  public int uHh;
  public String uHi;
  public int uHj;
  public String uHk;
  public int udE;
  public int ufa;
  
  public aqy()
  {
    GMTrace.i(3645353492480L, 27160);
    GMTrace.o(3645353492480L, 27160);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3645487710208L, 27161);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gPS != null) {
        paramVarArgs.e(1, this.gPS);
      }
      paramVarArgs.fk(2, this.uHg);
      paramVarArgs.fk(3, this.uHh);
      paramVarArgs.fk(4, this.tWZ);
      if (this.uHi != null) {
        paramVarArgs.e(5, this.uHi);
      }
      paramVarArgs.fk(6, this.ufa);
      paramVarArgs.fk(7, this.uHj);
      paramVarArgs.fk(8, this.udE);
      if (this.uHk != null) {
        paramVarArgs.e(9, this.uHk);
      }
      GMTrace.o(3645487710208L, 27161);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gPS == null) {
        break label658;
      }
    }
    label658:
    for (paramInt = b.a.a.b.b.a.f(1, this.gPS) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uHg) + b.a.a.a.fh(3, this.uHh) + b.a.a.a.fh(4, this.tWZ);
      paramInt = i;
      if (this.uHi != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uHi);
      }
      i = paramInt + b.a.a.a.fh(6, this.ufa) + b.a.a.a.fh(7, this.uHj) + b.a.a.a.fh(8, this.udE);
      paramInt = i;
      if (this.uHk != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uHk);
      }
      GMTrace.o(3645487710208L, 27161);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3645487710208L, 27161);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aqy localaqy = (aqy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3645487710208L, 27161);
          return -1;
        case 1: 
          localaqy.gPS = locala.yqV.readString();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 2: 
          localaqy.uHg = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 3: 
          localaqy.uHh = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 4: 
          localaqy.tWZ = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 5: 
          localaqy.uHi = locala.yqV.readString();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 6: 
          localaqy.ufa = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 7: 
          localaqy.uHj = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        case 8: 
          localaqy.udE = locala.yqV.nj();
          GMTrace.o(3645487710208L, 27161);
          return 0;
        }
        localaqy.uHk = locala.yqV.readString();
        GMTrace.o(3645487710208L, 27161);
        return 0;
      }
      GMTrace.o(3645487710208L, 27161);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */