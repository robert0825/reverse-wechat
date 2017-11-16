package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bm.a
{
  public long mIJ;
  public String mIK;
  public String mIW;
  public String mIX;
  public String mIY;
  public String mIZ;
  public String mIn;
  public String userName;
  
  public m()
  {
    GMTrace.i(9746354536448L, 72616);
    GMTrace.o(9746354536448L, 72616);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9746488754176L, 72617);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mIW != null) {
        paramVarArgs.e(1, this.mIW);
      }
      if (this.mIX != null) {
        paramVarArgs.e(2, this.mIX);
      }
      paramVarArgs.T(3, this.mIJ);
      if (this.mIK != null) {
        paramVarArgs.e(4, this.mIK);
      }
      if (this.mIY != null) {
        paramVarArgs.e(5, this.mIY);
      }
      if (this.mIn != null) {
        paramVarArgs.e(6, this.mIn);
      }
      if (this.mIZ != null) {
        paramVarArgs.e(7, this.mIZ);
      }
      if (this.userName != null) {
        paramVarArgs.e(8, this.userName);
      }
      GMTrace.o(9746488754176L, 72617);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mIW == null) {
        break label668;
      }
    }
    label668:
    for (paramInt = b.a.a.b.b.a.f(1, this.mIW) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mIX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mIX);
      }
      i += b.a.a.a.S(3, this.mIJ);
      paramInt = i;
      if (this.mIK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mIK);
      }
      i = paramInt;
      if (this.mIY != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mIY);
      }
      paramInt = i;
      if (this.mIn != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mIn);
      }
      i = paramInt;
      if (this.mIZ != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mIZ);
      }
      paramInt = i;
      if (this.userName != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.userName);
      }
      GMTrace.o(9746488754176L, 72617);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(9746488754176L, 72617);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        m localm = (m)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(9746488754176L, 72617);
          return -1;
        case 1: 
          localm.mIW = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 2: 
          localm.mIX = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 3: 
          localm.mIJ = locala.yqV.nk();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 4: 
          localm.mIK = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 5: 
          localm.mIY = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 6: 
          localm.mIn = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        case 7: 
          localm.mIZ = locala.yqV.readString();
          GMTrace.o(9746488754176L, 72617);
          return 0;
        }
        localm.userName = locala.yqV.readString();
        GMTrace.o(9746488754176L, 72617);
        return 0;
      }
      GMTrace.o(9746488754176L, 72617);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */