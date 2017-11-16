package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class anf
  extends com.tencent.mm.bm.a
{
  public boolean uBY;
  public boolean uBZ;
  public int uCa;
  public int uCb;
  public String uCc;
  public boolean uCd;
  
  public anf()
  {
    GMTrace.i(3958617669632L, 29494);
    GMTrace.o(3958617669632L, 29494);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3958751887360L, 29495);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.ah(1, this.uBY);
      paramVarArgs.ah(2, this.uBZ);
      paramVarArgs.fk(3, this.uCa);
      paramVarArgs.fk(4, this.uCb);
      if (this.uCc != null) {
        paramVarArgs.e(5, this.uCc);
      }
      paramVarArgs.ah(6, this.uCd);
      GMTrace.o(3958751887360L, 29495);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 1 + 0 + (b.a.a.b.b.a.cK(2) + 1) + b.a.a.a.fh(3, this.uCa) + b.a.a.a.fh(4, this.uCb);
      paramInt = i;
      if (this.uCc != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uCc);
      }
      i = b.a.a.b.b.a.cK(6);
      GMTrace.o(3958751887360L, 29495);
      return paramInt + (i + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3958751887360L, 29495);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      anf localanf = (anf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3958751887360L, 29495);
        return -1;
      case 1: 
        localanf.uBY = locala.csU();
        GMTrace.o(3958751887360L, 29495);
        return 0;
      case 2: 
        localanf.uBZ = locala.csU();
        GMTrace.o(3958751887360L, 29495);
        return 0;
      case 3: 
        localanf.uCa = locala.yqV.nj();
        GMTrace.o(3958751887360L, 29495);
        return 0;
      case 4: 
        localanf.uCb = locala.yqV.nj();
        GMTrace.o(3958751887360L, 29495);
        return 0;
      case 5: 
        localanf.uCc = locala.yqV.readString();
        GMTrace.o(3958751887360L, 29495);
        return 0;
      }
      localanf.uCd = locala.csU();
      GMTrace.o(3958751887360L, 29495);
      return 0;
    }
    GMTrace.o(3958751887360L, 29495);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */