package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public class ary
  extends com.tencent.mm.bm.a
{
  public String gCy;
  public String gCz;
  public String lPi;
  public String nuV;
  public double tWm;
  public double tWn;
  public String uHS;
  public String uHT;
  public String uHU;
  public String uHV;
  public String ufq;
  public String ufr;
  
  public ary()
  {
    GMTrace.i(3760914956288L, 28021);
    GMTrace.o(3760914956288L, 28021);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3761049174016L, 28022);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.uHS != null) {
        paramVarArgs.e(2, this.uHS);
      }
      paramVarArgs.a(3, this.tWm);
      paramVarArgs.a(4, this.tWn);
      if (this.uHT != null) {
        paramVarArgs.e(5, this.uHT);
      }
      if (this.nuV != null) {
        paramVarArgs.e(6, this.nuV);
      }
      if (this.uHU != null) {
        paramVarArgs.e(7, this.uHU);
      }
      if (this.gCy != null) {
        paramVarArgs.e(8, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(9, this.gCz);
      }
      if (this.ufq != null) {
        paramVarArgs.e(10, this.ufq);
      }
      if (this.ufr != null) {
        paramVarArgs.e(11, this.ufr);
      }
      if (this.uHV != null) {
        paramVarArgs.e(12, this.uHV);
      }
      GMTrace.o(3761049174016L, 28022);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label926;
      }
    }
    label926:
    for (paramInt = b.a.a.b.b.a.f(1, this.lPi) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.uHS != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uHS);
      }
      i = i + (b.a.a.b.b.a.cK(3) + 8) + (b.a.a.b.b.a.cK(4) + 8);
      paramInt = i;
      if (this.uHT != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uHT);
      }
      i = paramInt;
      if (this.nuV != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.nuV);
      }
      paramInt = i;
      if (this.uHU != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uHU);
      }
      i = paramInt;
      if (this.gCy != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.gCy);
      }
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gCz);
      }
      i = paramInt;
      if (this.ufq != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.ufq);
      }
      paramInt = i;
      if (this.ufr != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.ufr);
      }
      i = paramInt;
      if (this.uHV != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uHV);
      }
      GMTrace.o(3761049174016L, 28022);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3761049174016L, 28022);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ary localary = (ary)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3761049174016L, 28022);
          return -1;
        case 1: 
          localary.lPi = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 2: 
          localary.uHS = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 3: 
          localary.tWm = locala.yqV.readDouble();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 4: 
          localary.tWn = locala.yqV.readDouble();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 5: 
          localary.uHT = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 6: 
          localary.nuV = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 7: 
          localary.uHU = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 8: 
          localary.gCy = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 9: 
          localary.gCz = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 10: 
          localary.ufq = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        case 11: 
          localary.ufr = locala.yqV.readString();
          GMTrace.o(3761049174016L, 28022);
          return 0;
        }
        localary.uHV = locala.yqV.readString();
        GMTrace.o(3761049174016L, 28022);
        return 0;
      }
      GMTrace.o(3761049174016L, 28022);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */