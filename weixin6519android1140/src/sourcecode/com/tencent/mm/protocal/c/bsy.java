package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsy
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public com.tencent.mm.bm.b tRB;
  public long vbQ;
  public String vbv;
  
  public bsy()
  {
    GMTrace.i(3683873980416L, 27447);
    GMTrace.o(3683873980416L, 27447);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684008198144L, 27448);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.tRB == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      paramVarArgs.T(2, this.vbQ);
      if (this.tRB != null) {
        paramVarArgs.b(3, this.tRB);
      }
      paramVarArgs.fk(4, this.tOG);
      GMTrace.o(3684008198144L, 27448);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label467;
      }
    }
    label467:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.S(2, this.vbQ);
      paramInt = i;
      if (this.tRB != null) {
        paramInt = i + b.a.a.a.a(3, this.tRB);
      }
      i = b.a.a.a.fh(4, this.tOG);
      GMTrace.o(3684008198144L, 27448);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b.a.a.b("Not all required fields were included: Talker");
        }
        if (this.tRB == null) {
          throw new b.a.a.b("Not all required fields were included: VoiceData");
        }
        GMTrace.o(3684008198144L, 27448);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsy localbsy = (bsy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684008198144L, 27448);
          return -1;
        case 1: 
          localbsy.vbv = locala.yqV.readString();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        case 2: 
          localbsy.vbQ = locala.yqV.nk();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        case 3: 
          localbsy.tRB = locala.csV();
          GMTrace.o(3684008198144L, 27448);
          return 0;
        }
        localbsy.tOG = locala.yqV.nj();
        GMTrace.o(3684008198144L, 27448);
        return 0;
      }
      GMTrace.o(3684008198144L, 27448);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */