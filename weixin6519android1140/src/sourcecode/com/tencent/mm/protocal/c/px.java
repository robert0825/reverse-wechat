package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class px
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int tXI;
  
  public px()
  {
    GMTrace.i(3729239572480L, 27785);
    GMTrace.o(3729239572480L, 27785);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3729373790208L, 27786);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      paramVarArgs.fk(2, this.tXI);
      GMTrace.o(3729373790208L, 27786);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.tXI);
      GMTrace.o(3729373790208L, 27786);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3729373790208L, 27786);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        px localpx = (px)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3729373790208L, 27786);
          return -1;
        case 1: 
          localpx.eBt = locala.yqV.readString();
          GMTrace.o(3729373790208L, 27786);
          return 0;
        }
        localpx.tXI = locala.yqV.nj();
        GMTrace.o(3729373790208L, 27786);
        return 0;
      }
      GMTrace.o(3729373790208L, 27786);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */