package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aiy
  extends com.tencent.mm.bm.a
{
  public int eGy;
  public String eGz;
  
  public aiy()
  {
    GMTrace.i(3764673052672L, 28049);
    GMTrace.o(3764673052672L, 28049);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3764807270400L, 28050);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.eGy);
      if (this.eGz != null) {
        paramVarArgs.e(2, this.eGz);
      }
      GMTrace.o(3764807270400L, 28050);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.eGy) + 0;
      paramInt = i;
      if (this.eGz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eGz);
      }
      GMTrace.o(3764807270400L, 28050);
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
      GMTrace.o(3764807270400L, 28050);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aiy localaiy = (aiy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3764807270400L, 28050);
        return -1;
      case 1: 
        localaiy.eGy = locala.yqV.nj();
        GMTrace.o(3764807270400L, 28050);
        return 0;
      }
      localaiy.eGz = locala.yqV.readString();
      GMTrace.o(3764807270400L, 28050);
      return 0;
    }
    GMTrace.o(3764807270400L, 28050);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */