package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class bc
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String eQA;
  
  public bc()
  {
    GMTrace.i(12650155081728L, 94251);
    GMTrace.o(12650155081728L, 94251);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12650289299456L, 94252);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eQA != null) {
        paramVarArgs.e(1, this.eQA);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      GMTrace.o(12650289299456L, 94252);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eQA == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.eQA) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.desc);
      }
      GMTrace.o(12650289299456L, 94252);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12650289299456L, 94252);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bc localbc = (bc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12650289299456L, 94252);
          return -1;
        case 1: 
          localbc.eQA = locala.yqV.readString();
          GMTrace.o(12650289299456L, 94252);
          return 0;
        }
        localbc.desc = locala.yqV.readString();
        GMTrace.o(12650289299456L, 94252);
        return 0;
      }
      GMTrace.o(12650289299456L, 94252);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */