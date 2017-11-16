package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bvs
  extends com.tencent.mm.bm.a
{
  public int score;
  public String title;
  
  public bvs()
  {
    GMTrace.i(3724676169728L, 27751);
    GMTrace.o(3724676169728L, 27751);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3724810387456L, 27752);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      paramVarArgs.fk(2, this.score);
      GMTrace.o(3724810387456L, 27752);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.title) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.score);
      GMTrace.o(3724810387456L, 27752);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.title == null) {
          throw new b("Not all required fields were included: title");
        }
        GMTrace.o(3724810387456L, 27752);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvs localbvs = (bvs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3724810387456L, 27752);
          return -1;
        case 1: 
          localbvs.title = locala.yqV.readString();
          GMTrace.o(3724810387456L, 27752);
          return 0;
        }
        localbvs.score = locala.yqV.nj();
        GMTrace.o(3724810387456L, 27752);
        return 0;
      }
      GMTrace.o(3724810387456L, 27752);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */