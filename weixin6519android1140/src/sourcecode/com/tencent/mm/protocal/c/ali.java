package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public class ali
  extends com.tencent.mm.bm.a
{
  public String gCA;
  public String gCC;
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
  public String ubV;
  public String ubW;
  public String uoe;
  public String utG;
  
  public ali()
  {
    GMTrace.i(3997943463936L, 29787);
    GMTrace.o(3997943463936L, 29787);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3998077681664L, 29788);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
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
      paramVarArgs.fk(9, this.uAv);
      if (this.uAw != null) {
        paramVarArgs.e(10, this.uAw);
      }
      if (this.utG != null) {
        paramVarArgs.e(11, this.utG);
      }
      if (this.gCC != null) {
        paramVarArgs.e(12, this.gCC);
      }
      if (this.uAx != null) {
        paramVarArgs.e(13, this.uAx);
      }
      if (this.uAy != null) {
        paramVarArgs.e(14, this.uAy);
      }
      paramVarArgs.fk(15, this.uAz);
      paramVarArgs.fk(19, this.uAA);
      if (this.uAB != null)
      {
        paramVarArgs.fm(20, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(21, this.gCG);
      }
      if (this.ubV != null) {
        paramVarArgs.e(22, this.ubV);
      }
      if (this.ubW != null) {
        paramVarArgs.e(23, this.ubW);
      }
      if (this.gCH != null) {
        paramVarArgs.e(24, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(25, this.uAC.aYq());
        this.uAC.a(paramVarArgs);
      }
      if (this.uoe != null) {
        paramVarArgs.e(26, this.uoe);
      }
      GMTrace.o(3998077681664L, 29788);
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
      i = paramInt + b.a.a.a.fh(7, this.gCx) + b.a.a.a.fh(8, this.tPZ) + b.a.a.a.fh(9, this.uAv);
      paramInt = i;
      if (this.uAw != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uAw);
      }
      i = paramInt;
      if (this.utG != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.utG);
      }
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.gCC);
      }
      i = paramInt;
      if (this.uAx != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.uAx);
      }
      paramInt = i;
      if (this.uAy != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.uAy);
      }
      i = paramInt + b.a.a.a.fh(15, this.uAz) + b.a.a.a.fh(19, this.uAA);
      paramInt = i;
      if (this.uAB != null) {
        paramInt = i + b.a.a.a.fj(20, this.uAB.aYq());
      }
      i = paramInt;
      if (this.gCG != null) {
        i = paramInt + b.a.a.b.b.a.f(21, this.gCG);
      }
      paramInt = i;
      if (this.ubV != null) {
        paramInt = i + b.a.a.b.b.a.f(22, this.ubV);
      }
      i = paramInt;
      if (this.ubW != null) {
        i = paramInt + b.a.a.b.b.a.f(23, this.ubW);
      }
      paramInt = i;
      if (this.gCH != null) {
        paramInt = i + b.a.a.b.b.a.f(24, this.gCH);
      }
      i = paramInt;
      if (this.uAC != null) {
        i = paramInt + b.a.a.a.fj(25, this.uAC.aYq());
      }
      paramInt = i;
      if (this.uoe != null) {
        paramInt = i + b.a.a.b.b.a.f(26, this.uoe);
      }
      GMTrace.o(3998077681664L, 29788);
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
      GMTrace.o(3998077681664L, 29788);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ali localali = (ali)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 16: 
      case 17: 
      case 18: 
      default: 
        GMTrace.o(3998077681664L, 29788);
        return -1;
      case 1: 
        localali.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 2: 
        localali.jio = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 3: 
        localali.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 4: 
        localali.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 5: 
        localali.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 6: 
        localali.uAu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 7: 
        localali.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 8: 
        localali.tPZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 9: 
        localali.uAv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 10: 
        localali.uAw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 11: 
        localali.utG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 12: 
        localali.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 13: 
        localali.uAx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 14: 
        localali.uAy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 15: 
        localali.uAz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 19: 
        localali.uAA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 20: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localali.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 21: 
        localali.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 22: 
        localali.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 23: 
        localali.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 24: 
        localali.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3998077681664L, 29788);
        return 0;
      case 25: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localali.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3998077681664L, 29788);
        return 0;
      }
      localali.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3998077681664L, 29788);
      return 0;
    }
    GMTrace.o(3998077681664L, 29788);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ali.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */