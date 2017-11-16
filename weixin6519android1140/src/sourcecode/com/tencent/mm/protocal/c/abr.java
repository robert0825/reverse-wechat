package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class abr
  extends com.tencent.mm.bm.a
{
  public String usk;
  
  public abr()
  {
    GMTrace.i(20973935919104L, 156268);
    GMTrace.o(20973935919104L, 156268);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20974070136832L, 156269);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.usk != null) {
        paramVarArgs.e(1, this.usk);
      }
      GMTrace.o(20974070136832L, 156269);
      return 0;
    }
    if (paramInt == 1) {
      if (this.usk == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = b.a.a.b.b.a.f(1, this.usk) + 0;; paramInt = 0)
    {
      GMTrace.o(20974070136832L, 156269);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20974070136832L, 156269);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        abr localabr = (abr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20974070136832L, 156269);
          return -1;
        }
        localabr.usk = locala.yqV.readString();
        GMTrace.o(20974070136832L, 156269);
        return 0;
      }
      GMTrace.o(20974070136832L, 156269);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\abr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */