package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brs
  extends com.tencent.mm.bm.a
{
  public long urf;
  
  public brs()
  {
    GMTrace.i(3743466651648L, 27891);
    GMTrace.o(3743466651648L, 27891);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3743600869376L, 27892);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).T(1, this.urf);
      GMTrace.o(3743600869376L, 27892);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.S(1, this.urf);
      GMTrace.o(3743600869376L, 27892);
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
      GMTrace.o(3743600869376L, 27892);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brs localbrs = (brs)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3743600869376L, 27892);
        return -1;
      }
      localbrs.urf = locala.yqV.nk();
      GMTrace.o(3743600869376L, 27892);
      return 0;
    }
    GMTrace.o(3743600869376L, 27892);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */