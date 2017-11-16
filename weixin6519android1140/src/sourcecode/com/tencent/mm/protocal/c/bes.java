package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bes
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int uAF;
  public String uQv;
  public int uQw;
  public String uQx;
  public int uQy;
  
  public bes()
  {
    GMTrace.i(16867947184128L, 125676);
    GMTrace.o(16867947184128L, 125676);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16868081401856L, 125677);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uQv != null) {
        paramVarArgs.e(1, this.uQv);
      }
      paramVarArgs.fk(2, this.uQw);
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      if (this.uQx != null) {
        paramVarArgs.e(4, this.uQx);
      }
      paramVarArgs.fk(5, this.uAF);
      paramVarArgs.fk(6, this.uQy);
      GMTrace.o(16868081401856L, 125677);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uQv == null) {
        break label506;
      }
    }
    label506:
    for (paramInt = b.a.a.b.b.a.f(1, this.uQv) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uQw);
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jhi);
      }
      i = paramInt;
      if (this.uQx != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uQx);
      }
      paramInt = b.a.a.a.fh(5, this.uAF);
      int j = b.a.a.a.fh(6, this.uQy);
      GMTrace.o(16868081401856L, 125677);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(16868081401856L, 125677);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bes localbes = (bes)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16868081401856L, 125677);
          return -1;
        case 1: 
          localbes.uQv = locala.yqV.readString();
          GMTrace.o(16868081401856L, 125677);
          return 0;
        case 2: 
          localbes.uQw = locala.yqV.nj();
          GMTrace.o(16868081401856L, 125677);
          return 0;
        case 3: 
          localbes.jhi = locala.yqV.readString();
          GMTrace.o(16868081401856L, 125677);
          return 0;
        case 4: 
          localbes.uQx = locala.yqV.readString();
          GMTrace.o(16868081401856L, 125677);
          return 0;
        case 5: 
          localbes.uAF = locala.yqV.nj();
          GMTrace.o(16868081401856L, 125677);
          return 0;
        }
        localbes.uQy = locala.yqV.nj();
        GMTrace.o(16868081401856L, 125677);
        return 0;
      }
      GMTrace.o(16868081401856L, 125677);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */