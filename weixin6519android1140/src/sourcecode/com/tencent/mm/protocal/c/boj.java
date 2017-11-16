package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class boj
  extends com.tencent.mm.bm.a
{
  public String uBe;
  public int uKd;
  
  public boj()
  {
    GMTrace.i(3811783475200L, 28400);
    GMTrace.o(3811783475200L, 28400);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3811917692928L, 28401);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uBe == null) {
        throw new b("Not all required fields were included: Ip");
      }
      if (this.uBe != null) {
        paramVarArgs.e(1, this.uBe);
      }
      paramVarArgs.fk(2, this.uKd);
      GMTrace.o(3811917692928L, 28401);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uBe == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.uBe) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uKd);
      GMTrace.o(3811917692928L, 28401);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uBe == null) {
          throw new b("Not all required fields were included: Ip");
        }
        GMTrace.o(3811917692928L, 28401);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        boj localboj = (boj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3811917692928L, 28401);
          return -1;
        case 1: 
          localboj.uBe = locala.yqV.readString();
          GMTrace.o(3811917692928L, 28401);
          return 0;
        }
        localboj.uKd = locala.yqV.nj();
        GMTrace.o(3811917692928L, 28401);
        return 0;
      }
      GMTrace.o(3811917692928L, 28401);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */