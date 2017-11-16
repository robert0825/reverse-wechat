package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class y
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public String jie;
  public int jif;
  public int jih;
  public int jii;
  
  public y()
  {
    GMTrace.i(14832266903552L, 110509);
    GMTrace.o(14832266903552L, 110509);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14832401121280L, 110510);
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
      paramVarArgs.fk(5, this.jhA);
      GMTrace.o(14832401121280L, 110510);
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
      int m = b.a.a.a.fh(5, this.jhA);
      GMTrace.o(14832401121280L, 110510);
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
        GMTrace.o(14832401121280L, 110510);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14832401121280L, 110510);
          return -1;
        case 1: 
          localy.jie = locala.yqV.readString();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 2: 
          localy.jif = locala.yqV.nj();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 3: 
          localy.jih = locala.yqV.nj();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        case 4: 
          localy.jii = locala.yqV.nj();
          GMTrace.o(14832401121280L, 110510);
          return 0;
        }
        localy.jhA = locala.yqV.nj();
        GMTrace.o(14832401121280L, 110510);
        return 0;
      }
      GMTrace.o(14832401121280L, 110510);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */