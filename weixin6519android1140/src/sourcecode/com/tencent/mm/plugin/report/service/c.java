package com.tencent.mm.plugin.report.service;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class c
  extends com.tencent.mm.bm.a
{
  public boolean oqI;
  public int oqP;
  public String oqQ;
  public boolean oqR;
  
  public c()
  {
    GMTrace.i(13111327195136L, 97687);
    GMTrace.o(13111327195136L, 97687);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13111461412864L, 97688);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.oqQ == null) {
        throw new b("Not all required fields were included: Value");
      }
      paramVarArgs.fk(1, this.oqP);
      if (this.oqQ != null) {
        paramVarArgs.e(2, this.oqQ);
      }
      paramVarArgs.ah(3, this.oqR);
      paramVarArgs.ah(4, this.oqI);
      GMTrace.o(13111461412864L, 97688);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.oqP) + 0;
      paramInt = i;
      if (this.oqQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.oqQ);
      }
      i = b.a.a.b.b.a.cK(3);
      int j = b.a.a.b.b.a.cK(4);
      GMTrace.o(13111461412864L, 97688);
      return paramInt + (i + 1) + (j + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.oqQ == null) {
        throw new b("Not all required fields were included: Value");
      }
      GMTrace.o(13111461412864L, 97688);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13111461412864L, 97688);
        return -1;
      case 1: 
        localc.oqP = locala.yqV.nj();
        GMTrace.o(13111461412864L, 97688);
        return 0;
      case 2: 
        localc.oqQ = locala.yqV.readString();
        GMTrace.o(13111461412864L, 97688);
        return 0;
      case 3: 
        localc.oqR = locala.csU();
        GMTrace.o(13111461412864L, 97688);
        return 0;
      }
      localc.oqI = locala.csU();
      GMTrace.o(13111461412864L, 97688);
      return 0;
    }
    GMTrace.o(13111461412864L, 97688);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */