package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahn
  extends com.tencent.mm.bm.a
{
  public String uxb;
  public String uxc;
  public int uxd;
  
  public ahn()
  {
    GMTrace.i(13573841485824L, 101133);
    GMTrace.o(13573841485824L, 101133);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13573975703552L, 101134);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uxb != null) {
        paramVarArgs.e(1, this.uxb);
      }
      if (this.uxc != null) {
        paramVarArgs.e(2, this.uxc);
      }
      paramVarArgs.fk(3, this.uxd);
      GMTrace.o(13573975703552L, 101134);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uxb == null) {
        break label345;
      }
    }
    label345:
    for (paramInt = b.a.a.b.b.a.f(1, this.uxb) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uxc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uxc);
      }
      paramInt = b.a.a.a.fh(3, this.uxd);
      GMTrace.o(13573975703552L, 101134);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13573975703552L, 101134);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahn localahn = (ahn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13573975703552L, 101134);
          return -1;
        case 1: 
          localahn.uxb = locala.yqV.readString();
          GMTrace.o(13573975703552L, 101134);
          return 0;
        case 2: 
          localahn.uxc = locala.yqV.readString();
          GMTrace.o(13573975703552L, 101134);
          return 0;
        }
        localahn.uxd = locala.yqV.nj();
        GMTrace.o(13573975703552L, 101134);
        return 0;
      }
      GMTrace.o(13573975703552L, 101134);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ahn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */