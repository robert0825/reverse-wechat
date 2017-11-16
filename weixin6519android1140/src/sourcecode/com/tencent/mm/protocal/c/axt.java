package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class axt
  extends com.tencent.mm.bm.a
{
  public String lQf;
  public int uMp;
  
  public axt()
  {
    GMTrace.i(4017539252224L, 29933);
    GMTrace.o(4017539252224L, 29933);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4017673469952L, 29934);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uMp);
      if (this.lQf != null) {
        paramVarArgs.e(2, this.lQf);
      }
      GMTrace.o(4017673469952L, 29934);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uMp) + 0;
      paramInt = i;
      if (this.lQf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQf);
      }
      GMTrace.o(4017673469952L, 29934);
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
      GMTrace.o(4017673469952L, 29934);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      axt localaxt = (axt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4017673469952L, 29934);
        return -1;
      case 1: 
        localaxt.uMp = locala.yqV.nj();
        GMTrace.o(4017673469952L, 29934);
        return 0;
      }
      localaxt.lQf = locala.yqV.readString();
      GMTrace.o(4017673469952L, 29934);
      return 0;
    }
    GMTrace.o(4017673469952L, 29934);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */