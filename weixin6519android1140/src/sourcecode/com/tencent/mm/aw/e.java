package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;

public final class e
  extends com.tencent.mm.bm.a
{
  public String gPW;
  public String lang;
  
  public e()
  {
    GMTrace.i(12938320543744L, 96398);
    GMTrace.o(12938320543744L, 96398);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12938454761472L, 96399);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gPW != null) {
        paramVarArgs.e(1, this.gPW);
      }
      if (this.lang != null) {
        paramVarArgs.e(2, this.lang);
      }
      GMTrace.o(12938454761472L, 96399);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gPW == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.gPW) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lang != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lang);
      }
      GMTrace.o(12938454761472L, 96399);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12938454761472L, 96399);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        e locale = (e)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12938454761472L, 96399);
          return -1;
        case 1: 
          locale.gPW = locala.yqV.readString();
          GMTrace.o(12938454761472L, 96399);
          return 0;
        }
        locale.lang = locala.yqV.readString();
        GMTrace.o(12938454761472L, 96399);
        return 0;
      }
      GMTrace.o(12938454761472L, 96399);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */