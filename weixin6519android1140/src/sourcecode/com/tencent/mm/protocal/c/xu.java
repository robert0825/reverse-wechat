package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class xu
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int upk;
  
  public xu()
  {
    GMTrace.i(4010559930368L, 29881);
    GMTrace.o(4010559930368L, 29881);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4010694148096L, 29882);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.upk);
      GMTrace.o(4010694148096L, 29882);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.upk);
      GMTrace.o(4010694148096L, 29882);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4010694148096L, 29882);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        xu localxu = (xu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4010694148096L, 29882);
          return -1;
        case 1: 
          localxu.jhi = locala.yqV.readString();
          GMTrace.o(4010694148096L, 29882);
          return 0;
        }
        localxu.upk = locala.yqV.nj();
        GMTrace.o(4010694148096L, 29882);
        return 0;
      }
      GMTrace.o(4010694148096L, 29882);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\xu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */