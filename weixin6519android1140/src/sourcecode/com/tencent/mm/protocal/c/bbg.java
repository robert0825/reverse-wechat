package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bbg
  extends com.tencent.mm.bm.a
{
  public int uOA;
  public int uOB;
  public int uOC;
  public int uOD;
  public int uOE;
  public int uOy;
  public int uOz;
  public com.tencent.mm.bm.b ugp;
  
  public bbg()
  {
    GMTrace.i(4049617289216L, 30172);
    GMTrace.o(4049617289216L, 30172);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4049751506944L, 30173);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugp == null) {
        throw new b.a.a.b("Not all required fields were included: data");
      }
      paramVarArgs.fk(1, this.uOy);
      paramVarArgs.fk(2, this.uOz);
      paramVarArgs.fk(3, this.uOA);
      paramVarArgs.fk(4, this.uOB);
      paramVarArgs.fk(5, this.uOC);
      paramVarArgs.fk(6, this.uOD);
      paramVarArgs.fk(7, this.uOE);
      if (this.ugp != null) {
        paramVarArgs.b(8, this.ugp);
      }
      GMTrace.o(4049751506944L, 30173);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uOy) + 0 + b.a.a.a.fh(2, this.uOz) + b.a.a.a.fh(3, this.uOA) + b.a.a.a.fh(4, this.uOB) + b.a.a.a.fh(5, this.uOC) + b.a.a.a.fh(6, this.uOD) + b.a.a.a.fh(7, this.uOE);
      paramInt = i;
      if (this.ugp != null) {
        paramInt = i + b.a.a.a.a(8, this.ugp);
      }
      GMTrace.o(4049751506944L, 30173);
      return paramInt;
    }
    b.a.a.a.a locala;
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      locala = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(locala); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(locala)) {
        if (!super.a(locala, this, paramInt)) {
          locala.csW();
        }
      }
      if (paramVarArgs == null) {
        throw new b.a.a.b("Not all required fields were included: data");
      }
      GMTrace.o(4049751506944L, 30173);
      return 0;
    }
    if (paramInt == 3)
    {
      locala = (b.a.a.a.a)paramVarArgs[0];
      bbg localbbg = (bbg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4049751506944L, 30173);
        return -1;
      case 1: 
        localbbg.uOy = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 2: 
        localbbg.uOz = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 3: 
        localbbg.uOA = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 4: 
        localbbg.uOB = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 5: 
        localbbg.uOC = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 6: 
        localbbg.uOD = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      case 7: 
        localbbg.uOE = locala.yqV.nj();
        GMTrace.o(4049751506944L, 30173);
        return 0;
      }
      localbbg.ugp = locala.csV();
      GMTrace.o(4049751506944L, 30173);
      return 0;
    }
    GMTrace.o(4049751506944L, 30173);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */