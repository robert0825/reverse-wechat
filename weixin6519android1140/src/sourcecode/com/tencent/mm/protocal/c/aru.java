package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aru
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String nIp;
  
  public aru()
  {
    GMTrace.i(13334933929984L, 99353);
    GMTrace.o(13334933929984L, 99353);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13335068147712L, 99354);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nIp != null) {
        paramVarArgs.e(1, this.nIp);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      GMTrace.o(13335068147712L, 99354);
      return 0;
    }
    if (paramInt == 1) {
      if (this.nIp == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.nIp) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eBt);
      }
      GMTrace.o(13335068147712L, 99354);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13335068147712L, 99354);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aru localaru = (aru)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13335068147712L, 99354);
          return -1;
        case 1: 
          localaru.nIp = locala.yqV.readString();
          GMTrace.o(13335068147712L, 99354);
          return 0;
        }
        localaru.eBt = locala.yqV.readString();
        GMTrace.o(13335068147712L, 99354);
        return 0;
      }
      GMTrace.o(13335068147712L, 99354);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */