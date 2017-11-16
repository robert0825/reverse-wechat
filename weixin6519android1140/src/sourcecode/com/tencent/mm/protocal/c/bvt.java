package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bvt
  extends com.tencent.mm.bm.a
{
  public String gjb;
  public String title;
  public int vdP;
  
  public bvt()
  {
    GMTrace.i(3922915753984L, 29228);
    GMTrace.o(3922915753984L, 29228);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3923049971712L, 29229);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gjb == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.gjb != null) {
        paramVarArgs.e(1, this.gjb);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      paramVarArgs.fk(3, this.vdP);
      GMTrace.o(3923049971712L, 29229);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gjb == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.gjb) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.title);
      }
      paramInt = b.a.a.a.fh(3, this.vdP);
      GMTrace.o(3923049971712L, 29229);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.gjb == null) {
          throw new b("Not all required fields were included: rankid");
        }
        if (this.title == null) {
          throw new b("Not all required fields were included: title");
        }
        GMTrace.o(3923049971712L, 29229);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvt localbvt = (bvt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3923049971712L, 29229);
          return -1;
        case 1: 
          localbvt.gjb = locala.yqV.readString();
          GMTrace.o(3923049971712L, 29229);
          return 0;
        case 2: 
          localbvt.title = locala.yqV.readString();
          GMTrace.o(3923049971712L, 29229);
          return 0;
        }
        localbvt.vdP = locala.yqV.nj();
        GMTrace.o(3923049971712L, 29229);
        return 0;
      }
      GMTrace.o(3923049971712L, 29229);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */