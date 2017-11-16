package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aht
  extends com.tencent.mm.bm.a
{
  public String lSG;
  public float tWy;
  public float tWz;
  public float uxm;
  public String uxn;
  
  public aht()
  {
    GMTrace.i(3908957110272L, 29124);
    GMTrace.o(3908957110272L, 29124);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3909091328000L, 29125);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.tWy);
      paramVarArgs.n(2, this.tWz);
      paramVarArgs.n(3, this.uxm);
      if (this.lSG != null) {
        paramVarArgs.e(4, this.lSG);
      }
      if (this.uxn != null) {
        paramVarArgs.e(5, this.uxn);
      }
      GMTrace.o(3909091328000L, 29125);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 4 + 0 + (b.a.a.b.b.a.cK(2) + 4) + (b.a.a.b.b.a.cK(3) + 4);
      paramInt = i;
      if (this.lSG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSG);
      }
      i = paramInt;
      if (this.uxn != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uxn);
      }
      GMTrace.o(3909091328000L, 29125);
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
      GMTrace.o(3909091328000L, 29125);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aht localaht = (aht)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3909091328000L, 29125);
        return -1;
      case 1: 
        localaht.tWy = locala.yqV.readFloat();
        GMTrace.o(3909091328000L, 29125);
        return 0;
      case 2: 
        localaht.tWz = locala.yqV.readFloat();
        GMTrace.o(3909091328000L, 29125);
        return 0;
      case 3: 
        localaht.uxm = locala.yqV.readFloat();
        GMTrace.o(3909091328000L, 29125);
        return 0;
      case 4: 
        localaht.lSG = locala.yqV.readString();
        GMTrace.o(3909091328000L, 29125);
        return 0;
      }
      localaht.uxn = locala.yqV.readString();
      GMTrace.o(3909091328000L, 29125);
      return 0;
    }
    GMTrace.o(3909091328000L, 29125);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */