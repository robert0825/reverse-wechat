package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqj
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPj;
  public String mmS;
  public int tPM;
  public String tRS;
  public String uJL;
  public String vay;
  
  public bqj()
  {
    GMTrace.i(15000441716736L, 111762);
    GMTrace.o(15000441716736L, 111762);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15000575934464L, 111763);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.uJL != null) {
        paramVarArgs.e(2, this.uJL);
      }
      if (this.mmS != null) {
        paramVarArgs.e(3, this.mmS);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.vay != null) {
        paramVarArgs.e(5, this.vay);
      }
      paramVarArgs.fk(6, this.tPM);
      if (this.tRS != null) {
        paramVarArgs.e(7, this.tRS);
      }
      GMTrace.o(15000575934464L, 111763);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label601;
      }
    }
    label601:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uJL != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uJL);
      }
      i = paramInt;
      if (this.mmS != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.mmS);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.vay != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.vay);
      }
      i += b.a.a.a.fh(6, this.tPM);
      paramInt = i;
      if (this.tRS != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tRS);
      }
      GMTrace.o(15000575934464L, 111763);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15000575934464L, 111763);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqj localbqj = (bqj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15000575934464L, 111763);
          return -1;
        case 1: 
          localbqj.eBt = locala.yqV.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 2: 
          localbqj.uJL = locala.yqV.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 3: 
          localbqj.mmS = locala.yqV.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 4: 
          localbqj.lPj = locala.yqV.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 5: 
          localbqj.vay = locala.yqV.readString();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        case 6: 
          localbqj.tPM = locala.yqV.nj();
          GMTrace.o(15000575934464L, 111763);
          return 0;
        }
        localbqj.tRS = locala.yqV.readString();
        GMTrace.o(15000575934464L, 111763);
        return 0;
      }
      GMTrace.o(15000575934464L, 111763);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */