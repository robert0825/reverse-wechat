package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bci
  extends com.tencent.mm.bm.a
{
  public String eCQ;
  public boolean uOY;
  public String uOZ;
  public String username;
  
  public bci()
  {
    GMTrace.i(4029216194560L, 30020);
    GMTrace.o(4029216194560L, 30020);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4029350412288L, 30021);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.ah(2, this.uOY);
      if (this.eCQ != null) {
        paramVarArgs.e(3, this.eCQ);
      }
      if (this.uOZ != null) {
        paramVarArgs.e(4, this.uOZ);
      }
      GMTrace.o(4029350412288L, 30021);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label415;
      }
    }
    label415:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt + (b.a.a.b.b.a.cK(2) + 1);
      paramInt = i;
      if (this.eCQ != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.eCQ);
      }
      i = paramInt;
      if (this.uOZ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uOZ);
      }
      GMTrace.o(4029350412288L, 30021);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4029350412288L, 30021);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bci localbci = (bci)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4029350412288L, 30021);
          return -1;
        case 1: 
          localbci.username = locala.yqV.readString();
          GMTrace.o(4029350412288L, 30021);
          return 0;
        case 2: 
          localbci.uOY = locala.csU();
          GMTrace.o(4029350412288L, 30021);
          return 0;
        case 3: 
          localbci.eCQ = locala.yqV.readString();
          GMTrace.o(4029350412288L, 30021);
          return 0;
        }
        localbci.uOZ = locala.yqV.readString();
        GMTrace.o(4029350412288L, 30021);
        return 0;
      }
      GMTrace.o(4029350412288L, 30021);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */