package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aol
  extends com.tencent.mm.bm.a
{
  public int gCL;
  public String jhi;
  
  public aol()
  {
    GMTrace.i(4032974290944L, 30048);
    GMTrace.o(4032974290944L, 30048);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4033108508672L, 30049);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.gCL);
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      GMTrace.o(4033108508672L, 30049);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.gCL) + 0;
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      GMTrace.o(4033108508672L, 30049);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4033108508672L, 30049);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aol localaol = (aol)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4033108508672L, 30049);
        return -1;
      case 1: 
        localaol.gCL = locala.yqV.nj();
        GMTrace.o(4033108508672L, 30049);
        return 0;
      }
      localaol.jhi = locala.yqV.readString();
      GMTrace.o(4033108508672L, 30049);
      return 0;
    }
    GMTrace.o(4033108508672L, 30049);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */