package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cn
  extends com.tencent.mm.bm.a
{
  public String lRT;
  public String lRV;
  
  public cn()
  {
    GMTrace.i(3810978168832L, 28394);
    GMTrace.o(3810978168832L, 28394);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3811112386560L, 28395);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRT != null) {
        paramVarArgs.e(1, this.lRT);
      }
      if (this.lRV != null) {
        paramVarArgs.e(2, this.lRV);
      }
      GMTrace.o(3811112386560L, 28395);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRT == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.lRT) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lRV != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lRV);
      }
      GMTrace.o(3811112386560L, 28395);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3811112386560L, 28395);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cn localcn = (cn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3811112386560L, 28395);
          return -1;
        case 1: 
          localcn.lRT = locala.yqV.readString();
          GMTrace.o(3811112386560L, 28395);
          return 0;
        }
        localcn.lRV = locala.yqV.readString();
        GMTrace.o(3811112386560L, 28395);
        return 0;
      }
      GMTrace.o(3811112386560L, 28395);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */