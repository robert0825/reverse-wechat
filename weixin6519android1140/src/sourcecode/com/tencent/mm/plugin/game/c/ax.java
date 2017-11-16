package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ax
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPd;
  public String lQf;
  public String lRN;
  
  public ax()
  {
    GMTrace.i(12640759840768L, 94181);
    GMTrace.o(12640759840768L, 94181);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12640894058496L, 94182);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRN == null) {
        throw new b("Not all required fields were included: LogoURL");
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.lPd == null) {
        throw new b("Not all required fields were included: WebURL");
      }
      if (this.lRN != null) {
        paramVarArgs.e(1, this.lRN);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.lQf != null) {
        paramVarArgs.e(3, this.lQf);
      }
      if (this.lPd != null) {
        paramVarArgs.e(4, this.lPd);
      }
      GMTrace.o(12640894058496L, 94182);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRN == null) {
        break label560;
      }
    }
    label560:
    for (int i = b.a.a.b.b.a.f(1, this.lRN) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.lQf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lQf);
      }
      paramInt = i;
      if (this.lPd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPd);
      }
      GMTrace.o(12640894058496L, 94182);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lRN == null) {
          throw new b("Not all required fields were included: LogoURL");
        }
        if (this.eBt == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.lQf == null) {
          throw new b("Not all required fields were included: Detail");
        }
        if (this.lPd == null) {
          throw new b("Not all required fields were included: WebURL");
        }
        GMTrace.o(12640894058496L, 94182);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ax localax = (ax)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12640894058496L, 94182);
          return -1;
        case 1: 
          localax.lRN = locala.yqV.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        case 2: 
          localax.eBt = locala.yqV.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        case 3: 
          localax.lQf = locala.yqV.readString();
          GMTrace.o(12640894058496L, 94182);
          return 0;
        }
        localax.lPd = locala.yqV.readString();
        GMTrace.o(12640894058496L, 94182);
        return 0;
      }
      GMTrace.o(12640894058496L, 94182);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */