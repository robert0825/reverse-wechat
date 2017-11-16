package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class awu
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String ujf;
  public String uoe;
  
  public awu()
  {
    GMTrace.i(3893924724736L, 29012);
    GMTrace.o(3893924724736L, 29012);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3894058942464L, 29013);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.uoe != null) {
        paramVarArgs.e(2, this.uoe);
      }
      if (this.ujf != null) {
        paramVarArgs.e(3, this.ujf);
      }
      GMTrace.o(3894058942464L, 29013);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.jhi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uoe != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uoe);
      }
      i = paramInt;
      if (this.ujf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ujf);
      }
      GMTrace.o(3894058942464L, 29013);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3894058942464L, 29013);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        awu localawu = (awu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3894058942464L, 29013);
          return -1;
        case 1: 
          localawu.jhi = locala.yqV.readString();
          GMTrace.o(3894058942464L, 29013);
          return 0;
        case 2: 
          localawu.uoe = locala.yqV.readString();
          GMTrace.o(3894058942464L, 29013);
          return 0;
        }
        localawu.ujf = locala.yqV.readString();
        GMTrace.o(3894058942464L, 29013);
        return 0;
      }
      GMTrace.o(3894058942464L, 29013);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */