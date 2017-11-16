package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public String name;
  public String url;
  
  public d()
  {
    GMTrace.i(7696849829888L, 57346);
    GMTrace.o(7696849829888L, 57346);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7696984047616L, 57347);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.e(1, this.url);
      }
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      GMTrace.o(7696984047616L, 57347);
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.url) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.name != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.name);
      }
      GMTrace.o(7696984047616L, 57347);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(7696984047616L, 57347);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        d locald = (d)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(7696984047616L, 57347);
          return -1;
        case 1: 
          locald.url = locala.yqV.readString();
          GMTrace.o(7696984047616L, 57347);
          return 0;
        }
        locald.name = locala.yqV.readString();
        GMTrace.o(7696984047616L, 57347);
        return 0;
      }
      GMTrace.o(7696984047616L, 57347);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */