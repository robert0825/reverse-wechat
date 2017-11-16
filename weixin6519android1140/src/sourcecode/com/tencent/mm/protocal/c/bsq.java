package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsq
  extends com.tencent.mm.bm.a
{
  public int uTi;
  public String vaw;
  public com.tencent.mm.bm.b vbL;
  public com.tencent.mm.bm.b vbM;
  public String vbN;
  public String vbO;
  
  public bsq()
  {
    GMTrace.i(3846814302208L, 28661);
    GMTrace.o(3846814302208L, 28661);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3846948519936L, 28662);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vaw == null) {
        throw new b.a.a.b("Not all required fields were included: Msg");
      }
      paramVarArgs.fk(1, this.uTi);
      if (this.vaw != null) {
        paramVarArgs.e(2, this.vaw);
      }
      if (this.vbL != null) {
        paramVarArgs.b(3, this.vbL);
      }
      if (this.vbM != null) {
        paramVarArgs.b(4, this.vbM);
      }
      if (this.vbN != null) {
        paramVarArgs.e(5, this.vbN);
      }
      if (this.vbO != null) {
        paramVarArgs.e(6, this.vbO);
      }
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uTi) + 0;
      paramInt = i;
      if (this.vaw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vaw);
      }
      i = paramInt;
      if (this.vbL != null) {
        i = paramInt + b.a.a.a.a(3, this.vbL);
      }
      paramInt = i;
      if (this.vbM != null) {
        paramInt = i + b.a.a.a.a(4, this.vbM);
      }
      i = paramInt;
      if (this.vbN != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.vbN);
      }
      paramInt = i;
      if (this.vbO != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.vbO);
      }
      GMTrace.o(3846948519936L, 28662);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vaw == null) {
        throw new b.a.a.b("Not all required fields were included: Msg");
      }
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsq localbsq = (bsq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3846948519936L, 28662);
        return -1;
      case 1: 
        localbsq.uTi = locala.yqV.nj();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 2: 
        localbsq.vaw = locala.yqV.readString();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 3: 
        localbsq.vbL = locala.csV();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 4: 
        localbsq.vbM = locala.csV();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      case 5: 
        localbsq.vbN = locala.yqV.readString();
        GMTrace.o(3846948519936L, 28662);
        return 0;
      }
      localbsq.vbO = locala.yqV.readString();
      GMTrace.o(3846948519936L, 28662);
      return 0;
    }
    GMTrace.o(3846948519936L, 28662);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */