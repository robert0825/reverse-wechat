package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class p
  extends com.tencent.mm.bm.a
{
  public String ID;
  public int jhC;
  public int jhD;
  public int jhE;
  public long jhF;
  public long jhG;
  public long jhz;
  
  public p()
  {
    GMTrace.i(14833877516288L, 110521);
    GMTrace.o(14833877516288L, 110521);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14834011734016L, 110522);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.fk(2, this.jhC);
      paramVarArgs.fk(3, this.jhD);
      paramVarArgs.fk(4, this.jhE);
      paramVarArgs.T(5, this.jhz);
      paramVarArgs.T(6, this.jhF);
      paramVarArgs.T(7, this.jhG);
      GMTrace.o(14834011734016L, 110522);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label565;
      }
    }
    label565:
    for (paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jhC);
      int j = b.a.a.a.fh(3, this.jhD);
      int k = b.a.a.a.fh(4, this.jhE);
      int m = b.a.a.a.S(5, this.jhz);
      int n = b.a.a.a.S(6, this.jhF);
      int i1 = b.a.a.a.S(7, this.jhG);
      GMTrace.o(14834011734016L, 110522);
      return paramInt + i + j + k + m + n + i1;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.ID == null) {
          throw new b("Not all required fields were included: ID");
        }
        GMTrace.o(14834011734016L, 110522);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        p localp = (p)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14834011734016L, 110522);
          return -1;
        case 1: 
          localp.ID = locala.yqV.readString();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        case 2: 
          localp.jhC = locala.yqV.nj();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        case 3: 
          localp.jhD = locala.yqV.nj();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        case 4: 
          localp.jhE = locala.yqV.nj();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        case 5: 
          localp.jhz = locala.yqV.nk();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        case 6: 
          localp.jhF = locala.yqV.nk();
          GMTrace.o(14834011734016L, 110522);
          return 0;
        }
        localp.jhG = locala.yqV.nk();
        GMTrace.o(14834011734016L, 110522);
        return 0;
      }
      GMTrace.o(14834011734016L, 110522);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */