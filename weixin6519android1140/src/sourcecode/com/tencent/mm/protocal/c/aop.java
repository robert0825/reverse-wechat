package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aop
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int oqH;
  public int uEm;
  public String ufz;
  
  public aop()
  {
    GMTrace.i(3721991815168L, 27731);
    GMTrace.o(3721991815168L, 27731);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3722126032896L, 27732);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufz != null) {
        paramVarArgs.e(1, this.ufz);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.uEm);
      paramVarArgs.fk(4, this.oqH);
      GMTrace.o(3722126032896L, 27732);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ufz == null) {
        break label406;
      }
    }
    label406:
    for (paramInt = b.a.a.b.b.a.f(1, this.ufz) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      paramInt = b.a.a.a.fh(3, this.uEm);
      int j = b.a.a.a.fh(4, this.oqH);
      GMTrace.o(3722126032896L, 27732);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3722126032896L, 27732);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aop localaop = (aop)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3722126032896L, 27732);
          return -1;
        case 1: 
          localaop.ufz = locala.yqV.readString();
          GMTrace.o(3722126032896L, 27732);
          return 0;
        case 2: 
          localaop.jhi = locala.yqV.readString();
          GMTrace.o(3722126032896L, 27732);
          return 0;
        case 3: 
          localaop.uEm = locala.yqV.nj();
          GMTrace.o(3722126032896L, 27732);
          return 0;
        }
        localaop.oqH = locala.yqV.nj();
        GMTrace.o(3722126032896L, 27732);
        return 0;
      }
      GMTrace.o(3722126032896L, 27732);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */