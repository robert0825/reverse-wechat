package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ae
  extends com.tencent.mm.bm.a
{
  public int tNB;
  public int tNC;
  
  public ae()
  {
    GMTrace.i(18919733592064L, 140963);
    GMTrace.o(18919733592064L, 140963);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18919867809792L, 140964);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tNB);
      paramVarArgs.fk(2, this.tNC);
      GMTrace.o(18919867809792L, 140964);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tNB);
      int i = b.a.a.a.fh(2, this.tNC);
      GMTrace.o(18919867809792L, 140964);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18919867809792L, 140964);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ae localae = (ae)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(18919867809792L, 140964);
        return -1;
      case 1: 
        localae.tNB = locala.yqV.nj();
        GMTrace.o(18919867809792L, 140964);
        return 0;
      }
      localae.tNC = locala.yqV.nj();
      GMTrace.o(18919867809792L, 140964);
      return 0;
    }
    GMTrace.o(18919867809792L, 140964);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */