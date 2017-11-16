package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ar
  extends com.tencent.mm.bm.a
{
  public int jib;
  public String lPi;
  public String lRV;
  public String nIo;
  public String nIp;
  
  public ar()
  {
    GMTrace.i(3991769448448L, 29741);
    GMTrace.o(3991769448448L, 29741);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3991903666176L, 29742);
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
      GMTrace.o(3991903666176L, 29742);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label482;
      }
    }
    label482:
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
      GMTrace.o(3991903666176L, 29742);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3991903666176L, 29742);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ar localar = (ar)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3991903666176L, 29742);
          return -1;
        case 1: 
          localar.lPi = locala.yqV.readString();
          GMTrace.o(3991903666176L, 29742);
          return 0;
        case 2: 
          localar.nIo = locala.yqV.readString();
          GMTrace.o(3991903666176L, 29742);
          return 0;
        case 3: 
          localar.jib = locala.yqV.nj();
          GMTrace.o(3991903666176L, 29742);
          return 0;
        case 4: 
          localar.nIp = locala.yqV.readString();
          GMTrace.o(3991903666176L, 29742);
          return 0;
        }
        localar.lRV = locala.yqV.readString();
        GMTrace.o(3991903666176L, 29742);
        return 0;
      }
      GMTrace.o(3991903666176L, 29742);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */