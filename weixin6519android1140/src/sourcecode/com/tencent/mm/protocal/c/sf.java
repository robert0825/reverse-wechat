package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class sf
  extends com.tencent.mm.bm.a
{
  public int uii;
  public String uij;
  public String uik;
  public String uil;
  
  public sf()
  {
    GMTrace.i(3797287960576L, 28292);
    GMTrace.o(3797287960576L, 28292);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3797422178304L, 28293);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uii);
      if (this.uij != null) {
        paramVarArgs.e(2, this.uij);
      }
      if (this.uil != null) {
        paramVarArgs.e(3, this.uil);
      }
      if (this.uik != null) {
        paramVarArgs.e(4, this.uik);
      }
      GMTrace.o(3797422178304L, 28293);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uii) + 0;
      paramInt = i;
      if (this.uij != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uij);
      }
      i = paramInt;
      if (this.uil != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uil);
      }
      paramInt = i;
      if (this.uik != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uik);
      }
      GMTrace.o(3797422178304L, 28293);
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
      GMTrace.o(3797422178304L, 28293);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      sf localsf = (sf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3797422178304L, 28293);
        return -1;
      case 1: 
        localsf.uii = locala.yqV.nj();
        GMTrace.o(3797422178304L, 28293);
        return 0;
      case 2: 
        localsf.uij = locala.yqV.readString();
        GMTrace.o(3797422178304L, 28293);
        return 0;
      case 3: 
        localsf.uil = locala.yqV.readString();
        GMTrace.o(3797422178304L, 28293);
        return 0;
      }
      localsf.uik = locala.yqV.readString();
      GMTrace.o(3797422178304L, 28293);
      return 0;
    }
    GMTrace.o(3797422178304L, 28293);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */