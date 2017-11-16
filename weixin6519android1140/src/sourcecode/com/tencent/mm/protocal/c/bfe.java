package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bfe
  extends com.tencent.mm.bm.a
{
  public String eEU;
  public String mFr;
  
  public bfe()
  {
    GMTrace.i(3948685557760L, 29420);
    GMTrace.o(3948685557760L, 29420);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3948819775488L, 29421);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mFr != null) {
        paramVarArgs.e(1, this.mFr);
      }
      if (this.eEU != null) {
        paramVarArgs.e(2, this.eEU);
      }
      GMTrace.o(3948819775488L, 29421);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mFr == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.mFr) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eEU != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eEU);
      }
      GMTrace.o(3948819775488L, 29421);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3948819775488L, 29421);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bfe localbfe = (bfe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3948819775488L, 29421);
          return -1;
        case 1: 
          localbfe.mFr = locala.yqV.readString();
          GMTrace.o(3948819775488L, 29421);
          return 0;
        }
        localbfe.eEU = locala.yqV.readString();
        GMTrace.o(3948819775488L, 29421);
        return 0;
      }
      GMTrace.o(3948819775488L, 29421);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */