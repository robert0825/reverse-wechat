package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btf
  extends com.tencent.mm.bm.a
{
  public String jio;
  public com.tencent.mm.bm.b vbn;
  public String vbv;
  
  public btf()
  {
    GMTrace.i(3855672672256L, 28727);
    GMTrace.o(3855672672256L, 28727);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855806889984L, 28728);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.jio == null) {
        throw new b.a.a.b("Not all required fields were included: NickName");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.vbn != null) {
        paramVarArgs.b(3, this.vbn);
      }
      GMTrace.o(3855806889984L, 28728);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label435;
      }
    }
    label435:
    for (int i = b.a.a.b.b.a.f(1, this.vbv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.vbn != null) {
        i = paramInt + b.a.a.a.a(3, this.vbn);
      }
      GMTrace.o(3855806889984L, 28728);
      return i;
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
        if (this.jio == null) {
          throw new b.a.a.b("Not all required fields were included: NickName");
        }
        GMTrace.o(3855806889984L, 28728);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btf localbtf = (btf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3855806889984L, 28728);
          return -1;
        case 1: 
          localbtf.vbv = locala.yqV.readString();
          GMTrace.o(3855806889984L, 28728);
          return 0;
        case 2: 
          localbtf.jio = locala.yqV.readString();
          GMTrace.o(3855806889984L, 28728);
          return 0;
        }
        localbtf.vbn = locala.csV();
        GMTrace.o(3855806889984L, 28728);
        return 0;
      }
      GMTrace.o(3855806889984L, 28728);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\btf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */