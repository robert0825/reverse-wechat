package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class qv
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public String lRV;
  public String ugQ;
  public int ugR;
  
  public qv()
  {
    GMTrace.i(18615864655872L, 138699);
    GMTrace.o(18615864655872L, 138699);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18615998873600L, 138700);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.lRV != null) {
        paramVarArgs.e(2, this.lRV);
      }
      if (this.ugQ != null) {
        paramVarArgs.e(3, this.ugQ);
      }
      paramVarArgs.fk(4, this.ugR);
      GMTrace.o(18615998873600L, 138700);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label408;
      }
    }
    label408:
    for (int i = b.a.a.b.b.a.f(1, this.lPi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lRV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRV);
      }
      i = paramInt;
      if (this.ugQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugQ);
      }
      paramInt = b.a.a.a.fh(4, this.ugR);
      GMTrace.o(18615998873600L, 138700);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18615998873600L, 138700);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        qv localqv = (qv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18615998873600L, 138700);
          return -1;
        case 1: 
          localqv.lPi = locala.yqV.readString();
          GMTrace.o(18615998873600L, 138700);
          return 0;
        case 2: 
          localqv.lRV = locala.yqV.readString();
          GMTrace.o(18615998873600L, 138700);
          return 0;
        case 3: 
          localqv.ugQ = locala.yqV.readString();
          GMTrace.o(18615998873600L, 138700);
          return 0;
        }
        localqv.ugR = locala.yqV.nj();
        GMTrace.o(18615998873600L, 138700);
        return 0;
      }
      GMTrace.o(18615998873600L, 138700);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */