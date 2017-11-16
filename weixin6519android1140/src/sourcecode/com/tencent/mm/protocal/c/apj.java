package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class apj
  extends com.tencent.mm.bm.a
{
  public int tWA;
  public int uEX;
  public b uEY;
  public String uEZ;
  public String ubV;
  public String ubW;
  
  public apj()
  {
    GMTrace.i(3790308638720L, 28240);
    GMTrace.o(3790308638720L, 28240);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3790442856448L, 28241);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tWA);
      paramVarArgs.fk(2, this.uEX);
      if (this.uEY != null) {
        paramVarArgs.b(3, this.uEY);
      }
      if (this.uEZ != null) {
        paramVarArgs.e(4, this.uEZ);
      }
      if (this.ubV != null) {
        paramVarArgs.e(5, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(6, this.ubW);
      }
      GMTrace.o(3790442856448L, 28241);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tWA) + 0 + b.a.a.a.fh(2, this.uEX);
      paramInt = i;
      if (this.uEY != null) {
        paramInt = i + b.a.a.a.a(3, this.uEY);
      }
      i = paramInt;
      if (this.uEZ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uEZ);
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ubW);
      }
      GMTrace.o(3790442856448L, 28241);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3790442856448L, 28241);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      apj localapj = (apj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3790442856448L, 28241);
        return -1;
      case 1: 
        localapj.tWA = locala.yqV.nj();
        GMTrace.o(3790442856448L, 28241);
        return 0;
      case 2: 
        localapj.uEX = locala.yqV.nj();
        GMTrace.o(3790442856448L, 28241);
        return 0;
      case 3: 
        localapj.uEY = locala.csV();
        GMTrace.o(3790442856448L, 28241);
        return 0;
      case 4: 
        localapj.uEZ = locala.yqV.readString();
        GMTrace.o(3790442856448L, 28241);
        return 0;
      case 5: 
        localapj.ubV = locala.yqV.readString();
        GMTrace.o(3790442856448L, 28241);
        return 0;
      }
      localapj.ubW = locala.yqV.readString();
      GMTrace.o(3790442856448L, 28241);
      return 0;
    }
    GMTrace.o(3790442856448L, 28241);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\apj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */