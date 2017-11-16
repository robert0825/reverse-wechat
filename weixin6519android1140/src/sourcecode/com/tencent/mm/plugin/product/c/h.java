package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class h
  extends com.tencent.mm.bm.a
{
  public String id;
  public boolean nII;
  public String name;
  
  public h()
  {
    GMTrace.i(6042079461376L, 45017);
    GMTrace.o(6042079461376L, 45017);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6042213679104L, 45018);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.e(1, this.id);
      }
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      paramVarArgs.ah(3, this.nII);
      GMTrace.o(6042213679104L, 45018);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label342;
      }
    }
    label342:
    for (paramInt = b.a.a.b.b.a.f(1, this.id) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.name != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.name);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      GMTrace.o(6042213679104L, 45018);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6042213679104L, 45018);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        h localh = (h)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6042213679104L, 45018);
          return -1;
        case 1: 
          localh.id = locala.yqV.readString();
          GMTrace.o(6042213679104L, 45018);
          return 0;
        case 2: 
          localh.name = locala.yqV.readString();
          GMTrace.o(6042213679104L, 45018);
          return 0;
        }
        localh.nII = locala.csU();
        GMTrace.o(6042213679104L, 45018);
        return 0;
      }
      GMTrace.o(6042213679104L, 45018);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */