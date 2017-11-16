package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class brl
  extends com.tencent.mm.bm.a
{
  public String jhm;
  public String tSz;
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public String vbi;
  public String vbj;
  public String vbk;
  
  public brl()
  {
    GMTrace.i(16742453608448L, 124741);
    GMTrace.o(16742453608448L, 124741);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16742587826176L, 124742);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSz != null) {
        paramVarArgs.e(1, this.tSz);
      }
      if (this.tWE != null) {
        paramVarArgs.e(2, this.tWE);
      }
      if (this.tWD != null) {
        paramVarArgs.e(3, this.tWD);
      }
      if (this.jhm != null) {
        paramVarArgs.e(4, this.jhm);
      }
      if (this.vbi != null) {
        paramVarArgs.e(5, this.vbi);
      }
      if (this.tWF != null) {
        paramVarArgs.e(6, this.tWF);
      }
      if (this.tWG != null) {
        paramVarArgs.e(7, this.tWG);
      }
      if (this.vbj != null) {
        paramVarArgs.e(8, this.vbj);
      }
      if (this.vbk != null) {
        paramVarArgs.e(9, this.vbk);
      }
      GMTrace.o(16742587826176L, 124742);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tSz == null) {
        break label747;
      }
    }
    label747:
    for (int i = b.a.a.b.b.a.f(1, this.tSz) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tWE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWE);
      }
      i = paramInt;
      if (this.tWD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tWD);
      }
      paramInt = i;
      if (this.jhm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jhm);
      }
      i = paramInt;
      if (this.vbi != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.vbi);
      }
      paramInt = i;
      if (this.tWF != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tWF);
      }
      i = paramInt;
      if (this.tWG != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tWG);
      }
      paramInt = i;
      if (this.vbj != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.vbj);
      }
      i = paramInt;
      if (this.vbk != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.vbk);
      }
      GMTrace.o(16742587826176L, 124742);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(16742587826176L, 124742);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        brl localbrl = (brl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(16742587826176L, 124742);
          return -1;
        case 1: 
          localbrl.tSz = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 2: 
          localbrl.tWE = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 3: 
          localbrl.tWD = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 4: 
          localbrl.jhm = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 5: 
          localbrl.vbi = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 6: 
          localbrl.tWF = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 7: 
          localbrl.tWG = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        case 8: 
          localbrl.vbj = locala.yqV.readString();
          GMTrace.o(16742587826176L, 124742);
          return 0;
        }
        localbrl.vbk = locala.yqV.readString();
        GMTrace.o(16742587826176L, 124742);
        return 0;
      }
      GMTrace.o(16742587826176L, 124742);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\brl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */