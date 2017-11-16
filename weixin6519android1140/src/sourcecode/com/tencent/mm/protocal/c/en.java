package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class en
  extends com.tencent.mm.bm.a
{
  public String jHS;
  public String mhU;
  public String nDt;
  public String rcs;
  public String tTo;
  public String tTp;
  public String tTq;
  public boolean tTr;
  
  public en()
  {
    GMTrace.i(19144548286464L, 142638);
    GMTrace.o(19144548286464L, 142638);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19144682504192L, 142639);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mhU != null) {
        paramVarArgs.e(1, this.mhU);
      }
      if (this.nDt != null) {
        paramVarArgs.e(2, this.nDt);
      }
      if (this.jHS != null) {
        paramVarArgs.e(3, this.jHS);
      }
      if (this.rcs != null) {
        paramVarArgs.e(4, this.rcs);
      }
      if (this.tTo != null) {
        paramVarArgs.e(5, this.tTo);
      }
      if (this.tTp != null) {
        paramVarArgs.e(6, this.tTp);
      }
      if (this.tTq != null) {
        paramVarArgs.e(8, this.tTq);
      }
      paramVarArgs.ah(9, this.tTr);
      GMTrace.o(19144682504192L, 142639);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mhU == null) {
        break label665;
      }
    }
    label665:
    for (int i = b.a.a.b.b.a.f(1, this.mhU) + 0;; i = 0)
    {
      paramInt = i;
      if (this.nDt != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.nDt);
      }
      i = paramInt;
      if (this.jHS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jHS);
      }
      paramInt = i;
      if (this.rcs != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rcs);
      }
      i = paramInt;
      if (this.tTo != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tTo);
      }
      paramInt = i;
      if (this.tTp != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tTp);
      }
      i = paramInt;
      if (this.tTq != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tTq);
      }
      paramInt = b.a.a.b.b.a.cK(9);
      GMTrace.o(19144682504192L, 142639);
      return i + (paramInt + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(19144682504192L, 142639);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        en localen = (en)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 7: 
        default: 
          GMTrace.o(19144682504192L, 142639);
          return -1;
        case 1: 
          localen.mhU = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 2: 
          localen.nDt = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 3: 
          localen.jHS = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 4: 
          localen.rcs = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 5: 
          localen.tTo = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 6: 
          localen.tTp = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        case 8: 
          localen.tTq = locala.yqV.readString();
          GMTrace.o(19144682504192L, 142639);
          return 0;
        }
        localen.tTr = locala.csU();
        GMTrace.o(19144682504192L, 142639);
        return 0;
      }
      GMTrace.o(19144682504192L, 142639);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */