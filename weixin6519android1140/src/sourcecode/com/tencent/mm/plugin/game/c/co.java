package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class co
  extends com.tencent.mm.bm.a
{
  public String lPR;
  public String lTh;
  public String lTi;
  public String lTj;
  public String lTk;
  public int lTl;
  public String lTm;
  public String lTn;
  
  public co()
  {
    GMTrace.i(12656329097216L, 94297);
    GMTrace.o(12656329097216L, 94297);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12656463314944L, 94298);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPR != null) {
        paramVarArgs.e(1, this.lPR);
      }
      if (this.lTh != null) {
        paramVarArgs.e(2, this.lTh);
      }
      if (this.lTi != null) {
        paramVarArgs.e(3, this.lTi);
      }
      if (this.lTj != null) {
        paramVarArgs.e(4, this.lTj);
      }
      if (this.lTk != null) {
        paramVarArgs.e(5, this.lTk);
      }
      paramVarArgs.fk(6, this.lTl);
      if (this.lTm != null) {
        paramVarArgs.e(7, this.lTm);
      }
      if (this.lTn != null) {
        paramVarArgs.e(8, this.lTn);
      }
      GMTrace.o(12656463314944L, 94298);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPR == null) {
        break label668;
      }
    }
    label668:
    for (int i = b.a.a.b.b.a.f(1, this.lPR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lTh != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lTh);
      }
      i = paramInt;
      if (this.lTi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lTi);
      }
      paramInt = i;
      if (this.lTj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lTj);
      }
      i = paramInt;
      if (this.lTk != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lTk);
      }
      i += b.a.a.a.fh(6, this.lTl);
      paramInt = i;
      if (this.lTm != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lTm);
      }
      i = paramInt;
      if (this.lTn != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.lTn);
      }
      GMTrace.o(12656463314944L, 94298);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12656463314944L, 94298);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        co localco = (co)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12656463314944L, 94298);
          return -1;
        case 1: 
          localco.lPR = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 2: 
          localco.lTh = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 3: 
          localco.lTi = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 4: 
          localco.lTj = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 5: 
          localco.lTk = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 6: 
          localco.lTl = locala.yqV.nj();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        case 7: 
          localco.lTm = locala.yqV.readString();
          GMTrace.o(12656463314944L, 94298);
          return 0;
        }
        localco.lTn = locala.yqV.readString();
        GMTrace.o(12656463314944L, 94298);
        return 0;
      }
      GMTrace.o(12656463314944L, 94298);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */