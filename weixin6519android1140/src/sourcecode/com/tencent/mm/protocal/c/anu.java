package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anu
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public int eCt;
  public String eDW;
  public int jib;
  public String lPM;
  public String lPj;
  public String mmR;
  public String pPP;
  public int ppo;
  public int qkw;
  public int uCN;
  public String uCO;
  public int uCP;
  public int uCQ;
  public anw uCR;
  public String uCS;
  public int uCT;
  public int uCU;
  public String uCV;
  public String uCW;
  public String uCX;
  public String uCY;
  public String uCZ;
  public int uDa;
  public long uDb;
  public String uDc;
  public String uDd;
  public int uDe;
  public String uDf;
  public String uDg;
  public int uDh;
  public String uDi;
  public String uDj;
  
  public anu()
  {
    GMTrace.i(3808293814272L, 28374);
    GMTrace.o(3808293814272L, 28374);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3808428032000L, 28375);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mmR != null) {
        paramVarArgs.e(1, this.mmR);
      }
      paramVarArgs.fk(2, this.jib);
      if (this.lPj != null) {
        paramVarArgs.e(3, this.lPj);
      }
      if (this.lPM != null) {
        paramVarArgs.e(4, this.lPM);
      }
      paramVarArgs.fk(5, this.uCN);
      if (this.uCO != null) {
        paramVarArgs.e(6, this.uCO);
      }
      paramVarArgs.fk(7, this.uCP);
      paramVarArgs.fk(8, this.uCQ);
      if (this.eBt != null) {
        paramVarArgs.e(9, this.eBt);
      }
      if (this.uCR != null)
      {
        paramVarArgs.fm(10, this.uCR.aYq());
        this.uCR.a(paramVarArgs);
      }
      if (this.uCS != null) {
        paramVarArgs.e(11, this.uCS);
      }
      paramVarArgs.fk(12, this.uCT);
      paramVarArgs.fk(13, this.ppo);
      paramVarArgs.fk(14, this.uCU);
      if (this.pPP != null) {
        paramVarArgs.e(15, this.pPP);
      }
      paramVarArgs.fk(16, this.eCt);
      if (this.eDW != null) {
        paramVarArgs.e(17, this.eDW);
      }
      if (this.uCV != null) {
        paramVarArgs.e(18, this.uCV);
      }
      if (this.uCW != null) {
        paramVarArgs.e(19, this.uCW);
      }
      if (this.uCX != null) {
        paramVarArgs.e(20, this.uCX);
      }
      paramVarArgs.fk(21, this.qkw);
      if (this.uCY != null) {
        paramVarArgs.e(22, this.uCY);
      }
      if (this.uCZ != null) {
        paramVarArgs.e(23, this.uCZ);
      }
      paramVarArgs.fk(24, this.uDa);
      paramVarArgs.T(25, this.uDb);
      if (this.uDc != null) {
        paramVarArgs.e(26, this.uDc);
      }
      if (this.uDd != null) {
        paramVarArgs.e(27, this.uDd);
      }
      paramVarArgs.fk(28, this.uDe);
      if (this.uDf != null) {
        paramVarArgs.e(29, this.uDf);
      }
      if (this.uDg != null) {
        paramVarArgs.e(30, this.uDg);
      }
      paramVarArgs.fk(31, this.uDh);
      if (this.uDi != null) {
        paramVarArgs.e(32, this.uDi);
      }
      if (this.uDj != null) {
        paramVarArgs.e(33, this.uDj);
      }
      GMTrace.o(3808428032000L, 28375);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.mmR != null) {
        paramInt = b.a.a.b.b.a.f(1, this.mmR) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jib);
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lPj);
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.lPM);
      }
      i += b.a.a.a.fh(5, this.uCN);
      paramInt = i;
      if (this.uCO != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uCO);
      }
      i = paramInt + b.a.a.a.fh(7, this.uCP) + b.a.a.a.fh(8, this.uCQ);
      paramInt = i;
      if (this.eBt != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.eBt);
      }
      i = paramInt;
      if (this.uCR != null) {
        i = paramInt + b.a.a.a.fj(10, this.uCR.aYq());
      }
      paramInt = i;
      if (this.uCS != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uCS);
      }
      i = paramInt + b.a.a.a.fh(12, this.uCT) + b.a.a.a.fh(13, this.ppo) + b.a.a.a.fh(14, this.uCU);
      paramInt = i;
      if (this.pPP != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.pPP);
      }
      i = paramInt + b.a.a.a.fh(16, this.eCt);
      paramInt = i;
      if (this.eDW != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.eDW);
      }
      i = paramInt;
      if (this.uCV != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.uCV);
      }
      paramInt = i;
      if (this.uCW != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.uCW);
      }
      i = paramInt;
      if (this.uCX != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.uCX);
      }
      i += b.a.a.a.fh(21, this.qkw);
      paramInt = i;
      if (this.uCY != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.uCY);
      }
      i = paramInt;
      if (this.uCZ != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.uCZ);
      }
      i = i + b.a.a.a.fh(24, this.uDa) + b.a.a.a.S(25, this.uDb);
      paramInt = i;
      if (this.uDc != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uDc);
      }
      i = paramInt;
      if (this.uDd != null) {
        i = paramInt + b.a.a.b.b.a.f(27, this.uDd);
      }
      i += b.a.a.a.fh(28, this.uDe);
      paramInt = i;
      if (this.uDf != null) {
        paramInt = i + b.a.a.b.b.a.f(29, this.uDf);
      }
      i = paramInt;
      if (this.uDg != null) {
        i = paramInt + b.a.a.b.b.a.f(30, this.uDg);
      }
      i += b.a.a.a.fh(31, this.uDh);
      paramInt = i;
      if (this.uDi != null) {
        paramInt = i + b.a.a.b.b.a.f(32, this.uDi);
      }
      i = paramInt;
      if (this.uDj != null) {
        i = paramInt + b.a.a.b.b.a.f(33, this.uDj);
      }
      GMTrace.o(3808428032000L, 28375);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3808428032000L, 28375);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anu localanu = (anu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3808428032000L, 28375);
        return -1;
      case 1: 
        localanu.mmR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 2: 
        localanu.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 3: 
        localanu.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 4: 
        localanu.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 5: 
        localanu.uCN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 6: 
        localanu.uCO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 7: 
        localanu.uCP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 8: 
        localanu.uCQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 9: 
        localanu.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((anw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanu.uCR = ((anw)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 11: 
        localanu.uCS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 12: 
        localanu.uCT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 13: 
        localanu.ppo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 14: 
        localanu.uCU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 15: 
        localanu.pPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 16: 
        localanu.eCt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 17: 
        localanu.eDW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 18: 
        localanu.uCV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 19: 
        localanu.uCW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 20: 
        localanu.uCX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 21: 
        localanu.qkw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 22: 
        localanu.uCY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 23: 
        localanu.uCZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 24: 
        localanu.uDa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 25: 
        localanu.uDb = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 26: 
        localanu.uDc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 27: 
        localanu.uDd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 28: 
        localanu.uDe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 29: 
        localanu.uDf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 30: 
        localanu.uDg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 31: 
        localanu.uDh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      case 32: 
        localanu.uDi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3808428032000L, 28375);
        return 0;
      }
      localanu.uDj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3808428032000L, 28375);
      return 0;
    }
    GMTrace.o(3808428032000L, 28375);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */