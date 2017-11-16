package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhq
  extends com.tencent.mm.bm.a
{
  public String gkI;
  public int gkJ;
  public String gkK;
  public String gkL;
  public String gkM;
  public String gkN;
  public String gkO;
  public String gkP;
  
  public bhq()
  {
    GMTrace.i(3843861512192L, 28639);
    GMTrace.o(3843861512192L, 28639);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3843995729920L, 28640);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.gkI != null) {
        paramVarArgs.e(1, this.gkI);
      }
      paramVarArgs.fk(2, this.gkJ);
      if (this.gkL != null) {
        paramVarArgs.e(3, this.gkL);
      }
      if (this.gkM != null) {
        paramVarArgs.e(4, this.gkM);
      }
      if (this.gkK != null) {
        paramVarArgs.e(5, this.gkK);
      }
      if (this.gkN != null) {
        paramVarArgs.e(6, this.gkN);
      }
      if (this.gkO != null) {
        paramVarArgs.e(7, this.gkO);
      }
      if (this.gkP != null) {
        paramVarArgs.e(8, this.gkP);
      }
      GMTrace.o(3843995729920L, 28640);
      return 0;
    }
    if (paramInt == 1) {
      if (this.gkI == null) {
        break label682;
      }
    }
    label682:
    for (paramInt = b.a.a.b.b.a.f(1, this.gkI) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.gkJ);
      paramInt = i;
      if (this.gkL != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.gkL);
      }
      i = paramInt;
      if (this.gkM != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.gkM);
      }
      paramInt = i;
      if (this.gkK != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.gkK);
      }
      i = paramInt;
      if (this.gkN != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.gkN);
      }
      paramInt = i;
      if (this.gkO != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gkO);
      }
      i = paramInt;
      if (this.gkP != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.gkP);
      }
      GMTrace.o(3843995729920L, 28640);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3843995729920L, 28640);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhq localbhq = (bhq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3843995729920L, 28640);
          return -1;
        case 1: 
          localbhq.gkI = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 2: 
          localbhq.gkJ = locala.yqV.nj();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 3: 
          localbhq.gkL = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 4: 
          localbhq.gkM = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 5: 
          localbhq.gkK = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 6: 
          localbhq.gkN = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        case 7: 
          localbhq.gkO = locala.yqV.readString();
          GMTrace.o(3843995729920L, 28640);
          return 0;
        }
        localbhq.gkP = locala.yqV.readString();
        GMTrace.o(3843995729920L, 28640);
        return 0;
      }
      GMTrace.o(3843995729920L, 28640);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */