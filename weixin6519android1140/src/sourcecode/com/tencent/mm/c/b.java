package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public String apkMd5;
  public int eqV;
  public String eqW;
  public int eqX;
  public String eqY;
  public String eqZ;
  public boolean era;
  public int erb;
  public boolean erc;
  
  public b()
  {
    GMTrace.i(14019310125056L, 104452);
    GMTrace.o(14019310125056L, 104452);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14019444342784L, 104453);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.apkMd5 == null) {
        throw new b.a.a.b("Not all required fields were included: apkMd5");
      }
      if (this.apkMd5 != null) {
        paramVarArgs.e(1, this.apkMd5);
      }
      paramVarArgs.fl(2, this.eqV);
      if (this.eqW != null) {
        paramVarArgs.e(3, this.eqW);
      }
      paramVarArgs.fl(4, this.eqX);
      if (this.eqY != null) {
        paramVarArgs.e(5, this.eqY);
      }
      if (this.eqZ != null) {
        paramVarArgs.e(6, this.eqZ);
      }
      paramVarArgs.ah(7, this.era);
      paramVarArgs.fl(8, this.erb);
      paramVarArgs.ah(9, this.erc);
      GMTrace.o(14019444342784L, 104453);
      return 0;
    }
    if (paramInt == 1) {
      if (this.apkMd5 == null) {
        break label668;
      }
    }
    label668:
    for (paramInt = b.a.a.a.f(1, this.apkMd5) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fi(2, this.eqV);
      paramInt = i;
      if (this.eqW != null) {
        paramInt = i + b.a.a.a.f(3, this.eqW);
      }
      i = paramInt + b.a.a.a.fi(4, this.eqX);
      paramInt = i;
      if (this.eqY != null) {
        paramInt = i + b.a.a.a.f(5, this.eqY);
      }
      i = paramInt;
      if (this.eqZ != null) {
        i = paramInt + b.a.a.a.f(6, this.eqZ);
      }
      paramInt = b.a.a.a.Gu(7);
      int j = b.a.a.a.fi(8, this.erb);
      int k = b.a.a.a.Gu(9);
      GMTrace.o(14019444342784L, 104453);
      return i + paramInt + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs);; paramInt = com.tencent.mm.bm.a.a(paramVarArgs))
        {
          if (paramInt <= 0)
          {
            if (this.apkMd5 != null) {
              break;
            }
            throw new b.a.a.b("Not all required fields were included: apkMd5");
          }
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(14019444342784L, 104453);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14019444342784L, 104453);
          return -1;
        case 1: 
          localb.apkMd5 = locala.csT();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 2: 
          localb.eqV = locala.csR();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 3: 
          localb.eqW = locala.csT();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 4: 
          localb.eqX = locala.csR();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 5: 
          localb.eqY = locala.csT();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 6: 
          localb.eqZ = locala.csT();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 7: 
          localb.era = locala.csU();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        case 8: 
          localb.erb = locala.csR();
          GMTrace.o(14019444342784L, 104453);
          return 0;
        }
        localb.erc = locala.csU();
        GMTrace.o(14019444342784L, 104453);
        return 0;
      }
      GMTrace.o(14019444342784L, 104453);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */