package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class vz
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lQa;
  public int tQB;
  public int uow;
  
  public vz()
  {
    GMTrace.i(3926136979456L, 29252);
    GMTrace.o(3926136979456L, 29252);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3926271197184L, 29253);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa != null) {
        paramVarArgs.e(1, this.lQa);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.tQB);
      paramVarArgs.fk(4, this.uow);
      GMTrace.o(3926271197184L, 29253);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lQa == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.lQa) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jib);
      int j = b.a.a.a.fh(3, this.tQB);
      int k = b.a.a.a.fh(4, this.uow);
      GMTrace.o(3926271197184L, 29253);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3926271197184L, 29253);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        vz localvz = (vz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3926271197184L, 29253);
          return -1;
        case 1: 
          localvz.lQa = locala.yqV.readString();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        case 2: 
          localvz.jib = locala.yqV.nj();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        case 3: 
          localvz.tQB = locala.yqV.nj();
          GMTrace.o(3926271197184L, 29253);
          return 0;
        }
        localvz.uow = locala.yqV.nj();
        GMTrace.o(3926271197184L, 29253);
        return 0;
      }
      GMTrace.o(3926271197184L, 29253);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */