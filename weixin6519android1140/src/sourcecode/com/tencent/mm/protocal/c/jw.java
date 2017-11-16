package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jw
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int tPN;
  public String uar;
  public long uas;
  public int uat;
  
  public jw()
  {
    GMTrace.i(3860772945920L, 28765);
    GMTrace.o(3860772945920L, 28765);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3860907163648L, 28766);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uar != null) {
        paramVarArgs.e(1, this.uar);
      }
      paramVarArgs.T(2, this.uas);
      paramVarArgs.fk(3, this.uat);
      paramVarArgs.fk(4, this.tPN);
      paramVarArgs.fk(5, this.jhA);
      GMTrace.o(3860907163648L, 28766);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uar == null) {
        break label442;
      }
    }
    label442:
    for (paramInt = b.a.a.b.b.a.f(1, this.uar) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.S(2, this.uas);
      int j = b.a.a.a.fh(3, this.uat);
      int k = b.a.a.a.fh(4, this.tPN);
      int m = b.a.a.a.fh(5, this.jhA);
      GMTrace.o(3860907163648L, 28766);
      return paramInt + i + j + k + m;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3860907163648L, 28766);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jw localjw = (jw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3860907163648L, 28766);
          return -1;
        case 1: 
          localjw.uar = locala.yqV.readString();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 2: 
          localjw.uas = locala.yqV.nk();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 3: 
          localjw.uat = locala.yqV.nj();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        case 4: 
          localjw.tPN = locala.yqV.nj();
          GMTrace.o(3860907163648L, 28766);
          return 0;
        }
        localjw.jhA = locala.yqV.nj();
        GMTrace.o(3860907163648L, 28766);
        return 0;
      }
      GMTrace.o(3860907163648L, 28766);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */