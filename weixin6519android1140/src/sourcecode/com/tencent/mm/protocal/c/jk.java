package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jk
  extends com.tencent.mm.bm.a
{
  public int jzr;
  public String text;
  public String url;
  
  public jk()
  {
    GMTrace.i(3804267282432L, 28344);
    GMTrace.o(3804267282432L, 28344);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3804401500160L, 28345);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jzr);
      if (this.text != null) {
        paramVarArgs.e(2, this.text);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jzr) + 0;
      paramInt = i;
      if (this.text != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.text);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      GMTrace.o(3804401500160L, 28345);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      jk localjk = (jk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3804401500160L, 28345);
        return -1;
      case 1: 
        localjk.jzr = locala.yqV.nj();
        GMTrace.o(3804401500160L, 28345);
        return 0;
      case 2: 
        localjk.text = locala.yqV.readString();
        GMTrace.o(3804401500160L, 28345);
        return 0;
      }
      localjk.url = locala.yqV.readString();
      GMTrace.o(3804401500160L, 28345);
      return 0;
    }
    GMTrace.o(3804401500160L, 28345);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */