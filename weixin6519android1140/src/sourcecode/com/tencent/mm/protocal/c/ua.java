package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class ua
  extends com.tencent.mm.bm.a
{
  public int aHs;
  public String rOy;
  public String ulK;
  
  public ua()
  {
    GMTrace.i(3943585284096L, 29382);
    GMTrace.o(3943585284096L, 29382);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3943719501824L, 29383);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.rOy == null) {
        throw new b("Not all required fields were included: tagName");
      }
      if (this.ulK == null) {
        throw new b("Not all required fields were included: tagPinYin");
      }
      if (this.rOy != null) {
        paramVarArgs.e(1, this.rOy);
      }
      if (this.ulK != null) {
        paramVarArgs.e(2, this.ulK);
      }
      paramVarArgs.fk(3, this.aHs);
      GMTrace.o(3943719501824L, 29383);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rOy == null) {
        break label422;
      }
    }
    label422:
    for (paramInt = b.a.a.b.b.a.f(1, this.rOy) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ulK != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ulK);
      }
      paramInt = b.a.a.a.fh(3, this.aHs);
      GMTrace.o(3943719501824L, 29383);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.rOy == null) {
          throw new b("Not all required fields were included: tagName");
        }
        if (this.ulK == null) {
          throw new b("Not all required fields were included: tagPinYin");
        }
        GMTrace.o(3943719501824L, 29383);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ua localua = (ua)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3943719501824L, 29383);
          return -1;
        case 1: 
          localua.rOy = locala.yqV.readString();
          GMTrace.o(3943719501824L, 29383);
          return 0;
        case 2: 
          localua.ulK = locala.yqV.readString();
          GMTrace.o(3943719501824L, 29383);
          return 0;
        }
        localua.aHs = locala.yqV.nj();
        GMTrace.o(3943719501824L, 29383);
        return 0;
      }
      GMTrace.o(3943719501824L, 29383);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */