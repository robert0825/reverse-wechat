package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bup
  extends com.tencent.mm.bm.a
{
  public int tWR;
  public int ubf;
  public String username;
  
  public bup()
  {
    GMTrace.i(3835271577600L, 28575);
    GMTrace.o(3835271577600L, 28575);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3835405795328L, 28576);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.fk(2, this.ubf);
      paramVarArgs.fk(3, this.tWR);
      GMTrace.o(3835405795328L, 28576);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label342;
      }
    }
    label342:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.ubf);
      int j = b.a.a.a.fh(3, this.tWR);
      GMTrace.o(3835405795328L, 28576);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3835405795328L, 28576);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bup localbup = (bup)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3835405795328L, 28576);
          return -1;
        case 1: 
          localbup.username = locala.yqV.readString();
          GMTrace.o(3835405795328L, 28576);
          return 0;
        case 2: 
          localbup.ubf = locala.yqV.nj();
          GMTrace.o(3835405795328L, 28576);
          return 0;
        }
        localbup.tWR = locala.yqV.nj();
        GMTrace.o(3835405795328L, 28576);
        return 0;
      }
      GMTrace.o(3835405795328L, 28576);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */