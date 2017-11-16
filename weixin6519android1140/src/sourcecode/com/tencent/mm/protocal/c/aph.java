package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aph
  extends com.tencent.mm.bm.a
{
  public String uEJ;
  public int uEV;
  
  public aph()
  {
    GMTrace.i(13335739236352L, 99359);
    GMTrace.o(13335739236352L, 99359);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13335873454080L, 99360);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uEJ != null) {
        paramVarArgs.e(1, this.uEJ);
      }
      paramVarArgs.fk(2, this.uEV);
      GMTrace.o(13335873454080L, 99360);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uEJ == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.uEJ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uEV);
      GMTrace.o(13335873454080L, 99360);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13335873454080L, 99360);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aph localaph = (aph)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13335873454080L, 99360);
          return -1;
        case 1: 
          localaph.uEJ = locala.yqV.readString();
          GMTrace.o(13335873454080L, 99360);
          return 0;
        }
        localaph.uEV = locala.yqV.nj();
        GMTrace.o(13335873454080L, 99360);
        return 0;
      }
      GMTrace.o(13335873454080L, 99360);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */