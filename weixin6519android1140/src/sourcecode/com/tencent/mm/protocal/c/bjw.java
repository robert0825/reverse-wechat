package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjw
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int uUL;
  public String uUM;
  public String uUN;
  
  public bjw()
  {
    GMTrace.i(3962912636928L, 29526);
    GMTrace.o(3962912636928L, 29526);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3963046854656L, 29527);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uUL);
      if (this.uUM != null) {
        paramVarArgs.e(2, this.uUM);
      }
      if (this.uUN != null) {
        paramVarArgs.e(3, this.uUN);
      }
      paramVarArgs.fk(4, this.tOG);
      GMTrace.o(3963046854656L, 29527);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uUL) + 0;
      paramInt = i;
      if (this.uUM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uUM);
      }
      i = paramInt;
      if (this.uUN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uUN);
      }
      paramInt = b.a.a.a.fh(4, this.tOG);
      GMTrace.o(3963046854656L, 29527);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3963046854656L, 29527);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bjw localbjw = (bjw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3963046854656L, 29527);
        return -1;
      case 1: 
        localbjw.uUL = locala.yqV.nj();
        GMTrace.o(3963046854656L, 29527);
        return 0;
      case 2: 
        localbjw.uUM = locala.yqV.readString();
        GMTrace.o(3963046854656L, 29527);
        return 0;
      case 3: 
        localbjw.uUN = locala.yqV.readString();
        GMTrace.o(3963046854656L, 29527);
        return 0;
      }
      localbjw.tOG = locala.yqV.nj();
      GMTrace.o(3963046854656L, 29527);
      return 0;
    }
    GMTrace.o(3963046854656L, 29527);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */