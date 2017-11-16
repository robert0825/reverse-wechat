package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lPi;
  public String lRV;
  public String nIo;
  public String nIp;
  
  public a()
  {
    GMTrace.i(6041811025920L, 45015);
    GMTrace.o(6041811025920L, 45015);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6041945243648L, 45016);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.nIo != null) {
        paramVarArgs.e(2, this.nIo);
      }
      paramVarArgs.fk(3, this.jib);
      if (this.nIp != null) {
        paramVarArgs.e(4, this.nIp);
      }
      if (this.lRV != null) {
        paramVarArgs.e(5, this.lRV);
      }
      GMTrace.o(6041945243648L, 45016);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label471;
      }
    }
    label471:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nIo != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nIo);
      }
      i += b.a.a.a.fh(3, this.jib);
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nIp);
      }
      i = paramInt;
      if (this.lRV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lRV);
      }
      GMTrace.o(6041945243648L, 45016);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(6041945243648L, 45016);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        a locala1 = (a)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(6041945243648L, 45016);
          return -1;
        case 1: 
          locala1.lPi = locala.yqV.readString();
          GMTrace.o(6041945243648L, 45016);
          return 0;
        case 2: 
          locala1.nIo = locala.yqV.readString();
          GMTrace.o(6041945243648L, 45016);
          return 0;
        case 3: 
          locala1.jib = locala.yqV.nj();
          GMTrace.o(6041945243648L, 45016);
          return 0;
        case 4: 
          locala1.nIp = locala.yqV.readString();
          GMTrace.o(6041945243648L, 45016);
          return 0;
        }
        locala1.lRV = locala.yqV.readString();
        GMTrace.o(6041945243648L, 45016);
        return 0;
      }
      GMTrace.o(6041945243648L, 45016);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */