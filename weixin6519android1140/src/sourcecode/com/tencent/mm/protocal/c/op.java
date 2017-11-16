package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class op
  extends com.tencent.mm.bm.a
{
  public int gCL;
  public String gCM;
  public String gCN;
  public String gCO;
  
  public op()
  {
    GMTrace.i(3778900131840L, 28155);
    GMTrace.o(3778900131840L, 28155);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3779034349568L, 28156);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.gCL);
      if (this.gCM != null) {
        paramVarArgs.e(2, this.gCM);
      }
      if (this.gCN != null) {
        paramVarArgs.e(3, this.gCN);
      }
      if (this.gCO != null) {
        paramVarArgs.e(4, this.gCO);
      }
      GMTrace.o(3779034349568L, 28156);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.gCL) + 0;
      paramInt = i;
      if (this.gCM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.gCM);
      }
      i = paramInt;
      if (this.gCN != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gCN);
      }
      paramInt = i;
      if (this.gCO != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gCO);
      }
      GMTrace.o(3779034349568L, 28156);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3779034349568L, 28156);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      op localop = (op)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3779034349568L, 28156);
        return -1;
      case 1: 
        localop.gCL = locala.yqV.nj();
        GMTrace.o(3779034349568L, 28156);
        return 0;
      case 2: 
        localop.gCM = locala.yqV.readString();
        GMTrace.o(3779034349568L, 28156);
        return 0;
      case 3: 
        localop.gCN = locala.yqV.readString();
        GMTrace.o(3779034349568L, 28156);
        return 0;
      }
      localop.gCO = locala.yqV.readString();
      GMTrace.o(3779034349568L, 28156);
      return 0;
    }
    GMTrace.o(3779034349568L, 28156);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */