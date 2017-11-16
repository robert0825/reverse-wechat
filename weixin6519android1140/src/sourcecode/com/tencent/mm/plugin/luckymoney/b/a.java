package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public int fPf;
  public String mHM;
  public String mHN;
  
  public a()
  {
    GMTrace.i(9740851609600L, 72575);
    GMTrace.o(9740851609600L, 72575);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9740985827328L, 72576);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.fPf);
      if (this.mHM != null) {
        paramVarArgs.e(2, this.mHM);
      }
      if (this.mHN != null) {
        paramVarArgs.e(3, this.mHN);
      }
      GMTrace.o(9740985827328L, 72576);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.fPf) + 0;
      paramInt = i;
      if (this.mHM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.mHM);
      }
      i = paramInt;
      if (this.mHN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mHN);
      }
      GMTrace.o(9740985827328L, 72576);
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
      GMTrace.o(9740985827328L, 72576);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(9740985827328L, 72576);
        return -1;
      case 1: 
        locala1.fPf = locala.yqV.nj();
        GMTrace.o(9740985827328L, 72576);
        return 0;
      case 2: 
        locala1.mHM = locala.yqV.readString();
        GMTrace.o(9740985827328L, 72576);
        return 0;
      }
      locala1.mHN = locala.yqV.readString();
      GMTrace.o(9740985827328L, 72576);
      return 0;
    }
    GMTrace.o(9740985827328L, 72576);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */