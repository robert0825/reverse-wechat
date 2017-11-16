package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ql
  extends com.tencent.mm.bm.a
{
  public boolean ugq;
  public boolean ugr;
  public String ugs;
  
  public ql()
  {
    GMTrace.i(18812762062848L, 140166);
    GMTrace.o(18812762062848L, 140166);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18812896280576L, 140167);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.ah(1, this.ugq);
      paramVarArgs.ah(2, this.ugr);
      if (this.ugs != null) {
        paramVarArgs.e(3, this.ugs);
      }
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 1 + 0 + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.ugs != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ugs);
      }
      GMTrace.o(18812896280576L, 140167);
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
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ql localql = (ql)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(18812896280576L, 140167);
        return -1;
      case 1: 
        localql.ugq = locala.csU();
        GMTrace.o(18812896280576L, 140167);
        return 0;
      case 2: 
        localql.ugr = locala.csU();
        GMTrace.o(18812896280576L, 140167);
        return 0;
      }
      localql.ugs = locala.yqV.readString();
      GMTrace.o(18812896280576L, 140167);
      return 0;
    }
    GMTrace.o(18812896280576L, 140167);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */