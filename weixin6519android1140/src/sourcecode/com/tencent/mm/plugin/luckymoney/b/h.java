package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;

public final class h
  extends com.tencent.mm.bm.a
{
  public String mFr;
  public String mII;
  public long mIJ;
  public String mIK;
  public String mIL;
  public String mIM;
  public long mIN;
  public int mIO;
  public int mIb;
  public String mIh;
  public long mIk;
  public long mIm;
  public String mIn;
  public int mIy;
  public int status;
  
  public h()
  {
    GMTrace.i(9736959295488L, 72546);
    GMTrace.o(9736959295488L, 72546);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9737093513216L, 72547);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mII != null) {
        paramVarArgs.e(1, this.mII);
      }
      if (this.mIh != null) {
        paramVarArgs.e(2, this.mIh);
      }
      paramVarArgs.T(3, this.mIJ);
      if (this.mIK != null) {
        paramVarArgs.e(4, this.mIK);
      }
      paramVarArgs.fk(5, this.mIb);
      if (this.mIL != null) {
        paramVarArgs.e(6, this.mIL);
      }
      if (this.mIM != null) {
        paramVarArgs.e(7, this.mIM);
      }
      paramVarArgs.T(8, this.mIm);
      paramVarArgs.T(9, this.mIN);
      paramVarArgs.T(10, this.mIk);
      paramVarArgs.fk(11, this.status);
      paramVarArgs.fk(12, this.mIO);
      if (this.mIn != null) {
        paramVarArgs.e(13, this.mIn);
      }
      if (this.mFr != null) {
        paramVarArgs.e(14, this.mFr);
      }
      paramVarArgs.fk(15, this.mIy);
      GMTrace.o(9737093513216L, 72547);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mII == null) {
        break label1001;
      }
    }
    label1001:
    for (paramInt = b.a.a.b.b.a.f(1, this.mII) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.mIh != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.mIh);
      }
      i += b.a.a.a.S(3, this.mIJ);
      paramInt = i;
      if (this.mIK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mIK);
      }
      i = paramInt + b.a.a.a.fh(5, this.mIb);
      paramInt = i;
      if (this.mIL != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mIL);
      }
      i = paramInt;
      if (this.mIM != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mIM);
      }
      i = i + b.a.a.a.S(8, this.mIm) + b.a.a.a.S(9, this.mIN) + b.a.a.a.S(10, this.mIk) + b.a.a.a.fh(11, this.status) + b.a.a.a.fh(12, this.mIO);
      paramInt = i;
      if (this.mIn != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.mIn);
      }
      i = paramInt;
      if (this.mFr != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.mFr);
      }
      paramInt = b.a.a.a.fh(15, this.mIy);
      GMTrace.o(9737093513216L, 72547);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(9737093513216L, 72547);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        h localh = (h)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(9737093513216L, 72547);
          return -1;
        case 1: 
          localh.mII = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 2: 
          localh.mIh = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 3: 
          localh.mIJ = locala.yqV.nk();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 4: 
          localh.mIK = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 5: 
          localh.mIb = locala.yqV.nj();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 6: 
          localh.mIL = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 7: 
          localh.mIM = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 8: 
          localh.mIm = locala.yqV.nk();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 9: 
          localh.mIN = locala.yqV.nk();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 10: 
          localh.mIk = locala.yqV.nk();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 11: 
          localh.status = locala.yqV.nj();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 12: 
          localh.mIO = locala.yqV.nj();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 13: 
          localh.mIn = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        case 14: 
          localh.mFr = locala.yqV.readString();
          GMTrace.o(9737093513216L, 72547);
          return 0;
        }
        localh.mIy = locala.yqV.nj();
        GMTrace.o(9737093513216L, 72547);
        return 0;
      }
      GMTrace.o(9737093513216L, 72547);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */