package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aq
  extends com.tencent.mm.bm.a
{
  public String lQa;
  public String tOD;
  public String tOE;
  public String tOF;
  
  public aq()
  {
    GMTrace.i(3798361702400L, 28300);
    GMTrace.o(3798361702400L, 28300);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3798495920128L, 28301);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa != null) {
        paramVarArgs.e(1, this.lQa);
      }
      if (this.tOD != null) {
        paramVarArgs.e(2, this.tOD);
      }
      if (this.tOE != null) {
        paramVarArgs.e(3, this.tOE);
      }
      if (this.tOF != null) {
        paramVarArgs.e(4, this.tOF);
      }
      GMTrace.o(3798495920128L, 28301);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lQa == null) {
        break label434;
      }
    }
    label434:
    for (int i = b.a.a.b.b.a.f(1, this.lQa) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tOD != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tOD);
      }
      i = paramInt;
      if (this.tOE != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tOE);
      }
      paramInt = i;
      if (this.tOF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tOF);
      }
      GMTrace.o(3798495920128L, 28301);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3798495920128L, 28301);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aq localaq = (aq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3798495920128L, 28301);
          return -1;
        case 1: 
          localaq.lQa = locala.yqV.readString();
          GMTrace.o(3798495920128L, 28301);
          return 0;
        case 2: 
          localaq.tOD = locala.yqV.readString();
          GMTrace.o(3798495920128L, 28301);
          return 0;
        case 3: 
          localaq.tOE = locala.yqV.readString();
          GMTrace.o(3798495920128L, 28301);
          return 0;
        }
        localaq.tOF = locala.yqV.readString();
        GMTrace.o(3798495920128L, 28301);
        return 0;
      }
      GMTrace.o(3798495920128L, 28301);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */