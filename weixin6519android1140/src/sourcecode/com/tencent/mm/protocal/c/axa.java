package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axa
  extends com.tencent.mm.bm.a
{
  public String lPS;
  public String lPg;
  public int lPo;
  public String lRT;
  public String tOW;
  public String tOX;
  public String tOY;
  public String tOZ;
  public String tPa;
  public String tPb;
  public bvm tPc;
  public String tRV;
  public int uFX;
  public String uLJ;
  public String uLK;
  public int uLL;
  public LinkedList<azq> uLM;
  public String uLN;
  public String uLO;
  public String uLP;
  public String uLQ;
  public String uLR;
  public String uLS;
  public String uLT;
  public int uLU;
  
  public axa()
  {
    GMTrace.i(3888824451072L, 28974);
    this.uLM = new LinkedList();
    GMTrace.o(3888824451072L, 28974);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3888958668800L, 28975);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.lRT != null) {
        paramVarArgs.e(2, this.lRT);
      }
      if (this.tOY != null) {
        paramVarArgs.e(3, this.tOY);
      }
      if (this.uLJ != null) {
        paramVarArgs.e(4, this.uLJ);
      }
      if (this.tOX != null) {
        paramVarArgs.e(5, this.tOX);
      }
      if (this.tOW != null) {
        paramVarArgs.e(6, this.tOW);
      }
      if (this.uLK != null) {
        paramVarArgs.e(7, this.uLK);
      }
      paramVarArgs.fk(8, this.uLL);
      paramVarArgs.d(9, 8, this.uLM);
      if (this.tOZ != null) {
        paramVarArgs.e(10, this.tOZ);
      }
      if (this.uLN != null) {
        paramVarArgs.e(11, this.uLN);
      }
      if (this.uLO != null) {
        paramVarArgs.e(12, this.uLO);
      }
      paramVarArgs.fk(13, this.uFX);
      if (this.tRV != null) {
        paramVarArgs.e(14, this.tRV);
      }
      if (this.lPS != null) {
        paramVarArgs.e(15, this.lPS);
      }
      if (this.tPa != null) {
        paramVarArgs.e(16, this.tPa);
      }
      if (this.uLP != null) {
        paramVarArgs.e(17, this.uLP);
      }
      if (this.uLQ != null) {
        paramVarArgs.e(18, this.uLQ);
      }
      if (this.tPb != null) {
        paramVarArgs.e(19, this.tPb);
      }
      if (this.uLR != null) {
        paramVarArgs.e(20, this.uLR);
      }
      if (this.uLS != null) {
        paramVarArgs.e(21, this.uLS);
      }
      if (this.tPc != null)
      {
        paramVarArgs.fm(22, this.tPc.aYq());
        this.tPc.a(paramVarArgs);
      }
      if (this.uLT != null) {
        paramVarArgs.e(23, this.uLT);
      }
      paramVarArgs.fk(24, this.uLU);
      paramVarArgs.fk(25, this.lPo);
      GMTrace.o(3888958668800L, 28975);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.lPg != null) {
        i = b.a.a.b.b.a.f(1, this.lPg) + 0;
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRT);
      }
      i = paramInt;
      if (this.tOY != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tOY);
      }
      paramInt = i;
      if (this.uLJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uLJ);
      }
      i = paramInt;
      if (this.tOX != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tOX);
      }
      paramInt = i;
      if (this.tOW != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tOW);
      }
      i = paramInt;
      if (this.uLK != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uLK);
      }
      i = i + b.a.a.a.fh(8, this.uLL) + b.a.a.a.c(9, 8, this.uLM);
      paramInt = i;
      if (this.tOZ != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tOZ);
      }
      i = paramInt;
      if (this.uLN != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.uLN);
      }
      paramInt = i;
      if (this.uLO != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uLO);
      }
      i = paramInt + b.a.a.a.fh(13, this.uFX);
      paramInt = i;
      if (this.tRV != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tRV);
      }
      i = paramInt;
      if (this.lPS != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.lPS);
      }
      paramInt = i;
      if (this.tPa != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.tPa);
      }
      i = paramInt;
      if (this.uLP != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.uLP);
      }
      paramInt = i;
      if (this.uLQ != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.uLQ);
      }
      i = paramInt;
      if (this.tPb != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.tPb);
      }
      paramInt = i;
      if (this.uLR != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.uLR);
      }
      i = paramInt;
      if (this.uLS != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.uLS);
      }
      paramInt = i;
      if (this.tPc != null) {
        paramInt = i + b.a.a.a.fj(22, this.tPc.aYq());
      }
      i = paramInt;
      if (this.uLT != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.uLT);
      }
      paramInt = b.a.a.a.fh(24, this.uLU);
      int j = b.a.a.a.fh(25, this.lPo);
      GMTrace.o(3888958668800L, 28975);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uLM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3888958668800L, 28975);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axa localaxa = (axa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3888958668800L, 28975);
        return -1;
      case 1: 
        localaxa.lPg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 2: 
        localaxa.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 3: 
        localaxa.tOY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 4: 
        localaxa.uLJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 5: 
        localaxa.tOX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 6: 
        localaxa.tOW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 7: 
        localaxa.uLK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 8: 
        localaxa.uLL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxa.uLM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 10: 
        localaxa.tOZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 11: 
        localaxa.uLN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 12: 
        localaxa.uLO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 13: 
        localaxa.uFX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 14: 
        localaxa.tRV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 15: 
        localaxa.lPS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 16: 
        localaxa.tPa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 17: 
        localaxa.uLP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 18: 
        localaxa.uLQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 19: 
        localaxa.tPb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 20: 
        localaxa.uLR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 21: 
        localaxa.uLS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaxa.tPc = ((bvm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 23: 
        localaxa.uLT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      case 24: 
        localaxa.uLU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3888958668800L, 28975);
        return 0;
      }
      localaxa.lPo = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3888958668800L, 28975);
      return 0;
    }
    GMTrace.o(3888958668800L, 28975);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\axa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */