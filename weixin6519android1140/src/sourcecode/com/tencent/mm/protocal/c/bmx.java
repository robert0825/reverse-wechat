package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bmx
  extends com.tencent.mm.bm.a
{
  public int uWZ;
  public b uXa;
  
  public bmx()
  {
    GMTrace.i(4019686735872L, 29949);
    GMTrace.o(4019686735872L, 29949);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4019820953600L, 29950);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uWZ);
      if (this.uXa != null) {
        paramVarArgs.b(2, this.uXa);
      }
      GMTrace.o(4019820953600L, 29950);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uWZ) + 0;
      paramInt = i;
      if (this.uXa != null) {
        paramInt = i + b.a.a.a.a(2, this.uXa);
      }
      GMTrace.o(4019820953600L, 29950);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4019820953600L, 29950);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bmx localbmx = (bmx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4019820953600L, 29950);
        return -1;
      case 1: 
        localbmx.uWZ = locala.yqV.nj();
        GMTrace.o(4019820953600L, 29950);
        return 0;
      }
      localbmx.uXa = locala.csV();
      GMTrace.o(4019820953600L, 29950);
      return 0;
    }
    GMTrace.o(4019820953600L, 29950);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */