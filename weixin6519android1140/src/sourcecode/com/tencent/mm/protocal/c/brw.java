package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brw
  extends com.tencent.mm.bm.a
{
  public int tWu;
  
  public brw()
  {
    GMTrace.i(4025189662720L, 29990);
    GMTrace.o(4025189662720L, 29990);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4025323880448L, 29991);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.tWu);
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tWu);
      GMTrace.o(4025323880448L, 29991);
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
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brw localbrw = (brw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4025323880448L, 29991);
        return -1;
      }
      localbrw.tWu = locala.yqV.nj();
      GMTrace.o(4025323880448L, 29991);
      return 0;
    }
    GMTrace.o(4025323880448L, 29991);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */