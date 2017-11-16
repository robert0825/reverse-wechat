package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ln
  extends com.tencent.mm.bm.a
{
  public String uch;
  public String uci;
  public String ucj;
  public int uck;
  public int ucl;
  public String ucm;
  public int ucn;
  
  public ln()
  {
    GMTrace.i(3775142035456L, 28127);
    GMTrace.o(3775142035456L, 28127);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3775276253184L, 28128);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uch != null) {
        paramVarArgs.e(1, this.uch);
      }
      if (this.uci != null) {
        paramVarArgs.e(2, this.uci);
      }
      if (this.ucj != null) {
        paramVarArgs.e(3, this.ucj);
      }
      paramVarArgs.fk(4, this.uck);
      paramVarArgs.fk(5, this.ucl);
      if (this.ucm != null) {
        paramVarArgs.e(6, this.ucm);
      }
      paramVarArgs.fk(7, this.ucn);
      GMTrace.o(3775276253184L, 28128);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uch == null) {
        break label582;
      }
    }
    label582:
    for (int i = b.a.a.b.b.a.f(1, this.uch) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uci != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uci);
      }
      i = paramInt;
      if (this.ucj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ucj);
      }
      i = i + b.a.a.a.fh(4, this.uck) + b.a.a.a.fh(5, this.ucl);
      paramInt = i;
      if (this.ucm != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ucm);
      }
      i = b.a.a.a.fh(7, this.ucn);
      GMTrace.o(3775276253184L, 28128);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3775276253184L, 28128);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ln localln = (ln)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3775276253184L, 28128);
          return -1;
        case 1: 
          localln.uch = locala.yqV.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 2: 
          localln.uci = locala.yqV.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 3: 
          localln.ucj = locala.yqV.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 4: 
          localln.uck = locala.yqV.nj();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 5: 
          localln.ucl = locala.yqV.nj();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        case 6: 
          localln.ucm = locala.yqV.readString();
          GMTrace.o(3775276253184L, 28128);
          return 0;
        }
        localln.ucn = locala.yqV.nj();
        GMTrace.o(3775276253184L, 28128);
        return 0;
      }
      GMTrace.o(3775276253184L, 28128);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */