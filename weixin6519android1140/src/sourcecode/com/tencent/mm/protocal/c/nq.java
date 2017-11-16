package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class nq
  extends com.tencent.mm.bm.a
{
  public String amf;
  public long ueq;
  public String uer;
  
  public nq()
  {
    GMTrace.i(4027874017280L, 30010);
    GMTrace.o(4027874017280L, 30010);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4028008235008L, 30011);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.amf == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.amf != null) {
        paramVarArgs.e(1, this.amf);
      }
      paramVarArgs.T(2, this.ueq);
      if (this.uer != null) {
        paramVarArgs.e(3, this.uer);
      }
      GMTrace.o(4028008235008L, 30011);
      return 0;
    }
    if (paramInt == 1) {
      if (this.amf == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.amf) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.S(2, this.ueq);
      paramInt = i;
      if (this.uer != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uer);
      }
      GMTrace.o(4028008235008L, 30011);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.amf == null) {
          throw new b("Not all required fields were included: key");
        }
        GMTrace.o(4028008235008L, 30011);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        nq localnq = (nq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4028008235008L, 30011);
          return -1;
        case 1: 
          localnq.amf = locala.yqV.readString();
          GMTrace.o(4028008235008L, 30011);
          return 0;
        case 2: 
          localnq.ueq = locala.yqV.nk();
          GMTrace.o(4028008235008L, 30011);
          return 0;
        }
        localnq.uer = locala.yqV.readString();
        GMTrace.o(4028008235008L, 30011);
        return 0;
      }
      GMTrace.o(4028008235008L, 30011);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\nq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */