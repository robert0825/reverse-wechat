package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class se
  extends com.tencent.mm.bm.a
{
  public int uii;
  public String uij;
  public String uik;
  public String uil;
  
  public se()
  {
    GMTrace.i(3791919251456L, 28252);
    GMTrace.o(3791919251456L, 28252);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3792053469184L, 28253);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uii);
      if (this.uij != null) {
        paramVarArgs.e(2, this.uij);
      }
      if (this.uik != null) {
        paramVarArgs.e(3, this.uik);
      }
      if (this.uil != null) {
        paramVarArgs.e(4, this.uil);
      }
      GMTrace.o(3792053469184L, 28253);
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
      if (this.uik != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uik);
      }
      paramInt = i;
      if (this.uil != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uil);
      }
      GMTrace.o(3792053469184L, 28253);
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
      GMTrace.o(3792053469184L, 28253);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      se localse = (se)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3792053469184L, 28253);
        return -1;
      case 1: 
        localse.uii = locala.yqV.nj();
        GMTrace.o(3792053469184L, 28253);
        return 0;
      case 2: 
        localse.uij = locala.yqV.readString();
        GMTrace.o(3792053469184L, 28253);
        return 0;
      case 3: 
        localse.uik = locala.yqV.readString();
        GMTrace.o(3792053469184L, 28253);
        return 0;
      }
      localse.uil = locala.yqV.readString();
      GMTrace.o(3792053469184L, 28253);
      return 0;
    }
    GMTrace.o(3792053469184L, 28253);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\se.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */