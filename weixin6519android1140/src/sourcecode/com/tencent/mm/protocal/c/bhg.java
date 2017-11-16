package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhg
  extends com.tencent.mm.bm.a
{
  public int cfz;
  public int gVx;
  public String pLQ;
  public String uTe;
  public String uTf;
  public int uTg;
  
  public bhg()
  {
    GMTrace.i(3675149828096L, 27382);
    GMTrace.o(3675149828096L, 27382);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3675284045824L, 27383);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.gVx);
      if (this.uTe != null) {
        paramVarArgs.e(2, this.uTe);
      }
      if (this.uTf != null) {
        paramVarArgs.e(3, this.uTf);
      }
      paramVarArgs.fk(4, this.cfz);
      if (this.pLQ != null) {
        paramVarArgs.e(5, this.pLQ);
      }
      paramVarArgs.fk(6, this.uTg);
      GMTrace.o(3675284045824L, 27383);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.gVx) + 0;
      paramInt = i;
      if (this.uTe != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uTe);
      }
      i = paramInt;
      if (this.uTf != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uTf);
      }
      i += b.a.a.a.fh(4, this.cfz);
      paramInt = i;
      if (this.pLQ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.pLQ);
      }
      i = b.a.a.a.fh(6, this.uTg);
      GMTrace.o(3675284045824L, 27383);
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
      GMTrace.o(3675284045824L, 27383);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhg localbhg = (bhg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3675284045824L, 27383);
        return -1;
      case 1: 
        localbhg.gVx = locala.yqV.nj();
        GMTrace.o(3675284045824L, 27383);
        return 0;
      case 2: 
        localbhg.uTe = locala.yqV.readString();
        GMTrace.o(3675284045824L, 27383);
        return 0;
      case 3: 
        localbhg.uTf = locala.yqV.readString();
        GMTrace.o(3675284045824L, 27383);
        return 0;
      case 4: 
        localbhg.cfz = locala.yqV.nj();
        GMTrace.o(3675284045824L, 27383);
        return 0;
      case 5: 
        localbhg.pLQ = locala.yqV.readString();
        GMTrace.o(3675284045824L, 27383);
        return 0;
      }
      localbhg.uTg = locala.yqV.nj();
      GMTrace.o(3675284045824L, 27383);
      return 0;
    }
    GMTrace.o(3675284045824L, 27383);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */