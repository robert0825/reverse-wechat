package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cs
  extends com.tencent.mm.bm.a
{
  public String jhO;
  public String lRT;
  public String mmR;
  public String tQE;
  public String tQF;
  public int tQG;
  
  public cs()
  {
    GMTrace.i(3887213838336L, 28962);
    GMTrace.o(3887213838336L, 28962);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3887348056064L, 28963);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mmR != null) {
        paramVarArgs.e(1, this.mmR);
      }
      if (this.jhO != null) {
        paramVarArgs.e(2, this.jhO);
      }
      if (this.lRT != null) {
        paramVarArgs.e(3, this.lRT);
      }
      if (this.tQE != null) {
        paramVarArgs.e(4, this.tQE);
      }
      if (this.tQF != null) {
        paramVarArgs.e(5, this.tQF);
      }
      paramVarArgs.fk(6, this.tQG);
      GMTrace.o(3887348056064L, 28963);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mmR == null) {
        break label550;
      }
    }
    label550:
    for (int i = b.a.a.b.b.a.f(1, this.mmR) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhO != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhO);
      }
      i = paramInt;
      if (this.lRT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lRT);
      }
      paramInt = i;
      if (this.tQE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tQE);
      }
      i = paramInt;
      if (this.tQF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tQF);
      }
      paramInt = b.a.a.a.fh(6, this.tQG);
      GMTrace.o(3887348056064L, 28963);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3887348056064L, 28963);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cs localcs = (cs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3887348056064L, 28963);
          return -1;
        case 1: 
          localcs.mmR = locala.yqV.readString();
          GMTrace.o(3887348056064L, 28963);
          return 0;
        case 2: 
          localcs.jhO = locala.yqV.readString();
          GMTrace.o(3887348056064L, 28963);
          return 0;
        case 3: 
          localcs.lRT = locala.yqV.readString();
          GMTrace.o(3887348056064L, 28963);
          return 0;
        case 4: 
          localcs.tQE = locala.yqV.readString();
          GMTrace.o(3887348056064L, 28963);
          return 0;
        case 5: 
          localcs.tQF = locala.yqV.readString();
          GMTrace.o(3887348056064L, 28963);
          return 0;
        }
        localcs.tQG = locala.yqV.nj();
        GMTrace.o(3887348056064L, 28963);
        return 0;
      }
      GMTrace.o(3887348056064L, 28963);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */