package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aid
  extends com.tencent.mm.bm.a
{
  public String lPJ;
  public String nIo;
  public int ucS;
  
  public aid()
  {
    GMTrace.i(3746956312576L, 27917);
    GMTrace.o(3746956312576L, 27917);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3747090530304L, 27918);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ucS);
      if (this.nIo != null) {
        paramVarArgs.e(2, this.nIo);
      }
      if (this.lPJ != null) {
        paramVarArgs.e(3, this.lPJ);
      }
      GMTrace.o(3747090530304L, 27918);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.ucS) + 0;
      paramInt = i;
      if (this.nIo != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nIo);
      }
      i = paramInt;
      if (this.lPJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPJ);
      }
      GMTrace.o(3747090530304L, 27918);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3747090530304L, 27918);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aid localaid = (aid)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3747090530304L, 27918);
        return -1;
      case 1: 
        localaid.ucS = locala.yqV.nj();
        GMTrace.o(3747090530304L, 27918);
        return 0;
      case 2: 
        localaid.nIo = locala.yqV.readString();
        GMTrace.o(3747090530304L, 27918);
        return 0;
      }
      localaid.lPJ = locala.yqV.readString();
      GMTrace.o(3747090530304L, 27918);
      return 0;
    }
    GMTrace.o(3747090530304L, 27918);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */