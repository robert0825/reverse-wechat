package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class alc
  extends com.tencent.mm.bm.a
{
  public int tNf;
  public String uAd;
  public boolean uAe;
  public String uAf;
  public String uva;
  
  public alc()
  {
    GMTrace.i(15352360599552L, 114384);
    GMTrace.o(15352360599552L, 114384);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15352494817280L, 114385);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tNf);
      if (this.uAd != null) {
        paramVarArgs.e(2, this.uAd);
      }
      paramVarArgs.ah(3, this.uAe);
      if (this.uAf != null) {
        paramVarArgs.e(4, this.uAf);
      }
      if (this.uva != null) {
        paramVarArgs.e(5, this.uva);
      }
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tNf) + 0;
      paramInt = i;
      if (this.uAd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uAd);
      }
      i = paramInt + (b.a.a.b.b.a.cK(3) + 1);
      paramInt = i;
      if (this.uAf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uAf);
      }
      i = paramInt;
      if (this.uva != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uva);
      }
      GMTrace.o(15352494817280L, 114385);
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
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      alc localalc = (alc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15352494817280L, 114385);
        return -1;
      case 1: 
        localalc.tNf = locala.yqV.nj();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 2: 
        localalc.uAd = locala.yqV.readString();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 3: 
        localalc.uAe = locala.csU();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      case 4: 
        localalc.uAf = locala.yqV.readString();
        GMTrace.o(15352494817280L, 114385);
        return 0;
      }
      localalc.uva = locala.yqV.readString();
      GMTrace.o(15352494817280L, 114385);
      return 0;
    }
    GMTrace.o(15352494817280L, 114385);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\alc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */