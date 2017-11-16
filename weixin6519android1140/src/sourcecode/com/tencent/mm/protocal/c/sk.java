package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class sk
  extends com.tencent.mm.bm.a
{
  public int uiA;
  public String uiB;
  public String uiC;
  public int uii;
  public String uij;
  public String uik;
  public String uix;
  public String uiy;
  public int uiz;
  
  public sk()
  {
    GMTrace.i(3628710494208L, 27036);
    GMTrace.o(3628710494208L, 27036);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3628844711936L, 27037);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uii);
      if (this.uij != null) {
        paramVarArgs.e(2, this.uij);
      }
      if (this.uix != null) {
        paramVarArgs.e(3, this.uix);
      }
      if (this.uiy != null) {
        paramVarArgs.e(4, this.uiy);
      }
      paramVarArgs.fk(5, this.uiz);
      paramVarArgs.fk(6, this.uiA);
      if (this.uiB != null) {
        paramVarArgs.e(7, this.uiB);
      }
      if (this.uik != null) {
        paramVarArgs.e(8, this.uik);
      }
      if (this.uiC != null) {
        paramVarArgs.e(9, this.uiC);
      }
      GMTrace.o(3628844711936L, 27037);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uii) + 0;
      paramInt = i;
      if (this.uij != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uij);
      }
      i = paramInt;
      if (this.uix != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uix);
      }
      paramInt = i;
      if (this.uiy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uiy);
      }
      i = paramInt + b.a.a.a.fh(5, this.uiz) + b.a.a.a.fh(6, this.uiA);
      paramInt = i;
      if (this.uiB != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uiB);
      }
      i = paramInt;
      if (this.uik != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uik);
      }
      paramInt = i;
      if (this.uiC != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uiC);
      }
      GMTrace.o(3628844711936L, 27037);
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
      GMTrace.o(3628844711936L, 27037);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      sk localsk = (sk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3628844711936L, 27037);
        return -1;
      case 1: 
        localsk.uii = locala.yqV.nj();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 2: 
        localsk.uij = locala.yqV.readString();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 3: 
        localsk.uix = locala.yqV.readString();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 4: 
        localsk.uiy = locala.yqV.readString();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 5: 
        localsk.uiz = locala.yqV.nj();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 6: 
        localsk.uiA = locala.yqV.nj();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 7: 
        localsk.uiB = locala.yqV.readString();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      case 8: 
        localsk.uik = locala.yqV.readString();
        GMTrace.o(3628844711936L, 27037);
        return 0;
      }
      localsk.uiC = locala.yqV.readString();
      GMTrace.o(3628844711936L, 27037);
      return 0;
    }
    GMTrace.o(3628844711936L, 27037);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */