package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class atw
  extends com.tencent.mm.bm.a
{
  public int tOv;
  public int uJr;
  
  public atw()
  {
    GMTrace.i(3713401880576L, 27667);
    GMTrace.o(3713401880576L, 27667);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3713536098304L, 27668);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tOv);
      paramVarArgs.fk(2, this.uJr);
      GMTrace.o(3713536098304L, 27668);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tOv);
      int i = b.a.a.a.fh(2, this.uJr);
      GMTrace.o(3713536098304L, 27668);
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
      GMTrace.o(3713536098304L, 27668);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      atw localatw = (atw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3713536098304L, 27668);
        return -1;
      case 1: 
        localatw.tOv = locala.yqV.nj();
        GMTrace.o(3713536098304L, 27668);
        return 0;
      }
      localatw.uJr = locala.yqV.nj();
      GMTrace.o(3713536098304L, 27668);
      return 0;
    }
    GMTrace.o(3713536098304L, 27668);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\atw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */