package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;

public final class l
  extends com.tencent.mm.bm.a
{
  public int glA;
  public int glB;
  public String glC;
  public String glD;
  public int glE;
  public int glF;
  public String glG;
  public String glH;
  public String glI;
  public String glJ;
  public String glv;
  public String glw;
  public String glx;
  public String gly;
  public String glz;
  public long time;
  public String title;
  public int type;
  public String url;
  
  public l()
  {
    GMTrace.i(311250911232L, 2319);
    GMTrace.o(311250911232L, 2319);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(311385128960L, 2320);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.glv != null) {
        paramVarArgs.e(3, this.glv);
      }
      if (this.glw != null) {
        paramVarArgs.e(4, this.glw);
      }
      paramVarArgs.T(5, this.time);
      if (this.glx != null) {
        paramVarArgs.e(6, this.glx);
      }
      if (this.gly != null) {
        paramVarArgs.e(7, this.gly);
      }
      if (this.glz != null) {
        paramVarArgs.e(8, this.glz);
      }
      paramVarArgs.fk(9, this.type);
      paramVarArgs.fk(10, this.glA);
      paramVarArgs.fk(11, this.glB);
      if (this.glC != null) {
        paramVarArgs.e(12, this.glC);
      }
      if (this.glD != null) {
        paramVarArgs.e(13, this.glD);
      }
      paramVarArgs.fk(14, this.glE);
      paramVarArgs.fk(15, this.glF);
      if (this.glG != null) {
        paramVarArgs.e(16, this.glG);
      }
      if (this.glH != null) {
        paramVarArgs.e(17, this.glH);
      }
      if (this.glI != null) {
        paramVarArgs.e(18, this.glI);
      }
      if (this.glJ != null) {
        paramVarArgs.e(19, this.glJ);
      }
      GMTrace.o(311385128960L, 2320);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label1322;
      }
    }
    label1322:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.glv != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.glv);
      }
      paramInt = i;
      if (this.glw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.glw);
      }
      i = paramInt + b.a.a.a.S(5, this.time);
      paramInt = i;
      if (this.glx != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.glx);
      }
      i = paramInt;
      if (this.gly != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.gly);
      }
      paramInt = i;
      if (this.glz != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.glz);
      }
      i = paramInt + b.a.a.a.fh(9, this.type) + b.a.a.a.fh(10, this.glA) + b.a.a.a.fh(11, this.glB);
      paramInt = i;
      if (this.glC != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.glC);
      }
      i = paramInt;
      if (this.glD != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.glD);
      }
      i = i + b.a.a.a.fh(14, this.glE) + b.a.a.a.fh(15, this.glF);
      paramInt = i;
      if (this.glG != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.glG);
      }
      i = paramInt;
      if (this.glH != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.glH);
      }
      paramInt = i;
      if (this.glI != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.glI);
      }
      i = paramInt;
      if (this.glJ != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.glJ);
      }
      GMTrace.o(311385128960L, 2320);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(311385128960L, 2320);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        l locall = (l)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(311385128960L, 2320);
          return -1;
        case 1: 
          locall.title = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 2: 
          locall.url = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 3: 
          locall.glv = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 4: 
          locall.glw = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 5: 
          locall.time = locala.yqV.nk();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 6: 
          locall.glx = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 7: 
          locall.gly = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 8: 
          locall.glz = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 9: 
          locall.type = locala.yqV.nj();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 10: 
          locall.glA = locala.yqV.nj();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 11: 
          locall.glB = locala.yqV.nj();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 12: 
          locall.glC = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 13: 
          locall.glD = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 14: 
          locall.glE = locala.yqV.nj();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 15: 
          locall.glF = locala.yqV.nj();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 16: 
          locall.glG = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 17: 
          locall.glH = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        case 18: 
          locall.glI = locala.yqV.readString();
          GMTrace.o(311385128960L, 2320);
          return 0;
        }
        locall.glJ = locala.yqV.readString();
        GMTrace.o(311385128960L, 2320);
        return 0;
      }
      GMTrace.o(311385128960L, 2320);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\x\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */