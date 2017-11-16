package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class oc
  extends com.tencent.mm.bm.a
{
  public int tPV;
  public long tQd;
  
  public oc()
  {
    GMTrace.i(3953517395968L, 29456);
    GMTrace.o(3953517395968L, 29456);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3953651613696L, 29457);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPV);
      paramVarArgs.T(2, this.tQd);
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tPV);
      int i = b.a.a.a.S(2, this.tQd);
      GMTrace.o(3953651613696L, 29457);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      oc localoc = (oc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3953651613696L, 29457);
        return -1;
      case 1: 
        localoc.tPV = locala.yqV.nj();
        GMTrace.o(3953651613696L, 29457);
        return 0;
      }
      localoc.tQd = locala.yqV.nk();
      GMTrace.o(3953651613696L, 29457);
      return 0;
    }
    GMTrace.o(3953651613696L, 29457);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\oc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */