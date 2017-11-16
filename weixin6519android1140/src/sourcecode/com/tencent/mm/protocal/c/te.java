package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class te
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public String jhi;
  public String jio;
  public String uhb;
  public String ujf;
  
  public te()
  {
    GMTrace.i(3837419061248L, 28591);
    GMTrace.o(3837419061248L, 28591);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3837553278976L, 28592);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.ujf != null) {
        paramVarArgs.e(2, this.ujf);
      }
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      if (this.uhb != null) {
        paramVarArgs.e(4, this.uhb);
      }
      paramVarArgs.fk(5, this.jhA);
      GMTrace.o(3837553278976L, 28592);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label482;
      }
    }
    label482:
    for (int i = b.a.a.b.b.a.f(1, this.jhi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ujf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ujf);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jio);
      }
      paramInt = i;
      if (this.uhb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uhb);
      }
      i = b.a.a.a.fh(5, this.jhA);
      GMTrace.o(3837553278976L, 28592);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3837553278976L, 28592);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        te localte = (te)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3837553278976L, 28592);
          return -1;
        case 1: 
          localte.jhi = locala.yqV.readString();
          GMTrace.o(3837553278976L, 28592);
          return 0;
        case 2: 
          localte.ujf = locala.yqV.readString();
          GMTrace.o(3837553278976L, 28592);
          return 0;
        case 3: 
          localte.jio = locala.yqV.readString();
          GMTrace.o(3837553278976L, 28592);
          return 0;
        case 4: 
          localte.uhb = locala.yqV.readString();
          GMTrace.o(3837553278976L, 28592);
          return 0;
        }
        localte.jhA = locala.yqV.nj();
        GMTrace.o(3837553278976L, 28592);
        return 0;
      }
      GMTrace.o(3837553278976L, 28592);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\te.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */