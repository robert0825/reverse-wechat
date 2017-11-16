package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avo
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public int gCB;
  public String gCC;
  public int gCD;
  public int gCE;
  public String gCF;
  public String gCG;
  public String gCH;
  public int gCx;
  public String gCy;
  public String gCz;
  public String jhi;
  public String jio;
  public bgm uAB;
  public oo uAC;
  public int uKO;
  public String uKP;
  public int uKQ;
  public String uKR;
  public String ubV;
  public String ubW;
  public String uoe;
  
  public avo()
  {
    GMTrace.i(3648574717952L, 27184);
    GMTrace.o(3648574717952L, 27184);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3648708935680L, 27185);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uKO);
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(3, this.jio);
      }
      if (this.uKP != null) {
        paramVarArgs.e(4, this.uKP);
      }
      paramVarArgs.fk(5, this.uKQ);
      if (this.uKR != null) {
        paramVarArgs.e(6, this.uKR);
      }
      paramVarArgs.fk(7, this.gCx);
      if (this.gCy != null) {
        paramVarArgs.e(8, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(9, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(10, this.gCA);
      }
      paramVarArgs.fk(11, this.gCB);
      if (this.gCC != null) {
        paramVarArgs.e(12, this.gCC);
      }
      paramVarArgs.fk(13, this.gCD);
      paramVarArgs.fk(14, this.gCE);
      if (this.gCF != null) {
        paramVarArgs.e(15, this.gCF);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(16, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(17, this.gCG);
      }
      if (this.gCH != null) {
        paramVarArgs.e(18, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(19, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.ubV != null) {
        paramVarArgs.e(20, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(21, this.ubW);
      }
      if (this.uoe != null) {
        paramVarArgs.e(22, this.uoe);
      }
      GMTrace.o(3648708935680L, 27185);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uKO) + 0;
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.jio != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jio);
      }
      paramInt = i;
      if (this.uKP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uKP);
      }
      i = paramInt + b.a.a.a.fh(5, this.uKQ);
      paramInt = i;
      if (this.uKR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uKR);
      }
      i = paramInt + b.a.a.a.fh(7, this.gCx);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(11, this.gCB);
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.gCC);
      }
      i = paramInt + b.a.a.a.fh(13, this.gCD) + b.a.a.a.fh(14, this.gCE);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.gCF);
      }
      i = paramInt;
      if (this.uAB != null) {
        i = paramInt + b.a.a.a.fj(16, this.uAB.aYq());
      }
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.gCG);
      }
      i = paramInt;
      if (this.gCH != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.gCH);
      }
      paramInt = i;
      if (this.uAC != null) {
        paramInt = i + b.a.a.a.fj(19, this.uAC.aYq());
      }
      i = paramInt;
      if (this.ubV != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.ubV);
      }
      paramInt = i;
      if (this.ubW != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.ubW);
      }
      i = paramInt;
      if (this.uoe != null) {
        i = paramInt + b.a.a.b.b.a.f(22, this.uoe);
      }
      GMTrace.o(3648708935680L, 27185);
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
      GMTrace.o(3648708935680L, 27185);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avo localavo = (avo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3648708935680L, 27185);
        return -1;
      case 1: 
        localavo.uKO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 2: 
        localavo.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 3: 
        localavo.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 4: 
        localavo.uKP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 5: 
        localavo.uKQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 6: 
        localavo.uKR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 7: 
        localavo.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 8: 
        localavo.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 9: 
        localavo.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 10: 
        localavo.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 11: 
        localavo.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 12: 
        localavo.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 13: 
        localavo.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 14: 
        localavo.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 15: 
        localavo.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localavo.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 17: 
        localavo.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 18: 
        localavo.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 19: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localavo.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 20: 
        localavo.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      case 21: 
        localavo.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648708935680L, 27185);
        return 0;
      }
      localavo.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3648708935680L, 27185);
      return 0;
    }
    GMTrace.o(3648708935680L, 27185);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\avo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */