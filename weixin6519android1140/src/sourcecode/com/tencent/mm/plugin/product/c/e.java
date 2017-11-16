package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class e
  extends com.tencent.mm.bm.a
{
  public int id;
  public String name;
  public int value;
  
  public e()
  {
    GMTrace.i(6039663542272L, 44999);
    GMTrace.o(6039663542272L, 44999);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6039797760000L, 45000);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.id);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      paramVarArgs.fk(3, this.value);
      GMTrace.o(6039797760000L, 45000);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.id) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = b.a.a.a.fh(3, this.value);
      GMTrace.o(6039797760000L, 45000);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6039797760000L, 45000);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(6039797760000L, 45000);
        return -1;
      case 1: 
        locale.id = locala.yqV.nj();
        GMTrace.o(6039797760000L, 45000);
        return 0;
      case 2: 
        locale.name = locala.yqV.readString();
        GMTrace.o(6039797760000L, 45000);
        return 0;
      }
      locale.value = locala.yqV.nj();
      GMTrace.o(6039797760000L, 45000);
      return 0;
    }
    GMTrace.o(6039797760000L, 45000);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */