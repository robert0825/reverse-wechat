package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class akr
  extends com.tencent.mm.bm.a
{
  public String tWD;
  public String tWE;
  public String tWF;
  public String tWG;
  public String tWH;
  public int uzT;
  
  public akr()
  {
    GMTrace.i(3703738204160L, 27595);
    GMTrace.o(3703738204160L, 27595);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3703872421888L, 27596);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWD != null) {
        paramVarArgs.e(1, this.tWD);
      }
      if (this.tWE != null) {
        paramVarArgs.e(2, this.tWE);
      }
      if (this.tWF != null) {
        paramVarArgs.e(3, this.tWF);
      }
      if (this.tWG != null) {
        paramVarArgs.e(4, this.tWG);
      }
      if (this.tWH != null) {
        paramVarArgs.e(5, this.tWH);
      }
      paramVarArgs.fk(6, this.uzT);
      GMTrace.o(3703872421888L, 27596);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tWD == null) {
        break label550;
      }
    }
    label550:
    for (int i = b.a.a.b.b.a.f(1, this.tWD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.tWE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tWE);
      }
      i = paramInt;
      if (this.tWF != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tWF);
      }
      paramInt = i;
      if (this.tWG != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tWG);
      }
      i = paramInt;
      if (this.tWH != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tWH);
      }
      paramInt = b.a.a.a.fh(6, this.uzT);
      GMTrace.o(3703872421888L, 27596);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3703872421888L, 27596);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        akr localakr = (akr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3703872421888L, 27596);
          return -1;
        case 1: 
          localakr.tWD = locala.yqV.readString();
          GMTrace.o(3703872421888L, 27596);
          return 0;
        case 2: 
          localakr.tWE = locala.yqV.readString();
          GMTrace.o(3703872421888L, 27596);
          return 0;
        case 3: 
          localakr.tWF = locala.yqV.readString();
          GMTrace.o(3703872421888L, 27596);
          return 0;
        case 4: 
          localakr.tWG = locala.yqV.readString();
          GMTrace.o(3703872421888L, 27596);
          return 0;
        case 5: 
          localakr.tWH = locala.yqV.readString();
          GMTrace.o(3703872421888L, 27596);
          return 0;
        }
        localakr.uzT = locala.yqV.nj();
        GMTrace.o(3703872421888L, 27596);
        return 0;
      }
      GMTrace.o(3703872421888L, 27596);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\akr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */