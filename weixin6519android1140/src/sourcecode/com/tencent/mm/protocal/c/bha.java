package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bha
  extends com.tencent.mm.bm.a
{
  public int aJb;
  public String appName;
  public String uSS;
  public boolean uST;
  public boolean uSU;
  
  public bha()
  {
    GMTrace.i(3652198596608L, 27211);
    GMTrace.o(3652198596608L, 27211);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3652332814336L, 27212);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uSS != null) {
        paramVarArgs.e(1, this.uSS);
      }
      if (this.appName != null) {
        paramVarArgs.e(2, this.appName);
      }
      paramVarArgs.fk(3, this.aJb);
      paramVarArgs.ah(4, this.uST);
      paramVarArgs.ah(5, this.uSU);
      GMTrace.o(3652332814336L, 27212);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uSS == null) {
        break label444;
      }
    }
    label444:
    for (paramInt = b.a.a.b.b.a.f(1, this.uSS) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.appName != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.appName);
      }
      paramInt = b.a.a.a.fh(3, this.aJb);
      int j = b.a.a.b.b.a.cK(4);
      int k = b.a.a.b.b.a.cK(5);
      GMTrace.o(3652332814336L, 27212);
      return i + paramInt + (j + 1) + (k + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3652332814336L, 27212);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bha localbha = (bha)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3652332814336L, 27212);
          return -1;
        case 1: 
          localbha.uSS = locala.yqV.readString();
          GMTrace.o(3652332814336L, 27212);
          return 0;
        case 2: 
          localbha.appName = locala.yqV.readString();
          GMTrace.o(3652332814336L, 27212);
          return 0;
        case 3: 
          localbha.aJb = locala.yqV.nj();
          GMTrace.o(3652332814336L, 27212);
          return 0;
        case 4: 
          localbha.uST = locala.csU();
          GMTrace.o(3652332814336L, 27212);
          return 0;
        }
        localbha.uSU = locala.csU();
        GMTrace.o(3652332814336L, 27212);
        return 0;
      }
      GMTrace.o(3652332814336L, 27212);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */