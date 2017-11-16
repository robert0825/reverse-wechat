package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ob
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int tPV;
  public long tQd;
  public String ueZ;
  public int ufa;
  
  public ob()
  {
    GMTrace.i(3950027735040L, 29430);
    GMTrace.o(3950027735040L, 29430);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3950161952768L, 29431);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPV);
      if (this.ueZ != null) {
        paramVarArgs.e(2, this.ueZ);
      }
      paramVarArgs.fk(3, this.jhA);
      paramVarArgs.fk(4, this.ufa);
      paramVarArgs.T(5, this.tQd);
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tPV) + 0;
      paramInt = i;
      if (this.ueZ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ueZ);
      }
      i = b.a.a.a.fh(3, this.jhA);
      int j = b.a.a.a.fh(4, this.ufa);
      int k = b.a.a.a.S(5, this.tQd);
      GMTrace.o(3950161952768L, 29431);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ob localob = (ob)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3950161952768L, 29431);
        return -1;
      case 1: 
        localob.tPV = locala.yqV.nj();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 2: 
        localob.ueZ = locala.yqV.readString();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 3: 
        localob.jhA = locala.yqV.nj();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      case 4: 
        localob.ufa = locala.yqV.nj();
        GMTrace.o(3950161952768L, 29431);
        return 0;
      }
      localob.tQd = locala.yqV.nk();
      GMTrace.o(3950161952768L, 29431);
      return 0;
    }
    GMTrace.o(3950161952768L, 29431);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */