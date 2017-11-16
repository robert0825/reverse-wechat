package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class api
  extends com.tencent.mm.bm.a
{
  public int uEW;
  
  public api()
  {
    GMTrace.i(3820104974336L, 28462);
    GMTrace.o(3820104974336L, 28462);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3820239192064L, 28463);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.uEW);
      GMTrace.o(3820239192064L, 28463);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uEW);
      GMTrace.o(3820239192064L, 28463);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3820239192064L, 28463);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      api localapi = (api)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3820239192064L, 28463);
        return -1;
      }
      localapi.uEW = locala.yqV.nj();
      GMTrace.o(3820239192064L, 28463);
      return 0;
    }
    GMTrace.o(3820239192064L, 28463);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */