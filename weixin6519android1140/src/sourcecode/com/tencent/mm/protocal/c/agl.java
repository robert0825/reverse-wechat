package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agl
  extends com.tencent.mm.bm.a
{
  public String uwc;
  
  public agl()
  {
    GMTrace.i(3796214218752L, 28284);
    GMTrace.o(3796214218752L, 28284);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3796348436480L, 28285);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uwc != null) {
        paramVarArgs.e(1, this.uwc);
      }
      GMTrace.o(3796348436480L, 28285);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uwc == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.uwc) + 0;; paramInt = 0)
    {
      GMTrace.o(3796348436480L, 28285);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3796348436480L, 28285);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agl localagl = (agl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3796348436480L, 28285);
          return -1;
        }
        localagl.uwc = locala.yqV.readString();
        GMTrace.o(3796348436480L, 28285);
        return 0;
      }
      GMTrace.o(3796348436480L, 28285);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\agl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */