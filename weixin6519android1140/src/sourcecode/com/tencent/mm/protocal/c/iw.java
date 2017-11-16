package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class iw
  extends com.tencent.mm.bm.a
{
  public String eQA;
  public String rgU;
  public String rnz;
  public String tXV;
  public String tXW;
  public int tXX;
  public String title;
  public int type;
  public String url;
  
  public iw()
  {
    GMTrace.i(19143742980096L, 142632);
    GMTrace.o(19143742980096L, 142632);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19143877197824L, 142633);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      if (this.rnz != null) {
        paramVarArgs.e(2, this.rnz);
      }
      if (this.eQA != null) {
        paramVarArgs.e(3, this.eQA);
      }
      if (this.title != null) {
        paramVarArgs.e(4, this.title);
      }
      if (this.rgU != null) {
        paramVarArgs.e(5, this.rgU);
      }
      if (this.url != null) {
        paramVarArgs.e(6, this.url);
      }
      if (this.tXV != null) {
        paramVarArgs.e(7, this.tXV);
      }
      if (this.tXW != null) {
        paramVarArgs.e(8, this.tXW);
      }
      paramVarArgs.fk(9, this.tXX);
      GMTrace.o(19143877197824L, 142633);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.type) + 0;
      paramInt = i;
      if (this.rnz != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.rnz);
      }
      i = paramInt;
      if (this.eQA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eQA);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.title);
      }
      i = paramInt;
      if (this.rgU != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.rgU);
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.url);
      }
      i = paramInt;
      if (this.tXV != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tXV);
      }
      paramInt = i;
      if (this.tXW != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tXW);
      }
      i = b.a.a.a.fh(9, this.tXX);
      GMTrace.o(19143877197824L, 142633);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(19143877197824L, 142633);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      iw localiw = (iw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(19143877197824L, 142633);
        return -1;
      case 1: 
        localiw.type = locala.yqV.nj();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 2: 
        localiw.rnz = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 3: 
        localiw.eQA = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 4: 
        localiw.title = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 5: 
        localiw.rgU = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 6: 
        localiw.url = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 7: 
        localiw.tXV = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      case 8: 
        localiw.tXW = locala.yqV.readString();
        GMTrace.o(19143877197824L, 142633);
        return 0;
      }
      localiw.tXX = locala.yqV.nj();
      GMTrace.o(19143877197824L, 142633);
      return 0;
    }
    GMTrace.o(19143877197824L, 142633);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */