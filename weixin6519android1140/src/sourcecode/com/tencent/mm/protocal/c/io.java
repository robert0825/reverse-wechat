package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class io
  extends com.tencent.mm.bm.a
{
  public String lRV;
  public String tXy;
  public String tXz;
  
  public io()
  {
    GMTrace.i(3686289899520L, 27465);
    GMTrace.o(3686289899520L, 27465);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686424117248L, 27466);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRV == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.lRV != null) {
        paramVarArgs.e(1, this.lRV);
      }
      if (this.tXy != null) {
        paramVarArgs.e(2, this.tXy);
      }
      if (this.tXz != null) {
        paramVarArgs.e(3, this.tXz);
      }
      GMTrace.o(3686424117248L, 27466);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRV == null) {
        break label406;
      }
    }
    label406:
    for (int i = b.a.a.b.b.a.f(1, this.lRV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tXy != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tXy);
      }
      i = paramInt;
      if (this.tXz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXz);
      }
      GMTrace.o(3686424117248L, 27466);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lRV == null) {
          throw new b("Not all required fields were included: IconUrl");
        }
        GMTrace.o(3686424117248L, 27466);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        io localio = (io)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3686424117248L, 27466);
          return -1;
        case 1: 
          localio.lRV = locala.yqV.readString();
          GMTrace.o(3686424117248L, 27466);
          return 0;
        case 2: 
          localio.tXy = locala.yqV.readString();
          GMTrace.o(3686424117248L, 27466);
          return 0;
        }
        localio.tXz = locala.yqV.readString();
        GMTrace.o(3686424117248L, 27466);
        return 0;
      }
      GMTrace.o(3686424117248L, 27466);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\io.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */