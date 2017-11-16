package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;

public final class bo
  extends com.tencent.mm.bm.a
{
  public String goY;
  public long goZ;
  public int key;
  
  public bo()
  {
    GMTrace.i(690013339648L, 5141);
    GMTrace.o(690013339648L, 5141);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(690147557376L, 5142);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.key);
      if (this.goY != null) {
        paramVarArgs.e(2, this.goY);
      }
      paramVarArgs.T(3, this.goZ);
      GMTrace.o(690147557376L, 5142);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.key) + 0;
      paramInt = i;
      if (this.goY != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.goY);
      }
      i = b.a.a.a.S(3, this.goZ);
      GMTrace.o(690147557376L, 5142);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(690147557376L, 5142);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bo localbo = (bo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(690147557376L, 5142);
        return -1;
      case 1: 
        localbo.key = locala.yqV.nj();
        GMTrace.o(690147557376L, 5142);
        return 0;
      case 2: 
        localbo.goY = locala.yqV.readString();
        GMTrace.o(690147557376L, 5142);
        return 0;
      }
      localbo.goZ = locala.yqV.nk();
      GMTrace.o(690147557376L, 5142);
      return 0;
    }
    GMTrace.o(690147557376L, 5142);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */