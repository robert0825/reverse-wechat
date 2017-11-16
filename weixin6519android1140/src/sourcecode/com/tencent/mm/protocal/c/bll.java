package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bll
  extends com.tencent.mm.bm.a
{
  public int tRC;
  public int tRD;
  public int tST;
  public String ugH;
  
  public bll()
  {
    GMTrace.i(3938753445888L, 29346);
    GMTrace.o(3938753445888L, 29346);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3938887663616L, 29347);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.ugH != null) {
        paramVarArgs.e(4, this.ugH);
      }
      GMTrace.o(3938887663616L, 29347);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tST) + 0 + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugH);
      }
      GMTrace.o(3938887663616L, 29347);
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
      GMTrace.o(3938887663616L, 29347);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bll localbll = (bll)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3938887663616L, 29347);
        return -1;
      case 1: 
        localbll.tST = locala.yqV.nj();
        GMTrace.o(3938887663616L, 29347);
        return 0;
      case 2: 
        localbll.tRD = locala.yqV.nj();
        GMTrace.o(3938887663616L, 29347);
        return 0;
      case 3: 
        localbll.tRC = locala.yqV.nj();
        GMTrace.o(3938887663616L, 29347);
        return 0;
      }
      localbll.ugH = locala.yqV.readString();
      GMTrace.o(3938887663616L, 29347);
      return 0;
    }
    GMTrace.o(3938887663616L, 29347);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */