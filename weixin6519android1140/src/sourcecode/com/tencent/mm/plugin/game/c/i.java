package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class i
  extends com.tencent.mm.bm.a
{
  public String lPJ;
  public String lPK;
  public String lPL;
  public String lPM;
  
  public i()
  {
    GMTrace.i(12651228823552L, 94259);
    GMTrace.o(12651228823552L, 94259);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12651363041280L, 94260);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPJ == null) {
        throw new b("Not all required fields were included: Message");
      }
      if (this.lPK == null) {
        throw new b("Not all required fields were included: GotoBtn");
      }
      if (this.lPL == null) {
        throw new b("Not all required fields were included: CancelBtn");
      }
      if (this.lPM == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.lPJ != null) {
        paramVarArgs.e(1, this.lPJ);
      }
      if (this.lPK != null) {
        paramVarArgs.e(2, this.lPK);
      }
      if (this.lPL != null) {
        paramVarArgs.e(3, this.lPL);
      }
      if (this.lPM != null) {
        paramVarArgs.e(4, this.lPM);
      }
      GMTrace.o(12651363041280L, 94260);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPJ == null) {
        break label560;
      }
    }
    label560:
    for (int i = b.a.a.b.b.a.f(1, this.lPJ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPK);
      }
      i = paramInt;
      if (this.lPL != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPL);
      }
      paramInt = i;
      if (this.lPM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPM);
      }
      GMTrace.o(12651363041280L, 94260);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lPJ == null) {
          throw new b("Not all required fields were included: Message");
        }
        if (this.lPK == null) {
          throw new b("Not all required fields were included: GotoBtn");
        }
        if (this.lPL == null) {
          throw new b("Not all required fields were included: CancelBtn");
        }
        if (this.lPM == null) {
          throw new b("Not all required fields were included: Url");
        }
        GMTrace.o(12651363041280L, 94260);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        i locali = (i)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12651363041280L, 94260);
          return -1;
        case 1: 
          locali.lPJ = locala.yqV.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        case 2: 
          locali.lPK = locala.yqV.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        case 3: 
          locali.lPL = locala.yqV.readString();
          GMTrace.o(12651363041280L, 94260);
          return 0;
        }
        locali.lPM = locala.yqV.readString();
        GMTrace.o(12651363041280L, 94260);
        return 0;
      }
      GMTrace.o(12651363041280L, 94260);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */