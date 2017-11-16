package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class brq
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int jib;
  public String jio;
  
  public brq()
  {
    GMTrace.i(3849767092224L, 28683);
    GMTrace.o(3849767092224L, 28683);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3849901309952L, 28684);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.jio == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      paramVarArgs.fk(3, this.jib);
      GMTrace.o(3849901309952L, 28684);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jio);
      }
      paramInt = b.a.a.a.fh(3, this.jib);
      GMTrace.o(3849901309952L, 28684);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jhi == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.jio == null) {
          throw new b("Not all required fields were included: NickName");
        }
        GMTrace.o(3849901309952L, 28684);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brq localbrq = (brq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3849901309952L, 28684);
          return -1;
        case 1: 
          localbrq.jhi = locala.yqV.readString();
          GMTrace.o(3849901309952L, 28684);
          return 0;
        case 2: 
          localbrq.jio = locala.yqV.readString();
          GMTrace.o(3849901309952L, 28684);
          return 0;
        }
        localbrq.jib = locala.yqV.nj();
        GMTrace.o(3849901309952L, 28684);
        return 0;
      }
      GMTrace.o(3849901309952L, 28684);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */