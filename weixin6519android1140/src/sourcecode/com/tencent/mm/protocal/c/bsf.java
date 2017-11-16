package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsf
  extends com.tencent.mm.bm.a
{
  public String jio;
  public String vbv;
  public long vbx;
  
  public bsf()
  {
    GMTrace.i(3884529483776L, 28942);
    GMTrace.o(3884529483776L, 28942);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3884663701504L, 28943);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.jio == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      paramVarArgs.T(3, this.vbx);
      GMTrace.o(3884663701504L, 28943);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jio);
      }
      paramInt = b.a.a.a.S(3, this.vbx);
      GMTrace.o(3884663701504L, 28943);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.jio == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(3884663701504L, 28943);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsf localbsf = (bsf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3884663701504L, 28943);
          return -1;
        case 1: 
          localbsf.vbv = locala.yqV.readString();
          GMTrace.o(3884663701504L, 28943);
          return 0;
        case 2: 
          localbsf.jio = locala.yqV.readString();
          GMTrace.o(3884663701504L, 28943);
          return 0;
        }
        localbsf.vbx = locala.yqV.nk();
        GMTrace.o(3884663701504L, 28943);
        return 0;
      }
      GMTrace.o(3884663701504L, 28943);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */