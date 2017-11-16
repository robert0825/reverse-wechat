package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amn
  extends com.tencent.mm.bm.a
{
  public String type;
  public String uBB;
  public String uBC;
  public String uBD;
  public int ubJ;
  
  public amn()
  {
    GMTrace.i(4005996527616L, 29847);
    GMTrace.o(4005996527616L, 29847);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4006130745344L, 29848);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uBB != null) {
        paramVarArgs.e(1, this.uBB);
      }
      if (this.uBC != null) {
        paramVarArgs.e(2, this.uBC);
      }
      if (this.type != null) {
        paramVarArgs.e(3, this.type);
      }
      paramVarArgs.fk(4, this.ubJ);
      if (this.uBD != null) {
        paramVarArgs.e(5, this.uBD);
      }
      GMTrace.o(4006130745344L, 29848);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uBB == null) {
        break label482;
      }
    }
    label482:
    for (int i = b.a.a.b.b.a.f(1, this.uBB) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uBC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uBC);
      }
      i = paramInt;
      if (this.type != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.type);
      }
      i += b.a.a.a.fh(4, this.ubJ);
      paramInt = i;
      if (this.uBD != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uBD);
      }
      GMTrace.o(4006130745344L, 29848);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4006130745344L, 29848);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        amn localamn = (amn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4006130745344L, 29848);
          return -1;
        case 1: 
          localamn.uBB = locala.yqV.readString();
          GMTrace.o(4006130745344L, 29848);
          return 0;
        case 2: 
          localamn.uBC = locala.yqV.readString();
          GMTrace.o(4006130745344L, 29848);
          return 0;
        case 3: 
          localamn.type = locala.yqV.readString();
          GMTrace.o(4006130745344L, 29848);
          return 0;
        case 4: 
          localamn.ubJ = locala.yqV.nj();
          GMTrace.o(4006130745344L, 29848);
          return 0;
        }
        localamn.uBD = locala.yqV.readString();
        GMTrace.o(4006130745344L, 29848);
        return 0;
      }
      GMTrace.o(4006130745344L, 29848);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */