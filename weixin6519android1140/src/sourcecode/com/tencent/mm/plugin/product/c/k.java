package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bm.a
{
  public String nDw;
  public String url;
  
  public k()
  {
    GMTrace.i(6040200413184L, 45003);
    GMTrace.o(6040200413184L, 45003);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6040334630912L, 45004);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nDw != null) {
        paramVarArgs.e(1, this.nDw);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      GMTrace.o(6040334630912L, 45004);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nDw == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.nDw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.url);
      }
      GMTrace.o(6040334630912L, 45004);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6040334630912L, 45004);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6040334630912L, 45004);
          return -1;
        case 1: 
          localk.nDw = locala.yqV.readString();
          GMTrace.o(6040334630912L, 45004);
          return 0;
        }
        localk.url = locala.yqV.readString();
        GMTrace.o(6040334630912L, 45004);
        return 0;
      }
      GMTrace.o(6040334630912L, 45004);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */