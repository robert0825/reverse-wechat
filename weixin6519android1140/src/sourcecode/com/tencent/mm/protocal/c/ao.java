package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ao
  extends com.tencent.mm.bm.a
{
  public String jyH;
  public String jyI;
  public String jyJ;
  public String jyK;
  
  public ao()
  {
    GMTrace.i(16868484055040L, 125680);
    GMTrace.o(16868484055040L, 125680);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16868618272768L, 125681);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jyH != null) {
        paramVarArgs.e(1, this.jyH);
      }
      if (this.jyI != null) {
        paramVarArgs.e(2, this.jyI);
      }
      if (this.jyJ != null) {
        paramVarArgs.e(3, this.jyJ);
      }
      if (this.jyK != null) {
        paramVarArgs.e(4, this.jyK);
      }
      GMTrace.o(16868618272768L, 125681);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jyH == null) {
        break label424;
      }
    }
    label424:
    for (int i = b.a.a.b.b.a.f(1, this.jyH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jyI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jyI);
      }
      i = paramInt;
      if (this.jyJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jyJ);
      }
      paramInt = i;
      if (this.jyK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jyK);
      }
      GMTrace.o(16868618272768L, 125681);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(16868618272768L, 125681);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ao localao = (ao)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16868618272768L, 125681);
          return -1;
        case 1: 
          localao.jyH = locala.yqV.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        case 2: 
          localao.jyI = locala.yqV.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        case 3: 
          localao.jyJ = locala.yqV.readString();
          GMTrace.o(16868618272768L, 125681);
          return 0;
        }
        localao.jyK = locala.yqV.readString();
        GMTrace.o(16868618272768L, 125681);
        return 0;
      }
      GMTrace.o(16868618272768L, 125681);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */