package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bd
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPE;
  public String lRV;
  public String lRW;
  
  public bd()
  {
    GMTrace.i(12651765694464L, 94263);
    GMTrace.o(12651765694464L, 94263);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651899912192L, 94264);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lRV != null) {
        paramVarArgs.e(2, this.lRV);
      }
      if (this.lPE != null) {
        paramVarArgs.e(3, this.lPE);
      }
      if (this.lRW != null) {
        paramVarArgs.e(4, this.lRW);
      }
      GMTrace.o(12651899912192L, 94264);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRV);
      }
      i = paramInt;
      if (this.lPE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPE);
      }
      paramInt = i;
      if (this.lRW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRW);
      }
      GMTrace.o(12651899912192L, 94264);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12651899912192L, 94264);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bd localbd = (bd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651899912192L, 94264);
          return -1;
        case 1: 
          localbd.eBt = locala.yqV.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        case 2: 
          localbd.lRV = locala.yqV.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        case 3: 
          localbd.lPE = locala.yqV.readString();
          GMTrace.o(12651899912192L, 94264);
          return 0;
        }
        localbd.lRW = locala.yqV.readString();
        GMTrace.o(12651899912192L, 94264);
        return 0;
      }
      GMTrace.o(12651899912192L, 94264);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */