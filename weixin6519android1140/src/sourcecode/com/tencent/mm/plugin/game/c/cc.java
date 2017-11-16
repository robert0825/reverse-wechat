package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;

public final class cc
  extends com.tencent.mm.bm.a
{
  public String lPd;
  public String lPh;
  public String lSP;
  public String lSQ;
  public String lSR;
  public boolean lSS;
  public boolean lST;
  
  public cc()
  {
    GMTrace.i(12652034129920L, 94265);
    GMTrace.o(12652034129920L, 94265);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12652168347648L, 94266);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPh != null) {
        paramVarArgs.e(1, this.lPh);
      }
      if (this.lSP != null) {
        paramVarArgs.e(2, this.lSP);
      }
      if (this.lSQ != null) {
        paramVarArgs.e(3, this.lSQ);
      }
      if (this.lSR != null) {
        paramVarArgs.e(4, this.lSR);
      }
      if (this.lPd != null) {
        paramVarArgs.e(5, this.lPd);
      }
      paramVarArgs.ah(6, this.lSS);
      paramVarArgs.ah(7, this.lST);
      GMTrace.o(12652168347648L, 94266);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPh == null) {
        break label579;
      }
    }
    label579:
    for (int i = b.a.a.b.b.a.f(1, this.lPh) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lSP != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSP);
      }
      i = paramInt;
      if (this.lSQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSQ);
      }
      paramInt = i;
      if (this.lSR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lSR);
      }
      i = paramInt;
      if (this.lPd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPd);
      }
      paramInt = b.a.a.b.b.a.cK(6);
      int j = b.a.a.b.b.a.cK(7);
      GMTrace.o(12652168347648L, 94266);
      return i + (paramInt + 1) + (j + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(12652168347648L, 94266);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cc localcc = (cc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(12652168347648L, 94266);
          return -1;
        case 1: 
          localcc.lPh = locala.yqV.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 2: 
          localcc.lSP = locala.yqV.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 3: 
          localcc.lSQ = locala.yqV.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 4: 
          localcc.lSR = locala.yqV.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 5: 
          localcc.lPd = locala.yqV.readString();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        case 6: 
          localcc.lSS = locala.csU();
          GMTrace.o(12652168347648L, 94266);
          return 0;
        }
        localcc.lST = locala.csU();
        GMTrace.o(12652168347648L, 94266);
        return 0;
      }
      GMTrace.o(12652168347648L, 94266);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */