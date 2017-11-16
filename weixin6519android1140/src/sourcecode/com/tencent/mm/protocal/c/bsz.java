package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsz
  extends com.tencent.mm.bm.a
{
  public int jhc;
  public int jib;
  public String lSX;
  public int nFd;
  public String tQb;
  public int uEe;
  public int vbR;
  
  public bsz()
  {
    GMTrace.i(3914325819392L, 29164);
    GMTrace.o(3914325819392L, 29164);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3914460037120L, 29165);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSX != null) {
        paramVarArgs.e(1, this.lSX);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.jhc);
      paramVarArgs.fk(4, this.nFd);
      paramVarArgs.fk(5, this.uEe);
      if (this.tQb != null) {
        paramVarArgs.e(6, this.tQb);
      }
      paramVarArgs.fk(7, this.vbR);
      GMTrace.o(3914460037120L, 29165);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lSX == null) {
        break label546;
      }
    }
    label546:
    for (paramInt = b.a.a.b.b.a.f(1, this.lSX) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.jib) + b.a.a.a.fh(3, this.jhc) + b.a.a.a.fh(4, this.nFd) + b.a.a.a.fh(5, this.uEe);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQb);
      }
      i = b.a.a.a.fh(7, this.vbR);
      GMTrace.o(3914460037120L, 29165);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3914460037120L, 29165);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsz localbsz = (bsz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3914460037120L, 29165);
          return -1;
        case 1: 
          localbsz.lSX = locala.yqV.readString();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 2: 
          localbsz.jib = locala.yqV.nj();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 3: 
          localbsz.jhc = locala.yqV.nj();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 4: 
          localbsz.nFd = locala.yqV.nj();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 5: 
          localbsz.uEe = locala.yqV.nj();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        case 6: 
          localbsz.tQb = locala.yqV.readString();
          GMTrace.o(3914460037120L, 29165);
          return 0;
        }
        localbsz.vbR = locala.yqV.nj();
        GMTrace.o(3914460037120L, 29165);
        return 0;
      }
      GMTrace.o(3914460037120L, 29165);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */