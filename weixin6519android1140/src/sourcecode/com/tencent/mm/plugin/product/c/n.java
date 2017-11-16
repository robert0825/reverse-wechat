package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class n
  extends com.tencent.mm.bm.a
{
  public int eQl;
  public String eSd;
  public String nIR;
  public String name;
  public String username;
  
  public n()
  {
    GMTrace.i(6040737284096L, 45007);
    GMTrace.o(6040737284096L, 45007);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6040871501824L, 45008);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eSd != null) {
        paramVarArgs.e(1, this.eSd);
      }
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.nIR != null) {
        paramVarArgs.e(3, this.nIR);
      }
      if (this.username != null) {
        paramVarArgs.e(4, this.username);
      }
      paramVarArgs.fk(5, this.eQl);
      GMTrace.o(6040871501824L, 45008);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eSd == null) {
        break label471;
      }
    }
    label471:
    for (int i = b.a.a.b.b.a.f(1, this.eSd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.nIR != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIR);
      }
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.username);
      }
      i = b.a.a.a.fh(5, this.eQl);
      GMTrace.o(6040871501824L, 45008);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6040871501824L, 45008);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6040871501824L, 45008);
          return -1;
        case 1: 
          localn.eSd = locala.yqV.readString();
          GMTrace.o(6040871501824L, 45008);
          return 0;
        case 2: 
          localn.name = locala.yqV.readString();
          GMTrace.o(6040871501824L, 45008);
          return 0;
        case 3: 
          localn.nIR = locala.yqV.readString();
          GMTrace.o(6040871501824L, 45008);
          return 0;
        case 4: 
          localn.username = locala.yqV.readString();
          GMTrace.o(6040871501824L, 45008);
          return 0;
        }
        localn.eQl = locala.yqV.nj();
        GMTrace.o(6040871501824L, 45008);
        return 0;
      }
      GMTrace.o(6040871501824L, 45008);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */