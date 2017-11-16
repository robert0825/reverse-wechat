package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdd
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public String gCG;
  public String gCH;
  public int gCx;
  public String gCy;
  public String gCz;
  public String jhi;
  public String jio;
  public int tPZ;
  public int uAA;
  public bgm uAB;
  public oo uAC;
  public String uAu;
  public int uAv;
  public String uAw;
  public String uAx;
  public String uAy;
  public int uAz;
  public int uPg;
  public azp uPh;
  public int uPi;
  public String ubV;
  public String ubW;
  public String uoe;
  public String utG;
  
  public bdd()
  {
    GMTrace.i(3953785831424L, 29458);
    GMTrace.o(3953785831424L, 29458);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3953920049152L, 29459);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uPh == null) {
        throw new b("Not all required fields were included: ImgBuffer");
      }
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      if (this.jio != null) {
        paramVarArgs.e(2, this.jio);
      }
      if (this.gCy != null) {
        paramVarArgs.e(3, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(4, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(5, this.gCA);
      }
      if (this.uAu != null) {
        paramVarArgs.e(6, this.uAu);
      }
      paramVarArgs.fk(7, this.gCx);
      paramVarArgs.fk(8, this.tPZ);
      paramVarArgs.fk(9, this.uPg);
      if (this.uPh != null)
      {
        paramVarArgs.fm(10, this.uPh.aYq());
        this.uPh.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.uPi);
      if (this.uAx != null) {
        paramVarArgs.e(12, this.uAx);
      }
      if (this.uAy != null) {
        paramVarArgs.e(13, this.uAy);
      }
      paramVarArgs.fk(14, this.uAz);
      paramVarArgs.fk(15, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(16, this.uAw);
      }
      if (this.utG != null) {
        paramVarArgs.e(17, this.utG);
      }
      paramVarArgs.fk(21, this.uAA);
      if (this.uAB != null)
      {
        paramVarArgs.fm(22, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(23, this.gCG);
      }
      if (this.ubV != null) {
        paramVarArgs.e(24, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(25, this.ubW);
      }
      if (this.gCH != null) {
        paramVarArgs.e(26, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(27, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.uoe != null) {
        paramVarArgs.e(28, this.uoe);
      }
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.jhi != null) {
        i = b.a.a.b.b.a.f(1, this.jhi) + 0;
      }
      paramInt = i;
      if (this.jio != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jio);
      }
      i = paramInt;
      if (this.gCy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gCy);
      }
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.gCz);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.gCA);
      }
      paramInt = i;
      if (this.uAu != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uAu);
      }
      i = paramInt + b.a.a.a.fh(7, this.gCx) + b.a.a.a.fh(8, this.tPZ) + b.a.a.a.fh(9, this.uPg);
      paramInt = i;
      if (this.uPh != null) {
        paramInt = i + b.a.a.a.fj(10, this.uPh.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.uPi);
      paramInt = i;
      if (this.uAx != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uAx);
      }
      i = paramInt;
      if (this.uAy != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uAy);
      }
      i = i + b.a.a.a.fh(14, this.uAz) + b.a.a.a.fh(15, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.uAw);
      }
      i = paramInt;
      if (this.utG != null) {
        i = paramInt + b.a.a.b.b.a.f(17, this.utG);
      }
      i += b.a.a.a.fh(21, this.uAA);
      paramInt = i;
      if (this.uAB != null) {
        paramInt = i + b.a.a.a.fj(22, this.uAB.aYq());
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.gCG);
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(25, this.ubW);
      }
      paramInt = i;
      if (this.gCH != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.gCH);
      }
      i = paramInt;
      if (this.uAC != null) {
        i = paramInt + b.a.a.a.fj(27, this.uAC.aYq());
      }
      paramInt = i;
      if (this.uoe != null) {
        paramInt = i + b.a.a.b.b.a.f(28, this.uoe);
      }
      GMTrace.o(3953920049152L, 29459);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uPh == null) {
        throw new b("Not all required fields were included: ImgBuffer");
      }
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdd localbdd = (bdd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 18: 
      case 19: 
      case 20: 
      default: 
        GMTrace.o(3953920049152L, 29459);
        return -1;
      case 1: 
        localbdd.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 2: 
        localbdd.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 3: 
        localbdd.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 4: 
        localbdd.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 5: 
        localbdd.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 6: 
        localbdd.uAu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 7: 
        localbdd.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 8: 
        localbdd.tPZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 9: 
        localbdd.uPg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbdd.uPh = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 11: 
        localbdd.uPi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 12: 
        localbdd.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 13: 
        localbdd.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 14: 
        localbdd.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 15: 
        localbdd.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 16: 
        localbdd.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 17: 
        localbdd.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 21: 
        localbdd.uAA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 22: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbdd.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 23: 
        localbdd.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 24: 
        localbdd.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 25: 
        localbdd.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 26: 
        localbdd.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3953920049152L, 29459);
        return 0;
      case 27: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbdd.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3953920049152L, 29459);
        return 0;
      }
      localbdd.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3953920049152L, 29459);
      return 0;
    }
    GMTrace.o(3953920049152L, 29459);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */