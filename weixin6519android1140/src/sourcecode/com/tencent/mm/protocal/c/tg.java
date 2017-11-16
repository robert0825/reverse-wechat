package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tg
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public String tYF;
  public int tYG;
  public String uch;
  public String uci;
  public String ucj;
  public int uck;
  public String ujj;
  public String ujk;
  public int ujl;
  
  public tg()
  {
    GMTrace.i(3816346877952L, 28434);
    GMTrace.o(3816346877952L, 28434);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3816481095680L, 28435);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uch != null) {
        paramVarArgs.e(1, this.uch);
      }
      if (this.uci != null) {
        paramVarArgs.e(2, this.uci);
      }
      if (this.ucj != null) {
        paramVarArgs.e(3, this.ucj);
      }
      paramVarArgs.fk(4, this.uck);
      if (this.ujj != null) {
        paramVarArgs.e(5, this.ujj);
      }
      if (this.tYF != null) {
        paramVarArgs.e(6, this.tYF);
      }
      paramVarArgs.fk(7, this.tYG);
      if (this.ujk != null) {
        paramVarArgs.e(8, this.ujk);
      }
      paramVarArgs.fk(9, this.jhA);
      paramVarArgs.fk(10, this.ujl);
      GMTrace.o(3816481095680L, 28435);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uch == null) {
        break label766;
      }
    }
    label766:
    for (int i = b.a.a.b.b.a.f(1, this.uch) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uci != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uci);
      }
      i = paramInt;
      if (this.ucj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ucj);
      }
      i += b.a.a.a.fh(4, this.uck);
      paramInt = i;
      if (this.ujj != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ujj);
      }
      i = paramInt;
      if (this.tYF != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tYF);
      }
      i += b.a.a.a.fh(7, this.tYG);
      paramInt = i;
      if (this.ujk != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ujk);
      }
      i = b.a.a.a.fh(9, this.jhA);
      int j = b.a.a.a.fh(10, this.ujl);
      GMTrace.o(3816481095680L, 28435);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3816481095680L, 28435);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tg localtg = (tg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3816481095680L, 28435);
          return -1;
        case 1: 
          localtg.uch = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 2: 
          localtg.uci = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 3: 
          localtg.ucj = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 4: 
          localtg.uck = locala.yqV.nj();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 5: 
          localtg.ujj = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 6: 
          localtg.tYF = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 7: 
          localtg.tYG = locala.yqV.nj();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 8: 
          localtg.ujk = locala.yqV.readString();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        case 9: 
          localtg.jhA = locala.yqV.nj();
          GMTrace.o(3816481095680L, 28435);
          return 0;
        }
        localtg.ujl = locala.yqV.nj();
        GMTrace.o(3816481095680L, 28435);
        return 0;
      }
      GMTrace.o(3816481095680L, 28435);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\tg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */