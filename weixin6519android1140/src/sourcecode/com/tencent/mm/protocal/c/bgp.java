package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bgp
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  
  public bgp()
  {
    GMTrace.i(3642132267008L, 27136);
    GMTrace.o(3642132267008L, 27136);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3642266484736L, 27137);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      GMTrace.o(3642266484736L, 27137);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jio);
      }
      GMTrace.o(3642266484736L, 27137);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3642266484736L, 27137);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bgp localbgp = (bgp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3642266484736L, 27137);
          return -1;
        case 1: 
          localbgp.jhi = locala.yqV.readString();
          GMTrace.o(3642266484736L, 27137);
          return 0;
        }
        localbgp.jio = locala.yqV.readString();
        GMTrace.o(3642266484736L, 27137);
        return 0;
      }
      GMTrace.o(3642266484736L, 27137);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */