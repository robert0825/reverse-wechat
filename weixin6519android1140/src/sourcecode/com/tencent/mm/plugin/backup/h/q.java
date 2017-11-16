package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class q
  extends com.tencent.mm.bm.a
{
  public String jhH;
  public String jhI;
  public String jhJ;
  public String jhK;
  public long jhL;
  public long jhM;
  public String jhN;
  public String jhO;
  public com.tencent.mm.bm.b jhP;
  public com.tencent.mm.bm.b jhQ;
  public String jhn;
  
  public q()
  {
    GMTrace.i(14834951258112L, 110529);
    GMTrace.o(14834951258112L, 110529);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14835085475840L, 110530);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhH == null) {
        throw new b.a.a.b("Not all required fields were included: WeChatVersion");
      }
      if (this.jhI == null) {
        throw new b.a.a.b("Not all required fields were included: WeChatUserID");
      }
      if (this.jhJ == null) {
        throw new b.a.a.b("Not all required fields were included: WeChatNickName");
      }
      if (this.jhK == null) {
        throw new b.a.a.b("Not all required fields were included: WeChatInstallDir");
      }
      if (this.jhN == null) {
        throw new b.a.a.b("Not all required fields were included: Manufacturer");
      }
      if (this.jhn == null) {
        throw new b.a.a.b("Not all required fields were included: Model");
      }
      if (this.jhO == null) {
        throw new b.a.a.b("Not all required fields were included: Version");
      }
      if (this.jhH != null) {
        paramVarArgs.e(1, this.jhH);
      }
      if (this.jhI != null) {
        paramVarArgs.e(2, this.jhI);
      }
      if (this.jhJ != null) {
        paramVarArgs.e(3, this.jhJ);
      }
      if (this.jhK != null) {
        paramVarArgs.e(4, this.jhK);
      }
      paramVarArgs.T(5, this.jhL);
      paramVarArgs.T(6, this.jhM);
      if (this.jhN != null) {
        paramVarArgs.e(7, this.jhN);
      }
      if (this.jhn != null) {
        paramVarArgs.e(8, this.jhn);
      }
      if (this.jhO != null) {
        paramVarArgs.e(9, this.jhO);
      }
      if (this.jhP != null) {
        paramVarArgs.b(10, this.jhP);
      }
      if (this.jhQ != null) {
        paramVarArgs.b(11, this.jhQ);
      }
      GMTrace.o(14835085475840L, 110530);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhH == null) {
        break label1075;
      }
    }
    label1075:
    for (int i = b.a.a.b.b.a.f(1, this.jhH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhI != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhI);
      }
      i = paramInt;
      if (this.jhJ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhJ);
      }
      paramInt = i;
      if (this.jhK != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jhK);
      }
      i = paramInt + b.a.a.a.S(5, this.jhL) + b.a.a.a.S(6, this.jhM);
      paramInt = i;
      if (this.jhN != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.jhN);
      }
      i = paramInt;
      if (this.jhn != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.jhn);
      }
      paramInt = i;
      if (this.jhO != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jhO);
      }
      i = paramInt;
      if (this.jhP != null) {
        i = paramInt + b.a.a.a.a(10, this.jhP);
      }
      paramInt = i;
      if (this.jhQ != null) {
        paramInt = i + b.a.a.a.a(11, this.jhQ);
      }
      GMTrace.o(14835085475840L, 110530);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jhH == null) {
          throw new b.a.a.b("Not all required fields were included: WeChatVersion");
        }
        if (this.jhI == null) {
          throw new b.a.a.b("Not all required fields were included: WeChatUserID");
        }
        if (this.jhJ == null) {
          throw new b.a.a.b("Not all required fields were included: WeChatNickName");
        }
        if (this.jhK == null) {
          throw new b.a.a.b("Not all required fields were included: WeChatInstallDir");
        }
        if (this.jhN == null) {
          throw new b.a.a.b("Not all required fields were included: Manufacturer");
        }
        if (this.jhn == null) {
          throw new b.a.a.b("Not all required fields were included: Model");
        }
        if (this.jhO == null) {
          throw new b.a.a.b("Not all required fields were included: Version");
        }
        GMTrace.o(14835085475840L, 110530);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14835085475840L, 110530);
          return -1;
        case 1: 
          localq.jhH = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 2: 
          localq.jhI = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 3: 
          localq.jhJ = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 4: 
          localq.jhK = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 5: 
          localq.jhL = locala.yqV.nk();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 6: 
          localq.jhM = locala.yqV.nk();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 7: 
          localq.jhN = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 8: 
          localq.jhn = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 9: 
          localq.jhO = locala.yqV.readString();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        case 10: 
          localq.jhP = locala.csV();
          GMTrace.o(14835085475840L, 110530);
          return 0;
        }
        localq.jhQ = locala.csV();
        GMTrace.o(14835085475840L, 110530);
        return 0;
      }
      GMTrace.o(14835085475840L, 110530);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */