package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class brv
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int lSW;
  public String nIp;
  
  public brv()
  {
    GMTrace.i(3870436622336L, 28837);
    GMTrace.o(3870436622336L, 28837);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3870570840064L, 28838);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.nIp == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fk(1, this.lSW);
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.nIp != null) {
        paramVarArgs.e(3, this.nIp);
      }
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lSW) + 0;
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIp);
      }
      GMTrace.o(3870570840064L, 28838);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.nIp == null) {
        throw new b("Not all required fields were included: Content");
      }
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      brv localbrv = (brv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3870570840064L, 28838);
        return -1;
      case 1: 
        localbrv.lSW = locala.yqV.nj();
        GMTrace.o(3870570840064L, 28838);
        return 0;
      case 2: 
        localbrv.eBt = locala.yqV.readString();
        GMTrace.o(3870570840064L, 28838);
        return 0;
      }
      localbrv.nIp = locala.yqV.readString();
      GMTrace.o(3870570840064L, 28838);
      return 0;
    }
    GMTrace.o(3870570840064L, 28838);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */