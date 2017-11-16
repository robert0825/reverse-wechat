package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class baa
  extends com.tencent.mm.bm.a
{
  public String ibU;
  public String lPj;
  public String tWJ;
  public int uOa;
  public String uxX;
  
  public baa()
  {
    GMTrace.i(3988816658432L, 29719);
    GMTrace.o(3988816658432L, 29719);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3988950876160L, 29720);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWJ != null) {
        paramVarArgs.e(1, this.tWJ);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      paramVarArgs.fk(3, this.uOa);
      if (this.ibU != null) {
        paramVarArgs.e(4, this.ibU);
      }
      if (this.uxX != null) {
        paramVarArgs.e(5, this.uxX);
      }
      GMTrace.o(3988950876160L, 29720);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tWJ == null) {
        break label482;
      }
    }
    label482:
    for (paramInt = b.a.a.b.b.a.f(1, this.tWJ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPj != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPj);
      }
      i += b.a.a.a.fh(3, this.uOa);
      paramInt = i;
      if (this.ibU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ibU);
      }
      i = paramInt;
      if (this.uxX != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uxX);
      }
      GMTrace.o(3988950876160L, 29720);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3988950876160L, 29720);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        baa localbaa = (baa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3988950876160L, 29720);
          return -1;
        case 1: 
          localbaa.tWJ = locala.yqV.readString();
          GMTrace.o(3988950876160L, 29720);
          return 0;
        case 2: 
          localbaa.lPj = locala.yqV.readString();
          GMTrace.o(3988950876160L, 29720);
          return 0;
        case 3: 
          localbaa.uOa = locala.yqV.nj();
          GMTrace.o(3988950876160L, 29720);
          return 0;
        case 4: 
          localbaa.ibU = locala.yqV.readString();
          GMTrace.o(3988950876160L, 29720);
          return 0;
        }
        localbaa.uxX = locala.yqV.readString();
        GMTrace.o(3988950876160L, 29720);
        return 0;
      }
      GMTrace.o(3988950876160L, 29720);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\baa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */