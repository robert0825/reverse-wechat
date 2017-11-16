package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bdv
  extends com.tencent.mm.bm.a
{
  public String url;
  
  public bdv()
  {
    GMTrace.i(3916204867584L, 29178);
    GMTrace.o(3916204867584L, 29178);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3916339085312L, 29179);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.e(1, this.url);
      }
      GMTrace.o(3916339085312L, 29179);
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.url) + 0;; paramInt = 0)
    {
      GMTrace.o(3916339085312L, 29179);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3916339085312L, 29179);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bdv localbdv = (bdv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3916339085312L, 29179);
          return -1;
        }
        localbdv.url = locala.yqV.readString();
        GMTrace.o(3916339085312L, 29179);
        return 0;
      }
      GMTrace.o(3916339085312L, 29179);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bdv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */