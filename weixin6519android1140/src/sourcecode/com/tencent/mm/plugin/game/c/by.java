package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class by
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int lSE;
  public long lSF;
  public String lSG;
  public boolean lSH;
  public int lSI;
  public String lSJ;
  
  public by()
  {
    GMTrace.i(12638075486208L, 94161);
    GMTrace.o(12638075486208L, 94161);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12638209703936L, 94162);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.lSE);
      paramVarArgs.T(3, this.lSF);
      if (this.lSG != null) {
        paramVarArgs.e(4, this.lSG);
      }
      paramVarArgs.ah(5, this.lSH);
      paramVarArgs.fk(6, this.lSI);
      if (this.lSJ != null) {
        paramVarArgs.e(7, this.lSJ);
      }
      GMTrace.o(12638209703936L, 94162);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label578;
      }
    }
    label578:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.lSE) + b.a.a.a.S(3, this.lSF);
      paramInt = i;
      if (this.lSG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSG);
      }
      i = paramInt + (b.a.a.b.b.a.cK(5) + 1) + b.a.a.a.fh(6, this.lSI);
      paramInt = i;
      if (this.lSJ != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.lSJ);
      }
      GMTrace.o(12638209703936L, 94162);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jhi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        GMTrace.o(12638209703936L, 94162);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        by localby = (by)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12638209703936L, 94162);
          return -1;
        case 1: 
          localby.jhi = locala.yqV.readString();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 2: 
          localby.lSE = locala.yqV.nj();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 3: 
          localby.lSF = locala.yqV.nk();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 4: 
          localby.lSG = locala.yqV.readString();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 5: 
          localby.lSH = locala.csU();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        case 6: 
          localby.lSI = locala.yqV.nj();
          GMTrace.o(12638209703936L, 94162);
          return 0;
        }
        localby.lSJ = locala.yqV.readString();
        GMTrace.o(12638209703936L, 94162);
        return 0;
      }
      GMTrace.o(12638209703936L, 94162);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */