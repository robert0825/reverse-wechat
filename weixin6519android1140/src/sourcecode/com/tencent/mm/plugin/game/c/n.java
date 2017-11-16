package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class n
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPd;
  
  public n()
  {
    GMTrace.i(12655523790848L, 94291);
    GMTrace.o(12655523790848L, 94291);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655658008576L, 94292);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPd == null) {
        throw new b("Not all required fields were included: WebURL");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPd != null) {
        paramVarArgs.e(2, this.lPd);
      }
      GMTrace.o(12655658008576L, 94292);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPd);
      }
      GMTrace.o(12655658008576L, 94292);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.eBt == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.lPd == null) {
          throw new b("Not all required fields were included: WebURL");
        }
        GMTrace.o(12655658008576L, 94292);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12655658008576L, 94292);
          return -1;
        case 1: 
          localn.eBt = locala.yqV.readString();
          GMTrace.o(12655658008576L, 94292);
          return 0;
        }
        localn.lPd = locala.yqV.readString();
        GMTrace.o(12655658008576L, 94292);
        return 0;
      }
      GMTrace.o(12655658008576L, 94292);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */