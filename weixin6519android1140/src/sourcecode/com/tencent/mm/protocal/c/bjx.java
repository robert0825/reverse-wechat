package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjx
  extends com.tencent.mm.bm.a
{
  public int tST;
  public int uUL;
  public String uUO;
  public String uUP;
  
  public bjx()
  {
    GMTrace.i(4030558371840L, 30030);
    GMTrace.o(4030558371840L, 30030);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4030692589568L, 30031);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uUL);
      if (this.uUO != null) {
        paramVarArgs.e(2, this.uUO);
      }
      paramVarArgs.fk(3, this.tST);
      if (this.uUP != null) {
        paramVarArgs.e(4, this.uUP);
      }
      GMTrace.o(4030692589568L, 30031);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uUL) + 0;
      paramInt = i;
      if (this.uUO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uUO);
      }
      i = paramInt + b.a.a.a.fh(3, this.tST);
      paramInt = i;
      if (this.uUP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uUP);
      }
      GMTrace.o(4030692589568L, 30031);
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
      GMTrace.o(4030692589568L, 30031);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bjx localbjx = (bjx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4030692589568L, 30031);
        return -1;
      case 1: 
        localbjx.uUL = locala.yqV.nj();
        GMTrace.o(4030692589568L, 30031);
        return 0;
      case 2: 
        localbjx.uUO = locala.yqV.readString();
        GMTrace.o(4030692589568L, 30031);
        return 0;
      case 3: 
        localbjx.tST = locala.yqV.nj();
        GMTrace.o(4030692589568L, 30031);
        return 0;
      }
      localbjx.uUP = locala.yqV.readString();
      GMTrace.o(4030692589568L, 30031);
      return 0;
    }
    GMTrace.o(4030692589568L, 30031);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */