package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public class jz
  extends com.tencent.mm.bm.a
{
  public String jBl;
  public String jxI;
  public String nDw;
  public String tZx;
  public String tZy;
  public String title;
  public long uaJ;
  public String uaK;
  public String uaL;
  public String url;
  
  public jz()
  {
    GMTrace.i(3684410851328L, 27451);
    GMTrace.o(3684410851328L, 27451);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3684545069056L, 27452);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.jxI != null) {
        paramVarArgs.e(2, this.jxI);
      }
      if (this.jBl != null) {
        paramVarArgs.e(3, this.jBl);
      }
      if (this.url != null) {
        paramVarArgs.e(4, this.url);
      }
      paramVarArgs.T(5, this.uaJ);
      if (this.uaK != null) {
        paramVarArgs.e(6, this.uaK);
      }
      if (this.uaL != null) {
        paramVarArgs.e(7, this.uaL);
      }
      if (this.nDw != null) {
        paramVarArgs.e(8, this.nDw);
      }
      if (this.tZx != null) {
        paramVarArgs.e(9, this.tZx);
      }
      if (this.tZy != null) {
        paramVarArgs.e(10, this.tZy);
      }
      GMTrace.o(3684545069056L, 27452);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label814;
      }
    }
    label814:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jxI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jxI);
      }
      i = paramInt;
      if (this.jBl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jBl);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.url);
      }
      i = paramInt + b.a.a.a.S(5, this.uaJ);
      paramInt = i;
      if (this.uaK != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uaK);
      }
      i = paramInt;
      if (this.uaL != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uaL);
      }
      paramInt = i;
      if (this.nDw != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.nDw);
      }
      i = paramInt;
      if (this.tZx != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tZx);
      }
      paramInt = i;
      if (this.tZy != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tZy);
      }
      GMTrace.o(3684545069056L, 27452);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3684545069056L, 27452);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        jz localjz = (jz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3684545069056L, 27452);
          return -1;
        case 1: 
          localjz.title = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 2: 
          localjz.jxI = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 3: 
          localjz.jBl = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 4: 
          localjz.url = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 5: 
          localjz.uaJ = locala.yqV.nk();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 6: 
          localjz.uaK = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 7: 
          localjz.uaL = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 8: 
          localjz.nDw = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        case 9: 
          localjz.tZx = locala.yqV.readString();
          GMTrace.o(3684545069056L, 27452);
          return 0;
        }
        localjz.tZy = locala.yqV.readString();
        GMTrace.o(3684545069056L, 27452);
        return 0;
      }
      GMTrace.o(3684545069056L, 27452);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */