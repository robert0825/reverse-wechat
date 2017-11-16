package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ne
  extends com.tencent.mm.bm.a
{
  public String jhO;
  public int tOG;
  public String udZ;
  
  public ne()
  {
    GMTrace.i(3823594635264L, 28488);
    GMTrace.o(3823594635264L, 28488);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3823728852992L, 28489);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.udZ == null) {
        throw new b("Not all required fields were included: PkgId");
      }
      if (this.udZ != null) {
        paramVarArgs.e(1, this.udZ);
      }
      if (this.jhO != null) {
        paramVarArgs.e(2, this.jhO);
      }
      paramVarArgs.fk(3, this.tOG);
      GMTrace.o(3823728852992L, 28489);
      return 0;
    }
    if (paramInt == 1) {
      if (this.udZ == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.udZ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jhO != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhO);
      }
      paramInt = b.a.a.a.fh(3, this.tOG);
      GMTrace.o(3823728852992L, 28489);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.udZ == null) {
          throw new b("Not all required fields were included: PkgId");
        }
        GMTrace.o(3823728852992L, 28489);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ne localne = (ne)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3823728852992L, 28489);
          return -1;
        case 1: 
          localne.udZ = locala.yqV.readString();
          GMTrace.o(3823728852992L, 28489);
          return 0;
        case 2: 
          localne.jhO = locala.yqV.readString();
          GMTrace.o(3823728852992L, 28489);
          return 0;
        }
        localne.tOG = locala.yqV.nj();
        GMTrace.o(3823728852992L, 28489);
        return 0;
      }
      GMTrace.o(3823728852992L, 28489);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */