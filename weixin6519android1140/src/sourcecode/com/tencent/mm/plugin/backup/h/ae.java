package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class ae
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b jgP;
  public int jhA;
  public String jie;
  public int jif;
  public int jih;
  public int jii;
  public int jij;
  
  public ae()
  {
    GMTrace.i(14838440919040L, 110555);
    GMTrace.o(14838440919040L, 110555);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838575136768L, 110556);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jie == null) {
        throw new b.a.a.b("Not all required fields were included: DataID");
      }
      if (this.jie != null) {
        paramVarArgs.e(1, this.jie);
      }
      paramVarArgs.fk(2, this.jif);
      paramVarArgs.fk(3, this.jih);
      paramVarArgs.fk(4, this.jii);
      paramVarArgs.fk(5, this.jhA);
      paramVarArgs.fk(6, this.jij);
      if (this.jgP != null) {
        paramVarArgs.b(7, this.jgP);
      }
      GMTrace.o(14838575136768L, 110556);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jie == null) {
        break label562;
      }
    }
    label562:
    for (paramInt = b.a.a.b.b.a.f(1, this.jie) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jif) + b.a.a.a.fh(3, this.jih) + b.a.a.a.fh(4, this.jii) + b.a.a.a.fh(5, this.jhA) + b.a.a.a.fh(6, this.jij);
      paramInt = i;
      if (this.jgP != null) {
        paramInt = i + b.a.a.a.a(7, this.jgP);
      }
      GMTrace.o(14838575136768L, 110556);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jie == null) {
          throw new b.a.a.b("Not all required fields were included: DataID");
        }
        GMTrace.o(14838575136768L, 110556);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ae localae = (ae)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14838575136768L, 110556);
          return -1;
        case 1: 
          localae.jie = locala.yqV.readString();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 2: 
          localae.jif = locala.yqV.nj();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 3: 
          localae.jih = locala.yqV.nj();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 4: 
          localae.jii = locala.yqV.nj();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 5: 
          localae.jhA = locala.yqV.nj();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        case 6: 
          localae.jij = locala.yqV.nj();
          GMTrace.o(14838575136768L, 110556);
          return 0;
        }
        localae.jgP = locala.csV();
        GMTrace.o(14838575136768L, 110556);
        return 0;
      }
      GMTrace.o(14838575136768L, 110556);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */