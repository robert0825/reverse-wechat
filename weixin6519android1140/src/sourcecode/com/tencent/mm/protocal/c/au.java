package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class au
  extends com.tencent.mm.bm.a
{
  public String text;
  public String url;
  
  public au()
  {
    GMTrace.i(3939558752256L, 29352);
    GMTrace.o(3939558752256L, 29352);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3939692969984L, 29353);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.text != null) {
        paramVarArgs.e(1, this.text);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      GMTrace.o(3939692969984L, 29353);
      return 0;
    }
    if (paramInt == 1) {
      if (this.text == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.text) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.url);
      }
      GMTrace.o(3939692969984L, 29353);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3939692969984L, 29353);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        au localau = (au)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3939692969984L, 29353);
          return -1;
        case 1: 
          localau.text = locala.yqV.readString();
          GMTrace.o(3939692969984L, 29353);
          return 0;
        }
        localau.url = locala.yqV.readString();
        GMTrace.o(3939692969984L, 29353);
        return 0;
      }
      GMTrace.o(3939692969984L, 29353);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */