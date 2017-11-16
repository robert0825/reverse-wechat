package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aiq
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int uxU;
  
  public aiq()
  {
    GMTrace.i(3913788948480L, 29160);
    GMTrace.o(3913788948480L, 29160);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3913923166208L, 29161);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.uxU);
      GMTrace.o(3913923166208L, 29161);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uxU);
      GMTrace.o(3913923166208L, 29161);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3913923166208L, 29161);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aiq localaiq = (aiq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3913923166208L, 29161);
          return -1;
        case 1: 
          localaiq.jhi = locala.yqV.readString();
          GMTrace.o(3913923166208L, 29161);
          return 0;
        }
        localaiq.uxU = locala.yqV.nj();
        GMTrace.o(3913923166208L, 29161);
        return 0;
      }
      GMTrace.o(3913923166208L, 29161);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */