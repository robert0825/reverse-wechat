package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class t
  extends com.tencent.mm.bm.a
{
  public long tMi;
  public String tMv;
  public long tMw;
  public int tMx;
  
  public t()
  {
    GMTrace.i(3741050732544L, 27873);
    GMTrace.o(3741050732544L, 27873);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3741184950272L, 27874);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tMv != null) {
        paramVarArgs.e(1, this.tMv);
      }
      paramVarArgs.T(2, this.tMi);
      paramVarArgs.T(3, this.tMw);
      paramVarArgs.fk(4, this.tMx);
      GMTrace.o(3741184950272L, 27874);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tMv == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.tMv) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.tMi);
      int j = b.a.a.a.S(3, this.tMw);
      int k = b.a.a.a.fh(4, this.tMx);
      GMTrace.o(3741184950272L, 27874);
      return paramInt + i + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3741184950272L, 27874);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        t localt = (t)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3741184950272L, 27874);
          return -1;
        case 1: 
          localt.tMv = locala.yqV.readString();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        case 2: 
          localt.tMi = locala.yqV.nk();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        case 3: 
          localt.tMw = locala.yqV.nk();
          GMTrace.o(3741184950272L, 27874);
          return 0;
        }
        localt.tMx = locala.yqV.nj();
        GMTrace.o(3741184950272L, 27874);
        return 0;
      }
      GMTrace.o(3741184950272L, 27874);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */