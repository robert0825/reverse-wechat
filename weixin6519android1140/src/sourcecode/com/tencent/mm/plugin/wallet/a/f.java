package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bm.a
{
  public LinkedList<q> qXA;
  public g qXB;
  public int qXC;
  public String qXD;
  public String qXE;
  public double qXF;
  public double qXG;
  public int qXH;
  public String qXI;
  public String qXJ;
  public a qXK;
  public double qXw;
  public double qXx;
  public double qXy;
  public String qXz;
  
  public f()
  {
    GMTrace.i(7697655136256L, 57352);
    this.qXA = new LinkedList();
    GMTrace.o(7697655136256L, 57352);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7697789353984L, 57353);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.a(1, this.qXw);
      paramVarArgs.a(2, this.qXx);
      paramVarArgs.a(3, this.qXy);
      if (this.qXz != null) {
        paramVarArgs.e(4, this.qXz);
      }
      paramVarArgs.d(5, 8, this.qXA);
      if (this.qXB != null)
      {
        paramVarArgs.fm(6, this.qXB.aYq());
        this.qXB.a(paramVarArgs);
      }
      paramVarArgs.fk(7, this.qXC);
      if (this.qXD != null) {
        paramVarArgs.e(8, this.qXD);
      }
      if (this.qXE != null) {
        paramVarArgs.e(9, this.qXE);
      }
      paramVarArgs.a(10, this.qXF);
      paramVarArgs.a(11, this.qXG);
      paramVarArgs.fk(12, this.qXH);
      if (this.qXI != null) {
        paramVarArgs.e(13, this.qXI);
      }
      if (this.qXJ != null) {
        paramVarArgs.e(14, this.qXJ);
      }
      if (this.qXK != null)
      {
        paramVarArgs.fm(15, this.qXK.aYq());
        this.qXK.a(paramVarArgs);
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.b.b.a.cK(1) + 8 + 0 + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8);
      paramInt = i;
      if (this.qXz != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.qXz);
      }
      i = paramInt + b.a.a.a.c(5, 8, this.qXA);
      paramInt = i;
      if (this.qXB != null) {
        paramInt = i + b.a.a.a.fj(6, this.qXB.aYq());
      }
      i = paramInt + b.a.a.a.fh(7, this.qXC);
      paramInt = i;
      if (this.qXD != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.qXD);
      }
      i = paramInt;
      if (this.qXE != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.qXE);
      }
      i = i + (b.a.a.b.b.a.cK(10) + 8) + (b.a.a.b.b.a.cK(11) + 8) + b.a.a.a.fh(12, this.qXH);
      paramInt = i;
      if (this.qXI != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.qXI);
      }
      i = paramInt;
      if (this.qXJ != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.qXJ);
      }
      paramInt = i;
      if (this.qXK != null) {
        paramInt = i + b.a.a.a.fj(15, this.qXK.aYq());
      }
      GMTrace.o(7697789353984L, 57353);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXA.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(7697789353984L, 57353);
        return -1;
      case 1: 
        localf.qXw = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 2: 
        localf.qXx = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 3: 
        localf.qXy = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 4: 
        localf.qXz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.qXA.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new g();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.qXB = ((g)localObject1);
          paramInt += 1;
        }
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 7: 
        localf.qXC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 8: 
        localf.qXD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 9: 
        localf.qXE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 10: 
        localf.qXF = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 11: 
        localf.qXG = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 12: 
        localf.qXH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 13: 
        localf.qXI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      case 14: 
        localf.qXJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7697789353984L, 57353);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new a();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localf.qXK = ((a)localObject1);
        paramInt += 1;
      }
      GMTrace.o(7697789353984L, 57353);
      return 0;
    }
    GMTrace.o(7697789353984L, 57353);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */