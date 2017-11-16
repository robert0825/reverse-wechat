package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class abb
  extends com.tencent.mm.bm.a
{
  public int ury;
  
  public abb()
  {
    GMTrace.i(3809099120640L, 28380);
    GMTrace.o(3809099120640L, 28380);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3809233338368L, 28381);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.ury);
      GMTrace.o(3809233338368L, 28381);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.ury);
      GMTrace.o(3809233338368L, 28381);
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
      GMTrace.o(3809233338368L, 28381);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      abb localabb = (abb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3809233338368L, 28381);
        return -1;
      }
      localabb.ury = locala.yqV.nj();
      GMTrace.o(3809233338368L, 28381);
      return 0;
    }
    GMTrace.o(3809233338368L, 28381);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\abb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */