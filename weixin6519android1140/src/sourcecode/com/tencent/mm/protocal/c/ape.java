package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ape
  extends com.tencent.mm.bm.a
{
  public int oqH;
  
  public ape()
  {
    GMTrace.i(3621462736896L, 26982);
    GMTrace.o(3621462736896L, 26982);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621596954624L, 26983);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.oqH);
      GMTrace.o(3621596954624L, 26983);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.oqH);
      GMTrace.o(3621596954624L, 26983);
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
      GMTrace.o(3621596954624L, 26983);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ape localape = (ape)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3621596954624L, 26983);
        return -1;
      }
      localape.oqH = locala.yqV.nj();
      GMTrace.o(3621596954624L, 26983);
      return 0;
    }
    GMTrace.o(3621596954624L, 26983);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */