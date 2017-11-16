package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahv
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPM;
  public String lRT;
  public String uxo;
  
  public ahv()
  {
    GMTrace.i(3811246604288L, 28396);
    GMTrace.o(3811246604288L, 28396);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3811380822016L, 28397);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPM != null) {
        paramVarArgs.e(1, this.lPM);
      }
      if (this.eBt != null) {
        paramVarArgs.e(2, this.eBt);
      }
      if (this.uxo != null) {
        paramVarArgs.e(3, this.uxo);
      }
      if (this.lRT != null) {
        paramVarArgs.e(4, this.lRT);
      }
      GMTrace.o(3811380822016L, 28397);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPM == null) {
        break label434;
      }
    }
    label434:
    for (int i = b.a.a.b.b.a.f(1, this.lPM) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eBt);
      }
      i = paramInt;
      if (this.uxo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uxo);
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lRT);
      }
      GMTrace.o(3811380822016L, 28397);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3811380822016L, 28397);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahv localahv = (ahv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3811380822016L, 28397);
          return -1;
        case 1: 
          localahv.lPM = locala.yqV.readString();
          GMTrace.o(3811380822016L, 28397);
          return 0;
        case 2: 
          localahv.eBt = locala.yqV.readString();
          GMTrace.o(3811380822016L, 28397);
          return 0;
        case 3: 
          localahv.uxo = locala.yqV.readString();
          GMTrace.o(3811380822016L, 28397);
          return 0;
        }
        localahv.lRT = locala.yqV.readString();
        GMTrace.o(3811380822016L, 28397);
        return 0;
      }
      GMTrace.o(3811380822016L, 28397);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */