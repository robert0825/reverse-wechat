package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class y
  extends com.tencent.mm.bm.a
{
  public String mJN;
  public String mJO;
  public String mJP;
  public String mJQ;
  public int tMT;
  
  public y()
  {
    GMTrace.i(3629247365120L, 27040);
    GMTrace.o(3629247365120L, 27040);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3629381582848L, 27041);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tMT);
      if (this.mJN != null) {
        paramVarArgs.e(2, this.mJN);
      }
      if (this.mJO != null) {
        paramVarArgs.e(3, this.mJO);
      }
      if (this.mJP != null) {
        paramVarArgs.e(4, this.mJP);
      }
      if (this.mJQ != null) {
        paramVarArgs.e(5, this.mJQ);
      }
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tMT) + 0;
      paramInt = i;
      if (this.mJN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mJN);
      }
      i = paramInt;
      if (this.mJO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mJO);
      }
      paramInt = i;
      if (this.mJP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mJP);
      }
      i = paramInt;
      if (this.mJQ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mJQ);
      }
      GMTrace.o(3629381582848L, 27041);
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
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      y localy = (y)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3629381582848L, 27041);
        return -1;
      case 1: 
        localy.tMT = locala.yqV.nj();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 2: 
        localy.mJN = locala.yqV.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 3: 
        localy.mJO = locala.yqV.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      case 4: 
        localy.mJP = locala.yqV.readString();
        GMTrace.o(3629381582848L, 27041);
        return 0;
      }
      localy.mJQ = locala.yqV.readString();
      GMTrace.o(3629381582848L, 27041);
      return 0;
    }
    GMTrace.o(3629381582848L, 27041);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */