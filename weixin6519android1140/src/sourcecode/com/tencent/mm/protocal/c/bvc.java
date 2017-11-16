package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvc
  extends com.tencent.mm.bm.a
{
  public int scene;
  public String vdt;
  
  public bvc()
  {
    GMTrace.i(15345381277696L, 114332);
    GMTrace.o(15345381277696L, 114332);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15345515495424L, 114333);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vdt != null) {
        paramVarArgs.e(1, this.vdt);
      }
      paramVarArgs.fk(2, this.scene);
      GMTrace.o(15345515495424L, 114333);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vdt == null) {
        break label282;
      }
    }
    label282:
    for (paramInt = b.a.a.b.b.a.f(1, this.vdt) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.scene);
      GMTrace.o(15345515495424L, 114333);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15345515495424L, 114333);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvc localbvc = (bvc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15345515495424L, 114333);
          return -1;
        case 1: 
          localbvc.vdt = locala.yqV.readString();
          GMTrace.o(15345515495424L, 114333);
          return 0;
        }
        localbvc.scene = locala.yqV.nj();
        GMTrace.o(15345515495424L, 114333);
        return 0;
      }
      GMTrace.o(15345515495424L, 114333);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */