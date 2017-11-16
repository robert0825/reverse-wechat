package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class g
  extends com.tencent.mm.bm.a
{
  public String country;
  public String fjk;
  public String fjl;
  public String gEy;
  
  public g()
  {
    GMTrace.i(6040468848640L, 45005);
    GMTrace.o(6040468848640L, 45005);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6040603066368L, 45006);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.country != null) {
        paramVarArgs.e(1, this.country);
      }
      if (this.fjk != null) {
        paramVarArgs.e(2, this.fjk);
      }
      if (this.fjl != null) {
        paramVarArgs.e(3, this.fjl);
      }
      if (this.gEy != null) {
        paramVarArgs.e(4, this.gEy);
      }
      GMTrace.o(6040603066368L, 45006);
      return 0;
    }
    if (paramInt == 1) {
      if (this.country == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.country) + 0;; i = 0)
    {
      paramInt = i;
      if (this.fjk != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.fjk);
      }
      i = paramInt;
      if (this.fjl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fjl);
      }
      paramInt = i;
      if (this.gEy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gEy);
      }
      GMTrace.o(6040603066368L, 45006);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6040603066368L, 45006);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        g localg = (g)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6040603066368L, 45006);
          return -1;
        case 1: 
          localg.country = locala.yqV.readString();
          GMTrace.o(6040603066368L, 45006);
          return 0;
        case 2: 
          localg.fjk = locala.yqV.readString();
          GMTrace.o(6040603066368L, 45006);
          return 0;
        case 3: 
          localg.fjl = locala.yqV.readString();
          GMTrace.o(6040603066368L, 45006);
          return 0;
        }
        localg.gEy = locala.yqV.readString();
        GMTrace.o(6040603066368L, 45006);
        return 0;
      }
      GMTrace.o(6040603066368L, 45006);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */