package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class x
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b jgP;
  public String jie;
  public int jif;
  public int jig;
  public int jih;
  public int jii;
  public int jij;
  public int jik;
  
  public x()
  {
    GMTrace.i(14837904048128L, 110551);
    GMTrace.o(14837904048128L, 110551);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14838038265856L, 110552);
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
      paramVarArgs.fk(3, this.jig);
      paramVarArgs.fk(4, this.jih);
      paramVarArgs.fk(5, this.jii);
      paramVarArgs.fk(6, this.jij);
      if (this.jgP != null) {
        paramVarArgs.b(7, this.jgP);
      }
      paramVarArgs.fk(8, this.jik);
      GMTrace.o(14838038265856L, 110552);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jie == null) {
        break label609;
      }
    }
    label609:
    for (paramInt = b.a.a.b.b.a.f(1, this.jie) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jif) + b.a.a.a.fh(3, this.jig) + b.a.a.a.fh(4, this.jih) + b.a.a.a.fh(5, this.jii) + b.a.a.a.fh(6, this.jij);
      paramInt = i;
      if (this.jgP != null) {
        paramInt = i + b.a.a.a.a(7, this.jgP);
      }
      i = b.a.a.a.fh(8, this.jik);
      GMTrace.o(14838038265856L, 110552);
      return paramInt + i;
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
        GMTrace.o(14838038265856L, 110552);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        x localx = (x)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14838038265856L, 110552);
          return -1;
        case 1: 
          localx.jie = locala.yqV.readString();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 2: 
          localx.jif = locala.yqV.nj();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 3: 
          localx.jig = locala.yqV.nj();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 4: 
          localx.jih = locala.yqV.nj();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 5: 
          localx.jii = locala.yqV.nj();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 6: 
          localx.jij = locala.yqV.nj();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        case 7: 
          localx.jgP = locala.csV();
          GMTrace.o(14838038265856L, 110552);
          return 0;
        }
        localx.jik = locala.yqV.nj();
        GMTrace.o(14838038265856L, 110552);
        return 0;
      }
      GMTrace.o(14838038265856L, 110552);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */