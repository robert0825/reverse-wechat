package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bsm
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int lSW;
  public String nIp;
  public int vbH;
  public boolean vbI;
  public boolean vbJ;
  public boolean vbK;
  public com.tencent.mm.bm.b vbn;
  public String vbv;
  
  public bsm()
  {
    GMTrace.i(3686826770432L, 27469);
    GMTrace.o(3686826770432L, 27469);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686960988160L, 27470);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.eBt == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fk(1, this.lSW);
      if (this.vbv != null) {
        paramVarArgs.e(2, this.vbv);
      }
      if (this.eBt != null) {
        paramVarArgs.e(3, this.eBt);
      }
      if (this.nIp != null) {
        paramVarArgs.e(4, this.nIp);
      }
      paramVarArgs.fk(5, this.vbH);
      if (this.vbn != null) {
        paramVarArgs.b(6, this.vbn);
      }
      paramVarArgs.ah(7, this.vbI);
      paramVarArgs.ah(8, this.vbJ);
      paramVarArgs.ah(9, this.vbK);
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lSW) + 0;
      paramInt = i;
      if (this.vbv != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vbv);
      }
      i = paramInt;
      if (this.eBt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eBt);
      }
      paramInt = i;
      if (this.nIp != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.nIp);
      }
      i = paramInt + b.a.a.a.fh(5, this.vbH);
      paramInt = i;
      if (this.vbn != null) {
        paramInt = i + b.a.a.a.a(6, this.vbn);
      }
      i = b.a.a.b.b.a.cK(7);
      int j = b.a.a.b.b.a.cK(8);
      int k = b.a.a.b.b.a.cK(9);
      GMTrace.o(3686960988160L, 27470);
      return paramInt + (i + 1) + (j + 1) + (k + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vbv == null) {
        throw new b.a.a.b("Not all required fields were included: Talker");
      }
      if (this.eBt == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.nIp == null) {
        throw new b.a.a.b("Not all required fields were included: Content");
      }
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bsm localbsm = (bsm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3686960988160L, 27470);
        return -1;
      case 1: 
        localbsm.lSW = locala.yqV.nj();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 2: 
        localbsm.vbv = locala.yqV.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 3: 
        localbsm.eBt = locala.yqV.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 4: 
        localbsm.nIp = locala.yqV.readString();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 5: 
        localbsm.vbH = locala.yqV.nj();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 6: 
        localbsm.vbn = locala.csV();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 7: 
        localbsm.vbI = locala.csU();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      case 8: 
        localbsm.vbJ = locala.csU();
        GMTrace.o(3686960988160L, 27470);
        return 0;
      }
      localbsm.vbK = locala.csU();
      GMTrace.o(3686960988160L, 27470);
      return 0;
    }
    GMTrace.o(3686960988160L, 27470);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */