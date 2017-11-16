package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class amd
  extends com.tencent.mm.bm.a
{
  public String kAX;
  public double tWm;
  public double tWn;
  public String uBc;
  public String uBd;
  public String uBe;
  
  public amd()
  {
    GMTrace.i(3807488507904L, 28368);
    GMTrace.o(3807488507904L, 28368);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3807622725632L, 28369);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.tWn);
      paramVarArgs.a(2, this.tWm);
      if (this.kAX != null) {
        paramVarArgs.e(3, this.kAX);
      }
      if (this.uBc != null) {
        paramVarArgs.e(4, this.uBc);
      }
      if (this.uBd != null) {
        paramVarArgs.e(5, this.uBd);
      }
      if (this.uBe != null) {
        paramVarArgs.e(6, this.uBe);
      }
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.kAX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kAX);
      }
      i = paramInt;
      if (this.uBc != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uBc);
      }
      paramInt = i;
      if (this.uBd != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uBd);
      }
      i = paramInt;
      if (this.uBe != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uBe);
      }
      GMTrace.o(3807622725632L, 28369);
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
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      amd localamd = (amd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3807622725632L, 28369);
        return -1;
      case 1: 
        localamd.tWn = locala.yqV.readDouble();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 2: 
        localamd.tWm = locala.yqV.readDouble();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 3: 
        localamd.kAX = locala.yqV.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 4: 
        localamd.uBc = locala.yqV.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      case 5: 
        localamd.uBd = locala.yqV.readString();
        GMTrace.o(3807622725632L, 28369);
        return 0;
      }
      localamd.uBe = locala.yqV.readString();
      GMTrace.o(3807622725632L, 28369);
      return 0;
    }
    GMTrace.o(3807622725632L, 28369);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */