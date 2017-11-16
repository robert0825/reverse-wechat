package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bjt
  extends com.tencent.mm.bm.a
{
  public String mhU;
  public String nDt;
  public String ojE;
  public String ojF;
  public String ojG;
  public String ojH;
  public String ojk;
  
  public bjt()
  {
    GMTrace.i(20859045543936L, 155412);
    GMTrace.o(20859045543936L, 155412);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20859179761664L, 155413);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ojE != null) {
        paramVarArgs.e(1, this.ojE);
      }
      if (this.ojF != null) {
        paramVarArgs.e(2, this.ojF);
      }
      if (this.ojk != null) {
        paramVarArgs.e(3, this.ojk);
      }
      if (this.mhU != null) {
        paramVarArgs.e(4, this.mhU);
      }
      if (this.nDt != null) {
        paramVarArgs.e(5, this.nDt);
      }
      if (this.ojG != null) {
        paramVarArgs.e(6, this.ojG);
      }
      if (this.ojH != null) {
        paramVarArgs.e(7, this.ojH);
      }
      GMTrace.o(20859179761664L, 155413);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ojE == null) {
        break label617;
      }
    }
    label617:
    for (int i = b.a.a.b.b.a.f(1, this.ojE) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ojF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ojF);
      }
      i = paramInt;
      if (this.ojk != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ojk);
      }
      paramInt = i;
      if (this.mhU != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mhU);
      }
      i = paramInt;
      if (this.nDt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.nDt);
      }
      paramInt = i;
      if (this.ojG != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ojG);
      }
      i = paramInt;
      if (this.ojH != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ojH);
      }
      GMTrace.o(20859179761664L, 155413);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20859179761664L, 155413);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bjt localbjt = (bjt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20859179761664L, 155413);
          return -1;
        case 1: 
          localbjt.ojE = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        case 2: 
          localbjt.ojF = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        case 3: 
          localbjt.ojk = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        case 4: 
          localbjt.mhU = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        case 5: 
          localbjt.nDt = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        case 6: 
          localbjt.ojG = locala.yqV.readString();
          GMTrace.o(20859179761664L, 155413);
          return 0;
        }
        localbjt.ojH = locala.yqV.readString();
        GMTrace.o(20859179761664L, 155413);
        return 0;
      }
      GMTrace.o(20859179761664L, 155413);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */