package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btd
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tRB;
  public int ugl;
  public boolean vbX;
  public boolean vbY;
  public String vbv;
  
  public btd()
  {
    GMTrace.i(3731923927040L, 27805);
    GMTrace.o(3731923927040L, 27805);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3732058144768L, 27806);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      paramVarArgs.fk(2, this.ugl);
      if (this.tRB != null) {
        paramVarArgs.b(3, this.tRB);
      }
      paramVarArgs.ah(4, this.vbX);
      paramVarArgs.ah(5, this.vbY);
      GMTrace.o(3732058144768L, 27806);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label473;
      }
    }
    label473:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.ugl);
      paramInt = i;
      if (this.tRB != null) {
        paramInt = i + b.a.a.a.a(3, this.tRB);
      }
      i = b.a.a.b.b.a.cK(4);
      int j = b.a.a.b.b.a.cK(5);
      GMTrace.o(3732058144768L, 27806);
      return paramInt + (i + 1) + (j + 1);
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
        GMTrace.o(3732058144768L, 27806);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btd localbtd = (btd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3732058144768L, 27806);
          return -1;
        case 1: 
          localbtd.vbv = locala.yqV.readString();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 2: 
          localbtd.ugl = locala.yqV.nj();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 3: 
          localbtd.tRB = locala.csV();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        case 4: 
          localbtd.vbX = locala.csU();
          GMTrace.o(3732058144768L, 27806);
          return 0;
        }
        localbtd.vbY = locala.csU();
        GMTrace.o(3732058144768L, 27806);
        return 0;
      }
      GMTrace.o(3732058144768L, 27806);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\btd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */