package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aoo
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String ubU;
  public String ufz;
  
  public aoo()
  {
    GMTrace.i(3618509946880L, 26960);
    GMTrace.o(3618509946880L, 26960);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3618644164608L, 26961);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufz != null) {
        paramVarArgs.e(1, this.ufz);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.ubU != null) {
        paramVarArgs.e(3, this.ubU);
      }
      GMTrace.o(3618644164608L, 26961);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufz == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.ufz) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.ubU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubU);
      }
      GMTrace.o(3618644164608L, 26961);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3618644164608L, 26961);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aoo localaoo = (aoo)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3618644164608L, 26961);
          return -1;
        case 1: 
          localaoo.ufz = locala.yqV.readString();
          GMTrace.o(3618644164608L, 26961);
          return 0;
        case 2: 
          localaoo.jhi = locala.yqV.readString();
          GMTrace.o(3618644164608L, 26961);
          return 0;
        }
        localaoo.ubU = locala.yqV.readString();
        GMTrace.o(3618644164608L, 26961);
        return 0;
      }
      GMTrace.o(3618644164608L, 26961);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aoo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */