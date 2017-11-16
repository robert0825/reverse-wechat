package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bvj
  extends com.tencent.mm.bm.a
{
  public String lPM;
  public String lTf;
  
  public bvj()
  {
    GMTrace.i(15344039100416L, 114322);
    GMTrace.o(15344039100416L, 114322);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344173318144L, 114323);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lTf != null) {
        paramVarArgs.e(1, this.lTf);
      }
      if (this.lPM != null) {
        paramVarArgs.e(2, this.lPM);
      }
      GMTrace.o(15344173318144L, 114323);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lTf == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.lTf) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPM);
      }
      GMTrace.o(15344173318144L, 114323);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15344173318144L, 114323);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bvj localbvj = (bvj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15344173318144L, 114323);
          return -1;
        case 1: 
          localbvj.lTf = locala.yqV.readString();
          GMTrace.o(15344173318144L, 114323);
          return 0;
        }
        localbvj.lPM = locala.yqV.readString();
        GMTrace.o(15344173318144L, 114323);
        return 0;
      }
      GMTrace.o(15344173318144L, 114323);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */