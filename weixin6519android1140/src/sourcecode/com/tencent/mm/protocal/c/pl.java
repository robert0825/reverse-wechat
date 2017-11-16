package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pl
  extends com.tencent.mm.bm.a
{
  public String ufK;
  public int ufL;
  
  public pl()
  {
    GMTrace.i(3800240750592L, 28314);
    GMTrace.o(3800240750592L, 28314);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3800374968320L, 28315);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufK != null) {
        paramVarArgs.e(1, this.ufK);
      }
      paramVarArgs.fk(2, this.ufL);
      GMTrace.o(3800374968320L, 28315);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufK == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.ufK) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.ufL);
      GMTrace.o(3800374968320L, 28315);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3800374968320L, 28315);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        pl localpl = (pl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3800374968320L, 28315);
          return -1;
        case 1: 
          localpl.ufK = locala.yqV.readString();
          GMTrace.o(3800374968320L, 28315);
          return 0;
        }
        localpl.ufL = locala.yqV.nj();
        GMTrace.o(3800374968320L, 28315);
        return 0;
      }
      GMTrace.o(3800374968320L, 28315);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */