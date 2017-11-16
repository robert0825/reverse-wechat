package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsw
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public String tXF;
  public String ugH;
  public String ulE;
  public String vbv;
  
  public bsw()
  {
    GMTrace.i(3891508805632L, 28994);
    GMTrace.o(3891508805632L, 28994);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3891643023360L, 28995);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.ulE == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.ugH == null) {
        throw new b("Not all required fields were included: MD5");
      }
      if (this.tXF == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.ulE != null) {
        paramVarArgs.e(2, this.ulE);
      }
      if (this.ugH != null) {
        paramVarArgs.e(3, this.ugH);
      }
      if (this.tXF != null) {
        paramVarArgs.e(4, this.tXF);
      }
      paramVarArgs.fk(5, this.tOG);
      GMTrace.o(3891643023360L, 28995);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label618;
      }
    }
    label618:
    for (int i = b.a.a.b.b.a.f(1, this.vbv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ulE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ulE);
      }
      i = paramInt;
      if (this.ugH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ugH);
      }
      paramInt = i;
      if (this.tXF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tXF);
      }
      i = b.a.a.a.fh(5, this.tOG);
      GMTrace.o(3891643023360L, 28995);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.ulE == null) {
          throw new b("Not all required fields were included: Text");
        }
        if (this.ugH == null) {
          throw new b("Not all required fields were included: MD5");
        }
        if (this.tXF == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        GMTrace.o(3891643023360L, 28995);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsw localbsw = (bsw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3891643023360L, 28995);
          return -1;
        case 1: 
          localbsw.vbv = locala.yqV.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 2: 
          localbsw.ulE = locala.yqV.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 3: 
          localbsw.ugH = locala.yqV.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        case 4: 
          localbsw.tXF = locala.yqV.readString();
          GMTrace.o(3891643023360L, 28995);
          return 0;
        }
        localbsw.tOG = locala.yqV.nj();
        GMTrace.o(3891643023360L, 28995);
        return 0;
      }
      GMTrace.o(3891643023360L, 28995);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */