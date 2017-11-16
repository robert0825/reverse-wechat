package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ul
  extends com.tencent.mm.bm.a
{
  public String text;
  public int umN;
  
  public ul()
  {
    GMTrace.i(3752056586240L, 27955);
    GMTrace.o(3752056586240L, 27955);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3752190803968L, 27956);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.text != null) {
        paramVarArgs.e(1, this.text);
      }
      paramVarArgs.fk(2, this.umN);
      GMTrace.o(3752190803968L, 27956);
      return 0;
    }
    if (paramInt == 1) {
      if (this.text == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.text) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.umN);
      GMTrace.o(3752190803968L, 27956);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3752190803968L, 27956);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ul localul = (ul)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3752190803968L, 27956);
          return -1;
        case 1: 
          localul.text = locala.yqV.readString();
          GMTrace.o(3752190803968L, 27956);
          return 0;
        }
        localul.umN = locala.yqV.nj();
        GMTrace.o(3752190803968L, 27956);
        return 0;
      }
      GMTrace.o(3752190803968L, 27956);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */