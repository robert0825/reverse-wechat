package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class nt
  extends com.tencent.mm.bm.a
{
  public String eCC;
  public String eCD;
  public int uew;
  public int uex;
  public String uey;
  public int version;
  
  public nt()
  {
    GMTrace.i(3891777241088L, 28996);
    GMTrace.o(3891777241088L, 28996);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891911458816L, 28997);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.version);
      paramVarArgs.fk(2, this.uew);
      paramVarArgs.fk(3, this.uex);
      if (this.eCD != null) {
        paramVarArgs.e(4, this.eCD);
      }
      if (this.uey != null) {
        paramVarArgs.e(5, this.uey);
      }
      if (this.eCC != null) {
        paramVarArgs.e(6, this.eCC);
      }
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.version) + 0 + b.a.a.a.fh(2, this.uew) + b.a.a.a.fh(3, this.uex);
      paramInt = i;
      if (this.eCD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.eCD);
      }
      i = paramInt;
      if (this.uey != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uey);
      }
      paramInt = i;
      if (this.eCC != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.eCC);
      }
      GMTrace.o(3891911458816L, 28997);
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
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      nt localnt = (nt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3891911458816L, 28997);
        return -1;
      case 1: 
        localnt.version = locala.yqV.nj();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 2: 
        localnt.uew = locala.yqV.nj();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 3: 
        localnt.uex = locala.yqV.nj();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 4: 
        localnt.eCD = locala.yqV.readString();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      case 5: 
        localnt.uey = locala.yqV.readString();
        GMTrace.o(3891911458816L, 28997);
        return 0;
      }
      localnt.eCC = locala.yqV.readString();
      GMTrace.o(3891911458816L, 28997);
      return 0;
    }
    GMTrace.o(3891911458816L, 28997);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */