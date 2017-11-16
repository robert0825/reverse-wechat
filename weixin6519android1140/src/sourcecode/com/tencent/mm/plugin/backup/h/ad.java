package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ad
  extends com.tencent.mm.bm.a
{
  public String jie;
  public int jif;
  public int jih;
  public int jii;
  public int jik;
  
  public ad()
  {
    GMTrace.i(14830656290816L, 110497);
    GMTrace.o(14830656290816L, 110497);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14830790508544L, 110498);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jie == null) {
        throw new b("Not all required fields were included: DataID");
      }
      if (this.jie != null) {
        paramVarArgs.e(1, this.jie);
      }
      paramVarArgs.fk(2, this.jif);
      paramVarArgs.fk(3, this.jih);
      paramVarArgs.fk(4, this.jii);
      paramVarArgs.fk(5, this.jik);
      GMTrace.o(14830790508544L, 110498);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jie == null) {
        break label463;
      }
    }
    label463:
    for (paramInt = b.a.a.b.b.a.f(1, this.jie) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jif);
      int j = b.a.a.a.fh(3, this.jih);
      int k = b.a.a.a.fh(4, this.jii);
      int m = b.a.a.a.fh(5, this.jik);
      GMTrace.o(14830790508544L, 110498);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jie == null) {
          throw new b("Not all required fields were included: DataID");
        }
        GMTrace.o(14830790508544L, 110498);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ad localad = (ad)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14830790508544L, 110498);
          return -1;
        case 1: 
          localad.jie = locala.yqV.readString();
          GMTrace.o(14830790508544L, 110498);
          return 0;
        case 2: 
          localad.jif = locala.yqV.nj();
          GMTrace.o(14830790508544L, 110498);
          return 0;
        case 3: 
          localad.jih = locala.yqV.nj();
          GMTrace.o(14830790508544L, 110498);
          return 0;
        case 4: 
          localad.jii = locala.yqV.nj();
          GMTrace.o(14830790508544L, 110498);
          return 0;
        }
        localad.jik = locala.yqV.nj();
        GMTrace.o(14830790508544L, 110498);
        return 0;
      }
      GMTrace.o(14830790508544L, 110498);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */