package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class avq
  extends com.tencent.mm.bm.a
{
  public int uKT;
  public String ugH;
  public int uhX;
  public String umT;
  public int usN;
  
  public avq()
  {
    GMTrace.i(3938485010432L, 29344);
    GMTrace.o(3938485010432L, 29344);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3938619228160L, 29345);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.usN);
      if (this.umT != null) {
        paramVarArgs.e(2, this.umT);
      }
      if (this.ugH != null) {
        paramVarArgs.e(3, this.ugH);
      }
      paramVarArgs.fk(4, this.uhX);
      paramVarArgs.fk(5, this.uKT);
      GMTrace.o(3938619228160L, 29345);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.usN) + 0;
      paramInt = i;
      if (this.umT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.umT);
      }
      i = paramInt;
      if (this.ugH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugH);
      }
      paramInt = b.a.a.a.fh(4, this.uhX);
      int j = b.a.a.a.fh(5, this.uKT);
      GMTrace.o(3938619228160L, 29345);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3938619228160L, 29345);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      avq localavq = (avq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3938619228160L, 29345);
        return -1;
      case 1: 
        localavq.usN = locala.yqV.nj();
        GMTrace.o(3938619228160L, 29345);
        return 0;
      case 2: 
        localavq.umT = locala.yqV.readString();
        GMTrace.o(3938619228160L, 29345);
        return 0;
      case 3: 
        localavq.ugH = locala.yqV.readString();
        GMTrace.o(3938619228160L, 29345);
        return 0;
      case 4: 
        localavq.uhX = locala.yqV.nj();
        GMTrace.o(3938619228160L, 29345);
        return 0;
      }
      localavq.uKT = locala.yqV.nj();
      GMTrace.o(3938619228160L, 29345);
      return 0;
    }
    GMTrace.o(3938619228160L, 29345);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\avq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */