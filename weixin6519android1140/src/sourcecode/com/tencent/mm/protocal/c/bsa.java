package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsa
  extends com.tencent.mm.bm.a
{
  public int lSW;
  public String uYN;
  
  public bsa()
  {
    GMTrace.i(4034316468224L, 30058);
    GMTrace.o(4034316468224L, 30058);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4034450685952L, 30059);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uYN == null) {
        throw new b("Not all required fields were included: Data");
      }
      paramVarArgs.fk(1, this.lSW);
      if (this.uYN != null) {
        paramVarArgs.e(2, this.uYN);
      }
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lSW) + 0;
      paramInt = i;
      if (this.uYN != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uYN);
      }
      GMTrace.o(4034450685952L, 30059);
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
      if (this.uYN == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsa localbsa = (bsa)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4034450685952L, 30059);
        return -1;
      case 1: 
        localbsa.lSW = locala.yqV.nj();
        GMTrace.o(4034450685952L, 30059);
        return 0;
      }
      localbsa.uYN = locala.yqV.readString();
      GMTrace.o(4034450685952L, 30059);
      return 0;
    }
    GMTrace.o(4034450685952L, 30059);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */