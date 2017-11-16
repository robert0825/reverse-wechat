package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class p
  extends com.tencent.mm.bm.a
{
  public String jio;
  public String lQe;
  
  public p()
  {
    GMTrace.i(12656060661760L, 94295);
    GMTrace.o(12656060661760L, 94295);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12656194879488L, 94296);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQe != null) {
        paramVarArgs.e(1, this.lQe);
      }
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      GMTrace.o(12656194879488L, 94296);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lQe == null) {
        break label302;
      }
    }
    label302:
    for (paramInt = b.a.a.b.b.a.f(1, this.lQe) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jio);
      }
      GMTrace.o(12656194879488L, 94296);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12656194879488L, 94296);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        p localp = (p)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 2: 
        default: 
          GMTrace.o(12656194879488L, 94296);
          return -1;
        case 1: 
          localp.lQe = locala.yqV.readString();
          GMTrace.o(12656194879488L, 94296);
          return 0;
        }
        localp.jio = locala.yqV.readString();
        GMTrace.o(12656194879488L, 94296);
        return 0;
      }
      GMTrace.o(12656194879488L, 94296);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */