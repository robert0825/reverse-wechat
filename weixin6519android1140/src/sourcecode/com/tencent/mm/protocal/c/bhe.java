package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhe
  extends com.tencent.mm.bm.a
{
  public String uTa;
  
  public bhe()
  {
    GMTrace.i(3725213040640L, 27755);
    GMTrace.o(3725213040640L, 27755);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3725347258368L, 27756);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uTa != null) {
        paramVarArgs.e(1, this.uTa);
      }
      GMTrace.o(3725347258368L, 27756);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uTa == null) {
        break label241;
      }
    }
    label241:
    for (paramInt = b.a.a.b.b.a.f(1, this.uTa) + 0;; paramInt = 0)
    {
      GMTrace.o(3725347258368L, 27756);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3725347258368L, 27756);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhe localbhe = (bhe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3725347258368L, 27756);
          return -1;
        }
        localbhe.uTa = locala.yqV.readString();
        GMTrace.o(3725347258368L, 27756);
        return 0;
      }
      GMTrace.o(3725347258368L, 27756);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */