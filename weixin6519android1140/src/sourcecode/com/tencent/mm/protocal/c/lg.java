package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class lg
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public String jio;
  public String ubU;
  public String ubV;
  public String ubW;
  public int ubX;
  public String ubY;
  
  public lg()
  {
    GMTrace.i(13343255429120L, 99415);
    GMTrace.o(13343255429120L, 99415);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13343389646848L, 99416);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.ubU != null) {
        paramVarArgs.e(3, this.ubU);
      }
      if (this.ubV != null) {
        paramVarArgs.e(4, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(5, this.ubW);
      }
      paramVarArgs.fk(6, this.ubX);
      if (this.ubY != null) {
        paramVarArgs.e(7, this.ubY);
      }
      GMTrace.o(13343389646848L, 99416);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label601;
      }
    }
    label601:
    for (int i = b.a.a.b.b.a.f(1, this.jhi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.ubU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubU);
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ubW);
      }
      i += b.a.a.a.fh(6, this.ubX);
      paramInt = i;
      if (this.ubY != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ubY);
      }
      GMTrace.o(13343389646848L, 99416);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13343389646848L, 99416);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        lg locallg = (lg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13343389646848L, 99416);
          return -1;
        case 1: 
          locallg.jhi = locala.yqV.readString();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        case 2: 
          locallg.jio = locala.yqV.readString();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        case 3: 
          locallg.ubU = locala.yqV.readString();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        case 4: 
          locallg.ubV = locala.yqV.readString();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        case 5: 
          locallg.ubW = locala.yqV.readString();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        case 6: 
          locallg.ubX = locala.yqV.nj();
          GMTrace.o(13343389646848L, 99416);
          return 0;
        }
        locallg.ubY = locala.yqV.readString();
        GMTrace.o(13343389646848L, 99416);
        return 0;
      }
      GMTrace.o(13343389646848L, 99416);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\lg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */