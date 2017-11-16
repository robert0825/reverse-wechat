package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ana
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int scene;
  public String tWC;
  public String tXx;
  public long uBO;
  public long uBP;
  
  public ana()
  {
    GMTrace.i(4050154160128L, 30176);
    GMTrace.o(4050154160128L, 30176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4050288377856L, 30177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.scene);
      if (this.tWC != null) {
        paramVarArgs.e(2, this.tWC);
      }
      paramVarArgs.T(3, this.uBO);
      paramVarArgs.T(4, this.uBP);
      if (this.tXx != null) {
        paramVarArgs.e(5, this.tXx);
      }
      paramVarArgs.fk(6, this.jib);
      GMTrace.o(4050288377856L, 30177);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.scene) + 0;
      paramInt = i;
      if (this.tWC != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWC);
      }
      i = paramInt + b.a.a.a.S(3, this.uBO) + b.a.a.a.S(4, this.uBP);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXx);
      }
      i = b.a.a.a.fh(6, this.jib);
      GMTrace.o(4050288377856L, 30177);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4050288377856L, 30177);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ana localana = (ana)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4050288377856L, 30177);
        return -1;
      case 1: 
        localana.scene = locala.yqV.nj();
        GMTrace.o(4050288377856L, 30177);
        return 0;
      case 2: 
        localana.tWC = locala.yqV.readString();
        GMTrace.o(4050288377856L, 30177);
        return 0;
      case 3: 
        localana.uBO = locala.yqV.nk();
        GMTrace.o(4050288377856L, 30177);
        return 0;
      case 4: 
        localana.uBP = locala.yqV.nk();
        GMTrace.o(4050288377856L, 30177);
        return 0;
      case 5: 
        localana.tXx = locala.yqV.readString();
        GMTrace.o(4050288377856L, 30177);
        return 0;
      }
      localana.jib = locala.yqV.nj();
      GMTrace.o(4050288377856L, 30177);
      return 0;
    }
    GMTrace.o(4050288377856L, 30177);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ana.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */