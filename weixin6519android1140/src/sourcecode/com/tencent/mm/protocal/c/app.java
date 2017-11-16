package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class app
  extends com.tencent.mm.bm.a
{
  public int uFm;
  public int uFn;
  
  public app()
  {
    GMTrace.i(13098173857792L, 97589);
    GMTrace.o(13098173857792L, 97589);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13098308075520L, 97590);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uFm);
      paramVarArgs.fk(2, this.uFn);
      GMTrace.o(13098308075520L, 97590);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uFm);
      int i = b.a.a.a.fh(2, this.uFn);
      GMTrace.o(13098308075520L, 97590);
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
      GMTrace.o(13098308075520L, 97590);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      app localapp = (app)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13098308075520L, 97590);
        return -1;
      case 1: 
        localapp.uFm = locala.yqV.nj();
        GMTrace.o(13098308075520L, 97590);
        return 0;
      }
      localapp.uFn = locala.yqV.nj();
      GMTrace.o(13098308075520L, 97590);
      return 0;
    }
    GMTrace.o(13098308075520L, 97590);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\app.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */