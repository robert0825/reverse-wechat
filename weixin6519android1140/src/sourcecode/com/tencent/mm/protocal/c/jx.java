package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jx
  extends com.tencent.mm.bm.a
{
  public String uau;
  public String uav;
  public int uaw;
  public int uax;
  public int uay;
  public int uaz;
  
  public jx()
  {
    GMTrace.i(3962644201472L, 29524);
    GMTrace.o(3962644201472L, 29524);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3962778419200L, 29525);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uau != null) {
        paramVarArgs.e(1, this.uau);
      }
      if (this.uav != null) {
        paramVarArgs.e(2, this.uav);
      }
      paramVarArgs.fk(3, this.uaw);
      paramVarArgs.fk(4, this.uax);
      paramVarArgs.fk(5, this.uay);
      paramVarArgs.fk(6, this.uaz);
      GMTrace.o(3962778419200L, 29525);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uau == null) {
        break label506;
      }
    }
    label506:
    for (paramInt = b.a.a.b.b.a.f(1, this.uau) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uav != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uav);
      }
      paramInt = b.a.a.a.fh(3, this.uaw);
      int j = b.a.a.a.fh(4, this.uax);
      int k = b.a.a.a.fh(5, this.uay);
      int m = b.a.a.a.fh(6, this.uaz);
      GMTrace.o(3962778419200L, 29525);
      return i + paramInt + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3962778419200L, 29525);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jx localjx = (jx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3962778419200L, 29525);
          return -1;
        case 1: 
          localjx.uau = locala.yqV.readString();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 2: 
          localjx.uav = locala.yqV.readString();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 3: 
          localjx.uaw = locala.yqV.nj();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 4: 
          localjx.uax = locala.yqV.nj();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        case 5: 
          localjx.uay = locala.yqV.nj();
          GMTrace.o(3962778419200L, 29525);
          return 0;
        }
        localjx.uaz = locala.yqV.nj();
        GMTrace.o(3962778419200L, 29525);
        return 0;
      }
      GMTrace.o(3962778419200L, 29525);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */