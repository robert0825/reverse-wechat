package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class aps
  extends com.tencent.mm.bm.a
{
  public String content;
  public String lang;
  
  public aps()
  {
    GMTrace.i(15346991890432L, 114344);
    GMTrace.o(15346991890432L, 114344);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15347126108160L, 114345);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lang == null) {
        throw new b("Not all required fields were included: lang");
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      if (this.lang != null) {
        paramVarArgs.e(1, this.lang);
      }
      if (this.content != null) {
        paramVarArgs.e(2, this.content);
      }
      GMTrace.o(15347126108160L, 114345);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lang == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.lang) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.content != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.content);
      }
      GMTrace.o(15347126108160L, 114345);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lang == null) {
          throw new b("Not all required fields were included: lang");
        }
        if (this.content == null) {
          throw new b("Not all required fields were included: content");
        }
        GMTrace.o(15347126108160L, 114345);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aps localaps = (aps)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15347126108160L, 114345);
          return -1;
        case 1: 
          localaps.lang = locala.yqV.readString();
          GMTrace.o(15347126108160L, 114345);
          return 0;
        }
        localaps.content = locala.yqV.readString();
        GMTrace.o(15347126108160L, 114345);
        return 0;
      }
      GMTrace.o(15347126108160L, 114345);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */