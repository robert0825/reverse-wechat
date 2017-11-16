package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bl
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPd;
  public String lPh;
  
  public bl()
  {
    GMTrace.i(12655255355392L, 94289);
    GMTrace.o(12655255355392L, 94289);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655389573120L, 94290);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPh == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      if (this.lPh != null) {
        paramVarArgs.e(1, this.lPh);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.lPd != null) {
        paramVarArgs.e(3, this.lPd);
      }
      GMTrace.o(12655389573120L, 94290);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPh == null) {
        break label397;
      }
    }
    label397:
    for (int i = b.a.a.b.b.a.f(1, this.lPh) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.lPd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPd);
      }
      GMTrace.o(12655389573120L, 94290);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lPh == null) {
          throw new b("Not all required fields were included: IconURL");
        }
        GMTrace.o(12655389573120L, 94290);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bl localbl = (bl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12655389573120L, 94290);
          return -1;
        case 1: 
          localbl.lPh = locala.yqV.readString();
          GMTrace.o(12655389573120L, 94290);
          return 0;
        case 2: 
          localbl.eBt = locala.yqV.readString();
          GMTrace.o(12655389573120L, 94290);
          return 0;
        }
        localbl.lPd = locala.yqV.readString();
        GMTrace.o(12655389573120L, 94290);
        return 0;
      }
      GMTrace.o(12655389573120L, 94290);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */