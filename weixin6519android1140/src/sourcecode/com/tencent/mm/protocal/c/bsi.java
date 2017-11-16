package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsi
  extends com.tencent.mm.bm.a
{
  public int lQc;
  public String nIp;
  public String uBf;
  public long vbB;
  public boolean vbC;
  public com.tencent.mm.bm.b vbD;
  public String vbv;
  public long vbw;
  
  public bsi()
  {
    GMTrace.i(3864262606848L, 28791);
    GMTrace.o(3864262606848L, 28791);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3864396824576L, 28792);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uBf == null) {
        throw new b.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      paramVarArgs.T(1, this.vbw);
      if (this.uBf != null) {
        paramVarArgs.e(2, this.uBf);
      }
      if (this.nIp != null) {
        paramVarArgs.e(3, this.nIp);
      }
      paramVarArgs.fk(4, this.lQc);
      if (this.vbv != null) {
        paramVarArgs.e(5, this.vbv);
      }
      paramVarArgs.T(6, this.vbB);
      paramVarArgs.ah(7, this.vbC);
      if (this.vbD != null) {
        paramVarArgs.b(8, this.vbD);
      }
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.S(1, this.vbw) + 0;
      paramInt = i;
      if (this.uBf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uBf);
      }
      i = paramInt;
      if (this.nIp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nIp);
      }
      i += b.a.a.a.fh(4, this.lQc);
      paramInt = i;
      if (this.vbv != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.vbv);
      }
      i = paramInt + b.a.a.a.S(6, this.vbB) + (b.a.a.b.b.a.cK(7) + 1);
      paramInt = i;
      if (this.vbD != null) {
        paramInt = i + b.a.a.a.a(8, this.vbD);
      }
      GMTrace.o(3864396824576L, 28792);
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
      if (this.uBf == null) {
        throw new b.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsi localbsi = (bsi)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3864396824576L, 28792);
        return -1;
      case 1: 
        localbsi.vbw = locala.yqV.nk();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 2: 
        localbsi.uBf = locala.yqV.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 3: 
        localbsi.nIp = locala.yqV.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 4: 
        localbsi.lQc = locala.yqV.nj();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 5: 
        localbsi.vbv = locala.yqV.readString();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 6: 
        localbsi.vbB = locala.yqV.nk();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      case 7: 
        localbsi.vbC = locala.csU();
        GMTrace.o(3864396824576L, 28792);
        return 0;
      }
      localbsi.vbD = locala.csV();
      GMTrace.o(3864396824576L, 28792);
      return 0;
    }
    GMTrace.o(3864396824576L, 28792);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */