package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvr
  extends com.tencent.mm.bm.a
{
  public int score;
  public String title;
  
  public bvr()
  {
    GMTrace.i(3637031993344L, 27098);
    GMTrace.o(3637031993344L, 27098);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3637166211072L, 27099);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      paramVarArgs.fk(2, this.score);
      GMTrace.o(3637166211072L, 27099);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.title) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.score);
      GMTrace.o(3637166211072L, 27099);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3637166211072L, 27099);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvr localbvr = (bvr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3637166211072L, 27099);
          return -1;
        case 1: 
          localbvr.title = locala.yqV.readString();
          GMTrace.o(3637166211072L, 27099);
          return 0;
        }
        localbvr.score = locala.yqV.nj();
        GMTrace.o(3637166211072L, 27099);
        return 0;
      }
      GMTrace.o(3637166211072L, 27099);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */