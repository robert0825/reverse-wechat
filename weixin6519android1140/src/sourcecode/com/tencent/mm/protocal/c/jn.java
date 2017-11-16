package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public class jn
  extends com.tencent.mm.bm.a
{
  public String eTK;
  public String jxF;
  
  public jn()
  {
    GMTrace.i(3806146330624L, 28358);
    GMTrace.o(3806146330624L, 28358);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3806280548352L, 28359);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jxF != null) {
        paramVarArgs.e(1, this.jxF);
      }
      if (this.eTK != null) {
        paramVarArgs.e(2, this.eTK);
      }
      GMTrace.o(3806280548352L, 28359);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jxF == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.jxF) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eTK != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eTK);
      }
      GMTrace.o(3806280548352L, 28359);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3806280548352L, 28359);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jn localjn = (jn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3806280548352L, 28359);
          return -1;
        case 1: 
          localjn.jxF = locala.yqV.readString();
          GMTrace.o(3806280548352L, 28359);
          return 0;
        }
        localjn.eTK = locala.yqV.readString();
        GMTrace.o(3806280548352L, 28359);
        return 0;
      }
      GMTrace.o(3806280548352L, 28359);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */