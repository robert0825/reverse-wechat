package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhs
  extends com.tencent.mm.bm.a
{
  public int oqG;
  public String uTC;
  
  public bhs()
  {
    GMTrace.i(13573573050368L, 101131);
    GMTrace.o(13573573050368L, 101131);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13573707268096L, 101132);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.oqG);
      if (this.uTC != null) {
        paramVarArgs.e(2, this.uTC);
      }
      GMTrace.o(13573707268096L, 101132);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.oqG) + 0;
      paramInt = i;
      if (this.uTC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uTC);
      }
      GMTrace.o(13573707268096L, 101132);
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
      GMTrace.o(13573707268096L, 101132);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhs localbhs = (bhs)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13573707268096L, 101132);
        return -1;
      case 1: 
        localbhs.oqG = locala.yqV.nj();
        GMTrace.o(13573707268096L, 101132);
        return 0;
      }
      localbhs.uTC = locala.yqV.readString();
      GMTrace.o(13573707268096L, 101132);
      return 0;
    }
    GMTrace.o(13573707268096L, 101132);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */