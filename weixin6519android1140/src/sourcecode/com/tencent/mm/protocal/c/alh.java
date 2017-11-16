package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class alh
  extends com.tencent.mm.bm.a
{
  public String jAY;
  public double latitude;
  public double longitude;
  
  public alh()
  {
    GMTrace.i(3763330875392L, 28039);
    GMTrace.o(3763330875392L, 28039);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3763465093120L, 28040);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.latitude);
      paramVarArgs.a(2, this.longitude);
      if (this.jAY != null) {
        paramVarArgs.e(3, this.jAY);
      }
      GMTrace.o(3763465093120L, 28040);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.jAY != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jAY);
      }
      GMTrace.o(3763465093120L, 28040);
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
      GMTrace.o(3763465093120L, 28040);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      alh localalh = (alh)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3763465093120L, 28040);
        return -1;
      case 1: 
        localalh.latitude = locala.yqV.readDouble();
        GMTrace.o(3763465093120L, 28040);
        return 0;
      case 2: 
        localalh.longitude = locala.yqV.readDouble();
        GMTrace.o(3763465093120L, 28040);
        return 0;
      }
      localalh.jAY = locala.yqV.readString();
      GMTrace.o(3763465093120L, 28040);
      return 0;
    }
    GMTrace.o(3763465093120L, 28040);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\alh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */