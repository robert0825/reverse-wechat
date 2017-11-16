package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class qs
  extends com.tencent.mm.bm.a
{
  public long tQd;
  public int tRC;
  public int tRD;
  public int tST;
  public String ugH;
  public int ugN;
  
  public qs()
  {
    GMTrace.i(3995527544832L, 29769);
    GMTrace.o(3995527544832L, 29769);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3995661762560L, 29770);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.tRD);
      paramVarArgs.fk(3, this.tRC);
      if (this.ugH != null) {
        paramVarArgs.e(4, this.ugH);
      }
      paramVarArgs.fk(5, this.ugN);
      paramVarArgs.T(6, this.tQd);
      GMTrace.o(3995661762560L, 29770);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tST) + 0 + b.a.a.a.fh(2, this.tRD) + b.a.a.a.fh(3, this.tRC);
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugH);
      }
      i = b.a.a.a.fh(5, this.ugN);
      int j = b.a.a.a.S(6, this.tQd);
      GMTrace.o(3995661762560L, 29770);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3995661762560L, 29770);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      qs localqs = (qs)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3995661762560L, 29770);
        return -1;
      case 1: 
        localqs.tST = locala.yqV.nj();
        GMTrace.o(3995661762560L, 29770);
        return 0;
      case 2: 
        localqs.tRD = locala.yqV.nj();
        GMTrace.o(3995661762560L, 29770);
        return 0;
      case 3: 
        localqs.tRC = locala.yqV.nj();
        GMTrace.o(3995661762560L, 29770);
        return 0;
      case 4: 
        localqs.ugH = locala.yqV.readString();
        GMTrace.o(3995661762560L, 29770);
        return 0;
      case 5: 
        localqs.ugN = locala.yqV.nj();
        GMTrace.o(3995661762560L, 29770);
        return 0;
      }
      localqs.tQd = locala.yqV.nk();
      GMTrace.o(3995661762560L, 29770);
      return 0;
    }
    GMTrace.o(3995661762560L, 29770);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */