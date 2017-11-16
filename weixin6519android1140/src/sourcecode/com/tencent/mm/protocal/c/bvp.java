package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bvp
  extends com.tencent.mm.bm.a
{
  public int score;
  public String username;
  public int vdP;
  public int vdQ;
  public int vdR;
  
  public bvp()
  {
    GMTrace.i(3979287199744L, 29648);
    GMTrace.o(3979287199744L, 29648);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3979421417472L, 29649);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.fk(2, this.score);
      paramVarArgs.fk(3, this.vdP);
      paramVarArgs.fk(4, this.vdQ);
      paramVarArgs.fk(5, this.vdR);
      GMTrace.o(3979421417472L, 29649);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label474;
      }
    }
    label474:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.score);
      int j = b.a.a.a.fh(3, this.vdP);
      int k = b.a.a.a.fh(4, this.vdQ);
      int m = b.a.a.a.fh(5, this.vdR);
      GMTrace.o(3979421417472L, 29649);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        GMTrace.o(3979421417472L, 29649);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvp localbvp = (bvp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3979421417472L, 29649);
          return -1;
        case 1: 
          localbvp.username = locala.yqV.readString();
          GMTrace.o(3979421417472L, 29649);
          return 0;
        case 2: 
          localbvp.score = locala.yqV.nj();
          GMTrace.o(3979421417472L, 29649);
          return 0;
        case 3: 
          localbvp.vdP = locala.yqV.nj();
          GMTrace.o(3979421417472L, 29649);
          return 0;
        case 4: 
          localbvp.vdQ = locala.yqV.nj();
          GMTrace.o(3979421417472L, 29649);
          return 0;
        }
        localbvp.vdR = locala.yqV.nj();
        GMTrace.o(3979421417472L, 29649);
        return 0;
      }
      GMTrace.o(3979421417472L, 29649);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */