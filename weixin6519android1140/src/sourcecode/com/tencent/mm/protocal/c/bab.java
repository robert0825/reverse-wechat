package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bab
  extends com.tencent.mm.bm.a
{
  public int density;
  public String uOb;
  
  public bab()
  {
    GMTrace.i(18665793650688L, 139071);
    GMTrace.o(18665793650688L, 139071);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18665927868416L, 139072);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uOb != null) {
        paramVarArgs.e(1, this.uOb);
      }
      paramVarArgs.fk(2, this.density);
      GMTrace.o(18665927868416L, 139072);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uOb == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.uOb) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.density);
      GMTrace.o(18665927868416L, 139072);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18665927868416L, 139072);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bab localbab = (bab)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18665927868416L, 139072);
          return -1;
        case 1: 
          localbab.uOb = locala.yqV.readString();
          GMTrace.o(18665927868416L, 139072);
          return 0;
        }
        localbab.density = locala.yqV.nj();
        GMTrace.o(18665927868416L, 139072);
        return 0;
      }
      GMTrace.o(18665927868416L, 139072);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */