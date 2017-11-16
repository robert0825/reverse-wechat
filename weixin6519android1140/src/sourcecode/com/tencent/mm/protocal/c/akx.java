package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akx
  extends com.tencent.mm.bm.a
{
  public String uzY;
  public String value;
  
  public akx()
  {
    GMTrace.i(3805609459712L, 28354);
    GMTrace.o(3805609459712L, 28354);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3805743677440L, 28355);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uzY != null) {
        paramVarArgs.e(1, this.uzY);
      }
      if (this.value != null) {
        paramVarArgs.e(2, this.value);
      }
      GMTrace.o(3805743677440L, 28355);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uzY == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.uzY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.value != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.value);
      }
      GMTrace.o(3805743677440L, 28355);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3805743677440L, 28355);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        akx localakx = (akx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3805743677440L, 28355);
          return -1;
        case 1: 
          localakx.uzY = locala.yqV.readString();
          GMTrace.o(3805743677440L, 28355);
          return 0;
        }
        localakx.value = locala.yqV.readString();
        GMTrace.o(3805743677440L, 28355);
        return 0;
      }
      GMTrace.o(3805743677440L, 28355);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */