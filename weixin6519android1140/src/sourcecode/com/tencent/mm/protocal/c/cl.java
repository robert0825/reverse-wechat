package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cl
  extends com.tencent.mm.bm.a
{
  public String tQv;
  public String tQw;
  
  public cl()
  {
    GMTrace.i(3666291458048L, 27316);
    GMTrace.o(3666291458048L, 27316);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3666425675776L, 27317);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQv != null) {
        paramVarArgs.e(1, this.tQv);
      }
      if (this.tQw != null) {
        paramVarArgs.e(2, this.tQw);
      }
      GMTrace.o(3666425675776L, 27317);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tQv == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tQv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tQw != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQw);
      }
      GMTrace.o(3666425675776L, 27317);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3666425675776L, 27317);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cl localcl = (cl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3666425675776L, 27317);
          return -1;
        case 1: 
          localcl.tQv = locala.yqV.readString();
          GMTrace.o(3666425675776L, 27317);
          return 0;
        }
        localcl.tQw = locala.yqV.readString();
        GMTrace.o(3666425675776L, 27317);
        return 0;
      }
      GMTrace.o(3666425675776L, 27317);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */