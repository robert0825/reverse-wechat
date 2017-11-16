package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aya
  extends com.tencent.mm.bm.a
{
  public String kAX;
  public String tTU;
  public int uLu;
  
  public aya()
  {
    GMTrace.i(3978213457920L, 29640);
    GMTrace.o(3978213457920L, 29640);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3978347675648L, 29641);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kAX != null) {
        paramVarArgs.e(1, this.kAX);
      }
      if (this.tTU != null) {
        paramVarArgs.e(2, this.tTU);
      }
      paramVarArgs.fk(3, this.uLu);
      GMTrace.o(3978347675648L, 29641);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kAX == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.kAX) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tTU != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tTU);
      }
      paramInt = b.a.a.a.fh(3, this.uLu);
      GMTrace.o(3978347675648L, 29641);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3978347675648L, 29641);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aya localaya = (aya)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3978347675648L, 29641);
          return -1;
        case 1: 
          localaya.kAX = locala.yqV.readString();
          GMTrace.o(3978347675648L, 29641);
          return 0;
        case 2: 
          localaya.tTU = locala.yqV.readString();
          GMTrace.o(3978347675648L, 29641);
          return 0;
        }
        localaya.uLu = locala.yqV.nj();
        GMTrace.o(3978347675648L, 29641);
        return 0;
      }
      GMTrace.o(3978347675648L, 29641);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */