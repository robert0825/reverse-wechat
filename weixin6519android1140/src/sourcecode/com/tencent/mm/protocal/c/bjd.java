package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bjd
  extends com.tencent.mm.bm.a
{
  public String amf;
  public String value;
  
  public bjd()
  {
    GMTrace.i(18982279053312L, 141429);
    GMTrace.o(18982279053312L, 141429);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18982413271040L, 141430);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.amf == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.value == null) {
        throw new b("Not all required fields were included: value");
      }
      if (this.amf != null) {
        paramVarArgs.e(1, this.amf);
      }
      if (this.value != null) {
        paramVarArgs.e(2, this.value);
      }
      GMTrace.o(18982413271040L, 141430);
      return 0;
    }
    if (paramInt == 1) {
      if (this.amf == null) {
        break label366;
      }
    }
    label366:
    for (paramInt = b.a.a.b.b.a.f(1, this.amf) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.value != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.value);
      }
      GMTrace.o(18982413271040L, 141430);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.amf == null) {
          throw new b("Not all required fields were included: key");
        }
        if (this.value == null) {
          throw new b("Not all required fields were included: value");
        }
        GMTrace.o(18982413271040L, 141430);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjd localbjd = (bjd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18982413271040L, 141430);
          return -1;
        case 1: 
          localbjd.amf = locala.yqV.readString();
          GMTrace.o(18982413271040L, 141430);
          return 0;
        }
        localbjd.value = locala.yqV.readString();
        GMTrace.o(18982413271040L, 141430);
        return 0;
      }
      GMTrace.o(18982413271040L, 141430);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */