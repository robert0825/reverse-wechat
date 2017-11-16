package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class eb
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public String jhi;
  public String jio;
  public String lTf;
  public int luA;
  public int tSG;
  public String tSH;
  public String tSI;
  
  public eb()
  {
    GMTrace.i(3778363260928L, 28151);
    GMTrace.o(3778363260928L, 28151);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3778497478656L, 28152);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lTf != null) {
        paramVarArgs.e(1, this.lTf);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      paramVarArgs.fk(4, this.tSG);
      if (this.tSH != null) {
        paramVarArgs.e(5, this.tSH);
      }
      if (this.gCA != null) {
        paramVarArgs.e(6, this.gCA);
      }
      if (this.tSI != null) {
        paramVarArgs.e(7, this.tSI);
      }
      paramVarArgs.fk(8, this.luA);
      GMTrace.o(3778497478656L, 28152);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lTf == null) {
        break label666;
      }
    }
    label666:
    for (int i = b.a.a.b.b.a.f(1, this.lTf) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhi);
      }
      i += b.a.a.a.fh(4, this.tSG);
      paramInt = i;
      if (this.tSH != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tSH);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.gCA);
      }
      paramInt = i;
      if (this.tSI != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tSI);
      }
      i = b.a.a.a.fh(8, this.luA);
      GMTrace.o(3778497478656L, 28152);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3778497478656L, 28152);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        eb localeb = (eb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3778497478656L, 28152);
          return -1;
        case 1: 
          localeb.lTf = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 2: 
          localeb.jio = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 3: 
          localeb.jhi = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 4: 
          localeb.tSG = locala.yqV.nj();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 5: 
          localeb.tSH = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 6: 
          localeb.gCA = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        case 7: 
          localeb.tSI = locala.yqV.readString();
          GMTrace.o(3778497478656L, 28152);
          return 0;
        }
        localeb.luA = locala.yqV.nj();
        GMTrace.o(3778497478656L, 28152);
        return 0;
      }
      GMTrace.o(3778497478656L, 28152);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */