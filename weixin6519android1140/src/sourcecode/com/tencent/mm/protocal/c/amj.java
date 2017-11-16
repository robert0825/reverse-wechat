package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amj
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
  public String gCw;
  public int gCx;
  public String gCy;
  public String gCz;
  public String tRz;
  public bgm uAB;
  public oo uAC;
  public String uBf;
  public sl uBg;
  public String ubV;
  public String ubW;
  public String uoe;
  
  public amj()
  {
    GMTrace.i(4041564225536L, 30112);
    GMTrace.o(4041564225536L, 30112);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4041698443264L, 30113);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRz != null) {
        paramVarArgs.e(1, this.tRz);
      }
      if (this.uBf != null) {
        paramVarArgs.e(2, this.uBf);
      }
      if (this.gCw != null) {
        paramVarArgs.e(3, this.gCw);
      }
      paramVarArgs.fk(4, this.gCx);
      if (this.gCy != null) {
        paramVarArgs.e(5, this.gCy);
      }
      if (this.gCz != null) {
        paramVarArgs.e(6, this.gCz);
      }
      if (this.gCA != null) {
        paramVarArgs.e(7, this.gCA);
      }
      paramVarArgs.fk(8, this.gCB);
      if (this.gCC != null) {
        paramVarArgs.e(9, this.gCC);
      }
      if (this.uBg != null)
      {
        paramVarArgs.fm(10, this.uBg.aYq());
        this.uBg.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.gCD);
      paramVarArgs.fk(12, this.gCE);
      if (this.gCF != null) {
        paramVarArgs.e(13, this.gCF);
      }
      if (this.uAB != null)
      {
        paramVarArgs.fm(14, this.uAB.aYq());
        this.uAB.a(paramVarArgs);
      }
      if (this.gCG != null) {
        paramVarArgs.e(15, this.gCG);
      }
      if (this.gCH != null) {
        paramVarArgs.e(16, this.gCH);
      }
      if (this.uAC != null)
      {
        paramVarArgs.fm(17, this.uAC.aYq());
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
      GMTrace.o(4041698443264L, 30113);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tRz != null) {
        i = b.a.a.b.b.a.f(1, this.tRz) + 0;
      }
      paramInt = i;
      if (this.uBf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uBf);
      }
      i = paramInt;
      if (this.gCw != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.gCw);
      }
      i += b.a.a.a.fh(4, this.gCx);
      paramInt = i;
      if (this.gCy != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.gCy);
      }
      i = paramInt;
      if (this.gCz != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.gCz);
      }
      paramInt = i;
      if (this.gCA != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gCA);
      }
      i = paramInt + b.a.a.a.fh(8, this.gCB);
      paramInt = i;
      if (this.gCC != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gCC);
      }
      i = paramInt;
      if (this.uBg != null) {
        i = paramInt + b.a.a.a.fj(10, this.uBg.aYq());
      }
      i = i + b.a.a.a.fh(11, this.gCD) + b.a.a.a.fh(12, this.gCE);
      paramInt = i;
      if (this.gCF != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.gCF);
      }
      i = paramInt;
      if (this.uAB != null) {
        i = paramInt + b.a.a.a.fj(14, this.uAB.aYq());
      }
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.gCG);
      }
      i = paramInt;
      if (this.gCH != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.gCH);
      }
      paramInt = i;
      if (this.uAC != null) {
        paramInt = i + b.a.a.a.fj(17, this.uAC.aYq());
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
      GMTrace.o(4041698443264L, 30113);
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
      GMTrace.o(4041698443264L, 30113);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amj localamj = (amj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 18: 
      case 19: 
      default: 
        GMTrace.o(4041698443264L, 30113);
        return -1;
      case 1: 
        localamj.tRz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 2: 
        localamj.uBf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 3: 
        localamj.gCw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 4: 
        localamj.gCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 5: 
        localamj.gCy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 6: 
        localamj.gCz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 7: 
        localamj.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 8: 
        localamj.gCB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 9: 
        localamj.gCC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new sl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((sl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localamj.uBg = ((sl)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 11: 
        localamj.gCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 12: 
        localamj.gCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 13: 
        localamj.gCF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localamj.uAB = ((bgm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 15: 
        localamj.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 16: 
        localamj.gCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new oo();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((oo)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localamj.uAC = ((oo)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 20: 
        localamj.ubV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      case 21: 
        localamj.ubW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4041698443264L, 30113);
        return 0;
      }
      localamj.uoe = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4041698443264L, 30113);
      return 0;
    }
    GMTrace.o(4041698443264L, 30113);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */