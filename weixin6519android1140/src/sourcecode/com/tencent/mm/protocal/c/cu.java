package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class cu
  extends com.tencent.mm.bm.a
{
  public String tQK;
  public String tQL;
  
  public cu()
  {
    GMTrace.i(3733266104320L, 27815);
    GMTrace.o(3733266104320L, 27815);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3733400322048L, 27816);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQK != null) {
        paramVarArgs.e(1, this.tQK);
      }
      if (this.tQL != null) {
        paramVarArgs.e(2, this.tQL);
      }
      GMTrace.o(3733400322048L, 27816);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tQK == null) {
        break label306;
      }
    }
    label306:
    for (paramInt = b.a.a.b.b.a.f(1, this.tQK) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tQL != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQL);
      }
      GMTrace.o(3733400322048L, 27816);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3733400322048L, 27816);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cu localcu = (cu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3733400322048L, 27816);
          return -1;
        case 1: 
          localcu.tQK = locala.yqV.readString();
          GMTrace.o(3733400322048L, 27816);
          return 0;
        }
        localcu.tQL = locala.yqV.readString();
        GMTrace.o(3733400322048L, 27816);
        return 0;
      }
      GMTrace.o(3733400322048L, 27816);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */