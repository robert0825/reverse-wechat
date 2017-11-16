package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends com.tencent.mm.bm.a
{
  public int month;
  public String nEU;
  public int year;
  
  public d()
  {
    GMTrace.i(6627134537728L, 49376);
    GMTrace.o(6627134537728L, 49376);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6627268755456L, 49377);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.year);
      paramVarArgs.fk(2, this.month);
      if (this.nEU != null) {
        paramVarArgs.e(3, this.nEU);
      }
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.year) + 0 + b.a.a.a.fh(2, this.month);
      paramInt = i;
      if (this.nEU != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nEU);
      }
      GMTrace.o(6627268755456L, 49377);
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
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(6627268755456L, 49377);
        return -1;
      case 1: 
        locald.year = locala.yqV.nj();
        GMTrace.o(6627268755456L, 49377);
        return 0;
      case 2: 
        locald.month = locala.yqV.nj();
        GMTrace.o(6627268755456L, 49377);
        return 0;
      }
      locald.nEU = locala.yqV.readString();
      GMTrace.o(6627268755456L, 49377);
      return 0;
    }
    GMTrace.o(6627268755456L, 49377);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */