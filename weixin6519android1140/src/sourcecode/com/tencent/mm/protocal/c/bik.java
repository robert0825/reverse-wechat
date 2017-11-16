package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bik
  extends com.tencent.mm.bm.a
{
  public String gjg;
  public String tag;
  
  public bik()
  {
    GMTrace.i(3708033171456L, 27627);
    GMTrace.o(3708033171456L, 27627);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3708167389184L, 27628);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tag != null) {
        paramVarArgs.e(1, this.tag);
      }
      if (this.gjg != null) {
        paramVarArgs.e(2, this.gjg);
      }
      GMTrace.o(3708167389184L, 27628);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tag == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tag) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.gjg != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gjg);
      }
      GMTrace.o(3708167389184L, 27628);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3708167389184L, 27628);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bik localbik = (bik)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3708167389184L, 27628);
          return -1;
        case 1: 
          localbik.tag = locala.yqV.readString();
          GMTrace.o(3708167389184L, 27628);
          return 0;
        }
        localbik.gjg = locala.yqV.readString();
        GMTrace.o(3708167389184L, 27628);
        return 0;
      }
      GMTrace.o(3708167389184L, 27628);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */